package com.lucas.petros.home.presentation.scenes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lucas.petros.home.domain.usecase.GetRoundNumber
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getRoundNumber: GetRoundNumber
) : ViewModel() {

    private val _uiState = mutableStateOf<HomeUiState>(HomeUiState.Processing)
    val uiState: State<HomeUiState>
        get() = _uiState

    fun loadData() {
        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                _uiState.value = HomeUiState.Processing
                getRoundNumber()
            }.onSuccess {
                _uiState.value = HomeUiState.HomeLoaded(it)
            }.onFailure {
                _uiState.value = HomeUiState.Error(it)
            }
        }
    }

    fun onEvent(event: HomeUiEvent) {
        when (event) {
            is HomeUiEvent.OnRetryButtonClicked -> loadData()
            is HomeUiEvent.OnRequestNumber -> loadData()
        }
    }
}
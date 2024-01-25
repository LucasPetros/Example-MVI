# Example MVI - Compose - Clean Architecture + MVI + Modularization

## Descrição
Este é um projeto Android de exemplo. A implementação é baseada em arquitetura limpa (Clean Architecture) com o padrão MVI (Model-View-Intent), proporcionando uma estrutura organizada e harmónica com Jetpack Compose.

##Módulos
O projeto foi modularizado para facilitar o desenvolvimento, manutenção, escalabilidade e testabilidade. Os módulos incluem:

* **UI**: Contém a implementação da interface do usuário e segue o padrão MVVM.

* **CORE**: Inclui componentes e utilitários compartilhados em toda a aplicação.

* **NETWORK**: Responsável pela comunicação com a API da Spotify.

* **BUILDSRC**: Contém as configurações de build, incluindo versionamento de dependências.

* **FEATURES**: Um Modulo que contem modulos de cada feature do projeto.

#Arquitetura
O projeto segue os princípios da arquitetura limpa, promovendo a separação de preocupações e a escalabilidade do código. A estrutura inclui:

## Clean Architecture
![https://fernandocejas.com/2018/05/07/architecting-android-reloaded/](https://github.com/android10/Sample-Data/blob/master/Android-CleanArchitecture-Kotlin/architecture/clean_architecture_reloaded_main.png)

### ----------------------------------------------------------------------------------------------

## Layers Architecture
![MVI-LAYER -ARCHITECTURE](https://miro.medium.com/v2/resize:fit:4800/format:webp/1*K-uEm96OX-j8pCeqi69W4g.png)

### ----------------------------------------------------------------------------------------------

## UI Layer: MVI 
![MVI-LAYER](https://blog.mindorks.com/images/mvi_1-9856d13ed93fdb60.png)

## Data Layer: Repository 
![https://fernandocejas.com/2018/05/07/architecting-android-reloaded/](https://github.com/android10/Sample-Data/blob/master/Android-CleanArchitecture-Kotlin/architecture/clean_archictecture_reloaded_repository.png)

### ----------------------------------------------------------------------------------------------

#Pré-requisitos
Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:
* Android Studio
* Java 18 sdk

O projeto possui todas as dependências necessárias nos arquivos do Gradle. Adicione o projeto ao Android Studio ou IntelliJ e sincronize. Todas as dependências serão baixadas e instaladas.

## Autor!

### Lucas Petros Borges da Silva
* Repositório: https://github.com/LucasPetros
* Linkedin: https://www.linkedin.com/in/Lucas-Petros/

Obrigado por demonstrar interesse no meu projeto. Seu envolvimento significa muito! 🤩

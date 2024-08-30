# [DIO](www.dio.me) - Trilha Java Básico

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    Dispositivo --> Player
    Dispositivo --> Phone
    Dispositivo --> Browser
    Player --> Album
    Album --> Musica
    Phone --> Contato
    Phone --> SMS
    SMS --> Contato
    class Player{
        +listarMusicas()
        +listarAlbunsPersonalisados()
        +listarAlbuns()        
        +listarMusicasAlbum(album : Album)
        +selecionar_musica(musica)
        +trocar_musica(proximo,anterior)
        +volume(aumentar,diminuir)
        +pausar()
        +selecionar_album(album)
        +criar_album()
        +adicionar_musica_ao_album(musica, album)
        +listar_videos()
        +selecionar_video(video)
        +trocar_video()
        +excluir_musica()
        +excluir_album()
    }
    class Phone{
        +listarContatos()
        +adicionarContato(Contato contato)
        +excluirContato(int idContato)
        +ligarContato(int numeroContato)
        +volume(int aumentar, int diminuir)
        +atenderLigacao()        
        +favoritarContato(int idContato)
        +iniciarConferencia(Array[Contato] listContatos)
        +historicoChamadas()
        +enviarSMS(int numeroContato)
        +historicoSMS()
        +excluirSMS(int idSMS)
        +iniciarCorreioVoz()
    }
    class Browser{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
      +removerAba(int idAba)
      +ativarModoLeitura(boolean modoLeitura)
    }
    class Contato{
        #idContato : int
        #nomeContato : String
        #numeroCelular : int
        #email : String
    }
    class Album{
        #idAlbum : int
        #nomeAlbum : String
        #descricao : String
        #personalisado : boolean
        #musicas : Array[Musica]
    }
    class Musica{
        #idAlbum : int
        #nomeAlbum : String
        #descricao : String
    }
    class SMS{
        #idSMS : int
        #idContato : int
        #texto : String
    }
```
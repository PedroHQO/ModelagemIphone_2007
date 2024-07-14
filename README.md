### Diagrama_Iphone_2007

## ![
	classDiagram
    interface ReprodutorMusical {
        +tocar() : void
        +pausar() : void
		+selecionarMusica(String music) : void
		
    }

    interface AparelhoTelefonico {
        + ligar(String numero) : void
		+ atender() : void 
		+ iniciarCorreioVoz() : void

    }

    interface NavegadorInternet {
        + exibirPagina(Sring url) : void
        + adicionarNovaAba() : void
		+ atualizarPagina() : void
    }
	
	interface DesbloquearIphone
		+ desbloquearIhone() : void
		+ bloquearIphone() : void
	
    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
	iPhone --> DesbloquearIphone](https://www.canva.com/design/DAGK9FSTlVk/LFSZzBteTcABD6wvHtArVw/view?utm_content=DAGK9FSTlVk&utm_campaign=designshare&utm_medium=link&utm_source=editor)


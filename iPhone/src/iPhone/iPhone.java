package iPhone;

import Funcoes.AT.AparelhoTelefonico;
import Funcoes.AT.AparelhoTelefonicoImpl;
import Funcoes.NI.NavegadorInternet;
import Funcoes.NI.NavagadorInternetImpl;
import Funcoes.RM.ReprodutorMusical;
import Funcoes.RM.ReprodutorMusicalImpl;

public class iPhone {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public void tocarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    public void fazerChamada(String numero) {
        telefone.ligar(numero);
    }

    public void abrirPagina(String url) {
        navegador.exibirPagina(url);
    }
    public static void main(String[] args) {

        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = new NavagadorInternetImpl();

        iPhone meuIphone = new iPhone(reprodutor, telefone, navegador);

        meuIphone.tocarMusica("Minha Música Favorita");
        meuIphone.fazerChamada("1234-5678");
        meuIphone.abrirPagina("www.exemplo.com");
    }
}

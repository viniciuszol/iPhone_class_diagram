package Funcoes.AT;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico{
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA NUMERO");
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("CHAMADA SENDO ENCAMINHADA PARA CAIXA DE MENSAGENS");
    }

    public void receberMensagem() {
        System.out.println("RECEBEU MENSAGEM");
    }

    public void enviarMensagem() {
        System.out.println("ENVIANDO MENSAGEM");
    }

}

package Funcoes.AT;
public interface AparelhoTelefonico {
    public void ligar(String numero);
    public void atender();
    public void iniciarCorreioVoz();
    public void receberMensagem();
    public void enviarMensagem();
    //receberMensagem e enviarMensagem seria para o SMS presente nos iPhone (Tinha colocado SMS como um atributo, mas vim a tirar depois)
}

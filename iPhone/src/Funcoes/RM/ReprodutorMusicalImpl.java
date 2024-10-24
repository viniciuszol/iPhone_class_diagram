package Funcoes.RM;

public class ReprodutorMusicalImpl implements ReprodutorMusical{
    public void selecionarMusica(String musica) {
        System.out.println("LIGANDO");
    }

    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    public void aumnetarVolume() {
        System.out.println("AUMENTANDO VOLUME");
    }

    public void diminuirVolume() {
        System.out.println("DIMINUINDO VOLUME");
    }

}

package br.edu.unifei.guilhermeesber.trabalho;

public class RedeDeDistribuicao {

    private double pressaoMedia;
    private double comprimentoTotal;

    public void distribuir() {
        System.out.println("Distribuindo água pela rede com pressão: " + pressaoMedia);
    }

    public void setPressaoMedia(double pressaoMedia) { this.pressaoMedia = pressaoMedia; }
    public void setComprimentoTotal(double comprimentoTotal) { this.comprimentoTotal = comprimentoTotal; }
}
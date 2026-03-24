package br.edu.unifei.guilhermeesber.trabalho;

public class Rio extends FonteDeAgua {

    private double comprimentoKm;
    private double velocidadeFluxo;
    private double larguraMedia;

    @Override
    public double captarAgua() {
        return volumeMedio * velocidadeFluxo * 0.1;
    }

    public double calcularVazao() {
        return larguraMedia * velocidadeFluxo;
    }

    public String analisarPoluicao() {
        return "Poluição estimada com base no fluxo e volume.";
    }

    public void setComprimentoKm(double comprimentoKm) { this.comprimentoKm = comprimentoKm; }
    public void setVelocidadeFluxo(double velocidadeFluxo) { this.velocidadeFluxo = velocidadeFluxo; }
    public void setLarguraMedia(double larguraMedia) { this.larguraMedia = larguraMedia; }
}
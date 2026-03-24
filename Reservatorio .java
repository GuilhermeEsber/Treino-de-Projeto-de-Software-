package br.edu.unifei.guilhermeesber.trabalho;

public class Reservatorio extends FonteDeAgua {

    private double capacidadeMaxima;
    private double nivelAtual;
    private String tipoEstrutura;

    @Override
    public double captarAgua() {
        return Math.max(0, capacidadeMaxima - nivelAtual);
    }

    public void armazenar(double qtd) {
        nivelAtual += qtd;
        if (nivelAtual > capacidadeMaxima)
            nivelAtual = capacidadeMaxima;
    }

    public void liberarAgua(double qtd) {
        nivelAtual -= qtd;
        if (nivelAtual < 0)
            nivelAtual = 0;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) { this.capacidadeMaxima = capacidadeMaxima; }
    public void setNivelAtual(double nivelAtual) { this.nivelAtual = nivelAtual; }
    public void setTipoEstrutura(String tipoEstrutura) { this.tipoEstrutura = tipoEstrutura; }
}
package br.edu.unifei.guilhermeesber.trabalho;

public class Hidrometro {

    private String numeroSerie;
    private double leituraAtual;

    public void registrarConsumo(double qtd) {
        leituraAtual += qtd;
    }

    public double getLeituraAtual() {
        return leituraAtual;
    }

    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; } 
    public void setLeituraAtual(double leituraAtual) { this.leituraAtual = leituraAtual; }
}
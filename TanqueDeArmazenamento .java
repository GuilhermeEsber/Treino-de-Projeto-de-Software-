package br.edu.unifei.guilhermeesber.trabalho;

public class TanqueDeArmazenamento {

    private double capacidade;
    private double volumeAtual;

    public void receberAgua(double qtd) {
        volumeAtual += qtd;
        if (volumeAtual > capacidade) {
            volumeAtual = capacidade;
        }
    }

    public double fornecerAgua(double qtd) {
        if (qtd > volumeAtual) {
            double fornecido = volumeAtual;
            volumeAtual = 0;
            return fornecido;
        }
        volumeAtual -= qtd;
        return qtd;
    }

    public void setCapacidade(double capacidade) { this.capacidade = capacidade; }
    public void setVolumeAtual(double volumeAtual) { this.volumeAtual = volumeAtual; }

    public double getVolumeAtual() { return volumeAtual; }
}
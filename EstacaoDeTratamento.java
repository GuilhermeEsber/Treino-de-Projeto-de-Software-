package br.edu.unifei.guilhermeesber.trabalho;

public class EstacaoDeTratamento {

    private double taxaFiltragem;
    private double nivelCloracao;

    public void filtrar() {
        System.out.println("Filtrando água com taxa: " + taxaFiltragem);
    }

    public void clorar() {
        System.out.println("Aplicando cloração nível: " + nivelCloracao);
    }

    public double enviarParaTanque(double qtd) {
        System.out.println("Enviando " + qtd + " litros para o tanque.");
        return qtd; // apenas retorna o valor enviado
    }

    public void setTaxaFiltragem(double taxaFiltragem) { this.taxaFiltragem = taxaFiltragem; }
    public void setNivelCloracao(double nivelCloracao) { this.nivelCloracao = nivelCloracao; }
}
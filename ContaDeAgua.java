package br.edu.unifei.guilhermeesber.trabalho;

public class ContaDeAgua {

    private String mesReferencia;
    private double valor;

    public void gerarConta(double consumo) {
        valor = consumo * 3.5;
        System.out.println("Conta gerada para " + mesReferencia + ": R$" + valor);
    }

    public void setMesReferencia(String mesReferencia) { this.mesReferencia = mesReferencia; }
    public void setValor(double valor) { this.valor = valor; } 
}
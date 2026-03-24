package br.edu.unifei.guilhermeesber.trabalho;

public class Relatorio {

    private String data;
    private String conteudo;

    public void imprimir() {
        System.out.println("Relatório [" + data + "]:");
        System.out.println(conteudo);
    }

    public void setData(String data) { this.data = data; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }
}
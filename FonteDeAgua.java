package br.edu.unifei.guilhermeesber.trabalho;

public abstract class FonteDeAgua {

    protected String nome;
    protected double volumeMedio;
    protected String qualidadeBase;

    public abstract double captarAgua();

    public String medirQualidade() {
        return "Qualidade medida: " + qualidadeBase;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setVolumeMedio(double volumeMedio) { this.volumeMedio = volumeMedio; }
    public void setQualidadeBase(String qualidadeBase) { this.qualidadeBase = qualidadeBase; }
}
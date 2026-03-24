package br.edu.unifei.guilhermeesber.trabalho;

public class PocoArtesiano extends FonteDeAgua {

    private double profundidade;
    private double pressaoAgua;
    private String qualidadeLencol;

    @Override
    public double captarAgua() {
        return pressaoAgua * 15;
    }

    public double bombear() {
        return pressaoAgua * 10;
    }

    public String analisarMinerais() {
        return "Análise mineral do lençol: " + qualidadeLencol;
    }

    public void setProfundidade(double profundidade) { this.profundidade = profundidade; }
    public void setPressaoAgua(double pressaoAgua) { this.pressaoAgua = pressaoAgua; }
    public void setQualidadeLencol(String qualidadeLencol) { this.qualidadeLencol = qualidadeLencol; }
}
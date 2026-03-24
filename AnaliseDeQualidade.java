package br.edu.unifei.guilhermeesber.trabalho;

public class AnaliseDeQualidade {

    private double ph;
    private double turbidez;
    private String metaisPesados;

    public String gerarRelatorio() {
        return "pH: " + ph + ", turbidez: " + turbidez + ", metais: " + metaisPesados;
    }

    public void setPh(double ph) { this.ph = ph; }
    public void setTurbidez(double turbidez) { this.turbidez = turbidez; }
    public void setMetaisPesados(String metaisPesados) { this.metaisPesados = metaisPesados; }
}
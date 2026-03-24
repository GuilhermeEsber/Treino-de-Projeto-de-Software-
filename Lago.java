package br.edu.unifei.guilhermeesber.trabalho;

public class Lago extends FonteDeAgua {

    private double profundidadeMedia;
    private double temperaturaMedia;
    private double areaSuperficial;

    @Override
    public double captarAgua() {
        return areaSuperficial * profundidadeMedia * 0.05;
    }

    public double medirTransparencia() {
        return profundidadeMedia * 0.3;
    }

    public void setProfundidadeMedia(double profundidadeMedia) { this.profundidadeMedia = profundidadeMedia; }
    public void setTemperaturaMedia(double temperaturaMedia) { this.temperaturaMedia = temperaturaMedia; }
    public void setAreaSuperficial(double areaSuperficial) { this.areaSuperficial = areaSuperficial; }
}
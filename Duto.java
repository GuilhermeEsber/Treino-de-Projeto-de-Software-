package br.edu.unifei.guilhermeesber.trabalho;

public class Duto {

    private double diametro;
    private double extensao;
    private String material;

    public void transportarAgua(double qtd) {
        System.out.println("Transportando " + qtd + " litros pelo duto.");
    }

    public boolean verificarVazamentos() {
        return Math.random() < 0.1;
    }

    public void setDiametro(double diametro) { this.diametro = diametro; }
    public void setExtensao(double extensao) { this.extensao = extensao; }
    public void setMaterial(String material) { this.material = material; }
}
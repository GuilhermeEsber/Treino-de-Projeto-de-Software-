package br.edu.unifei.guilhermeesber.trabalho;

import java.util.ArrayList;

public class Sensor {

    private double nivel;
    private double vazao;
    private String qualidade;

    private ArrayList<Observer> observadores = new ArrayList<>(); 

    public void medir() {
        if (nivel == 0) {
            nivel = Math.random() * 100;
        } else {
            nivel += (Math.random() * 4 - 2); // pequena variação
            if (nivel < 0) nivel = 0;
        }

        if (vazao == 0) {
            vazao = Math.random() * 50;
        } else {
            vazao += (Math.random() * 2 - 1); // pequena variação
            if (vazao < 0) vazao = 0;
        }

        qualidade = (nivel < 20) ? "Alerta" : "Boa";

        notificaObservadores();
    }

    public void addObservador (Observer obs) {
        observadores.add(obs);
    }

    public void notificaObservadores() {
        for (Observer o : observadores) {
            o.atualizar(this);
        }
    }

    public double getNivel() { return nivel; }
    public double getVazao() { return vazao; }
    public String getQualidade() { return qualidade; }

    public void setNivel(double nivel) { this.nivel = nivel; }
    public void setVazao(double vazao) { this.vazao = vazao; }
    public void setQualidade(String qualidade) { this.qualidade = qualidade; }
}
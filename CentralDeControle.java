package br.edu.unifei.guilhermeesber.trabalho;

public class CentralDeControle implements Observer {

    private String statusOperacional;

    @Override
    public void atualizar(Sensor sensor) {
        statusOperacional = "Monitorando sensor: nível " + sensor.getNivel();
        System.out.println("Central atualizada: " + statusOperacional);

        if (sensor.getNivel() < 10) {
            enviarEquipe();
        }
    }

    public void enviarEquipe() {
        System.out.println("Equipe enviada para verificar problema.");
    }
}
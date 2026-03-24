package br.edu.unifei.guilhermeesber.trabalho;

public class PainelDeMonitoramento implements Observer {

    private String ultimaLeitura;

    @Override
    public void atualizar(Sensor sensor) {
        ultimaLeitura = "Nível: " + sensor.getNivel() +
                        " | Vazão: " + sensor.getVazao() +
                        " | Qualidade: " + sensor.getQualidade();
        exibirDados();
    }

    public void exibirDados() {
        System.out.println("Painel: " + ultimaLeitura);
    }
}
package br.edu.unifei.guilhermeesber.trabalho;

public class Alerta {

    private String tipo;
    private String mensagem;

    public void emitir() {
        System.out.println("ALERTA [" + tipo + "]: " + mensagem);
    }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}
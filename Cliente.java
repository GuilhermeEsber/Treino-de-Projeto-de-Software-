package br.edu.unifei.guilhermeesber.trabalho;

public class Cliente {

    private String nome;
    private String endereco;
    private String tipoCliente;

    public void solicitarAgua(double qtd) {
        System.out.println(nome + " solicitou " + qtd + " litros.");
    }

    public void pagarConta() {
        System.out.println(nome + " pagou a conta.");
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }
}
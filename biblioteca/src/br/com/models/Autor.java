package br.com.models;

public class Autor {
    private static int proximoId = 1;

    private int id;
    private String nome;
    private String dataDeNascimento;

    public Autor() {
        this.id = proximoId;
        proximoId++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}

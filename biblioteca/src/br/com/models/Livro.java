package br.com.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Livro {
    private static int proximoId = 1;

    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private String dataCadastro;
    private String dataAtualizacao;

    public Livro() {
        this.id = proximoId;
        proximoId++;
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataCadastro = hoje.format(formatter);
        this.dataAtualizacao = hoje.format(formatter);
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Autor getAutor() { // getter do autor
        return autor;
    }

    public void setAutor(Autor autor) { // setter do autor
        this.autor = autor;
    }
}

package br.com.models;

public class Emprestimo {
    private static int proximoId = 1;

    private int id;
    private boolean status;
    private Livro livro;

    public Emprestimo() {
        this.id = proximoId;
        proximoId++;
    }

    public int getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}

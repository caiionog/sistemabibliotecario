package br.com.models;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    private List<Livro> listaLivros = new ArrayList<>();
    private List<Autor> listaAutores = new ArrayList<>();
    private List<Emprestimo> listaEmprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public void adicionarAutor(Autor autor) {
        listaAutores.add(autor);
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        listaEmprestimos.add(emprestimo);
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public List<Autor> getListaAutores() {
        return listaAutores;
    }
    public List<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }


}

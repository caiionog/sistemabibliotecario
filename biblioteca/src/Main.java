import br.com.models.*;
import java.util.Scanner;

public class Main {
    static int i = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("|          Sistema Bibliotecário           |");
        while (i != 0) {
            System.out.println("| Digite uma opção:                           |");
            System.out.println("| 1 - Adicionar um novo livro à biblioteca    |");
            System.out.println("| 2 - Listar livros disponíveis da biblioteca |");
            System.out.println("| 3 - Realizar o empréstimo de um livro       |");
            System.out.println("| 0 - Encerrar o programa                     |");

            i = sc.nextInt();
            sc.nextLine();
            if (i == 0) {
                break;
            }
            if (i == 1) {
                Livro livro = new Livro();
                System.out.println("Digite o titulo do livro: ");
                String nome = sc.nextLine();
                livro.setTitulo(nome);
                livro.setDisponivel(true);

                System.out.println("Digite o nome do autor: ");
                String nomeAutor = sc.nextLine();
                Autor autor = new Autor();
                autor.setNome(nomeAutor);

                System.out.println("Digite a data de nascimento do autor (dd/MM/yyyy): ");
                String dataNascimentoAutor = sc.nextLine();
                autor.setDataDeNascimento(dataNascimentoAutor);

                System.out.println("Livro adicionado com sucesso:");
                System.out.println("ID: " + livro.getId());
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + autor.getNome());
                System.out.println("ID Autor: " + autor.getId());
                System.out.println("Data de nascimento do autor: " + autor.getDataDeNascimento());
                System.out.println("Data de cadastro: " + livro.getDataCadastro());

                livro.setAutor(autor);

                biblioteca.adicionarLivro(livro);
                biblioteca.adicionarAutor(autor);
            }
            if (i == 2) {
                System.out.println("| Lista de Livros Disponíveis |");
                for (Livro livro : biblioteca.getListaLivros()) {
                    if (livro.isDisponivel()) {
                        System.out.println("ID: " + livro.getId() + ", Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor().getNome());
                    }
                }
            }
            if (i == 3) {
                System.out.println("| Digite o ID do livro desejado: |");
                int escolha = sc.nextInt();
                for (Livro livro : biblioteca.getListaLivros()) {
                    if (livro.getId() == escolha) {
                        if (livro.isDisponivel()) {
                            livro.setDisponivel(false);
                            Emprestimo emprestimo = new Emprestimo();
                            emprestimo.setLivro(livro);
                            emprestimo.setStatus(true);
                            biblioteca.adicionarEmprestimo(emprestimo);
                            System.out.println("Empréstimo realizado com sucesso.");
                        } else {
                            System.out.println("Livro já foi emprestado");
                        }
                    }
                }
            }
        }
    }
}

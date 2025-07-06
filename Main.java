import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        Autor at1 = new Autor(1, "J.K. Rowling", new Date());
        Autor at2 = new Autor(2, "J.R.R. Tolkien", new Date());
        Autor at3 = new Autor(3, "Rick Riordan", new Date());

        biblioteca.addAutor(at1);
        biblioteca.addAutor(at2);

        Livro lv1 = new Livro(1, "Harry Potter e o Prisioneiro de Azkaban", at1);
        Livro lv2 = new Livro(2, "O Hobbit", at2);
        Livro lv3 = new Livro(3, "Percy Jackson e o Ladrão de Raios", at3);
        
        biblioteca.addLivro(lv1);
        biblioteca.addLivro(lv2);
        biblioteca.addLivro(lv3);

        while (true) {
            System.out.println("Deseja ver os livros disponíveis? (sim/nao)");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                List<Livro> livrosDisp = biblioteca.ListarLivrosDisp();

                if (livrosDisp.isEmpty()) {
                    System.out.println("Não há livros disponíveis no momento.");
                } else {
                    System.out.println("Livros disponíveis:");
                    for (Livro livro : livrosDisp) {
                        System.out.println(livro.getId() + ": " + livro.getTitulo());
                    }

                    System.out.println("Digite o ID do livro que você deseja emprestar:");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();

                    Livro livroSelec = biblioteca.buscarLivroPorId(idLivro);

                    if (livroSelec != null && livroSelec.isDisponivel()) {
                        System.out.println("Digite seu nome:");
                        String nomeUsuario = scanner.nextLine();

                        biblioteca.empLivro(livroSelec, nomeUsuario);
                        System.out.println("O livro " + livroSelec.getTitulo() + " foi emprestado para " + nomeUsuario);
                    } else {
                        System.out.println("Livro não encontrado ou não disponível para empréstimo.");
                    }
                }
            } else if (resposta.equals("nao")) {
                System.out.println("Obrigado por utilizar o sistema da biblioteca.");
                break; 
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'sim' ou 'não'.");
            }
        }

        scanner.close();
    }
}
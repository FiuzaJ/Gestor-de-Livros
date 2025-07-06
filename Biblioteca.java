import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> ListarLivros() {
        return livros;
    }

    public List<Livro> ListarLivrosDisp() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public void attLivro(int id, String novoTitulo) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                livro.setTitulo(novoTitulo);
                break;
            }
        }
    }

    public void rmvLivro(int id) {
        livros.removeIf(livro -> livro.getId() == id);
    }

    public void addAutor(Autor autor) {
        autores.add(autor);
    }

    public List<Autor> listarAutores() {
        return autores;
    }

    public void attAutor(int id, String novoNome) {
        for (Autor autor : autores) {
            if (autor.getId() == id) {
                autor.setNome(novoNome);
                break;
            }
        }
    }

    public void rmvAutor(int id) {
        autores.removeIf(autor -> autor.getId() == id);
    }

    public void empLivro(Livro livro, String nomeUsuario) {
        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, nomeUsuario);
            emprestimos.add(emprestimo);
            livro.setDisponivel(false);
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(int idEmprestimo) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == idEmprestimo && emprestimo.isAtivo()) {
                emprestimo.devolverLivro();
                break;
            }
        }
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }
}

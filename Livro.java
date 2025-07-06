import java.util.Date;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private Date dataCad;
    private Date dataAtt;

    public Livro(int id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;  // Inicialmente, todos os livros são disponibilizados
        this.dataCad = new Date();
        this.dataAtt = new Date();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Date getDataCadastro() {
        return dataCad;
    }
    
    public Date getDataAtualizacao() {
        return dataAtt;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.dataAtt = new Date();
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", disponivel=" + disponivel +
                ", dataCadastro=" + dataCad +
                ", dataAtualizacao=" + dataAtt +
                '}';
    }
}
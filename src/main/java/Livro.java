public class Livro implements Cloneable {
    private String titulo;
    private Autor autor;
    private String editora;
    private int edicao;
    private int ano;

    public Livro(String titulo, Autor autor, String editora, int edicao, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public Livro clone() {
        try {
            Livro clone = (Livro) super.clone();
            clone.autor = clone.autor.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", editora='" + editora + '\'' +
                ", edicao=" + edicao +
                ", ano=" + ano +
                '}';
    }
}

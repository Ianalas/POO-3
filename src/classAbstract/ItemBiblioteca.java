package classAbstract;

public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private short ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "{ "+ titulo + ", " + autor + ", "+ ano;
    }

    public String toCSV() {
        return titulo + "," + autor + ","+ ano;
    }
}

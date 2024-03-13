package tec.poo.practica;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    private boolean disponible = true;

    public Libro() {

    }


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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestarLibro(){
        this.disponible = false;
    }

    public void devolverLibro(){
        this.disponible = true;
    }
}

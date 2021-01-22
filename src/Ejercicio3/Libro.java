package Ejercicio3;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;

    public Libro(){
        this.titulo = "";
        this.isbn = "";
        this.autor = "";
    }

    public Libro(String titulo, String isbn, String autor){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    @Override
    public String toString(){

        String str = this.titulo + " | " + this.isbn + " | " + this.autor;
        return str;
    }

    /*Override indica que quiere sobreescribir un metodo de una superclase en este caso Object, y nos indica error ya que el metodo
    tostring no existe.. en cambio el metodo toString si existe.
    * */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

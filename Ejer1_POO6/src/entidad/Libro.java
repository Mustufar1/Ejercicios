/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Carlos
 */
public class Libro {

    public String isbn;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {

    }
    public Libro(String isbn,String titulo,String autor,int numeroPaginas) {
        this.isbn =isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

}

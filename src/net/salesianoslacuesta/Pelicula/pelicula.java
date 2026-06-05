package net.salesianoslacuesta.Pelicula;

public class pelicula {
    
    private String titulo;
    private String genero;
    private int duracionMinutos;

    public pelicula (String titulo, String genero, int duracionMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int GetDuracionMinutos(){
        return duracionMinutos;
    }
}

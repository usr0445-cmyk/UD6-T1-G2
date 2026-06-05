package net.salesianoslacuesta.Participante;

public class participante {
    
    private String idJugador;
    private String nombre;
    private String categoria;

    public participante(String idJugador, String nombre, String categoria) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getIdJugador() {
        return idJugador;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    
    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Participante{" + "idJugador='" + idJugador + '\'' + ", nombre='" + nombre + '\'' + ", categoria='" + categoria + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
    participante otro = (participante) obj;
    return this.idJugador == (otro.idJugador);
}

}


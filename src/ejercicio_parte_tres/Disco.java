package ejercicio_parte_tres;

public class Disco {

    public enum Genero {
        ROCK, POP, JAZZ, BLUES
    }

    private String codigo;
    private String autor;
    private String titulo;
    private int duracion; // en minutos
    private Genero genero;

    public Disco(String codigo, String autor, String titulo, int duracion, Genero genero) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return codigo + " | " + autor + " | " + titulo +
               " | " + duracion + " min | " + genero;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Disco)) return false;

        Disco otro = (Disco) obj;
        return codigo.equalsIgnoreCase(otro.codigo);
    }
}
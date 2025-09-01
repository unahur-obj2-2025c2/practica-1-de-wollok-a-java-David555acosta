package ar.edu.unahur.obj2.wtoj.contenido;

public class Capitulo {
    private final String titulo;
    private final Integer numero;
    private Double costo;

    public Capitulo(String titulo, Integer numero, Double costo) {
        this.titulo = titulo;
        this.numero = numero;
        this.costo = costo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}

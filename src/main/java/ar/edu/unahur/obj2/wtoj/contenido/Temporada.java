package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    private final Integer numero;
    private List<Capitulo> capitulos = new ArrayList<>();

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public Temporada(Integer numero, List<Capitulo> capitulos) {
        this.numero = numero;
        this.capitulos = capitulos;
    }

    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public Integer getNumero() {
        return numero;
    }

    public Double costo() {
        return capitulos.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0);
    }
}

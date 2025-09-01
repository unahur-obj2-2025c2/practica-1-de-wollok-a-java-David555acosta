package ar.edu.unahur.obj2.wtoj.planes;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.Usuario;
import ar.edu.unahur.obj2.wtoj.contenido.Contenido;

public class PlanFamiliar implements Planeable {

    private Integer limite;

    public PlanFamiliar(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        // TODO Auto-generated method stub
        double costoBase = 5.0;

        List<Contenido> contenidos = usuario.getContenido();

        if (limite >= contenidos.size()) {
            return costoBase;
        } else {
            List<Contenido> excedentes = contenidos.subList(limite, contenidos.size());
            costoBase = costoBase + excedentes.stream().mapToDouble(c -> c.costo()).sum();
            return costoBase - ((costoBase * 15) / 100);
        }
    }
}

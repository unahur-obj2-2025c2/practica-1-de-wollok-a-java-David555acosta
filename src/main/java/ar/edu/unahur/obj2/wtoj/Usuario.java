package ar.edu.unahur.obj2.wtoj;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.PlanPremiun;
import ar.edu.unahur.obj2.wtoj.planes.Planeable;

public class Usuario {
    private Planeable plan = new PlanPremiun(12.0);
    private List<Contenido> contenidos = new ArrayList<>();


    public void VerContenido(Contenido contenido) {
        contenidos.add(contenido);
    }

    public Double costoMensual() {
        return plan.costoPlan(this);
    }

    public Planeable getPlaneable() {
        return plan;
    }

    public void SetPlan(Planeable plan) {
        this.plan = plan;
    }

    public List<Contenido> getContenido() {
        return new ArrayList<Contenido>();
    }

    public void limpiarContenidos() {
        contenidos.clear();
    }
}

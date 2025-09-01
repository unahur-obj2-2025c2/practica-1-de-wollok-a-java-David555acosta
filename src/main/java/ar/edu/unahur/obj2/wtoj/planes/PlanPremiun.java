package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.Usuario;

public class PlanPremiun implements Planeable {

    private Double costoMensual;

    

    public PlanPremiun(Double costoMensual) {
        this.costoMensual = costoMensual;
    }



    @Override
    public Double costoPlan(Usuario Usuario) {
        // TODO Auto-generated method stub
        return this.costoMensual;
    }

}

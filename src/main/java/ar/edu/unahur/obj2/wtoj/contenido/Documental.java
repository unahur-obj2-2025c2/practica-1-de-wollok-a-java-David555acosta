package ar.edu.unahur.obj2.wtoj.contenido;

public class Documental extends Contenido {

    public Documental(String titulo, Double costoBase) {
        super(titulo, costoBase);
        //TODO Auto-generated constructor stub
    }

    @Override
    protected Double doCosto() {
        // TODO Auto-generated method stub
        return IDRA.getIsnstance().getValor();
    }

}

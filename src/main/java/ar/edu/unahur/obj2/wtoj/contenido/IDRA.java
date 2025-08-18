package ar.edu.unahur.obj2.wtoj.contenido;

public class IDRA {
    private static IDRA isnstance = new IDRA();
    private double valor;

    public IDRA() {}

    public static IDRA getIsnstance () {
        return isnstance;
    }

    public static void setIsnstance(IDRA isnstance) {
        IDRA.isnstance = isnstance;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }    
}

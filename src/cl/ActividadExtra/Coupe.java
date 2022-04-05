package cl.ActividadExtra;

public class Coupe extends AutoMovil{
    public String Color;

    public Coupe(int numAuto,String patente, double valor, boolean arrendado,String Color) {
        super(numAuto,patente, valor, arrendado);
        this.Color = Color;
    }
}

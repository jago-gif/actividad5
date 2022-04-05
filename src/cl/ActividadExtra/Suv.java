package cl.ActividadExtra;

public class Suv extends AutoMovil{
    public String Color;
    public boolean DobleTraccion;
    public Suv(int numAuto,String patente, double valor, boolean arrendado,String Color, boolean DobleTraccion) {
        super(numAuto,patente, valor, arrendado);
        this.Color = Color;
        this.DobleTraccion = DobleTraccion;
    }
}

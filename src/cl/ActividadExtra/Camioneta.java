package cl.ActividadExtra;

public class Camioneta extends AutoMovil{
    public String Color;
    public boolean DobleTraccion;
    public Camioneta(int numAuto,String patente, double valor, boolean arrendado, String Color, boolean DobleTraccion) {
        super(numAuto,patente, valor, arrendado);
        this.Color = Color;
        this.DobleTraccion = DobleTraccion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isDobleTraccion() {
        return DobleTraccion;
    }

    public void setDobleTraccion(boolean dobleTraccion) {
        DobleTraccion = dobleTraccion;
    }
}

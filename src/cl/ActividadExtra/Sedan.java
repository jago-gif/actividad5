package cl.ActividadExtra;

public class Sedan extends AutoMovil{
    public String Color;
    public Sedan(int numAuto,String patente, double valor, boolean arrendado, String Color) {
        super(numAuto,patente, valor, arrendado);
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

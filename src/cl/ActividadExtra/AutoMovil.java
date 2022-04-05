package cl.ActividadExtra;

public class AutoMovil {
    public int numAuto;
    public String patente;
    public double valor;
    public boolean arrendado;

    public AutoMovil(int numAuto, String patente, double valor, boolean arrendado) {
        this.numAuto = numAuto;
        this.patente = patente;
        this.valor = valor;
        this.arrendado = arrendado;
    }

    public int getNumAuto() {
        return numAuto;
    }

    public void setNumAuto(int numAuto) {
        this.numAuto = numAuto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}

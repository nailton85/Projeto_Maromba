package br.ufpb.dcx.nailton.academia.usuario;

public class Dieta {
    private double caloria;
    private double macrosNutrientes;

    public Dieta(double caloria, double macrosNutrientes){
        this.caloria = caloria;
        this.macrosNutrientes = macrosNutrientes;
    }

    public double getCaloria() {
        return caloria;
    }

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }

    public double getMacrosNutrientes() {
        return macrosNutrientes;
    }

    public void setMacrosNutrientes(double macrosNutrientes) {
        this.macrosNutrientes = macrosNutrientes;
    }
}

package br.ufpb.dcx.nailton.academia.Usuario;

public class dadosfisicos {
    private double peso;
    private double altura;
    private int idade;
    public dadosfisicos(double peso, double altura, int idade){
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

package br.ufpb.dcx.nailton.academia.usuario.melhorarUsuario;

import br.ufpb.dcx.nailton.academia.usuario.Sexo;

import java.io.Serializable;

public class Dadosfisicos implements Serializable {
    private double peso;
    private double altura;
    private int idade;
    private Sexo sexo;
    public Dadosfisicos(double peso, double altura, int idade, Sexo sexo){
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

}

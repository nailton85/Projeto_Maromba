package br.ufpb.dcx.nailton.academia.usuario;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;

import java.util.List;

public class Usuario {
    private DadosDeUsuario dados;
    private Dadosfisicos fisico;
    private Dieta dieta;
    private List<Exercicio> exercicios;

    public Usuario(DadosDeUsuario dados, Dadosfisicos fisico, Dieta dieta){
        this.dados = dados;
        this.fisico = fisico;
        this.dieta = dieta;
    }

    public DadosDeUsuario getDados() {
        return dados;
    }

    public void setDados(DadosDeUsuario dados) {
        this.dados = dados;
    }

    public Dadosfisicos getFisico() {
        return fisico;
    }

    public void setFisico(Dadosfisicos fisico) {
        this.fisico = fisico;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    public void cauculaMacro(){

    }

    public double TMB(Sexo sexo, double peso, int idade, double altura) {
        return 0;
    }

    public double TMT(String nivelDeItensidade, double TMB) {
        return 0;
    }

}

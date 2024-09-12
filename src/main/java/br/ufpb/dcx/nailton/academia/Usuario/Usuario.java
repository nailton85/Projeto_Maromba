package br.ufpb.dcx.nailton.academia.Usuario;

import br.ufpb.dcx.nailton.treinos.Treino;

public class Usuario {
    private DadosDeUsuario dados;
    private dadosfisicos fisico;
    private Treino treino;
    private Dieta dieta;

    public Usuario(DadosDeUsuario dados, dadosfisicos fisico, Treino treino, Dieta dieta){
        this.dados = dados;
        this.fisico = fisico;
        this.treino = treino;
        this.dieta = dieta;
    }

    public DadosDeUsuario getDados() {
        return dados;
    }

    public void setDados(DadosDeUsuario dados) {
        this.dados = dados;
    }

    public dadosfisicos getFisico() {
        return fisico;
    }

    public void setFisico(dadosfisicos fisico) {
        this.fisico = fisico;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

}

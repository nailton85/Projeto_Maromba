package br.ufpb.dcx.nailton.academia.usuario;

public class Usuario {
    private DadosDeUsuario dados;
    private Dadosfisicos fisico;
    private Treino treino;
    private Dieta dieta;

    public Usuario(DadosDeUsuario dados, Dadosfisicos fisico, Treino treino, Dieta dieta){
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

    public Dadosfisicos getFisico() {
        return fisico;
    }

    public void setFisico(Dadosfisicos fisico) {
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

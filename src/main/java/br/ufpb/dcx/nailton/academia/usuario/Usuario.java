package br.ufpb.dcx.nailton.academia.usuario;

public class Usuario {
    private DadosDeUsuario dados;
    private Dadosfisicos fisico;
    private Dieta dieta;

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

}

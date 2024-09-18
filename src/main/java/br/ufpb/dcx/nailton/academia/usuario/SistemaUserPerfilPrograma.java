package br.ufpb.dcx.nailton.academia.usuario;

import java.util.List;

public class SistemaUserPerfilPrograma implements SistemaUserPerfil{

    @Override
    public void cadastraUsuario(Usuario aluno) throws UsuarioJaExisteException {

    }

    @Override
    public List<Usuario> loguinAluno(String email, String senha) {
        return null;
    }

    @Override
    public void rotinaDeTreinos(String diaDaSemada) {

    }

    @Override
    public double TMB(String Sexo, double peso, int idade, double altura) {
        return 0;
    }

    @Override
    public double TMT(String nivelDeItensidade, double TMB) {
        return 0;
    }

    @Override
    public double hidratacao(double peso) {
        return 0;
    }
}

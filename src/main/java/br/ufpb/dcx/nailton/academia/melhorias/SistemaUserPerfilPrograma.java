package br.ufpb.dcx.nailton.academia.melhorias;

import br.ufpb.dcx.nailton.academia.usuario.Usuario;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioJaExisteException;
import br.ufpb.dcx.nailton.academia.treino.MetodosUtilitariosEmplement;

public class SistemaUserPerfilPrograma extends MetodosUtilitariosEmplement implements SistemaUserPerfil {

    @Override
    public void cadastraUsuario(Usuario aluno) throws UsuarioJaExisteException {

    }


    @Override
    public void rotinaDeTreinos(String diaDaSemada) {

    }

    @Override
    public double hidratacao(double peso) {
        return 0;
    }
}

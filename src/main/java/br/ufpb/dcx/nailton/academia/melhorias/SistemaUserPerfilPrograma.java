package br.ufpb.dcx.nailton.academia.melhorias;

import br.ufpb.dcx.nailton.academia.treino.*;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioJaExisteException;

import java.io.IOException;
import java.util.List;

public class SistemaUserPerfilPrograma implements SistemaUserPerfil{

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

    @Override
    public void adicionaExercicio(String nome, String descicao, List<ParteDoCorpo> musculo) throws ExercicioJaExisteExeption {

    }

    @Override
    public void removerExercicio(String nome) throws ExercicioInexistenteExeption {

    }

    @Override
    public Exercicio pesquisaExercicio(String nome) throws ExercicioInexistenteExeption {
        return null;
    }

    @Override
    public List<Exercicio> filtrarExercicioPorTipo(List<ParteDoCorpo> tipo) throws TipoNuloException {
        return null;
    }

    @Override
    public void salvarDados() throws IOException {

    }

    @Override
    public void recuperarDados() throws IOException {

    }
}

package br.ufpb.dcx.nailton.academia.treino;

import br.ufpb.dcx.nailton.academia.util.MetodosUtilitariosEmplement;

import java.util.List;

public class MarombaSistremaGestaoDeExercicios extends MetodosUtilitariosEmplement implements SistemaGestaoDeExercicios{
    @Override
    public void adicionaExercicio(String nome, String descricao, partesDoCorpo musculo, String nomeDoGif) throws ExercicioJaExisteExeption {

    }

    @Override
    public void removerExercicio(String nome) throws ExercicioInexistenteExeption {

    }

    @Override
    public Exercicio pesquisaExercicio(String nome) throws ExercicioInexistenteExeption {
        return null;
    }

    @Override
    public List<Exercicio> filtrarExercicioPorTipo(partesDoCorpo tipo) throws TipoNuloException {
        return null;
    }
}

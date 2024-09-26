package br.ufpb.dcx.nailton.academia.treino;

import java.util.List;
import java.util.Map;

public class MarombaSistremaGestaoDeExercicios implements SistemaGestaoDeExercicios{
    private Map<String, Exercicio> Exercicio;
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

package br.ufpb.dcx.nailton.academia;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;
import br.ufpb.dcx.nailton.academia.treino.ExercicioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.treino.ParteDoCorpo;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;

public class SistemaMarombaFitTest {
    @Test
    public void ExercicoTest_Adiciona_remover_pesquisa_filtra() throws ExercicioInexistenteExeption {
        SistemaMarombaFitnessRioTinto testMaromba = new SistemaMarombaFitnessRioTinto();
        HashMap<String, Exercicio> exercicioMap = new HashMap<>();
        exercicioMap.put("agachamento", new Exercicio("agachamento", "exercicio para partes inferiores", Collections.singletonList(ParteDoCorpo.QUADRICEPS,ParteDoCorpo.POSTERIOR,ParteDoCorpo.GLUTEO)));
        exercicioMap.put("Elevação Pelvica",new Exercicio("Elevação Pelvica","Levante sua perna e escline levemnete",Collections.emptyList(ParteDoCorpo.GLUTEO,ParteDoCorpo.POSTERIOR));

        testMaromba.adicionaExercicio("Supino Reto","Perfeito para arias superiores", ParteDoCorpo.BICEPS,ParteDoCorpo.PEITO);
        testMaromba.adicionaExercicio("Cross over","Ótiomo para recupera rodas as fibras do peitoral",ParteDoCorpo.PEITO);

        testMaromba.pesquisaExercicio("Supino Reto");


    }
    private void Adiciona(){

    }
    private void remover(){

    }
}

package br.ufpb.dcx.nailton.academia;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;
import br.ufpb.dcx.nailton.academia.treino.ParteDoCorpo;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.*;

public class GravadorDeDadosTest {
    @Test
    public void testaGravacao()throws IOException {
        File arquivoAcademia = new File(GravadorDeDados.ARQUIVO_TREINOS);
        if(arquivoAcademia.exists()){
            arquivoAcademia.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_TREINOS);
        assertFalse(arquivo.exists());
        HashMap<String, Exercicio> exercicioMap = new HashMap<>();
        exercicioMap.put("agachamento búlgaro", new Exercicio("agachamento búlgaro", "exercicio para partes inferiores", Collections.singletonList(ParteDoCorpo.QUADRICEPS)));
        gravadorDeDados.salvarDadosExercicios(exercicioMap);
        assertTrue(arquivo.exists());
        arquivo.delete();
    }
    @Test
    public void testaRecupercao()throws IOException{
        File arquivoAcademia = new File(GravadorDeDados.ARQUIVO_TREINOS);
        if(arquivoAcademia.exists()){
            arquivoAcademia.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_TREINOS);
        assertFalse(arquivo.exists());
        HashMap<String, Exercicio> exercicioMap = new HashMap<>();
        exercicioMap.put("agachamento búlgaro", new Exercicio("agachamento búlgaro", "exercicio para partes inferiores", Collections.singletonList(ParteDoCorpo.QUADRICEPS)));
        gravadorDeDados.salvarDadosExercicios(exercicioMap);
        assertTrue(arquivo.exists());
        HashMap<String, Exercicio> exercicioRecuperados = gravadorDeDados.recuperarExercicios();
        Exercicio e1 = exercicioRecuperados.get("agachamento búlgaro");
        assertEquals(ParteDoCorpo.QUADRICEPS, e1.getMusculos());
        assertEquals("exercicio para partes inferiores", e1.getDescricao());
        assertEquals("agachamento búlgaro", e1.getNome());
        arquivo.delete();
    }
}

package br.ufpb.dcx.nailton.academia.treino;

import br.ufpb.dcx.nailton.academia.util.MetodosUtilitarios;

import java.io.IOException;
import java.util.List;

public interface SistemaGestaoDeExercicios extends MetodosUtilitarios {

    /**
     * Cadastra um Exercicio ao banco de dados
     * @param nome O nome do exercicio
     * @param descricao Uma descrição de como fazer o exercicio e de contra indicações
     * @param nomeDoGif O nome da imag que descrefe visualmente este exercicio
     * @return
     */
    public void adicionaExercicio(String nome, String descricao,partesDoCorpo musculo, String nomeDoGif) throws ExercicioJaExisteExeption;

    /**
     * Deleta um Exercio do banco de dados
     * @param nome O nome do exercicio
     */
    public void removerExercicio(String nome) throws ExercicioInexistenteExeption;
}

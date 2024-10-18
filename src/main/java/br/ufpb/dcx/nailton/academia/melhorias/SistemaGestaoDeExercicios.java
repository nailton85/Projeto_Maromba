package br.ufpb.dcx.nailton.academia.melhorias;

import br.ufpb.dcx.nailton.academia.treino.ExercicioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.treino.ExercicioJaExisteExeption;
import br.ufpb.dcx.nailton.academia.treino.ParteDoCorpo;
import br.ufpb.dcx.nailton.academia.SistemaMaromba;

public interface SistemaGestaoDeExercicios extends SistemaMaromba {

    /**
     * Cadastra um Exercicio ao banco de dados
     * @param nome O nome do exercicio
     * @param descricao Uma descrição de como fazer o exercicio e de contra indicações
     * @param nomeDoGif O nome da imag que descrefe visualmente este exercicio
     * @return
     */
    public void adicionaExercicio(String nome, String descricao, ParteDoCorpo musculo, String nomeDoGif) throws ExercicioJaExisteExeption;

    /**
     * Deleta um Exercio do banco de dados
     * @param nome O nome do exercicio
     */
    public void removerExercicioDaTabela(String nome) throws ExercicioInexistenteExeption;
}

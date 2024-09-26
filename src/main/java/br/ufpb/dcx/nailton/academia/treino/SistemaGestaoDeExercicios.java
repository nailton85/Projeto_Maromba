package br.ufpb.dcx.nailton.academia.treino;

import br.ufpb.dcx.nailton.dados.GerenciaArmazenamento;

import java.util.List;

public interface SistemaGestaoDeExercicios extends GerenciaArmazenamento {

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

    /**
     * Busca um Exercicio no bancode dados
     * @param nome O nome do exercicio
     * @return Exercicio o exercicio equevalente ao nome passado
     */
    public Exercicio pesquisaExercicio(String nome) throws ExercicioInexistenteExeption;

    /**
     * Filtra os exercicios do banco de dados pela parte do corpo trabalhada
     * @param tipo O tipo é a parte do corpo em que este exercicio foca
     * @return Uma Lista de exercicios que trabalhão esta area corporal
     */
    public List<Exercicio> filtrarExercicioPorTipo(partesDoCorpo tipo) throws TipoNuloException;
}

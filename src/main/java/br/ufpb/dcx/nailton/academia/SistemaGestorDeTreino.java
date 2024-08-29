package br.ufpb.dcx.nailton.academia;

import java.util.List;

public interface SistemaGestorDeTreino {
    /**
     *
     * @param aluno
     * @throws AlunoJaExisteException
     */
    public void cadastraAluno(Aluno aluno)throws AlunoJaExisteException;

    /**
     *
     * @param email
     * @param senha
     * @return
     */
    public List<Aluno> loguinAluno(String email, String senha);

    /**
     *
     * @param diaDaSemada
     */
    public void rotinaDeTreinos(List<Treino>, String diaDaSemada);

    /**
     *
     * @param Sexo
     * @param peso
     * @param idade
     * @param altura
     * @return
     */
    public double TMB(String Sexo, double peso, int idade, double altura);

    /**
     *
     * @param nivelDeItensidade
     * @param TMB
     * @return
     */
    public double TMT(String nivelDeItensidade, double TMB);

    /**
     *
     * @param peso
     * @return
     */
    public double hidratacao(double peso);


}

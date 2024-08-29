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
     * @param hora
     */
    public void rotinaDeTreinos(List<Treino>, String diaDaSemada, String hora);

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
     * @param GrauDeAtividade
     * @param TMB
     * @return
     */
    public double TMT(String GrauDeAtividade, double TMB);


}

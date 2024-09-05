package br.ufpb.dcx.nailton.academia.Usuario;

import java.util.List;

public interface SistemaUserPerfil {
    /**
     *
     * @param aluno
     * @throws UsuarioJaExisteException
     */
    public void cadastraUsuario(Usuario aluno)throws UsuarioJaExisteException;

    /**
     *
     * @param email
     * @param senha
     * @return
     */
    public List<Usuario> loguinAluno(String email, String senha);

    /**
     *
     * @param diaDaSemada
     */
    public void rotinaDeTreinos(String diaDaSemada);

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

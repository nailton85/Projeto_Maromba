package br.ufpb.dcx.nailton.academia.usuario;

import br.ufpb.dcx.nailton.academia.util.MetodosUtilitarios;

public interface SistemaUserPerfil extends MetodosUtilitarios {
    /**
     *
     * @param aluno
     * @throws UsuarioJaExisteException
     */
    public void cadastraUsuario(Usuario aluno)throws UsuarioJaExisteException;

    /**
     *
     * @param diaDaSemada
     */
    public void rotinaDeTreinos(String diaDaSemada);

    /**
     *
     * @param peso
     * @return
     */
    public double hidratacao(double peso);


}

package br.ufpb.dcx.nailton.academia.melhorias;

import br.ufpb.dcx.nailton.academia.usuario.Usuario;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioJaExisteException;
import br.ufpb.dcx.nailton.academia.SistemaMaromba;

public interface SistemaUserPerfil extends SistemaMaromba {
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

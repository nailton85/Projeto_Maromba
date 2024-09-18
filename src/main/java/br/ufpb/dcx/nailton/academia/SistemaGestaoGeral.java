package br.ufpb.dcx.nailton.academia;


import br.ufpb.dcx.nailton.academia.treino.Treino;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;

public interface SistemaGestaoGeral {
    public static final String PREFIXO_LINK_GIF = "./imgs/gif/";

    /**
     *
     * @param nome
     * @param descricao
     * @param nomeDoGif
     * @return
     */
    public Treino adicionaTreino(String nome, String descricao, String nomeDoGif);

    /**
     *
     * @param tipoDeTreino
     * @param nome
     */
    public void removerExercicio(String tipoDeTreino,String nome);

    /**
     *
     * @param ID
     */
    public void deletarContaDeUsuario(String ID);

    /**
     *
     * @param nomeDeUsuario
     * @return
     */
    public Usuario pesquisaUsuario(String nomeDeUsuario);


}

package br.ufpb.dcx.nailton.academia.util;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;
import br.ufpb.dcx.nailton.academia.treino.ExercicioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.treino.TipoNuloException;
import br.ufpb.dcx.nailton.academia.treino.partesDoCorpo;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioJaExisteException;

import java.io.IOException;
import java.util.List;

public interface MetodosUtilitarios {
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
    public void cadastraUsuario(String nome, String email) throws UsuarioJaExisteException;

    public void removerUsuario(Usuario usuario) throws UsuarioInexistenteExeption;


    public void salvarDados() throws IOException;
    public void recuperarDados() throws IOException;
}

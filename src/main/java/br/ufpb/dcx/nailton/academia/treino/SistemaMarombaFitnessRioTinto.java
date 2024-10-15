package br.ufpb.dcx.nailton.academia.treino;

import br.ufpb.dcx.nailton.academia.usuario.Usuario;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioJaExisteException;
import br.ufpb.dcx.nailton.academia.util.GravadorDeDados;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaMarombaFitnessRioTinto implements SistemaMaromba {
    private HashMap<String, Exercicio> exercicios;
    private Map<String, Usuario> usuarios;

    private GravadorDeDados gravador;
    ;

    public SistemaMarombaFitnessRioTinto(){
        this.exercicios = new HashMap<>();
        this.gravador = new GravadorDeDados();
        this.usuarios = new HashMap<>();
    }



    @Override
    public Exercicio pesquisaExercicio(String nome) throws ExercicioInexistenteExeption {
        if(this.exercicios.containsKey(nome)){
            //TODO: pega com get
        }
        throw new ExercicioInexistenteExeption("Exercicio "+nome+" não foi encontrado");
    }

    @Override
    public List<Exercicio> filtrarExercicioPorTipo(ParteDoCorpo tipo) throws TipoNuloException {

        return null;
    }

    @Override
    public void cadastraUsuario(String nome, String email) throws UsuarioJaExisteException {
        if(this.usuarios.containsKey(nome)){
            throw new UsuarioJaExisteException("Já existe usuario cadastrado");
        }else{
//            Usuario u = new Usuario(nome, email);
//            this.usuario.put(nome, u);
        }
    }

    @Override
    public void removerUsuario(Usuario usuario) throws UsuarioInexistenteExeption {

    }

    @Override
    public void salvarDados() throws IOException {
        this.gravador.salvarArquivos(this.exercicios);
        //TODO: Salvar usuários
    }

    @Override
    public void recuperarDados() throws IOException {
        this.exercicios = this.gravador.recuperarArquivo();
        this.usuarios = this.gravador.recuperarUsuarios();
    }
}

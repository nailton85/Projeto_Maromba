package br.ufpb.dcx.nailton.academia.util;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;
import br.ufpb.dcx.nailton.academia.treino.ExercicioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.treino.TipoNuloException;
import br.ufpb.dcx.nailton.academia.treino.partesDoCorpo;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;
import br.ufpb.dcx.nailton.academia.usuario.UsuarioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.util.MetodosUtilitarios;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetodosUtilitariosEmplement implements MetodosUtilitarios {
    private HashMap<String, Exercicio> exercicio;
    private Map<String, Usuario> usuario;

    private GravadorDeDados gravador;

    public MetodosUtilitariosEmplement(){
        this.exercicio = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }



    @Override
    public Exercicio pesquisaExercicio(String nome) throws ExercicioInexistenteExeption {
        return null;
    }

    @Override
    public List<Exercicio> filtrarExercicioPorTipo(partesDoCorpo tipo) throws TipoNuloException {
        return null;
    }

    @Override
    public void removerUsuario(Usuario usuario) throws UsuarioInexistenteExeption {

    }

    @Override
    public void salvarDados() throws IOException {
        this.gravador.salvarArquivos(this.exercicio);
    }

    @Override
    public void recuperarDados() throws IOException {
        this.exercicio = this.gravador.recuperarArquivo();
    }
}

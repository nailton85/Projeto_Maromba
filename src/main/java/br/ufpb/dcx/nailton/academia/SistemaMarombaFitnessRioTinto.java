package br.ufpb.dcx.nailton.academia;

import br.ufpb.dcx.nailton.academia.treino.*;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SistemaMarombaFitnessRioTinto implements SistemaMaromba {
    private HashMap<String, Exercicio> exercicios;
    private Usuario usuario;
    private GravadorDeDados gravador;
    ;

    public SistemaMarombaFitnessRioTinto(){
        this.exercicios = new HashMap<>();
        this.gravador = new GravadorDeDados();
        this.usuario = null;

    }


    @Override
    public void adicionaExercicio(String nome, String descicao, List<ParteDoCorpo> musculo) throws ExercicioJaExisteExeption {
        if (this.exercicios.containsKey(nome)){
            throw new ExercicioJaExisteExeption("Exercio "+nome+" ja se encontra no banco de dados");
        }else{
            Exercicio e = new Exercicio(nome, descicao,musculo);
            this.exercicios.put(nome,e);
        }
    }

    @Override
    public void removerExercicio(String nome) throws ExercicioInexistenteExeption {
        if (this.exercicios.containsKey(nome)) {
            this.exercicios.remove(nome);
        }else{
            throw new ExercicioInexistenteExeption("Exercicio "+nome+" não encontrado");
        }
    }

    @Override
    public Exercicio pesquisaExercicio(String nome) throws ExercicioInexistenteExeption {
        if(this.exercicios.containsKey(nome)){
            return this.exercicios.get(nome);
        }
        throw new ExercicioInexistenteExeption("Exercicio "+nome+" não foi encontrado");
    }

    @Override
    public List<Exercicio> filtrarExercicioPorTipo(ParteDoCorpo tipo) throws TipoNuloException {
        if(tipo == null){
            throw new TipoNuloException("cscs");
        }

        List<Exercicio> exerciciosDoTipo = new ArrayList<>();
        for(Exercicio c: this.exercicios.values()){
            if (c.getMusculos().contains(tipo)){
                exerciciosDoTipo.add(c);
            }
        }
        return exerciciosDoTipo;
    }


    @Override
    public void salvarDados() throws IOException {
        this.gravador.salvarDadosExercicios(this.exercicios);
        this.gravador.salvarDadosUsuario(this.usuario);
    }

    @Override
    public void recuperarDados() throws IOException {
        this.exercicios = this.gravador.recuperarExercicios();
        this.usuario = this.gravador.recuperarUsuario();
    }
}

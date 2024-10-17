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

    private GravadorDeDados gravador;
    ;

    public SistemaMarombaFitnessRioTinto(){
        this.exercicios = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }


    @Override
    public void adicionaExercicio(String nome, String descicao, List<ParteDoCorpo> musculo) throws ExercicioJaExisteExeption{
        if (this.exercicios.containsKey(nome)){
            throw new ExercicioJaExisteExeption("Exercio "+nome+" ja se encontra no banco de dados");
        }else{
            Exercicio e = new Exercicio(nome, descicao,musculo);
            this.exercicios.put(nome,e);
        }
    }

    @Override
    public void removerExercicio(String nome) throws ExercicioInexistenteExeption{
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
    public List<Exercicio> filtrarExercicioPorTipo(List<ParteDoCorpo> tipo) throws TipoNuloException {
//        Collection<Exercicio> exerciciosDoTipo = new ArrayList<>();
//        for(Exercicio c: this.exercicios.values()){
//            if (c.getMusculos()==tipo){
//                exerciciosDoTipo.add(c);
//            }
//        }
//        return exerciciosDoTipo;
        throw new TipoNuloException("cbshihcb");
    }


    @Override
    public void salvarDados() throws IOException {
        this.gravador.salvarDados(this.exercicios);
        //TODO: Salvar usuários
    }

    @Override
    public void recuperarDados() throws IOException {
        this.exercicios = this.gravador.recuperarExercicios();
    }
}

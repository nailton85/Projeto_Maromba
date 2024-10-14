package br.ufpb.dcx.nailton.academia.treino;

import java.util.Objects;

public class Exercicio {
    private String nome;
    private String descricao; //Talvez criar um objeto para descrição
    private partesDoCorpo musculo;

    public Exercicio(String nome, String descricao, partesDoCorpo musculo){
        this.nome = nome;
        this.descricao = descricao;
        this.musculo = musculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public partesDoCorpo getMusculo() {
        return musculo;
    }

    public void setMusculo(partesDoCorpo musculo) {
        this.musculo = musculo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercicio exercicio = (Exercicio) o;
        return Objects.equals(nome, exercicio.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

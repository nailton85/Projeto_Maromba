package br.ufpb.dcx.nailton.academia.ADM;


import br.ufpb.dcx.nailton.treinos.Treino;

import java.util.List;

public interface SistemaGestaoGeral {
    public static final String PREFIXO_LINK = "./imgs/gif/";

    public List<Treino> adicionaTreino(String nome, String descricao);

}

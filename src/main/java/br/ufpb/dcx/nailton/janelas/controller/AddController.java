package br.ufpb.dcx.nailton.janelas.controller;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddController {
    private Exercicio exercicio;
    private JFrame janelaPrincipal;

    public AddController(Exercicio exercicio, JFrame janelaPrincipal){
        this.exercicio = exercicio;
        this.janelaPrincipal = janelaPrincipal;
    }

    public void actionPerformed(ActionEvent e) {

    }
}

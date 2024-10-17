package br.ufpb.dcx.nailton.janelas.controller;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AdicionarExercicioAddControler {
    private Exercicio exercicio;
    private JFrame janelaPrincipal;

    public AdicionarExercicioAddControler(Exercicio exercicio, JFrame janelaPrincipal){
        this.exercicio = exercicio;
        this.janelaPrincipal = janelaPrincipal;
    }

    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,"D");

    }
}

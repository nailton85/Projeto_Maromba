package br.ufpb.dcx.nailton.gui;

import br.ufpb.dcx.nailton.academia.SistemaMarombaFitnessRioTinto;
import br.ufpb.dcx.nailton.academia.treino.Exercicio;
import br.ufpb.dcx.nailton.academia.treino.ParteDoCorpo;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class janelaExercicioDoUsuario extends JFrame {
    JLabel linha1, linha2;
    public janelaExercicioDoUsuario(){
        setTitle("Planilha de Exercicos");
        setSize(800,600);
        setLocation(250,250);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        ConfingLinha1();

        Exercicio exercicio1Teste = new Exercicio("Clestenia","asbdchabcashbcdjsac", Arrays.asList(ParteDoCorpo.BICEPS,ParteDoCorpo.COSTAS));


    }

    private void ConfingLinha1() {
        linha1 = new JLabel("Exercicios agendados", JLabel.CENTER);
        linha1.setForeground(Color.pink);
        linha1.setFont(new Font("Serif",Font.BOLD, 30));

        getContentPane().add(linha1);
    }

    private void MostraExercicio(){
        linha2 = new JLabel();

        getContentPane().add(linha2);
    }

    public static void main(String [] args){
        JFrame janelaDeExercicio = new janelaExercicioDoUsuario();
        janelaDeExercicio.setVisible(true);
        janelaDeExercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

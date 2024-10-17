package br.ufpb.dcx.nailton.janelas.gui;

import br.ufpb.dcx.nailton.academia.melhorias.SistemaUserPerfil;
import br.ufpb.dcx.nailton.academia.melhorias.SistemaUserPerfilPrograma;
import br.ufpb.dcx.nailton.academia.treino.Exercicio;
import br.ufpb.dcx.nailton.academia.treino.ExercicioInexistenteExeption;
import br.ufpb.dcx.nailton.academia.treino.SistemaMarombaFitnessRioTinto;

import javax.swing.*;
import java.awt.*;

public class janelaPrincipalComMenu extends JFrame {
    private Image princ;
    ImageIcon testeFundo = new ImageIcon("./img/fundo.jpg");
    JLabel linha1, linha2;
    JButton linha3;
    ImageIcon imagenTeste = new ImageIcon("./img/Pesos.jpg");
    SistemaUserPerfil Usuario = new SistemaUserPerfilPrograma();
    SistemaMarombaFitnessRioTinto exercicio = new SistemaMarombaFitnessRioTinto();
    JMenuBar barraDeMenu = new JMenuBar();

    public janelaPrincipalComMenu(){
        setTitle("aaaaaaaaa");
        setSize(800,600);
        setLocation(250,250);
        setResizable(false);

        barraMenu();
//        imagensDaJanela();
        fundo();

    }
    private void fundo(){
        princ = new ImageIcon("./img/fundo.jpg").getImage();
        getContentPane().add(new janelaPrincipalComMenu.PanelConFondo());
        linha1 = new JLabel(testeFundo, JLabel.CENTER);
    }
    private void imagensDaJanela(){
        linha3 = new JButton("vvvvvvvvvv");
        setLayout(new GridLayout(3,1));
        add(linha3);
    }

    private void barraMenu() {
        JMenu menuCadastaTreinos = new JMenu("Exercicios");
        JMenuItem menuVerExercicios = new JMenuItem("Tabela Exercicos");
        JMenu menuAdicionaExercicios = new JMenu("Escolha seus exercicos");
        JMenuItem menuPesquisaExercicio = new JMenuItem("Pesquisar");
        JMenuItem menuFiltraExercicio = new JMenuItem("Filtra");
        JMenuItem menuRemoverExercicio = new JMenuItem("Remover Exercicio");

        menuAdicionaExercicios.add(menuFiltraExercicio);
        menuAdicionaExercicios.add(menuPesquisaExercicio);
        menuCadastaTreinos.add(menuVerExercicios);
        menuCadastaTreinos.add(menuAdicionaExercicios);
        menuCadastaTreinos.add(menuRemoverExercicio);

        JMenu editarDados = new JMenu("Dieta");
        JMenuItem historicoAlimentar = new JMenuItem("Histórico Alimentar");
        JMenuItem menuCauculaDieta = new JMenuItem("Calcular Dieta");
        editarDados.add(historicoAlimentar);
        editarDados.add(menuCauculaDieta);

        menuPesquisaExercicio.addActionListener(
                (ae) ->{
                    String nome = JOptionPane.showInputDialog(this,"Digite o nome do exercicio");
                    try {
                        Exercicio procura = exercicio.pesquisaExercicio(nome);
                    } catch (ExercicioInexistenteExeption e) {
                        throw new RuntimeException(e);
                    }

                });
        menuVerExercicios.addActionListener(
                (ae)->{


        });

        menuFiltraExercicio.addActionListener(
                (ae) ->{



        });


        barraDeMenu.add(menuCadastaTreinos);
        barraDeMenu.add(editarDados);
        setJMenuBar(barraDeMenu);
    }
    private class PanelConFondo extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(princ, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String [] args){
        JFrame janela = new janelaPrincipalComMenu();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

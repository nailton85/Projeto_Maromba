package br.ufpb.dcx.nailton.janelas.gui;

import br.ufpb.dcx.nailton.academia.usuario.DadosDeUsuario;
import br.ufpb.dcx.nailton.academia.usuario.SistemaUserPerfil;
import br.ufpb.dcx.nailton.academia.usuario.SistemaUserPerfilPrograma;

import javax.swing.*;
import java.awt.*;

public class janelaPrincipalComMenu extends JFrame {
    private Image princ;
    ImageIcon testeFundo = new ImageIcon("./img/fundo.jpg");
    JLabel linha1, linha2;
    JButton linha3;
    ImageIcon imagenTeste = new ImageIcon("./img/Pesos.jpg");
    SistemaUserPerfil Usuario = new SistemaUserPerfilPrograma();
    JMenuBar barraDeMenu = new JMenuBar();

    public janelaPrincipalComMenu(){
        setTitle("aaaaaaaaa");
        setSize(800,600);
        setLocation(250,250);
        setResizable(false);

        barraMenu();
        imagensDaJanela();
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
        JMenuItem menuAdicionaExercicios = new JMenuItem("Escolha seus exercicos");
        JMenuItem menuPesquisaExercicio = new JMenuItem("Pesquisa exercicio");
        menuCadastaTreinos.add(menuAdicionaExercicios);
        menuCadastaTreinos.add(menuPesquisaExercicio);

        JMenu editarDados = new JMenu("Dieta");
        JMenuItem menuEditaDieta = new JMenuItem("Adicionar Dieta");
        JMenuItem menuCauculaDieta = new JMenuItem("Caucular Dieta");
        editarDados.add(menuEditaDieta);
        editarDados.add(menuCauculaDieta);


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

package br.ufpb.dcx.nailton.janelas.gui;

import javax.swing.*;
import java.awt.*;

public class janelaPrincipal extends JFrame {
    private Image princ;
    JLabel linha1;
    ImageIcon tela = new ImageIcon("./img/fundo.jpg");

    public janelaPrincipal(){
        setTitle("aaaaaaaaa");
        setSize(800,600);
        setLocation(250,250);
        setResizable(true);
        princ = new ImageIcon("./img/fundo.jpg").getImage();
        getContentPane().add(new PanelConFondo());
        linha1 = new JLabel(tela, JLabel.CENTER);


    }
    private class PanelConFondo extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(princ, 0, 0, getWidth(), getHeight(), this);
        }
    }
    public static void main (String [] args){
        JFrame janela = new janelaPrincipal();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

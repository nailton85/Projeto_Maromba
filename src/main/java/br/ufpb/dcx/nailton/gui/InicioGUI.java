package br.ufpb.dcx.nailton.gui;

import javax.swing.*;
import java.awt.*;

public class InicioGUI extends JFrame {
    JLabel linha1, linha2;
    ImageIcon tela = new ImageIcon("./img/academia.jpg");

    public InicioGUI(){
        setTitle("Aguma coisa");
        setSize(800, 600); //tamanho da janela
        setLocation(250, 280);
        setResizable(false);
    }

}

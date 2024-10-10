package br.ufpb.dcx.nailton.janelas.gui;

import br.ufpb.dcx.nailton.academia.usuario.DadosDeUsuario;
import br.ufpb.dcx.nailton.academia.usuario.SistemaUserPerfil;
import br.ufpb.dcx.nailton.academia.usuario.SistemaUserPerfilPrograma;

import javax.swing.*;

public class janelaPrincipalComMenu extends JFrame {
    JLabel linha1, linha2;
    SistemaUserPerfil Usuario = new SistemaUserPerfilPrograma();
    JMenuBar barraDeMenu = new JMenuBar();

    public janelaPrincipalComMenu(){

        JMenu menuCadastaTreinos = new JMenu("Exercicios");
        JMenuItem menuAdicionaExercicios = new JMenuItem("Escolha seus exercicos");
        menuCadastaTreinos.add(menuAdicionaExercicios);


    }
}

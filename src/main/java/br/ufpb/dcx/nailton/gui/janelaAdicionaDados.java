package br.ufpb.dcx.nailton.gui;

import br.ufpb.dcx.nailton.academia.SistemaMarombaFitnessRioTinto;
import br.ufpb.dcx.nailton.academia.melhorias.SistemaUserPerfil;
import br.ufpb.dcx.nailton.academia.melhorias.SistemaUserPerfilPrograma;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class janelaAdicionaDados extends JDialog {
    SistemaMarombaFitnessRioTinto Usuario = new SistemaMarombaFitnessRioTinto();
    private boolean existeDadosParaEsteUsuario = false;
    public janelaAdicionaDados(){
        setTitle("Adicione seu dados ao sistema");
        setSize(800,200);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2));

        JLabel labelUsuario = new JLabel("Nome:");
        JTextField campoUsuario = new JTextField();

        JLabel labelEmail = new JLabel("Email:");
        JTextField campoEmail = new JTextField();

        JLabel labelNomeDeUsuario = new JLabel("Nome de Usuario:");
        JTextField campoNomeUser = new JTextField();


        JButton botaoCadastra = new JButton("Cadastrar-me");
        JButton botaoCancelar = new JButton("Cancelar");

        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelEmail);
        painel.add(campoEmail);
        painel.add(labelNomeDeUsuario);
        painel.add(campoNomeUser);
        painel.add(botaoCadastra);
        painel.add(botaoCancelar);

        botaoCadastra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String email= campoEmail.getText();
                String nomeUsuario = campoUsuario.getText();

                if (Usuario == null) {
                    Usuario.cadastraUsuario(usuario,email,nomeUsuario);
                    existeDadosParaEsteUsuario = true;
                    dispose(); // Fecha a janela de login
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ja existe no banco de dados");
                }
            }
        });
        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela de login sem autenticar
            }
        });

        getContentPane().add(painel);
    }
    public boolean isExisteDadosParaEsteUsuario(){
        return existeDadosParaEsteUsuario;
    }
    public static void main(String[]args){
        JDialog janela = new janelaAdicionaDados();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

package br.ufpb.dcx.nailton.gui;

import br.ufpb.dcx.nailton.academia.SistemaMarombaFitnessRioTinto;
import br.ufpb.dcx.nailton.academia.melhorias.SistemaUserPerfil;
import br.ufpb.dcx.nailton.academia.melhorias.SistemaUserPerfilPrograma;
import br.ufpb.dcx.nailton.academia.treino.*;

import javax.swing.*;
import java.awt.*;

public class janelaPrincipalComMenu extends JFrame {
    private Image princ;
    ImageIcon testeFundo = new ImageIcon("./img/fundo.jpg");
    JLabel linha1;
    SistemaMarombaFitnessRioTinto Usuario = new SistemaMarombaFitnessRioTinto();
    SistemaMarombaFitnessRioTinto exercicio = new SistemaMarombaFitnessRioTinto();
    JMenuBar barraDeMenu = new JMenuBar();

    public janelaPrincipalComMenu(){
        setTitle("Planejamento de Exercicos");
        setSize(800,600);
        setLocation(250,250);
        setResizable(false);

        //Chamar a janela de incerir os dados
        if (exibirJanelaParaAdicionarDados()) {
            JLabel rotulo = new JLabel("Bem-vindo à Janela Principal!", SwingConstants.CENTER);
            getContentPane().add(rotulo);

//        }else {
//            JOptionPane.showInputDialog(this,"Dados de usuario não foram adicionados");
//            System.exit(0);
        }
        barraMenu();
        fundo();

    }
    private boolean exibirJanelaParaAdicionarDados(){
        janelaAdicionaDados dados = new janelaAdicionaDados();
        dados.setVisible(true);
        return dados.isExisteDadosParaEsteUsuario();
    }
    private void fundo(){
        princ = new ImageIcon("./img/fundo.jpg").getImage();
        getContentPane().add(new janelaPrincipalComMenu.PanelConFondo());
        linha1 = new JLabel(testeFundo, JLabel.CENTER);
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

        JMenu dadosUsuario = new JMenu("Meus Dados");
        JMenuItem editarDadosUsuario = new JMenuItem("Editar");
        JMenuItem verDados = new JMenuItem("Perfil");
        dadosUsuario.add(editarDadosUsuario);
        dadosUsuario.add(verDados);


        ExercicioMenu(menuPesquisaExercicio, menuVerExercicios, menuFiltraExercicio);
        DietaMenu (historicoAlimentar,menuCauculaDieta);
        perfilMenu(editarDadosUsuario, verDados);

        barraDeMenu.add(menuCadastaTreinos);
        barraDeMenu.add(editarDados);
        barraDeMenu.add(dadosUsuario);
        setJMenuBar(barraDeMenu);
    }
    private void DietaMenu(JMenuItem historicoAlimentar, JMenuItem menuCauculaDieta){
        historicoAlimentar.addActionListener((ae)-> {

        });
        menuCauculaDieta.addActionListener((ae)->{
            Double peso = Double.parseDouble(JOptionPane.showInputDialog(this,"Digite seu peso Kg"));
            Double altura = Double.parseDouble(JOptionPane.showInputDialog(this,"Digite seu altura em METROS"));
            int idade = Integer.parseInt(JOptionPane.showInputDialog(this,"Digite sua Idade"));
            //Todo:
        });
    }

    private void ExercicioMenu(JMenuItem menuPesquisaExercicio, JMenuItem menuVerExercicios, JMenuItem menuFiltraExercicio) {
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
                    janelaExercicioDoUsuario tabelaExercicio = new janelaExercicioDoUsuario();
                    tabelaExercicio.setVisible(true);


        });

        menuFiltraExercicio.addActionListener(
                (ae) ->{
                    String menbro = JOptionPane.showInputDialog(this,"Escolha um dos tipos abaixo");
//                    ParteDoCorpo tipo = exercicio.filtrarExercicioPorTipo(menbro);
                    //TODO:


        });
    }
    private void perfilMenu(JMenuItem editarDadosUsuario, JMenuItem verDados){
        editarDadosUsuario.addActionListener(
                (ae) ->{

        });
        verDados.addActionListener(
                (ae)->{



        });
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

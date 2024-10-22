package br.ufpb.dcx.nailton.gui;

import br.ufpb.dcx.nailton.academia.SistemaMarombaFitnessRioTinto;
import br.ufpb.dcx.nailton.academia.treino.*;
import br.ufpb.dcx.nailton.academia.usuario.SemanaDia;
import br.ufpb.dcx.nailton.academia.usuario.Sexo;
import br.ufpb.dcx.nailton.academia.usuario.TabelaDeTreino;
import br.ufpb.dcx.nailton.gui.NTempo.janelaAdicionaDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class janelaPrincipalComMenu extends JFrame {
    private Image princ;
    ImageIcon testeFundo = new ImageIcon("./img/fundo.jpg");
    JLabel linha1;
    SistemaMarombaFitnessRioTinto exercicio = new SistemaMarombaFitnessRioTinto();
    JMenuBar barraDeMenu = new JMenuBar();

    public janelaPrincipalComMenu(){
        setTitle("Planejamento de Exercicos:");
        setSize(800,600);
        setLocation(250,250);
        setResizable(false);
        try {
            exercicio.recuperarDados();
            JOptionPane.showMessageDialog(this, "Dados recuperados com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao recuperar dados: " + e.getMessage());
        }

        // Verifica se o usuário está cadastrado
        if (exercicio.getUsuario() == null) {
            cadastraUsuario();
        }
        barraMenu();
        fundo();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    exercicio.salvarDados(); // Tente salvar os dados
                } catch (IOException ex) {
                    ex.printStackTrace(); // Exiba a exceção no console
                }
                dispose(); // Fecha a janela
            }
        });

    }
    private void fundo(){
        princ = new ImageIcon("./img/fundo.jpg").getImage();
        getContentPane().add(new janelaPrincipalComMenu.PanelConFondo());
        linha1 = new JLabel(testeFundo, JLabel.CENTER);
    }
    private void cadastraUsuario() {
        String nome = JOptionPane.showInputDialog(this, "Digite seu nome:");
        String email = JOptionPane.showInputDialog(this, "Digite seu email:");
        String nomeDeUsuario = JOptionPane.showInputDialog(this, "Digite um nome de usuário:");

        // Aqui você deve adicionar a lógica para cadastrar o usuário no sistema
        exercicio.cadastraUsuario(nome, email, nomeDeUsuario);
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
        JMenuItem hidratacao = new JMenuItem("Hidratação");
        JMenuItem menuCauculaDieta = new JMenuItem("Calcular Dieta");
        editarDados.add(hidratacao);
        editarDados.add(menuCauculaDieta);


        ExercicioMenu(menuPesquisaExercicio, menuVerExercicios, menuFiltraExercicio,menuRemoverExercicio);
        DietaMenu (hidratacao,menuCauculaDieta);

        barraDeMenu.add(menuCadastaTreinos);
        barraDeMenu.add(editarDados);
        setJMenuBar(barraDeMenu);
    }
    private void DietaMenu(JMenuItem hidratacao, JMenuItem menuCauculaDieta){
        hidratacao.addActionListener((ae)-> {
            Double peso = Double.parseDouble(JOptionPane.showInputDialog(this,"Digite se pego Kg"));
            JOptionPane.showMessageDialog(this,"Vc deve beber no maximo "+exercicio.hidratacao(peso)+" litros por dia");

        });
        menuCauculaDieta.addActionListener((ae) -> {
            Double peso = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite seu peso Kg"));
            Double altura = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite sua altura em METROS"));
            int idade = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite sua Idade"));

            String[] opcoesSexo = {"Masculino", "Feminino"};
            int resposta = JOptionPane.showOptionDialog(this, "Selecione seu sexo:", "Sexo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoesSexo, opcoesSexo[0]);

            Sexo sexo;
            if (resposta == 0) {
                sexo = Sexo.M;  // Masculino
            } else if (resposta == 1) {
                sexo = Sexo.F;  // Feminino
            } else {
                // Tratar caso em que o usuário cancela ou não escolhe
                JOptionPane.showMessageDialog(this, "Sexo não selecionado.");
                return;
            }
            JOptionPane.showMessageDialog(this, "Você deve ingerir no minimo "+exercicio.cauculaDieta(peso, altura, idade, sexo)+"g por dia");
        });

    }

    private void ExercicioMenu(JMenuItem menuPesquisaExercicio, JMenuItem menuVerExercicios, JMenuItem menuFiltraExercicio,JMenuItem menuRemoverExercicio) {
        menuPesquisaExercicio.addActionListener((ae) -> {
            String nome = JOptionPane.showInputDialog(this, "Digite o nome do exercício");

            try {
                Exercicio procura = exercicio.pesquisaExercicio(nome); // Método que busca o exercício

                // Usando o enum SemanaDia
                SemanaDia[] diasSemana = SemanaDia.values();
                String[] opcoes = new String[diasSemana.length];

                for (int i = 0; i < diasSemana.length; i++) {
                    opcoes[i] = diasSemana[i].name();  // Pega o nome do enum
                }

                int resposta = JOptionPane.showOptionDialog(this, "Selecione um dia da semana:", "Dia da Semana",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, opcoes, opcoes[0]);

            } catch (ExercicioInexistenteExeption e) {
                JOptionPane.showMessageDialog(this,  e.getMessage());
            }
        });

        menuFiltraExercicio.addActionListener((ae) -> {
            // Exibe as opções para o usuário
            ParteDoCorpo[] tipos = ParteDoCorpo.values();
            String[] opcoes = new String[tipos.length];

            for (int i = 0; i < tipos.length; i++) {
                opcoes[i] = tipos[i].name();
            }

            int resposta = JOptionPane.showOptionDialog(this, "Escolha um tipo de músculo:",
                    "Filtrar Exercícios", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (resposta != -1) { // Verifica se o usuário não cancelou
                ParteDoCorpo tipoSelecionado = tipos[resposta];
                try {
                    List<Exercicio> exerciciosFiltrados = exercicio.filtrarExercicioPorTipo(tipoSelecionado);
                    StringBuilder mensagem = new StringBuilder("Exercícios filtrados:\n");
                    for (Exercicio ex : exerciciosFiltrados) {
                        mensagem.append(ex.getNome()).append("\n");
                    }
                    JOptionPane.showMessageDialog(this, mensagem.toString());
                } catch (TipoNuloException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleção cancelada.");
            }
        });
        menuVerExercicios.addActionListener((ae) -> {
            // Obtém todos os dias da semana
            SemanaDia[] diasSemana = SemanaDia.values();
            String[] opcoes = new String[diasSemana.length];

            // Prepara as opções para o diálogo
            for (int i = 0; i < diasSemana.length; i++) {
                opcoes[i] = diasSemana[i].name();  // Pega o nome do enum
            }

            // Mostra o diálogo para selecionar o dia da semana
            int resposta = JOptionPane.showOptionDialog(this, "Selecione um dia da semana:", "Dia da Semana",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoes, opcoes[0]);

            if (resposta != -1) { // Verifica se o usuário não cancelou
                SemanaDia diaSelecionado = diasSemana[resposta];
                List<Exercicio> exerciciosFiltrados;

                // Verifica se o usuário está cadastrado
                if (exercicio.getUsuario() == null) {
                    JOptionPane.showMessageDialog(this, "Nenhum usuário cadastrado.");
                    return;
                }

                // Filtra os exercícios por dia
                exerciciosFiltrados = exercicio.getUsuario().getTreinos().filtrarExercicioPorDia(diaSelecionado);

                // Prepara a mensagem para exibir os exercícios
                StringBuilder mensagem = new StringBuilder("Exercícios filtrados para " + diaSelecionado.name() + ":\n");

                if (exerciciosFiltrados.isEmpty()) {
                    mensagem.append("Nenhum exercício cadastrado para este dia.");
                } else {
                    for (Exercicio ex : exerciciosFiltrados) {
                        mensagem.append("- ").append(ex.getNome()).append("\n");
                    }
                }

                // Exibe a mensagem em uma caixa de diálogo
                JOptionPane.showMessageDialog(this, mensagem.toString());
            } else {
                JOptionPane.showMessageDialog(this, "Seleção cancelada.");
            }
        });
        menuRemoverExercicio.addActionListener((ae) -> {
            // Solicita ao usuário o nome do exercício a ser removido
            String nomeExercicio = JOptionPane.showInputDialog(this, "Digite o nome do exercício que deseja remover:");

            if (nomeExercicio != null && !nomeExercicio.trim().isEmpty()) {
                try {
                    // Tenta remover o exercício
                    exercicio.removerExercicio(nomeExercicio);
                    JOptionPane.showMessageDialog(this, "Exercício '" + nomeExercicio + "' removido com sucesso.");
                } catch (ExercicioInexistenteExeption e) {
                    // Se o exercício não existir, exibe uma mensagem de erro
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nome do exercício não pode ser vazio.");
            }
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

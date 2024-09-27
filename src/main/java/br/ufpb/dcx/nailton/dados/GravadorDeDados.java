package br.ufpb.dcx.nailton.dados;

import br.ufpb.dcx.nailton.academia.treino.Exercicio;
import br.ufpb.dcx.nailton.academia.usuario.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GravadorDeDados {
    private HashMap<String, Exercicio> recuperaTreinos;
    private Map<String, Exercicio> salvarTreion;
    private HashMap<String, Usuario> recuperaUsuario;
    private Map<String, Usuario> salvarUsuario;

    public static final String ARQUIVO_TREINOS = "treinos.dat";
    public static final String DADOS_USUARIO = "usuario.dat";


    public List<String> recupetaTextoDeArquivo(String nomeArquivo) throws IOException {
        BufferedReader leitor = null;
        List<String> textoLido = new ArrayList<String>();
        try {
            leitor = new BufferedReader(new FileReader(nomeArquivo));
            String texto = null;
            do{
                texto = leitor.readLine();
                if(texto != null){
                    textoLido.add(texto);
                }
            }while (texto != null);
        }finally {
            if(leitor != null){
                leitor.close();
            }
        }
        return textoLido;
    }

    @Override
    public void gravaTextoEmArquivo(List<String> texto, String nomeArquivo) throws IOException {
        BufferedWriter gravador = null;
        try{
            gravador = new BufferedWriter(new FileWriter(nomeArquivo));
            for(String s: texto){
                gravador.write(s+"\n");
            }
        }finally{
            if(gravador!= null){
                gravador.close();
            }
        }
    }
}

package br.ufpb.dcx.nailton.dados;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ProgrGerenciaArmazenamento implements GerenciaArmazenamento{
    @Override
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

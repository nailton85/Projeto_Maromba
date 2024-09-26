package br.ufpb.dcx.nailton.dados;

import java.io.IOException;
import java.util.List;

public interface GerenciaArmazenamento {





    public List<String> recupetaTextoDeArquivo(String nomeArquivo) throws IOException;
    public void gravaTextoEmArquivo(List<String>texto, String nomeArquivo) throws IOException;
}

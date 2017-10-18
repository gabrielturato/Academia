/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;

import java.time.LocalDate;
import academia.arquivo.AlunoArquivo;

/**
 *
 * @author Turato
 */
public class Academia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlunoArquivo arquivo = new AlunoArquivo();
        
        Ativo aluno;
        aluno = new Ativo();
        aluno.setData_nasc(LocalDate.of(1998, 9, 16));
        aluno.setEndereco("Rua Benedito de Freitas Nº 185");
        aluno.setNome("Gabriel");
        aluno.setRG("52406715-6");
        aluno.setTelefone("(19)99682-8615");
        arquivo.adicionaAtivo(aluno);
    }
    
}

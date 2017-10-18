/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.AlunoTreino;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Turato
 */
public class AlunoTreinoArquivo {
    public void adicionaVinculo(AlunoTreino at){
        try{
            FileWriter arquivo = new FileWriter("vinculos.txt",true);
            BufferedWriter escrever = new BufferedWriter(arquivo);
            
            String linha = at.getCod_aluno()+";"+at.getCod_treino()+";"+at.getData_inicio()+";"+at.getData_fim();
            escrever.write(linha);
            
            escrever.close();
            arquivo.close();
        }catch(IOException  e){
            System.out.println("Erro ao escrever o arquivo");
        }
        System.out.println("Treino Nº "+at.getCod_treino()+" vinculado com o aluno Nº "+at.getCod_aluno());
    }
    
    public void listaVinculos(){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("vinculos.txt"); 
            br = new BufferedReader(arquivo);
            String linha;
            do{
                linha=null;
                try{
                linha = br.readLine();
                }catch(IOException e){
                    System.out.println("Erro a ler a linha");
                }
                
                if(linha!=null){
                    String[] palavras = linha.split(";"); 
                    System.out.println("-------------Treino Nº "+palavras[0]+"-------------");
                    System.out.println("Vinculado com aluno Nº: "+palavras[1]);
                    System.out.println("Data de início: "+palavras[2]);
                    System.out.println("Data de fim: "+palavras[3]);
                }
            }while(linha!=null);
        }catch(FileNotFoundException e){
                System.err.println("Arquivo não encontrado");
                File file = new File("vinculos.txt");
                System.err.println("Arquivo criado");
        }finally{
            try{
                br.close();
                arquivo.close(); 
            }catch(IOException e){
                System.err.println("Erro ao fechar o arquivo");
            }
        }
     }
}

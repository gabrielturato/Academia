/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Catraca;
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
public class CatracaArquivo {    
    /**
     * Registra uma entrada, caso a mensalidade esteja em dia
     * @param c
     */
    public void adicionaEntrada(Catraca c){
        try{
            FileWriter arquivo = new FileWriter("entradas.txt",true);
            BufferedWriter escrever = new BufferedWriter(arquivo);
            //PESQUISAR MENSALIDADE
            String linha = c.getCod_aluno()+";"+c.getData_entrada().toString();
            escrever.write(linha);
            
            escrever.close();
            arquivo.close();
        }catch(IOException  e){
            System.out.println("Erro ao escrever o arquivo");
        }
            System.out.println("Entrada do aluno número "+c.getCod_aluno()+" foi registrada no horário "+c.getData_entrada().toString());
    }
    
    public void listaEntradas(){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("entradas.txt"); 
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
                    System.out.println("-------------Aluno Nº "+palavras[0]+"-------------");
                    System.out.println("Horário de Entrada55: "+palavras[1]);
                }
            }while(linha!=null);
        }catch(FileNotFoundException e){
                System.err.println("Arquivo não encontrado");
                File file = new File("entradas.txt");
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

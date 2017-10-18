/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Mensalidade;
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
public class MensalidadeArquivo {
     /**
     * Registra uma mensalidade paga
     * @param m
     */
    public void adicionaMensalidade(Mensalidade m){
        try{
            FileWriter arquivo = new FileWriter("mensalidades.txt",true);
            BufferedWriter escrever = new BufferedWriter(arquivo);
            
            String linha = m.getCod_aluno()+";"+m.getValor()+";"+m.getData_pagamento()+";"+m.getData_fim();
            escrever.write(linha);
            
            escrever.close();
            arquivo.close();
        }catch(IOException  e){
            System.out.println("Erro ao escrever o arquivo");
        }
            System.out.println("Pagamento do aluno Nº "+m.getCod_aluno()+" foi registrado no valor de: "+m.getValor());
    }

    public void listaEntradas(){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("mensalidades.txt"); 
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
                    System.out.println("Valor: "+palavras[1]);
                    System.out.println("Data de Pagamento: "+palavras[2]);
                    System.out.println("Dura até o dia: "+palavras[3]);
                }
            }while(linha!=null);
        }catch(FileNotFoundException e){
                System.err.println("Arquivo não encontrado");
                File file = new File("mensalidades.txt");
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

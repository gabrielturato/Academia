/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Inativo;
import academia.bean.Treinos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import static java.time.LocalDate.parse;

/**
 *
 * @author Turato
 */
public class TreinosArquivo {
    public void adicionaTreino(Treinos m){
        try{
            FileWriter arquivo = new FileWriter("treinos.txt",true);
            BufferedWriter escrever = new BufferedWriter(arquivo);
            
            String linha = m.getCod_treino()+";"+m.getDescricao();
            escrever.write(linha);
            
            escrever.close();
            arquivo.close();
        }catch(IOException  e){
            System.out.println("Erro ao escrever o arquivo");
        }
    }
    public void listaTreinos(){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("treinos.txt"); 
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
                    System.out.println("Descrição: "+palavras[1]);
                }
            }while(linha!=null);
        }catch(FileNotFoundException e){
                System.err.println("Arquivo não encontrado");
                File file = new File("treinos.txt");
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
    
    public Treinos buscaTreinoCodigo(int cod_treino){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("treinos.txt"); 
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
                    if(parseInt(palavras[0])==cod_treino){
                        Treinos t = new Treinos();
                        t.setCod_treino(parseInt(palavras[0]));
                        t.setDescricao(palavras[1]);
                        return t;
                    }
                }
            }while(linha!=null);
        }catch(FileNotFoundException e){
                System.err.println("Arquivo não encontrado");
        }finally{
            try{
                br.close();
                arquivo.close(); 
            }catch(IOException e){
                System.err.println("Erro ao fechar o arquivo");
            }
        }
        return null;     
     }
}

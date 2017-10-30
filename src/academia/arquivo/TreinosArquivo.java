/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Inativo;
import academia.bean.Treinos;
import academia.exceptions.CodigoException;
import academia.exceptions.NaoExisteException;
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
 * Responsável por operações no arquivo treinos.txt
 * @author Turato
 */
public class TreinosArquivo {
    /**
     * Adiciona um novo treino ao arquivo treinos.txt
     * @param t, classe Treinos a ser inserida
     * @throws CodigoException caso o código a ser inserido já exista
     */
    public boolean adicionaTreino(Treinos t) throws CodigoException{
        try{
            buscaTreinoCodigo(t.getCod_treino());
        }catch(NaoExisteException ex){
            try{
                FileWriter arquivo = new FileWriter("treinos.txt",true);
                BufferedWriter escrever = new BufferedWriter(arquivo);
            
                String linha = t.getCod_treino()+";"+t.getDescricao();
                escrever.write(linha);
            
                escrever.close();
                arquivo.close();
                return true;
            }catch(IOException  e){
                System.out.println("Erro ao escrever o arquivo");
                return true;    
            }
        }
        throw new CodigoException("O treino de código "+t.getCod_treino()+" já está registrado");
    }
    /**
     * Lista todos os treinos registrados no
     * arquivo treinos.txt
     */
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
    /**
     * Busca o treino pelo seu respectivo código
     * no arquivo treinos.txt
     * @param cod_treino código do treino a ser buscado
     * @return Treinos, classe para futuras operações
     * @throws NaoExisteException caso o registro não exista
     */
    public Treinos buscaTreinoCodigo(int cod_treino) throws NaoExisteException{
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
        throw new NaoExisteException("O treino de código "+cod_treino+" não existe no arquivo");     
     }
}

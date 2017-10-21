/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Catraca;
import academia.bean.Mensalidade;
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
import static java.lang.Float.parseFloat;
import static java.time.Period.between;
import java.time.Period;
import java.time.LocalDate;

/**
 * Classe que opera dados no arquivo mensalidades.txt
 * @author Turato
 */
public class MensalidadeArquivo {
     /**
     * Registra uma mensalidade paga
     * @param m , classe a ser inserida
     * @throws CodigoException caso o código a ser inserido já exista
     */
    public void adicionaMensalidade(Mensalidade m) throws CodigoException{
        try{
            buscaMensalidadeCodigo(m.getCod_aluno());
        }catch(NaoExisteException ex){
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
        throw new CodigoException("Mensalidade do aluno de código "+m.getCod_aluno()+" não está registrada");
    }
    /**
     * Lista todas as mensalidades pagas no arquivo mensalidades.txt
     */
    public void listaMensalidades(){
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
                    System.out.println("Data de Pagamento (Data que a operação foi feita no sistema): "+palavras[2]);
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
    /**
     * Busca a primeira mensalidade paga pelo aluno
     * de código especificado
     * @param cod_aluno código a ser procurado
     * @return Mensalidade, classe para futuras operações
     * @throws NaoExisteException caso não exista mensalidade do aluno com aquele codigo
     */
    public Mensalidade buscaMensalidadeCodigo(int cod_aluno) throws NaoExisteException{
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
                    if(parseInt(palavras[0])==cod_aluno){
                        LocalDate data_inicio, data_fim;
                        int dias,codigo;
                        float valor;
                        data_inicio= parse(palavras[2]);
                        data_fim=parse(palavras[3]);
                        codigo= parseInt(palavras[0]);
                        valor= parseFloat(palavras[1]);
                        dias=between(data_inicio,data_fim).getDays();
                        Mensalidade m = new Mensalidade(valor,codigo,dias);
                        return m;
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
        throw new NaoExisteException("Mensalidade do aluno Nº "+cod_aluno+" não está registrada.");    
     }
}

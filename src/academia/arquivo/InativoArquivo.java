/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Inativo;
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
 * Classe que trabalha com alunos inativos
 * no arquivo alunos_inativos.txt
 * @author Turato
 */
public class InativoArquivo {
        /**
         * Adiciona um aluno inativo ao documento
         * alunos_inativos.txt
         * @param i novo aluno inativo a ser adicionado
         */
        public void adicionaInativo(Inativo i){
        try{
            FileWriter arquivo = new FileWriter("alunos_inativos.txt",true);
            BufferedWriter escrever = new BufferedWriter(arquivo);
            
            String linha = i.getCod_aluno()+";"+i.getNome()+";"+i.getEndereco()+";"+i.getRG()+";"+i.getTelefone()+";"+i.getData_nasc().toString()+"\n";
            escrever.write(linha);
            
            escrever.close();
            arquivo.close();
        }catch(IOException  e){
            System.out.println("Erro ao escrever o arquivo");
        }
            System.out.println("Aluno "+i.getNome()+" foi inativado");

    }
     /**
      * Lista todos os alunos inativos no
      * documento alunos_inativos.txt
      */
     public void listaInativo(){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("alunos_inativos.txt"); 
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
                    System.out.println("Nome: "+palavras[1]);
                    System.out.println("Endereço: "+palavras[2]);
                    System.out.println("RG: "+palavras[3]);
                    System.out.println("Telefone: "+palavras[4]);
                    System.out.println("Data de Nascimento: "+palavras[5]);
                }
            }while(linha!=null);
        }catch(FileNotFoundException e){
                System.err.println("Arquivo não encontrado");
                File file = new File("alunos_ativos.txt");
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
      * Busca alunos inativos no documento alunos_inativos.txt
      * através de seus respectivos códigos identificadores
      * @param cod_aluno código identificador do aluno inativo
      * @return Inativo, classe para futuras operações
      */
     public Inativo buscaInativoCodigo(int cod_aluno){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("alunos_inativos.txt"); 
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
                        Inativo i = new Inativo();
                        i.setCod_aluno(parseInt(palavras[0]));
                        i.setNome(palavras[1]);
                        i.setEndereco(palavras[2]);
                        i.setRG(palavras[3]);
                        i.setTelefone(palavras[4]);
                        i.setData_nasc(parse(palavras[5]));
                        return i;
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
    /**
     * Busca todos o aluno inativo a partir
     * de seu nome no arquivo alunos_inativos.txt
     * @param nome a ser pesquisado no arquivo
     * @return Inativo, classe para futuras operações
     */
    public Inativo buscaInativoNome(String nome){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("alunos_inativos.txt"); 
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
                    if(palavras.equals(nome)){
                        Inativo i = new Inativo();
                        i.setCod_aluno(parseInt(palavras[0]));
                        i.setNome(palavras[1]);
                        i.setEndereco(palavras[2]);
                        i.setRG(palavras[3]);
                        i.setTelefone(palavras[4]);
                        i.setData_nasc(parse(palavras[5]));
                        return i;
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

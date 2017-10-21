/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Ativo;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import static java.time.LocalDate.parse;
import academia.exceptions.CodigoException;
import academia.exceptions.NaoExisteException;

/**
 * Classe responsável por fazer operações com
 * alunos ativos em um arquivo .txt
 * 
 * @author Turato
 */
public class AtivoArquivo {
    /**
     * Busca o aluno ativo no documento alunos_ativos.txt
     * através de seu código identificador
     * 
     * @param cod_aluno
     * 
     * @return classe Ativo
     * 
     * @throws NaoExisteException caso não exista esse registro no arquivo
     */
    public Ativo buscaAtivoCodigo(int cod_aluno) throws NaoExisteException{
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("alunos_ativos.txt"); 
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
                        Ativo a = new Ativo();
                        a.setCod_aluno(parseInt(palavras[0]));
                        a.setNome(palavras[1]);
                        a.setEndereco(palavras[2]);
                        a.setRG(palavras[3]);
                        a.setTelefone(palavras[4]);
                        a.setData_nasc(parse(palavras[5]));
                        return a;
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
        throw new NaoExisteException("O aluno de Nº "+cod_aluno+" não está registrado");
     }
    /**
     * Adiciona alunos ativos ao documento alunos_ativos.txt
     * 
     * @param a classe Ativo
     * 
     * @throws CodigoException caso o código
     * de aluno já exista, não permite cadastrar
     * novamente
     */
     public void adicionaAtivo(Ativo a) throws CodigoException{
        try{
            buscaAtivoCodigo(a.getCod_aluno());
            }catch(NaoExisteException ex){    
                try{
                    FileWriter arquivo = new FileWriter("alunos_ativos.txt",true);
                    BufferedWriter escrever = new BufferedWriter(arquivo);
                
                    String linha = a.getCod_aluno()+";"+a.getNome()+";"+a.getEndereco()+";"+a.getRG()+";"+a.getTelefone()+";"+a.getData_nasc().toString()+"\n";
                    escrever.write(linha);
                
                    escrever.close();
                    arquivo.close();
                }catch(IOException  e){
                    System.err.println("Erro ao escrever o arquivo");
                }
                System.out.println("Aluno "+a.getNome()+" adicionado com sucesso");
            }
            throw new CodigoException("Erro ao tentar inserir o aluno Nº "+a.getCod_aluno()+" pois já existe");
    }
     /**
      * Lista todos os alunos ativos
      * existentes no arquivo alunos_ativos.txt
      */
     public void listaAtivo(){
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("alunos_ativos.txt"); 
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
     * Busca um aluno ativo por nome 
     * no arquivo alunos_ativos.txt
     * @param nome
     * @return 
     */
    public Ativo buscaAtivoNome(String nome) throws NaoExisteException{
        FileReader arquivo = null;
        BufferedReader br = null;
        try{
            arquivo = new FileReader("alunos_ativos.txt"); 
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
                    if(palavras[1].equals(nome)){
                        Ativo a = new Ativo();
                        a.setCod_aluno(parseInt(palavras[0]));
                        a.setNome(palavras[1]);
                        a.setEndereco(palavras[2]);
                        a.setRG(palavras[3]);
                        a.setTelefone(palavras[4]);
                        a.setData_nasc(parse(palavras[5]));
                        return a;
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
        throw new NaoExisteException("O aluno chamado "+nome+" não está registrado");     
     }
}
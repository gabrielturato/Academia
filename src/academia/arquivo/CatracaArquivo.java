/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Catraca;
import academia.exceptions.CodigoException;
import academia.exceptions.NaoExisteException;
import academia.arquivo.MensalidadeArquivo;
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
 * Classe que manipula todas as entradas
 * no arquivo catraca.txt
 * @author Turato
 */
public class CatracaArquivo {    
    /**
     * Registra uma entrada, caso a mensalidade esteja em dia
     * 
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
    /**
     * Lista todas as entradas registradas
     * no documento entradas.txt
     */
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
                    System.out.println("Horário de Entrada: "+palavras[1]);
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
    /**
     * Busca a última entrada realizada pelo aluno com o
     * código específicado no arquivo entradas.txt
     * @param cod_aluno
     * @return Objeto Catraca
     * @throws NaoExisteException 
     */
    public Catraca buscaEntradaCodigo(int cod_aluno) throws NaoExisteException{
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
                    if(parseInt(palavras[0])==cod_aluno){
                        Catraca c = new Catraca(parse(palavras[1]));
                        c.setCod_aluno(parseInt(palavras[0]));
                        return c;
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
        throw new NaoExisteException("O aluno de código "+cod_aluno+" não tem nenhuma entrada registrada");     
     }
   
}

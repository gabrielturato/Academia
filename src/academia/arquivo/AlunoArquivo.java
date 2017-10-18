/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Ativo;
import academia.bean.Inativo;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Turato
 */
public class AlunoArquivo {
    private List<Inativo> inativos;
    private List<Ativo> ativos;
    
     public boolean adicionaAtivo(Ativo a){
        try{
            FileOutputStream arquivo = new FileOutputStream("alunos_ativos.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            
            String linha = a.getNome()+";"+a.getEndereco()+";"+a.getRG()+";"+a.getTelefone()+";"+a.getData_nasc().toString();
            pr.println(linha);
            
            pr.close();
            arquivo.close();
        }catch(Exception  e){
            System.out.println("Erro ao escrever o arquivo");
        }
        return true;
    }
    /**
     * Transforma aluno ativo em um aluno inativo
     * @param a
     * @return aluno inativo b
     */
    public Inativo transformaInativo(Ativo a){
        String nome,rg,endereco,telefone;
        LocalDate data;
        Inativo b=new Inativo();
        nome=a.getNome();
        rg=a.getRG();
        endereco=a.getEndereco();
        telefone=a.getTelefone();
        data=a.getData_nasc();
        b.setNome(nome);
        b.setRG(rg);
        b.setEndereco(endereco);
        b.setTelefone(telefone);
        b.setData_nasc(data);
        return b;
    }
    /**
     * Busca aluno na lista e o deleta da lista de ativos
     * E o envia para a lista de inativos (falta implementar)
     * @param codigo
     * @return 
     */
    public boolean desativaAluno(int codigo){
        Ativo a = ativos.get(codigo);
        Inativo b;
        //AlunoControle c = new AlunoControle();
        if(true==ativos.contains(a)){
           // b=c.transformaInativo(a);
            //c.adicionaInativo(b);
            return ativos.remove(a); 
        }else{
            return false;
        }
    }
    /**
     * Busca aluno na lista e devolve o objeto
     * Caso não ache retorna null
     * @param codigo
     * @return 
     */
    public Ativo buscaAtivo(int codigo){
        Ativo a = ativos.get(codigo);
        if(true==ativos.contains(a)){
            return a;
        }else{
            return null;
        }
    }
     /**
     * Lista de toda os alunos ativos
     * @return List or null 
     */
    public List<Ativo> listarAtivos(){
        if(ativos.isEmpty()==true){
            return null;   
        }else{
            return ativos;
        }
    }
    /**
     * Adiciona aluno inativo ao lista inativos
     * @param a
     * @return 
     */
    public boolean adicionaInativo(Inativo a){
        return inativos.add(a);
    }
    /**
     * Transforma aluno inativo em um aluno ativo
     * @param a
     * @return aluno ativo b
     */
    public Ativo transformaAtivo(Inativo a){
        String nome,rg,endereco,telefone;
        LocalDate data;
        Ativo b=new Ativo();
        nome=a.getNome();
        rg=a.getRG();
        endereco=a.getEndereco();
        telefone=a.getTelefone();
        data=a.getData_nasc();
        b.setNome(nome);
        b.setRG(rg);
        b.setEndereco(endereco);
        b.setTelefone(telefone);
        b.setData_nasc(data);
        return b;
    }
    
    /**
     * Busca aluno na lista e o deleta da lista de inativos
     * E o envia para a lista de ativos (falta implementar)
     * @param codigo
     * @return 
     */
    public boolean reativaAluno(int codigo){
        Inativo a = inativos.get(codigo);
        Ativo b;
        //AlunoControle c=new AlunoControle();
        if(inativos.contains(a)==true){
            //b=c.transformaAtivo(a);
            //c.adicionaAtivo(b);
            return inativos.remove(a);
        }else{
            return false;
        }
    }
    /**
     * Busca aluno na lista e devolve o objeto
     * Caso não ache retorna null
     * @param codigo
     * @return 
     */
    public Inativo buscaInativo(int codigo){
        Inativo a = inativos.get(codigo);
        if(inativos.contains(a)==true){
            return a;
        }else{
            return null;
        }
    }
     /**
     * Lista de toda os alunos inativos
     * @return List or null 
     */
    public List<Inativo> listarInativos(){
        if(inativos.isEmpty()==true){
            return null;   
        }else{
            return inativos;
        }
    }
    
}

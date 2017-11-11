/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.lista;

import academia.bean.Ativo;
import academia.bean.Inativo;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Responsável por controlar alunos em memória por meio de listas.
 * @author Turato
 */
public class ListaAluno {
    private ArrayList<Inativo> ListaInativos = new ArrayList();
    private ArrayList<Ativo> ListaAtivos = new ArrayList();
    /**
     * Set the value of ListaAtivos
     * 
     * @param ListaAtivos new value of ListaAtivos
     */
    public void setListaAtivos(ArrayList<Ativo> ListaAtivos){
        this.ListaAtivos = ListaAtivos;
    }
    /**
     * Adiciona um aluno ativo a lista
     * @param a aluno ativo
     * @return 
     */
    public boolean adicionaAtivo(Ativo a){
        return ListaAtivos.add(a);
    }
    /**
     * Transforma aluno ativo em um aluno inativo
     * @param a classe do aluno ativo
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
     * Busca aluno na lista e o deleta da ListaAtivos
     * E o envia para a ListaInativos
     * @param codigo do aluno a ser deletado
     * @return 
     */
    public boolean desativaAluno(int codigo){
        Ativo a = ListaAtivos.get(codigo);
        Inativo b;
        ListaAluno c = new ListaAluno();
        if(true==ListaAtivos.contains(a)){
            b=c.transformaInativo(a);
            c.adicionaInativo(b);
            return ListaAtivos.remove(a); 
        }else{
            return false;
        }
    }
    /**
     * Busca aluno na lista e devolve o objeto
     * Caso não ache retorna null
     * @param codigo do aluno a ser buscado
     * @return Ativo, objeto do aluno
     * null, se aluno não existir
     */
    public Ativo buscaAtivo(int codigo) throws IndexOutOfBoundsException{
        Ativo a = ListaAtivos.get(codigo);
        if(true==ListaAtivos.contains(a)){
            return a;
        }
        return null;
    }
    
    /**
     * Busca aluno ativo na lista e devolve o objeto
     * Caso não ache retorna null
     * @param nome a ser buscado
     * @return Ativo, objeto do aluno
     * null, se aluno não existir
     */
    public Ativo buscaAtivo(String nome) throws IndexOutOfBoundsException{
        Ativo a = null;
        for (int i = 0; i < ListaAtivos.size(); i++) {
            a=ListaAtivos.get(i);
            if(a.getNome().equals(nome))
                return a;
            a=null;
        }
        return a;
    }
     /**
     * Lista de toda os alunos ListaAtivos
     * @return ArrayList or null 
     */
    public ArrayList<Ativo> getListaAtivos(){
        if(ListaAtivos.isEmpty()==true){
            return null;   
        }else{
            return ListaAtivos;
        }
    }
    
    /**
     * Set the value of ListaInativos
     * 
     * @param ListaInativos new value of ListaInativos
     */
    public void setListaInativos(ArrayList<Inativo> ListaInativos){
        this.ListaInativos = ListaInativos;
    }
    /**
     * Adiciona aluno inativo ao lista ListaInativos
     * @param a Inativo a ser adicionado a lista
     * @return 
     */
    public boolean adicionaInativo(Inativo a){
        return ListaInativos.add(a);
    }
    /**
     * Transforma aluno inativo em um aluno ativo
     * @param a Inativo a ser transformado
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
     * Busca aluno na lista e o deleta da ListaInativos
     * e o coloca na ListaAtivos
     * @param codigo do aluno inativo a ser reativado
     * @return 
     */
    public boolean reativaAluno(int codigo){
        Inativo a = ListaInativos.get(codigo);
        Ativo b;
        ListaAluno c=new ListaAluno();
        if(ListaInativos.contains(a)==true){
            b=c.transformaAtivo(a);
            c.adicionaAtivo(b);
            return ListaInativos.remove(a);
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
        Inativo a = ListaInativos.get(codigo);
        if(ListaInativos.contains(a)==true){
            return a;
        }else{
            return null;
        }
    }
    
    /**
     * Busca aluno ativo na lista e devolve o objeto
     * Caso não ache retorna null
     * @param nome a ser buscado
     * @return Ativo, objeto do aluno
     * null, se aluno não existir
     */
    public Inativo buscaInativo(String nome) throws IndexOutOfBoundsException{
        Inativo a = null;
        for (int i = 0; i < ListaInativos.size(); i++) {
            a=ListaInativos.get(i);
            if(a.getNome().equals(nome))
                return a;
            a=null;
        }
        return a;
    }
     /**
     * Lista de toda os alunos ListaInativos
     * @return ArrayList or null 
     */
    public ArrayList<Inativo> getListaInativos(){
        if(ListaInativos.isEmpty()==true){
            return null;   
        }else{
            return ListaInativos;
        }
    }
    
    /**
     * Deleta o aluno se ele existir
     * @param cod_aluno a ser deletado da lista
     * @return true or false
     */
    public boolean deletaAtivo(int cod_aluno){
        Ativo aluno = ListaAtivos.get(cod_aluno);
        if(ListaAtivos.contains(aluno)==true){
            return ListaAtivos.remove(aluno);            
        }
        else{
            return false;     
        }
    }
}

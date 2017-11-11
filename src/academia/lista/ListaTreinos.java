/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.lista;

import academia.bean.Treinos;
import java.util.ArrayList;

/**
 * Classe que controla treinos em memória por meio de listas
 * @author Turato
 */
public class ListaTreinos {
    private ArrayList<Treinos> treinos;    
    
    /**
     * Lista de toda os alunos ListaAtivos
     * @return ArrayList<Mensalidade>
     */
    public ArrayList<Treinos> getTreinos() {
        return treinos;
    }
    
    /**
     * Set the value of ListaMensalidades
     * 
     * @param mensalidades new value of mensalidade
     */
    public void setTreinos(ArrayList<Treinos> treinos) {
        this.treinos = treinos;
    }
        
     /**
     * Adiciona treino na lista
     * @param T treino a ser adicionado
     * @return true or false
     */  
    public boolean adicionaTreino(Treinos T){
        return treinos.add(T);
    }
    /**
     * Busca o treino pelo código
     * @param cod_treino a ser buscado na lista
     * @return Treino
     */
    public Treinos buscaTreino(int cod_treino) throws IndexOutOfBoundsException{
        Treinos T = treinos.get(cod_treino);
        if(treinos.contains(T)==true){
            return T;            
        }
        else{
            return null;     
        }
    }
    /**
     * Deleta o treino se ele existir
     * @param cod_treino a ser deletado da lista
     * @return true or false
     */
    public boolean deletaTreino(int cod_treino){
        Treinos T = treinos.get(cod_treino);
        if(treinos.contains(T)==true){
            return treinos.remove(T);            
        }
        else{
            return false;     
        }
    }
}

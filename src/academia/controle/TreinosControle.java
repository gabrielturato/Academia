/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.controle;

import academia.bean.Treinos;
import java.util.List;

/**
 *
 * @author Turato
 */
public class TreinosControle {
    private List<Treinos> treinos;    
        
     /**
     * Adiciona treino na lista
     * @param T
     * @return true or false
     */  
    public boolean adicionaTreino(Treinos T){
        return treinos.add(T);
    }
    /**
     * Retorna a lista de treinos
     * @return List or null
     */
    public List<Treinos> listarTreinos(){
        if(treinos.isEmpty()==true){
            return null;   
        }else{
            return treinos;
        }
    }
    /**
     * Busca o treino pelo código
     * @param cod_treino
     * @return Treino
     */
    public Treinos buscaTreino(int cod_treino){
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
     * @param cod_treino
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

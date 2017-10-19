/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;
/**
 *
 * @author Turato
 */
public class Treinos {
    private int cod_treino;
    private String descricao;
    
    /**
     * Get the value of descricao
     *
     * @return the value of descricao
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * Set the value of descricao
     *
     * @param descricao new value of descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Treinos() {
        
    }
    
    /**
     * Get the value of codigo
     *
     * @return the value of cod_treino
     */
    public int getCod_treino() {
        return cod_treino;
    }

    /**
     * Set the value of cod_treino
     * 
     * @param cod_treino new value of cod_treino 
     */
    public void setCod_treino(int cod_treino) {
        this.cod_treino = cod_treino;
    }
    
    
    
    public boolean cadastrarTreino(String descricao){
     this.descricao = descricao;
     return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;
/**
 * Classe que registra treinos
 * @author Turato
 */
public class Treinos implements java.io.Serializable{
    private String descricao;
    /*
    * Construtor padrão
    */
    public Treinos() {
        
    }
    
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
}

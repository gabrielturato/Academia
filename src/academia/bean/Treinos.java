/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;
import java.time.LocalDate;
/**
 *
 * @author Turato
 */
public class Treinos {
    private int cod_treino;
    private final LocalDate data_inicio;
    private final LocalDate data_fim;
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


    /**
     * Get the value of data_fim
     *
     * @return the value of data_fim
     */
    public LocalDate getData_fim() {
        return data_fim;
    }

    /**
     * Get the value of data_inicio
     *
     * @return the value of data_inicio
     */
    public LocalDate getData_inicio() {
        return data_inicio;
    }


    public Treinos(LocalDate data_inicio, LocalDate data_fim) {
        this.data_inicio = LocalDate.now();
        this.data_fim = data_inicio.plusDays(30);
    }
    
    /**
     * Get the value of codigo
     *
     * @return the value of cod_treino
     */
    public int getCod_treino() {
        return cod_treino;
    }
    
    public boolean cadastrarTreino(String descricao){
     this.descricao = descricao;
     return true;
    }
    public void consultarTreino(int codigo){
        //Fazer na classe de controle
    }
}

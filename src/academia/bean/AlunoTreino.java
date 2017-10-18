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
public class AlunoTreino {
    private int cod_aluno;
    private final LocalDate data_inicio;
    private final LocalDate data_fim;
    private int cod_treino;
    
    public AlunoTreino(){
        this.data_inicio = LocalDate.now();
        this.data_fim = data_inicio.plusDays(30);
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
    /**
     * get the value of cod_aluno
     * 
     * @return the value of cod_aluno
     */
    public int getCod_aluno() {
        return cod_aluno;
    }
    /**
     * set the value of cod_aluno
     * 
     * @param cod_aluno the value of cod_aluno 
     */
    public void setCod_aluno(int cod_aluno) {
        this.cod_aluno = cod_aluno;
    }
/**
     * get the value of cod_treino
     * 
     * @return the value of cod_treino
     */
    public int getCod_treino() {
        return cod_treino;
    }
    /**
     * set the value of cod_treino
     * 
     * @param cod_treino the value of cod_treino
     */
    public void setCod_treino(int cod_treino) {
        this.cod_treino = cod_treino;
    }
    
    
}

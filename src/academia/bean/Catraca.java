/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;
import java.time.LocalDate;
/**
 * Classe que registra a entrada de alunos
 * @author Turato
 */
public class Catraca {
    private final LocalDate data_entrada;
    private int cod_aluno;    
    /**
     * Construtor da classe Catraca
     * @param data_entrada data em que foi registrada a entrada
     */
    public Catraca(LocalDate data_entrada) {
        this.data_entrada = data_entrada;
    }
    
    /**
     * Get the value of cod_aluno
     *
     * @return the value of cod_aluno
     */
    public int getCod_aluno() {
        return cod_aluno;
    }

    /**
     * Set the value of cod_aluno
     *
     * @param cod_aluno new value of cod_aluno
     */
    public void setCod_aluno(int cod_aluno) {
        this.cod_aluno = cod_aluno;
    }
    
    /**
     * Get the value of data_entrada
     *
     * @return the value of data_entrada
     */
    public LocalDate getData_entrada() {
        return data_entrada;
    }
    
}

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
public class Mensalidade{
    
    private final float valor;
    int cod_aluno;
    private final LocalDate data_pagamento;
    private LocalDate data_fim;

    public Mensalidade(LocalDate data_pagamento,float valor, int cod_aluno, int dias) {
        this.data_pagamento = LocalDate.now();
        this.valor = valor;
        this.cod_aluno = cod_aluno;
        this.data_fim = data_pagamento.plusDays(dias);
    }
    /**
     * Set the value of data_fim
     * 
     * @param data_fim new value of data_fim
     */
    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
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
     * Set the value of data_fim
     *
     * @param data_inicio data em que serÃƒÂ¡ adicionado os dias
     * @param dias contagem de dias para determinar data_fim
     */


    /**
     * Get the value of data_pagamento
     *
     * @return the value of data_pagamento
     */
    public LocalDate getData_pagamento() {
        return data_pagamento;
    }

    /**
     * Get the value of codigo_aluno
     *
     * @return the value of codigo_aluno
     */
    public int getCod_aluno() {
        return cod_aluno;
    }

    /**
     * Set the value of codigo_aluno
     *
     * @param cod_aluno new value of cod_aluno
     */
    public void setCod_aluno(int cod_aluno) {
        this.cod_aluno = cod_aluno;
    }
    

}

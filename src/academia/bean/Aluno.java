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
public abstract class Aluno {
    protected int cod_aluno;
    protected String nome;
    protected String telefone;
    protected String RG;
    protected String endereco;
    protected LocalDate data_nasc;
    
    /**
     * Construtor
     */
    public Aluno() {
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
     * Get the value of data_nasc
     *
     * @return the value of data_nasc
     */
    public abstract LocalDate getData_nasc();

    /**
     * Set the value of data_nasc
     *
     * @param data_nasc new value of idade
     */
    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }


    /**
     * Get the value of endereco
     *
     * @return the value of endereco
     */
    public abstract String getEndereco();

    /**
     * Set the value of endereco
     *
     * @param endereco new value of endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Discover the age of the client by the data_nasc
     * 
     * @param data_nasc date of the birth of the client
     * @return idade do cliente
     */
    public abstract int descobreIdade(LocalDate data_nasc);
    /**
     * Get the value of RG
     *
     * @return the value of RG
     */
    public abstract String getRG();

    /**
     * Set the value of RG
     *
     * @param RG new value of RG
     */
    public void setRG(String RG) {
        this.RG = RG;
    }
    /**
     * Get the value of telefone
     *
     * @return the value of telefone
     */
    public abstract String getTelefone();

    /**
     * Set the value of telefone
     *
     * @param telefone new value of telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public abstract String getNome();

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}

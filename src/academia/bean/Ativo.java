/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Turato
 */
    public class Ativo extends Aluno{
    /**
     * Construtor padrão, apenas com super
     */
    public Ativo() {
        super();
    }
    
    @Override
    public LocalDate getData_nasc() {
        return data_nasc;
    }
    @Override
    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
    }


    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int descobreIdade(LocalDate data_nasc){
        final LocalDate dataAtual = LocalDate.now();
        final Period aniversario = Period.between(data_nasc, dataAtual);
        return aniversario.getYears();
    }
    
    @Override
    public String getRG() {
        return RG;
    }

    @Override
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

}

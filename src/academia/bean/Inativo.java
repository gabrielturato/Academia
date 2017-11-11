/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;

import java.time.LocalDate;
import java.time.Period;
/**
 * Classe responsável por invalidar os alunos ativos que não frequentam mais
 * a academia por uma quantidade de tempo
 * @author Turato
 */
public class Inativo extends Aluno{
    /**
     * Construtor padrão, apenas com super
     */
    public Inativo() {
        super();
    }

    @Override
    public LocalDate getData_nasc() {
        return data_nasc;
    }

    @Override
    public String getEndereco() {
        return endereco;
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
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

}

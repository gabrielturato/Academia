/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.AlunoTreino;
import academia.exceptions.Log;
import academia.exceptions.NaoExisteException;
import academia.lista.ListaAlunoTreino;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Turato
 */
public class AlunoTreinoArquivo {
    private final Operacoes operar = new Operacoes();
    private final Log log = new Log();
    private ArrayList<AlunoTreino> vinculos = new ArrayList();
    private AlunoTreino vinculo = new AlunoTreino();
    private final ListaAlunoTreino ListaAlunoTreino = new ListaAlunoTreino();
    /**
     * Classe que adiciona a classe de vínculos
     * treino com alunos no arquivo vinculos.txt
     * 
     * @param at vínculo dos treinos clsse AlunoTreino
     * @return true se adicionar com sucesso, false do contrario
     */
    public boolean adicionaVinculo(AlunoTreino at){
        vinculos=operar.lerListaAlunoTreino("vinculos.txt");
        if(vinculos==null){
            boolean sucesso=ListaAlunoTreino.adicionaVinculo(at);
            vinculos=ListaAlunoTreino.getVinculos();
                operar.salvarListaAlunoTreino("vinculos.txt", vinculos);
            return sucesso;
        }else{
            ListaAlunoTreino.setVinculos(vinculos);
            boolean sucesso = ListaAlunoTreino.adicionaVinculo(at);
            vinculos=ListaAlunoTreino.getVinculos();
            operar.salvarListaAlunoTreino("vinculos.txt", vinculos);
            return sucesso;
        } 
    }
    /**
     * Método que consulta vinculos no arquivo vinculos.txt
     * e lista todos eles
     * @return ArrayList de vinculos
     * @throws NaoExisteException caso não exista vinculos
     */
    public ArrayList<AlunoTreino> listaVinculos() throws NaoExisteException{
        vinculos = operar.lerListaAlunoTreino("vinculos.txt");
        if(vinculos==null){
           throw new NaoExisteException("Não tem nenhum aluno registrado");
        }else{
           return vinculos;
        }
    }
}

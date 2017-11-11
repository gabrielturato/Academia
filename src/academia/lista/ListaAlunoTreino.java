/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.lista;

import academia.bean.AlunoTreino;
import academia.bean.Treinos;
import academia.bean.Ativo;
import academia.lista.ListaAluno;
import academia.lista.ListaTreinos;
import java.util.List;

/**
 * Responsável por controlar vínculos em memória por meio de listas.
 * @author Turato
 */
public class ListaAlunoTreino {
    private List<AlunoTreino> vinculos;
    
    /**
     * Adiciona um vinculo na lista
     * @param V vinculo a ser adicionado
     * @return true or false 
     */
    public boolean adicionaVinculo(AlunoTreino V){
        return vinculos.add(V);
    }
    /**
     * Pesquisa o código de aluno na lista e verifica o treino vinculado a esse aluno
     * @param cod_aluno a ser pesquisado
     * @param treinos lista de treinos a serem verificados
     * @return null or Treino 
     */
    public Treinos buscaVinculoTreino(int cod_aluno,List<Treinos> treinos){
        if(vinculos.isEmpty()==true){
            return null;   
        }else{
            int index=0;
            AlunoTreino V;
            while(vinculos.get(index).getCod_aluno()!=cod_aluno||vinculos.get(index)==null){
                index++;
            }
            V=vinculos.get(index);
            if(V==null){
                return null;
            }else{
                return treinos.get(V.getCod_treino());
            }
        } 
    }
    /**
     * Pesquisa o código de treino na lista e verifica o aluno vinculado a esse treino
     * @param cod_treino a ser pesquisado
     * @param ativos lista de alunos ativos a serem verificados
     * @return null or Ativo
     */
    public Ativo buscaVinculoAluno(int cod_treino, List<Ativo> ativos){
        if(vinculos.isEmpty()==true){
            return null;   
        }else{
            int index=0;
            AlunoTreino V;
            while(vinculos.get(index).getCod_treino()!=cod_treino||vinculos.get(index)==null){
                index++;
            }
            V=vinculos.get(index);
            if(V==null){
                return null;
            }else{
                return ativos.get(V.getCod_aluno());
            }
        } 
    }
}

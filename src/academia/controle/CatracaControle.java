/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.controle;

import academia.bean.Catraca;
import academia.bean.Mensalidade;
import java.util.List;

/**
 * Responsável por controlar entradas em memória por meio de listas
 * @author Turato
 */
public class CatracaControle {
    private List<Catraca> entradas;
    
    /**
     * Registra uma entrada, caso a mensalidade esteja em dia
     * @param C classe responsável pela entrada
     * @param Co classe para realizar operações
     * @return true or false
     */
    public boolean adicionaEntrada(Catraca C,MensalidadeControle Co){
        Mensalidade M;
        M=Co.buscaMensalidade(C.getCod_aluno());
        if(M==null){
            return false;
        }else{
            if(C.getData_entrada().isBefore(M.getData_fim())){
                return entradas.add(C);
            }else{
                return false;
            }
        }
    }
    
    /**
     * Busca uma entrada com o código de aluno
     * @param cod_aluno
     * @return
     */
    public Catraca buscaEntrada(int cod_aluno){
       if(entradas.isEmpty()==true){
            return null;   
        }else{
            int index=0;
            Catraca C;
            while(entradas.get(index).getCod_aluno()!=cod_aluno||entradas.get(index)==null){
                index++;
            }
            C=entradas.get(index);
            if(C==null){
                return null;
            }else{
                return C;
            }
        } 
    }
    
    /**
     * Lista de toda as entradas realizadas
     * @return List or null 
     */
    public List<Catraca> listarEntradas(){
        if(entradas.isEmpty()==true){
            return null;   
        }else{
            return entradas;
        }
    }
}

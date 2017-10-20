/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.controle;

import academia.bean.Mensalidade;
import java.util.List;

/**
 * Responsável por controlar em memória as mensalidades
 * por meio de listas.
 * @author Turato
 */
public class MensalidadeControle {
    private List<Mensalidade> mensalidades;
    
    /**
     * Adiciona mensalidade na lista
     * @param M Mensalidade a ser adicionada
     * @return true or false
     */
    public boolean adicionaMensalidade(Mensalidade M){
        return mensalidades.add(M);
    }
    
    /**
     * Busca a mensalidade com o código específico na lista
     * @param cod_aluno a ser pesquisado na lista de mensalidades
     * @return object mensalidade or null
     */
    public Mensalidade buscaMensalidade(int cod_aluno){
       if(mensalidades.isEmpty()==true){
            return null;   
        }else{
            int index=0;
            Mensalidade M;
            while(mensalidades.get(index).getCod_aluno()!=cod_aluno||mensalidades.get(index)==null){
                index++;
            }
            M=mensalidades.get(index);
            if(M==null){
                return null;
            }else{
                return M;
            }
        } 
    }
    /**
     * Lista de toda as mensalidades pagas
     * @return List or null 
     */
    public List<Mensalidade> listarMensalidades(){
        if(mensalidades.isEmpty()==true){
            return null;   
        }else{
            return mensalidades;
        }
    }
}

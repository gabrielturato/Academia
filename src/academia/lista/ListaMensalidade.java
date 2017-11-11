/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.lista;

import academia.bean.Mensalidade;
import java.util.ArrayList;

/**
 * Responsável por controlar em memória as ListaMensalidades
 por meio de listas.
 * @author Turato
 */
public class ListaMensalidade {
    private ArrayList<Mensalidade> ListaMensalidades = new ArrayList();

    /**
     * Lista de toda os alunos ListaAtivos
     * @return ArrayList<Mensalidade>
     */
    public ArrayList<Mensalidade> getMensalidades() {
        return ListaMensalidades;
    }
    
    /**
     * Set the value of ListaMensalidades
     * 
     * @param mensalidades new value of mensalidade
     */
    public void setMensalidades(ArrayList<Mensalidade> mensalidades) {
        this.ListaMensalidades = mensalidades;
    }
    
    /**
     * Adiciona mensalidade na lista
     * @param M Mensalidade a ser adicionada
     * @return true or false
     */
    public boolean adicionaMensalidade(Mensalidade M){
        return ListaMensalidades.add(M);
    }
    
    /**
     * Busca a mensalidade com o código específico na lista
     * @param codigo a ser pesquisado na lista de ListaMensalidades
     * @return object mensalidade or null
     */
    public Mensalidade buscaMensalidade(int codigo) throws IndexOutOfBoundsException{
        Mensalidade m = ListaMensalidades.get(codigo);
        if(ListaMensalidades.contains(m)==true){
            return m;
        }else{
            return null;
        }
    }
}

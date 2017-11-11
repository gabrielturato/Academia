/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.lista;

import academia.bean.Catraca;
import java.util.ArrayList;

/**
 * Responsável por controlar ListaEntradas em memória por meio de listas
 * @author Turato
 */
public class ListaCatraca {
    private ArrayList<Catraca> ListaEntradas = new ArrayList();
    /**
     * Get the value of ListaEntradas
     * @return the value of ListaEntradas
     */
    public ArrayList<Catraca> getEntradas() {
        return ListaEntradas;
    }
    /**
     * Set the value of ListaEntradas
     * @param entradas new value of ListaEntradas
     */
    public void setEntradas(ArrayList<Catraca> entradas) {
        this.ListaEntradas = entradas;
    }
    
    /**
     * Registra uma entrada
     * @param C entrada realizada
     * @return true or false
     */
    public boolean adicionaEntrada(Catraca C){
        return ListaEntradas.add(C);
    }
    
    /**
     * Busca uma entrada com seu código
     * @param codigo codigo da entrada realiza
     * @return
     */
    public Catraca buscaEntrada(int codigo){
        Catraca c = ListaEntradas.get(codigo);
        if(true==ListaEntradas.contains(c)){
            return c;
        }
        return null;
    }
}

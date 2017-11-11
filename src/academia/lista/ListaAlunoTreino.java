/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.lista;

import academia.bean.AlunoTreino;
import java.util.ArrayList;

/**
 * Responsável por controlar vínculos em memória por meio de listas.
 * @author Turato
 */
public class ListaAlunoTreino {
    private ArrayList<AlunoTreino> vinculos = new ArrayList();

    public ArrayList<AlunoTreino> getVinculos() {
        return vinculos;
    }

    public void setVinculos(ArrayList<AlunoTreino> vinculos) {
        this.vinculos = vinculos;
    }
    
    /**
     * Adiciona um vinculo na lista
     * @param V vinculo a ser adicionado
     * @return true or false 
     */
    public boolean adicionaVinculo(AlunoTreino V){
        return vinculos.add(V);
    }
}

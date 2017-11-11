/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Treinos;
import academia.exceptions.Log;
import academia.exceptions.NaoExisteException;
import academia.lista.ListaTreinos;
import java.util.ArrayList;

/**
 * Responsável por operações no arquivo treinos.txt
 * @author Turato
 */
public class TreinosArquivo {
    private final Operacoes operar = new Operacoes();
    private final ListaTreinos ListaTreinos = new ListaTreinos();
    private ArrayList<Treinos> treinos = new ArrayList();
    private Treinos treino;
    private final Log log = new Log();
    /**
     * Adiciona um novo treino ao arquivo treinos.txt
     * @param t, classe Treinos a ser inserida
     */
    public void adicionaTreino(Treinos t){
        treinos=operar.lerListaTreino("treinos.txt");
        ListaTreinos.setTreinos(treinos);
        ListaTreinos.adicionaTreino(t);
        treinos=ListaTreinos.getTreinos();
        boolean sucesso=operar.salvarListaTreino("treinos.txt", treinos);
        if(sucesso==true){
            System.out.println("Treino inserido com sucesso !");
        }else{
            System.out.println("Não foi possível inserir o treino !");
        }
    }
    /**
     * Lista todos os treinos registrados no
     * arquivo treinos.txt
     * @throws NaoExisteException caso não exista nenhum registro
     */
    public ArrayList<Treinos> listaTreinos() throws NaoExisteException{
        treinos = operar.lerListaTreino("treinos.txt");
        if(treinos==null){
           throw new NaoExisteException("Não tem nenhuma entrada registrado");
        }else{
           return treinos;
        }
     }
    /**
     * Busca o treino pelo seu respectivo código
     * no arquivo treinos.txt
     * @param cod_treino código do treino a ser buscado
     * @return Treino, classe para futuras operações
     * @throws NaoExisteException caso o registro não exista
     */
    public Treinos buscaTreinoCodigo(int cod_treino) throws NaoExisteException{
        try{
            treinos = operar.lerListaTreino("treinos.txt");
            ListaTreinos.setTreinos(treinos);
            treino=ListaTreinos.buscaTreino(cod_treino);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não tem nenhuma entrada registrada");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe uma entrada com esse código");
        }
        return treino;     
     }
}

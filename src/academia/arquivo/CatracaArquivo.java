/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Catraca;
import academia.exceptions.NaoExisteException;
import academia.exceptions.Log;
import academia.lista.ListaCatraca;
import java.util.ArrayList;
/**
 * Classe que manipula todas as entradas
 * no arquivo catraca.txt
 * @author Turato
 */
public class CatracaArquivo {  
    private final Operacoes operar = new Operacoes();
    private final ListaCatraca ListaEntradas = new ListaCatraca();
    private ArrayList<Catraca> entradas = new ArrayList();
    private Catraca entrada;
    private final Log log = new Log();
    /**
     * Registra uma entrada
     * 
     * @param c
     */
    public boolean adicionaEntrada(Catraca c){
        entradas=operar.lerListaCatraca("entradas.txt");
        if(entradas==null){
            ListaEntradas.adicionaEntrada(c);
            entradas=ListaEntradas.getEntradas();
            boolean sucesso=operar.salvarListaCatraca("entradas.txt", entradas);
            return sucesso;
        }else{
            ListaEntradas.setEntradas(entradas);
            ListaEntradas.adicionaEntrada(c);
            entradas=ListaEntradas.getEntradas();
            boolean sucesso=operar.salvarListaCatraca("entradas.txt", entradas);
            return sucesso;
        }
    }
    /**
     * Lista todas as entradas registradas
     * no documento entradas.txt
     * @return ArrayList<Catraca> lista de entradas registradas
     * @throws NaoExisteException caso não exista nenhuma entrada a ser listada
     */
    public ArrayList<Catraca> listaEntradas() throws NaoExisteException{
        entradas = operar.lerListaCatraca("entradas.txt");
        if(entradas==null){
           throw new NaoExisteException("Não tem nenhuma entrada registrado");
        }else{
           return entradas;
        }
     }
    /**
     * Busca a última entrada realizada pelo seu código
     * @param codigo da entrada
     * @return Catraca entrada que foi realizada
     * @throws NaoExisteException não existe uma entrada com esse código
     */
    public Catraca buscaEntradaCodigo(int codigo) throws NaoExisteException{
        try{
            entradas = operar.lerListaCatraca("entradas.txt");
            ListaEntradas.setEntradas(entradas);
            entrada=ListaEntradas.buscaEntrada(codigo);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não tem nenhuma entrada registrada");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe uma entrada com esse código");
        }
        return entrada;
    }
}

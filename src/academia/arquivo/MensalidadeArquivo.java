/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Mensalidade;
import academia.exceptions.Log;
import academia.exceptions.NaoExisteException;
import academia.lista.ListaMensalidade;
import java.util.ArrayList;

/**
 * Classe que opera dados no arquivo mensalidades.txt
 * @author Turato
 */
public class MensalidadeArquivo {
    private final Operacoes operar = new Operacoes();
    private final ListaMensalidade ListaMensalidades = new ListaMensalidade();
    private ArrayList<Mensalidade> mensalidades = new ArrayList();
    private Mensalidade mensalidade;
    private final Log log = new Log();
     /**
     * Registra uma mensalidade paga
     * @param m , classe a ser inserida
     */
    public boolean adicionaMensalidade(Mensalidade m){
        mensalidades=operar.lerListaMensalidade("mensalidades.txt");
        if(mensalidades==null){
            ListaMensalidades.adicionaMensalidade(m);
            mensalidades=ListaMensalidades.getMensalidades();
            boolean sucesso=operar.salvarListaMensalidade("mensalidades.txt", mensalidades);
            return sucesso;
        }else{
            ListaMensalidades.setMensalidades(mensalidades);
            ListaMensalidades.adicionaMensalidade(m);
            mensalidades=ListaMensalidades.getMensalidades();
            boolean sucesso=operar.salvarListaMensalidade("mensalidades.txt", mensalidades);
            return sucesso;
        }
    }
    /**
     * Lista todas as mensalidades pagas no arquivo mensalidades.txt
     * @return ArrayList<Mensalidade> Lista de mensalidades existentes
     * @throws NaoExisteException caso não exista nenhuma mensalidade no arquivo
     */
    public ArrayList<Mensalidade> listaMensalidades() throws NaoExisteException{
        mensalidades = operar.lerListaMensalidade("mensalidades.txt");
        if(mensalidades==null){
           throw new NaoExisteException("Não tem nenhuma mensalidade registrado");
        }else{
           return mensalidades;
        }
     }
    /**
     * Busca a primeira mensalidade com o código especificado
     * @param codigo código a ser procurado
     * @return Mensalidade, classe para futuras operações
     * @throws NaoExisteException caso não exista mensalidade do aluno com aquele codigo
     */
    public Mensalidade buscaMensalidadeCodigo(int codigo) throws NaoExisteException{
        try{
            mensalidades = operar.lerListaMensalidade("mensalidades.txt");
            ListaMensalidades.setMensalidades(mensalidades);
            mensalidade=ListaMensalidades.buscaMensalidade(codigo);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não tem nenhuma entrada registrada");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe uma entrada com esse código");
        }
        return mensalidade;
     }
}

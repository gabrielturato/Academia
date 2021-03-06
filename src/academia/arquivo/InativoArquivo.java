/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Inativo;
import academia.exceptions.*;
import academia.lista.ListaAluno;
import java.util.ArrayList;
/**
 * Classe que trabalha com alunos inativos
 * no arquivo alunos_inativos.txt
 * @author Turato
 */
public class InativoArquivo {
    private ArrayList<Inativo> inativos = new ArrayList();
    private final ListaAluno ListaAluno = new ListaAluno();
    private final Operacoes operar = new Operacoes();
    private Inativo aluno = new Inativo();
    /**
     * Adiciona um aluno inativo ao documento
     * alunos_inativos.txt
     * @param i novo aluno inativo a ser adicionado
     * @return true caso adicione com sucesso, false do contrário
     */
    public boolean adicionaInativo(Inativo i){
        inativos=operar.lerListaInativo("alunos_inativos.txt");
        if(inativos==null){
            ListaAluno.adicionaInativo(i);
            inativos=ListaAluno.getListaInativos();
            boolean sucesso=operar.salvarListaInativo("alunos_inativos.txt", inativos);
            return sucesso;
        }else{
            ListaAluno.setListaInativos(inativos);
            ListaAluno.adicionaInativo(i);
            inativos=ListaAluno.getListaInativos();
            boolean sucesso=operar.salvarListaInativo("alunos_inativos.txt", inativos);
            return sucesso;
        }
    }
     /**
      * Lista todos os alunos inativos no
      * documento alunos_inativos.txt
      * @return ArrayList de alunos invalidados
      * @throws NaoExisteException caso não exista nenhum aluno invalidado
      */
     public ArrayList<Inativo> listaInativo() throws NaoExisteException{
        inativos = operar.lerListaInativo("alunos_inativos.txt");
        if(inativos==null){
           throw new NaoExisteException("Não existe nenhum aluno invalidado");
        }else{
           return inativos;
        }
     }
     /**
      * Busca alunos inativos no documento alunos_inativos.txt
      * através de seus respectivos códigos identificadores
      * @param cod_aluno código identificador do aluno inativo
      * @return Inativo, classe para futuras operações
      * @throws NaoExisteException caso não exista um aluno com esse código
      */
     public Inativo buscaInativoCodigo(int cod_aluno) throws NaoExisteException{
       try{
            inativos = operar.lerListaInativo("alunos_inativos.txt");
            ListaAluno.setListaInativos(inativos);
            aluno=ListaAluno.buscaInativo(cod_aluno);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não existe nenhum aluno invalidado");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe um aluno invalidado com esse código");
        }
        return aluno;
     }
    /**
     * Busca todos o aluno inativo a partir
     * de seu nome no arquivo alunos_inativos.txt
     * @param nome a ser pesquisado no arquivo
     * @return Inativo, classe para futuras operações
     * @throws NaoExisteException caso não exista um inativo com esse nome
     */
    public Inativo buscaInativoNome(String nome) throws NaoExisteException{
        try{
            inativos = operar.lerListaInativo("alunos_inativos.txt");
            ListaAluno.setListaInativos(inativos);
            aluno=ListaAluno.buscaInativo(nome);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não existe nenhum aluno invalidado");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe um aluno invalidado com esse nome");
        }
        return aluno;
    }
}

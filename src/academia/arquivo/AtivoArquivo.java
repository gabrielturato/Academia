/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;

import academia.bean.Ativo;
import academia.bean.Inativo;
//import academia.bean.Inativo;
import academia.exceptions.*;
import academia.lista.ListaAluno;

/**
 * Classe responsável por fazer operações com
 * alunos ativos em um arquivo .txt
 * 
 * @author Turato
 */
import java.util.ArrayList;

public class AtivoArquivo {
    private final Operacoes operar = new Operacoes();
    private final ListaAluno ListaAluno = new ListaAluno();
    private ArrayList<Ativo> ativos = new ArrayList();
    private Ativo aluno = new Ativo();
    private final Log log = new Log();

    /**
     * Adiciona ativos ativos ao documento alunos_ativos.txt
     * 
     * @param a classe Ativo
     * 
     * @throws ExisteException caso o objeto
     * de aluno já exista no ArrayList, não 
     * permite cadastrar novamente
     */
     public boolean adicionaAtivo(Ativo a) throws ExisteException{
        ativos=operar.lerListaAtivo("alunos_ativos.txt");
        if(ativos==null){
            boolean sucesso=ListaAluno.adicionaAtivo(a);
            ativos=ListaAluno.getListaAtivos();
            operar.salvarListaAtivo("alunos_ativos.txt", ativos);
            return sucesso;
        }else{
            if(ativos.contains(a)){
                throw new ExisteException("Já existe esse aluno registrado");
            }else{
                ListaAluno.setListaAtivos(ativos);
                boolean sucesso = ListaAluno.adicionaAtivo(a);
                ativos=ListaAluno.getListaAtivos();
                operar.salvarListaAtivo("alunos_ativos.txt", ativos);
                return sucesso;
                }
        } 
     }
     /**
     * Lista todos os alunos ativos
     * existentes no arquivo alunos_ativos.txt
     * @return ArrayList de ativos
     * @throws academia.exceptions.NaoExisteException caso não exista nenhum
     * aluno registrado ainda.
      */
     public ArrayList<Ativo> listaAtivo() throws NaoExisteException{
        ativos = operar.lerListaAtivo("alunos_ativos.txt");
        if(ativos==null){
           throw new NaoExisteException("Não tem nenhum aluno registrado");
        }else{
           return ativos;
        }
     }
     /**
     * Busca o aluno ListaAluno no documento alunos_ativos.txt
 através de seu código identificador
     * 
     * @param cod_aluno
     * 
     * @return classe Ativo
     * 
     * @throws NaoExisteException caso não exista o registro no arquivo
     */
    public Ativo buscaAtivoCodigo(int cod_aluno) throws NaoExisteException{
        try{
            ativos = operar.lerListaAtivo("alunos_ativos.txt");
            ListaAluno.setListaAtivos(ativos);
            aluno=ListaAluno.buscaAtivo(cod_aluno);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não tem nenhum aluno registrado");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe um aluno com esse código");
        }
        return aluno;
    }
    /**
     * Busca um aluno ListaAluno por nome 
    no arquivo alunos_ativos.txt
     * @param nome
     * @return 
     * @throws NaoExisteException caso não exista um aluno com esse nome
     */
   public Ativo buscaAtivoNome(String nome) throws NaoExisteException{
       try{
            ativos = operar.lerListaAtivo("alunos_ativos.txt");
            ListaAluno.setListaAtivos(ativos);
            aluno=ListaAluno.buscaAtivo(nome);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não tem nenhum aluno registrado");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe um aluno com esse nome");
        }
        return aluno;
   }
   /**
    * Função que transforma um ativo em inativo
    * @param cod_ativo
    * @return 
    * @throws NaoExisteException caso o aluno não exista
    */
   public Inativo transformaInativo(int cod_ativo) throws NaoExisteException{
       Inativo inativo = new Inativo();
       try{
            ativos = operar.lerListaAtivo("alunos_ativos.txt");
            ListaAluno.setListaAtivos(ativos);
            aluno=ListaAluno.buscaAtivo(cod_ativo);
            inativo=ListaAluno.transformaInativo(aluno);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não tem nenhum aluno registrado");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe um aluno com esse nome");
        }
        return inativo;
   }
   /**
    * Função que deleta um aluno ativo se existir
    * @param cod_ativo codigo do aluno a ser deletado
    * @return boolean se for bem-sucedida ou falhou
    * @throws NaoExisteException caso o aluno não exista na lista
    */
   public boolean deletaAtivoCodigo(int cod_ativo) throws NaoExisteException{
       boolean sucesso=false;
       try{
            ativos = operar.lerListaAtivo("alunos_ativos.txt");
            ListaAluno.setListaAtivos(ativos);
            sucesso=ListaAluno.deletaAtivo(cod_ativo);
            ativos = ListaAluno.getListaAtivos();
            operar.salvarListaAtivo("alunos_ativos.txt", ativos);
        }catch(NullPointerException ex){
            throw new NaoExisteException("Não tem nenhum aluno registrado");
        }catch(IndexOutOfBoundsException ex){
            throw new NaoExisteException("Não existe um aluno com esse nome");
        }
       return sucesso;
   }
}

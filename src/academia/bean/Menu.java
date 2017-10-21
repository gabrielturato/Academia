/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;
import java.time.LocalDate;
import java.util.Scanner;
import academia.arquivo.AtivoArquivo;
import academia.arquivo.CatracaArquivo;
import academia.arquivo.InativoArquivo;
import academia.arquivo.MensalidadeArquivo;
import academia.arquivo.TreinosArquivo;
import academia.exceptions.CodigoException;
import academia.exceptions.NaoExisteException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Responsável pela impressão de menus no console
 * @author Gabriel Casemiro
 */
public class Menu {
    Scanner entrada = new Scanner(System.in);
    AtivoArquivo ativo = new AtivoArquivo();
    InativoArquivo inativo = new InativoArquivo();
    TreinosArquivo arquivoTreino = new TreinosArquivo();
    MensalidadeArquivo arquivoMensalidade = new MensalidadeArquivo();
    CatracaArquivo arquivoCatraca = new CatracaArquivo();
  
   int nivelMenu = 0;
   /**
    * Pega o nível do menu da classe e retorna
    * @return nivelMenu do menu sendo mostrado no console 
    */
    public int getNivelMenu() {
        return nivelMenu;
    }
    /**
     * Insere qual nível que o menu deve se encontrar
     * @param nivelMenu a ser mostrado no console
     */
    public void setNivelMenu(int nivelMenu) {
        this.nivelMenu = nivelMenu;
    }
    /**
     * Exibe menu principal no console
     */
    public void exibirMenuPrincipal(){
        System.out.println("--------- Menu Academia ---------");
        System.out.println("*         1. Alunos             *");
        System.out.println("*         2. Treino             *");
        System.out.println("*         3. Mensalidade        *");
        System.out.println("*         4. Catraca            *");
        System.out.println("*         5. Sair               *");
        
    }
    /**
     * Exibe os sub menus ao serem selecionados no menu principal
     * 1 = Alunos
     * 2 = Treinos
     * 3 = Mensalidade
     * 4 = Entrada
     * @param opcao 1,2,3,4
     */
    public void exibirSubMenus(int opcao){
        int selecao;
        switch (opcao) {
            case 1:
                this.nivelMenu = 1;
                System.out.println("--------------------- Alunos ----------------------");
                System.out.println("*         1. Inserir                              *");
                System.out.println("*         2. Listar ativos                        *");
                System.out.println("*         3. Buscar por código                    *");
                System.out.println("*         4. Buscar por nome                      *");
                System.out.println("*         5. Inativar um aluno-> Não implementado *");
                System.out.println("*         6. Listar inativos  -> Não implementado *");
                System.out.println("*         7. Voltar                               *");
                System.out.print("Escolha uma opção do menu : ");
                selecao = entrada.nextInt();
                System.out.println("Item escolhido : " + selecao);
                alunosMenu(selecao);
                
                break;
            case 2:
                this.nivelMenu = 1;
                System.out.println("---------------------Treinos--------------------------");
                System.out.println("*         1. Inserir                                 *");
                System.out.println("*         2. Listar                                  *");
                System.out.println("*         3. Vincular a um aluno -> Não implementado *");
                System.out.println("*         4. Buscar por código                       *");
                System.out.println("*         5. Voltar                                  *");
                System.out.print("Escolha uma opção do menu : ");
                selecao = entrada.nextInt();
                System.out.println("Item escolhido : " + selecao);
                treinoMenu(selecao);
                break;
            case 3:
                this.nivelMenu = 1;
                System.out.println("----------- Mensalidade ----------");
                System.out.println("*         1. Inserir             *");
                System.out.println("*         2. Listar              *");
                System.out.println("*         3. Buscar por código   *");
                System.out.println("*         4. Voltar              *");
                System.out.print("Escolha uma opção do menu : ");
                selecao = entrada.nextInt();
                System.out.println("Item escolhido : " + selecao);
                mensalidadeMenu(selecao);
                
                break;
            case 4:
                System.out.println("------------ Entrada -------------");
                System.out.println("*         1. Inserir             *");
                System.out.println("*         2. Listar              *");
                System.out.println("*         3. Buscar por código   *");
                System.out.println("*         4. Voltar             *");
                this.nivelMenu = 1;
                System.out.print("Escolha uma opção do menu : ");
                selecao = entrada.nextInt();
                System.out.println("Item escolhido : " + selecao);
                catracaMenu(selecao);
                break;
        
            case 5:
                //Finalizar Programa.
                break;
            default:
                break;
        }
        
    }
    /**
     * Ao submenu de aluno selecionado, escolher as opções
     * @param opcao a ser selecionada
     */
    public void alunosMenu(int opcao){
        Ativo aluno;
        aluno = new Ativo();
        String nome;
        int codigo;
        String endereco;
        String rg;
        int anoNasc;
        int mesNasc;
        int diaNasc;
        String telefone;
        switch (opcao) {
            case 1:
                //Funcao inserir aluno
                System.out.println("Opção selecionada : Inserir aluno.");
                System.out.print("Digite o codigo do aluno : ");
                codigo = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Digite o nome do aluno : ");
                nome = entrada.nextLine();
                System.out.print("Digite o dia de nascimento do aluno : ");
                diaNasc = entrada.nextInt();
                System.out.print("Digite o mes de nascimento do aluno : ");
                mesNasc = entrada.nextInt();
                System.out.print("Digite o ano de nascimento do aluno : ");
                anoNasc = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Digite o endereço do aluno : ");
                endereco = entrada.nextLine();
                System.out.print("Digite o RG do aluno : ");
                rg = entrada.nextLine();
                System.out.print("Digite o telefone do aluno : ");
                telefone = entrada.nextLine();
                
                System.out.println("Cadastrando...");
                
                
                
                aluno.setCod_aluno(codigo);
                aluno.setData_nasc(LocalDate.of(anoNasc, mesNasc, diaNasc));
                aluno.setEndereco(endereco);
                aluno.setNome(nome);
                aluno.setRG(rg);
                aluno.setTelefone(telefone);
                try{
                    ativo.adicionaAtivo(aluno);
                }catch(CodigoException e){
                    System.err.println(e.getMessage());
                }
                
                System.out.println("Cadastro efetuado com sucesso!");
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar alunos
                System.out.println("Opção selecionada : Listar alunos.");
                ativo.listaAtivo();
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar por código
                System.out.println("Opção selecionada : Buscar aluno por código.");
                System.out.print("Digite o código do aluno : ");
                codigo = entrada.nextInt();
                try {
                aluno=ativo.buscaAtivoCodigo(codigo);
                System.out.println("-------------Aluno Nº "+aluno.getCod_aluno()+"-------------");
                System.out.println("Nome: "+aluno.getNome());
                System.out.println("Endereço: "+aluno.getEndereco());
                System.out.println("RG: "+aluno.getRG());
                System.out.println("Telefone: "+aluno.getTelefone());
                System.out.println("Idade: "+aluno.descobreIdade(aluno.getData_nasc()));
                } catch (NaoExisteException ex) {
                   System.err.println(ex.getMessage());
                }
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao buscar por nome
                System.out.println("Opção selecionada : Buscar aluno por nome.");
                System.out.print("Digite o nome do aluno : ");
                entrada.nextLine();
                nome = entrada.nextLine();
                try{
                    aluno=ativo.buscaAtivoNome(nome);
                    System.out.println("-------------Aluno Nº "+aluno.getCod_aluno()+"-------------");
                    System.out.println("Nome: "+aluno.getNome());
                    System.out.println("Endereço: "+aluno.getEndereco());
                    System.out.println("RG: "+aluno.getRG());
                    System.out.println("Telefone: "+aluno.getTelefone());
                    System.out.println("Idade: "+aluno.descobreIdade(aluno.getData_nasc()));
                }catch(NaoExisteException ex){
                    System.err.println(ex.getMessage());
                }
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
        
            case 5://Não implementado ainda
                //Funcao excluir
                System.out.println("Opção selecionada : Inativar um aluno.");
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
                
            case 6:
                //Funcao listar alunos inativos
                System.out.println("Opção selecionada : Listar alunos inativos.");
                inativo.listaInativo();
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
                
            case 7:
                //Funcao voltar
                 this.nivelMenu = 0;
                
                break;
            default:
                break;
        
        }
    }
    /**
     * Ao submenu de treinos ser selecionado, escolher a opção
     * @param opcao a ser selecionada
     */
      public void treinoMenu(int opcao){
        Treinos treino = new Treinos();
        int cod_treino;
        String descricao;
        switch (opcao) {
            case 1:
                 //Funcao inserir treino
                System.out.println("Opção selecionada : Inserir treinos.");
                System.out.print("Digite o código do treino : ");
                cod_treino = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Escreva o treino : ");
                descricao = entrada.nextLine();
                
                treino.setCod_treino(cod_treino);
                treino.setDescricao(descricao);
                
                try{
                    arquivoTreino.adicionaTreino(treino);
                }catch(CodigoException ex){
                    System.err.println(ex.getMessage());
                }
                
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar treino
                System.out.println("Opção selecionada :  Listar treinos.");
                arquivoTreino.listaTreinos();
                
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 3://Não implementado ainda
                //Funcao vincular a um aluno
                System.out.println("Opção selecionada : Vincular treino a um aluno.");
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao buscar treino por codigo
                System.out.println("Opção selecionada : Buscar treino por código.");
                System.out.print("Digite o código do treino : ");
                cod_treino = entrada.nextInt();
                
                try{
                    treino=arquivoTreino.buscaTreinoCodigo(cod_treino);
                    System.out.println("-------------Treino Nº "+treino.getCod_treino()+"-------------");
                    System.out.println("Descrição: "+treino.getDescricao());
                }catch(NaoExisteException ex){
                    System.err.println(ex.getMessage());
                }
                
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 5:
                //Funcao voltar
                 this.nivelMenu = 0;
                 
                break;
            default:
                break;
        
        }
    }
      /**
       * Ao submenu de mensalidades ser selecionado, escolher a opção
       * @param opcao a ser selecionada
       */
       public void mensalidadeMenu(int opcao){
        int cod_aluno;
        int dias;
        float valor;
        switch (opcao) {
            case 1:
                 //Funcao inserir mensalidade
                System.out.println("Opção selecionada : Inserir mensalidade.");
                System.out.print("Digite o código do aluno : ");
                cod_aluno = entrada.nextInt();
                System.out.print("Digite o valor da mensalidade : ");
                valor = entrada.nextFloat();
                entrada.nextLine();
                System.out.print("Digite a quantidade de dias que será paga : ");
                dias = entrada.nextInt();
                
                Mensalidade mensalidade = new Mensalidade(valor,cod_aluno,dias);
                
                try{
                    arquivoMensalidade.adicionaMensalidade(mensalidade);
                }catch(CodigoException ex){
                    System.err.println(ex.getMessage());
                }
                
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar mensalidades
                System.out.println("Opção selecionada : Listar mensalidades.");
                arquivoMensalidade.listaMensalidades();
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar mensalidade por código
                System.out.println("Opção selecionada : Buscar mensalidade por código.");
                System.out.print("Digite o código do aluno : ");
                cod_aluno = entrada.nextInt();
                
                try{
                mensalidade=arquivoMensalidade.buscaMensalidadeCodigo(cod_aluno);
                System.out.println("-------------Aluno Nº "+mensalidade.getCod_aluno()+"-------------");
                System.out.println("Valor: "+mensalidade.getValor());
                System.out.println("Data de Pagamento (Data que a operação foi feita no sistema): "+mensalidade.getData_pagamento());
                System.out.println("Dura até o dia: "+mensalidade.getData_fim());
                }catch(NaoExisteException ex){
                    System.err.println(ex.getMessage());
                }
                
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao voltar
                 this.nivelMenu = 0;
                
                break;
            default:
                break;
        
        }
    }
       /**
        * Ao submenu de catraca ser selecionado, escolher a opção
        * @param opcao a ser selecionada
        */
        public void catracaMenu(int opcao){
            int cod_aluno;
            Catraca catraca;
            switch (opcao) {
            case 1:
                 //Funcao inserir catraca
                System.out.println("Opção selecionada : Inserir catraca.");
                System.out.print("Digite o código do aluno : ");
                cod_aluno = entrada.nextInt();
                catraca = new Catraca(LocalDate.now());
                catraca.setCod_aluno(cod_aluno);
                arquivoCatraca.adicionaEntrada(catraca);
                
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar catracas
                System.out.println("Opção selecionada : Listar catraca.");
                arquivoCatraca.listaEntradas();
                
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar por código de aluno
                System.out.println("Opção selecionada : Buscar catraca por código de aluno.");
                System.out.print("Digite o código do aluno : ");
                cod_aluno = entrada.nextInt();
                try{
                    catraca=arquivoCatraca.buscaEntradaCodigo(cod_aluno);
                    System.out.println("-------------Aluno Nº "+catraca.getCod_aluno()+"-------------");
                    System.out.println("Horário de Entrada55: "+catraca.getData_entrada());
                }catch(NaoExisteException ex){
                    System.err.println(ex.getMessage());
                }
                    
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao voltar
                 this.nivelMenu = 0;
                
                break;
            default:
                break;
        
        }
    }
}

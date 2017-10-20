/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;
import academia.bean.Ativo;
import academia.bean.Treinos;
import academia.bean.Mensalidade;
import academia.bean.Catraca;
import java.time.LocalDate;
import java.util.Scanner;
import academia.arquivo.AtivoArquivo;
import academia.arquivo.InativoArquivo;
import academia.arquivo.TreinosArquivo;
import academia.arquivo.MensalidadeArquivo;
import academia.arquivo.CatracaArquivo;
import academia.exceptions.CodigoException;
import java.time.Month;
/**
 *
 * @author Gabriel
 */
public class Menu {
    Scanner entrada = new Scanner(System.in);
    AtivoArquivo ativo = new AtivoArquivo();
    InativoArquivo inativo = new InativoArquivo();
    TreinosArquivo arquivoTreino = new TreinosArquivo();
    MensalidadeArquivo arquivoMensalidade = new MensalidadeArquivo();
    CatracaArquivo arquivoCatraca = new CatracaArquivo();
  
   int nivelMenu = 0;

    public int getNivelMenu() {
        return nivelMenu;
    }

    public void setNivelMenu(int nivelMenu) {
        this.nivelMenu = nivelMenu;
    }
    public void exibirMenuPrincipal(){
        System.out.println("--------- Menu Academia ---------");
        System.out.println("*         1. Alunos             *");
        System.out.println("*         2. Treino             *");
        System.out.println("*         3. Mensalidade        *");
        System.out.println("*         4. Catraca            *");
        System.out.println("*         5. Sair               *");
        
    }
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
                System.out.println("*         6. Listar inativos                      *");
                System.out.println("*         7. Voltar                               *");
                System.out.print("Escolha uma opção do menu : ");
                selecao = entrada.nextInt();
                System.out.println("Item escolhido : " + selecao);
                alunosMenu(selecao);
                
                break;
            case 2:
                this.nivelMenu = 1;
                System.out.println("------------ Treinos -------------");
                System.out.println("*         1. Inserir             *");
                System.out.println("*         2. Listar              *");
                System.out.println("*         3. Vincular a um aluno *");
                System.out.println("*         4. Buscar por código   *");
                System.out.println("*         5. Voltar             *");
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
    //Aluno
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
                    System.out.println(e.getMessage());
                    ativo.buscaAtivoCodigo(codigo);
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
                aluno=ativo.buscaAtivoCodigo(codigo);
                System.out.println("-------------Aluno Nº "+aluno.getCod_aluno()+"-------------");
                System.out.println("Nome: "+aluno.getNome());
                System.out.println("Endereço: "+aluno.getEndereco());
                System.out.println("RG: "+aluno.getRG());
                System.out.println("Telefone: "+aluno.getTelefone());
                System.out.println("Idade: "+aluno.descobreIdade(aluno.getData_nasc()));
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao buscar por nome
                System.out.println("Opção selecionada : Buscar aluno por nome.");
                System.out.print("Digite o nome do aluno : ");
                entrada.nextLine();
                nome = entrada.nextLine();
                aluno=ativo.buscaAtivoNome(nome);
                System.out.println("-------------Aluno Nº "+aluno.getCod_aluno()+"-------------");
                System.out.println("Nome: "+aluno.getNome());
                System.out.println("Endereço: "+aluno.getEndereco());
                System.out.println("RG: "+aluno.getRG());
                System.out.println("Telefone: "+aluno.getTelefone());
                System.out.println("Idade: "+aluno.descobreIdade(aluno.getData_nasc()));
                
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
                exibirMenuPrincipal();
                
                break;
            default:
                break;
        
        }
    }
    //Treino
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
                
                arquivoTreino.adicionaTreino(treino);
                
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
                treino=arquivoTreino.buscaTreinoCodigo(cod_treino);
                System.out.println("-------------Treino Nº "+treino.getCod_treino()+"-------------");
                System.out.println("Descrição: "+treino.getDescricao());
                
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 5:
                //Funcao voltar
                 this.nivelMenu = 0;
                exibirMenuPrincipal();
                
                break;
            default:
                break;
        
        }
    }
      //Mensalidade
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
                
                arquivoMensalidade.adicionaMensalidade(mensalidade);
                
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
                mensalidade=arquivoMensalidade.buscaMensalidadeCodigo(cod_aluno);
                System.out.println("-------------Aluno Nº "+mensalidade.getCod_aluno()+"-------------");
                System.out.println("Valor: "+mensalidade.getValor());
                System.out.println("Data de Pagamento (Data que a operação foi feita no sistema): "+mensalidade.getData_pagamento());
                System.out.println("Dura até o dia: "+mensalidade.getData_fim());
                
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao voltar
                 this.nivelMenu = 0;
                exibirMenuPrincipal();
                
                break;
            default:
                break;
        
        }
    }
  //Catraca
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
                catraca=arquivoCatraca.buscaEntradaCodigo(cod_aluno);
                System.out.println("-------------Aluno Nº "+catraca.getCod_aluno()+"-------------");
                System.out.println("Horário de Entrada55: "+catraca.getData_entrada());
                
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao voltar
                 this.nivelMenu = 0;
                exibirMenuPrincipal();
                
                break;
            default:
                break;
        
        }
    }
}

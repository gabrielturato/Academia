/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;
import academia.bean.Ativo;
import java.time.LocalDate;
import java.util.Scanner;
import academia.arquivo.AtivoArquivo;
import academia.arquivo.Menu;
/**
 *
 * @author Gabriel
 */
public class Menu {
    Scanner entrada = new Scanner(System.in);
    AtivoArquivo arquivo = new AtivoArquivo();
  
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
                System.out.println("------------- Alunos -------------");
                System.out.println("*         1. Inserir             *");
                System.out.println("*         2. Listar              *");
                System.out.println("*         3. Buscar por código   *");
                System.out.println("*         4. Buscar por nome     *");
                System.out.println("*         5. Excluir             *");
                System.out.println("*         6. Voltar             *");
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
                System.out.println("------------ Catraca -------------");
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
        switch (opcao) {
            case 1:
                //Funcao inserir aluno
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
                System.out.println("Opção selecionada : Inserir aluno.");
                System.out.print("Digite o codigo do aluno : ");
                codigo = entrada.nextInt();
                System.out.print("Digite o nome do aluno : ");
                nome = entrada.next();
                System.out.print("Digite o dia de nascimento do aluno : ");
                diaNasc = entrada.nextInt();
                System.out.print("Digite o mes de nascimento do aluno : ");
                mesNasc = entrada.nextInt();
                System.out.print("Digite o ano de nascimento do aluno : ");
                anoNasc = entrada.nextInt();
                System.out.print("Digite o endereço do aluno : ");
                endereco = entrada.next();
                System.out.print("Digite o RG do aluno : ");
                rg = entrada.next();
                System.out.print("Digite o telefone do aluno : ");
                telefone = entrada.next();
                
                System.out.println("Cadastrando...");
                
                
                
                aluno.setCod_aluno(codigo);
                aluno.setData_nasc(LocalDate.of(anoNasc, mesNasc, diaNasc));
                aluno.setEndereco(endereco);
                aluno.setNome(nome);
                aluno.setRG(rg);
                aluno.setTelefone(telefone);
                arquivo.adicionaAtivo(aluno);
                
                 
                System.out.println("Cadastro efetuado com sucesso!");
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar aluno
                System.out.println("Opção selecionada : Listar alunos.");
                arquivo.listaAtivo();
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar por código
                System.out.println("Opção selecionada : Buscar aluno por código.");
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao buscar por nome
                System.out.println("Opção selecionada : Buscar aluno por nome.");
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
        
            case 5:
                //Funcao excluir
                System.out.println("Opção selecionada : Excluir alunos.");
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 6:
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
        switch (opcao) {
            case 1:
                 //Funcao inserir treino
                System.out.println("Opção selecionada : Inserir alunos.");
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar treino
                System.out.println("Opção selecionada :  Listar treinos.");
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao vincular a um aluno
                System.out.println("Opção selecionada : Vincular treino a um aluno.");
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao buscar treino por codigo
                System.out.println("Opção selecionada : Buscar treino por código.");
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
        switch (opcao) {
            case 1:
                 //Funcao inserir mensalidade
                System.out.println("Opção selecionada : Inserir mensalidade.");
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar mensalidades
                System.out.println("Opção selecionada : Listar mensalidades.");
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao vincular mensalidade a um aluno
                System.out.println("Opção selecionada : Vincular mensalidade a um aluno.");
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 4:
                //Funcao buscar mensalidade por código
                System.out.println("Opção selecionada : Buscar mensalidade por código.");
                 exibirSubMenus(3);
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
  //Catraca
         public void catracaMenu(int opcao){
        switch (opcao) {
            case 1:
                 //Funcao inserir catraca
                System.out.println("Opção selecionada : Inserir catraca.");
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar catracas
                System.out.println("Opção selecionada : Listar catraca.");
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar por código de aluno
                System.out.println("Opção selecionada : Buscar catraca por código de aluno.");
                exibirSubMenus(4);
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
}

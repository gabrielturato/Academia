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
import academia.exceptions.Log;
import academia.arquivo.TreinosArquivo;
import academia.exceptions.ExisteException;
import academia.exceptions.NaoExisteException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
/**
 * Responsável pela impressão de menus no console
 * @author Gabriel Casemiro
 */
public class Menu {
    private final Scanner entrada = new Scanner(System.in);
    private final AtivoArquivo arquivoAtivo = new AtivoArquivo();
    private final InativoArquivo arquivoInativo = new InativoArquivo();
    private final TreinosArquivo arquivoTreino = new TreinosArquivo();
    private final MensalidadeArquivo arquivoMensalidade = new MensalidadeArquivo();
    private final CatracaArquivo arquivoCatraca = new CatracaArquivo();
    private final Log log = new Log();
    
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
                System.out.println("*         6. Listar inativos                      *");
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
     * Ao submenu de AlunoAtivo selecionado, escolher as opções
     * @param opcao a ser selecionada
     */
    public void alunosMenu(int opcao){
        Ativo AlunoAtivo = new Ativo();
        Inativo AlunoInativo = new Inativo();
        ArrayList<Ativo> ListaAtivos = new ArrayList();
        ArrayList<Inativo> ListaInativos = new ArrayList();
        int codigo;
        String nome;
        String endereco;
        String rg;
        int anoNasc;
        int mesNasc;
        int diaNasc;
        String telefone;
        switch (opcao) {
            case 1:
                //Funcao inserir AlunoAtivo
                System.out.println("Opção selecionada : Inserir aluno.");
                System.out.print("Digite o nome do aluno : ");
                entrada.nextLine();
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
                
                AlunoAtivo.setData_nasc(LocalDate.of(anoNasc, mesNasc, diaNasc));
                AlunoAtivo.setEndereco(endereco);
                AlunoAtivo.setNome(nome);
                AlunoAtivo.setRG(rg);
                AlunoAtivo.setTelefone(telefone);
                
                try {
                    arquivoAtivo.adicionaAtivo(AlunoAtivo);
                } catch (ExisteException ex) {
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                ListaAtivos=null;
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar ListaAtivos
                System.out.println("Opção selecionada : Listar alunos.");
                
                try{
                    ListaAtivos = arquivoAtivo.listaAtivo();
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                for (int i = 0; i < ListaAtivos.size(); i++) {
                    AlunoAtivo=ListaAtivos.get(i);
                    System.out.println("-------------Aluno Nº "+i+"-------------");
                    System.out.println("Nome: "+AlunoAtivo.getNome());
                    System.out.println("Endereço: "+AlunoAtivo.getEndereco());
                    System.out.println("RG: "+AlunoAtivo.getRG());
                    System.out.println("Telefone: "+AlunoAtivo.getTelefone());
                    System.out.println("Idade: "+AlunoAtivo.descobreIdade(AlunoAtivo.getData_nasc()));
                }
                ListaAtivos = null;
                
                exibirSubMenus(1);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar por código
                System.out.println("Opção selecionada : Buscar aluno por código.");
                System.out.print("Digite o código do aluno : ");
                codigo = entrada.nextInt();
                try {
                    AlunoAtivo=arquivoAtivo.buscaAtivoCodigo(codigo);
                    System.out.println("-------------Aluno Nº "+codigo+"-------------");
                    System.out.println("Nome: "+AlunoAtivo.getNome());
                    System.out.println("Endereço: "+AlunoAtivo.getEndereco());
                    System.out.println("RG: "+AlunoAtivo.getRG());
                    System.out.println("Telefone: "+AlunoAtivo.getTelefone());
                    System.out.println("Idade: "+AlunoAtivo.descobreIdade(AlunoAtivo.getData_nasc()));   
                }catch(NaoExisteException ex){
                   log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                ListaAtivos=null;
                
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
                    AlunoAtivo=arquivoAtivo.buscaAtivoNome(nome);
                    if(AlunoAtivo==null)
                       throw new NaoExisteException("Não existe um aluno com esse nome");
                    System.out.println("----------------Aluno----------------");
                    System.out.println("Nome: "+AlunoAtivo.getNome());
                    System.out.println("Endereço: "+AlunoAtivo.getEndereco());
                    System.out.println("RG: "+AlunoAtivo.getRG());
                    System.out.println("Telefone: "+AlunoAtivo.getTelefone());
                    System.out.println("Idade: "+AlunoAtivo.descobreIdade(AlunoAtivo.getData_nasc()));
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                ListaAtivos=null;
                
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
                //Funcao listar ListaAtivos inativos
                System.out.println("Opção selecionada : Listar ListaAlunos inativos.");
                
                try{
                    ListaInativos = arquivoInativo.listaInativo();
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                for (int i = 0; i < ListaInativos.size(); i++) {
                    AlunoInativo=ListaInativos.get(i);
                    System.out.println("-------------Aluno Nº "+i+"-------------");
                    System.out.println("Nome: "+AlunoInativo.getNome());
                    System.out.println("Endereço: "+AlunoInativo.getEndereco());
                    System.out.println("RG: "+AlunoInativo.getRG());
                    System.out.println("Telefone: "+AlunoInativo.getTelefone());
                    System.out.println("Idade: "+AlunoInativo.descobreIdade(AlunoInativo.getData_nasc()));
                }
                ListaInativos = null;
                
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
        ArrayList<Treinos> treinos = new ArrayList();
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
                
                treino.setDescricao(descricao);
                
                arquivoTreino.adicionaTreino(treino);
                
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar treino
                System.out.println("Opção selecionada :  Listar treinos.");
                
                try{
                    treinos = arquivoTreino.listaTreinos();
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                for (int i = 0; i < treinos.size(); i++) {
                    treino=treinos.get(i);
                    System.out.println("------------Treino Nº "+i+"-------------");
                    System.out.println("Descrição: "+treino.getDescricao());
                }
                
                exibirSubMenus(2);
                this.nivelMenu = 1;
                break;
            case 3://Não implementado ainda
                //Funcao vincular a um AlunoAtivo
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
                    System.out.println("------------Treino Nº "+cod_treino+"-------------");
                    System.out.println("Descrição: "+treino.getDescricao());
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
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
        int codigo;
        ArrayList<Mensalidade> mensalidades = new ArrayList();
        Mensalidade mensalidade;
        Ativo AlunoAtivo = new Ativo();
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
                
                mensalidade = new Mensalidade(valor,cod_aluno,dias);
                
                arquivoMensalidade.adicionaMensalidade(mensalidade);
                
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar mensalidades
                System.out.println("Opção selecionada : Listar mensalidades.");
                try{
                    mensalidades = arquivoMensalidade.listaMensalidades();
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                for (int i = 0; i < mensalidades.size(); i++) {
                    mensalidade=mensalidades.get(i);
                    System.out.println("------------Mensalidade Nº "+i+"-------------");
                    System.out.println("Data de Pagamento: "+mensalidade.getData_pagamento());
                    System.out.println("Valor: "+mensalidade.getValor());
                    System.out.println("Data que expira: "+mensalidade.getData_fim());
                    try {
                        AlunoAtivo=arquivoAtivo.buscaAtivoCodigo(mensalidade.getCod_aluno());
                        System.out.println("Código do aluno:"+mensalidade.getCod_aluno());
                        System.out.println("Nome: "+AlunoAtivo.getNome());
                    }catch(NaoExisteException ex){
                       log.getLogger().log(Level.SEVERE, ex.getMessage());
                    }
                }
                exibirSubMenus(3);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar mensalidade por código
                System.out.println("Opção selecionada : Buscar mensalidade por código.");
                System.out.print("Digite o código da mensalidade : ");
                codigo = entrada.nextInt();
                
                try{
                    mensalidade=arquivoMensalidade.buscaMensalidadeCodigo(codigo);
                    System.out.println("------------Mensalidade Nº "+codigo+"-------------");
                    System.out.println("Data de Pagamento: "+mensalidade.getData_pagamento());
                    System.out.println("Valor: "+mensalidade.getValor());
                    System.out.println("Data que expira: "+mensalidade.getData_fim());
                    try {
                        AlunoAtivo=arquivoAtivo.buscaAtivoCodigo(mensalidade.getCod_aluno());
                        System.out.println("Código do aluno:"+mensalidade.getCod_aluno());
                        System.out.println("Nome: "+AlunoAtivo.getNome());
                        System.out.println("RG: "+AlunoAtivo.getRG());
                        System.out.println("Telefone: "+AlunoAtivo.getTelefone());
                    }catch(NaoExisteException ex){
                       log.getLogger().log(Level.SEVERE, ex.getMessage());
                    }
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
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
            int codigo;
            Catraca catraca;
            ArrayList<Catraca> entradas = new ArrayList();
            Ativo AlunoAtivo = new Ativo();
            switch (opcao) {
            case 1:
                 //Funcao inserir catraca
                System.out.println("Opção selecionada : Inserir entrada.");
                System.out.print("Digite o código do aluno : ");
                codigo = entrada.nextInt();
                catraca = new Catraca(LocalDateTime.now());
                catraca.setCod_aluno(codigo);
   
                arquivoCatraca.adicionaEntrada(catraca);
                
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 2:
                //Funcao listar catracas
                System.out.println("Opção selecionada : Listar entradas.");
                
                try{
                    entradas = arquivoCatraca.listaEntradas();
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                for (int i = 0; i < entradas.size(); i++) {
                    catraca=entradas.get(i);
                    System.out.println("------------Entrada Nº "+i+"-------------");
                    System.out.println("Data de Entrada: "+catraca.getData_entrada());
                    try {
                    AlunoAtivo=arquivoAtivo.buscaAtivoCodigo(catraca.getCod_aluno());
                        System.out.println("Código do aluno:"+catraca.getCod_aluno());
                        System.out.println("Nome: "+AlunoAtivo.getNome());
                        System.out.println("RG: "+AlunoAtivo.getRG());
                        System.out.println("Telefone: "+AlunoAtivo.getTelefone());
                    }catch(NaoExisteException ex){
                       log.getLogger().log(Level.SEVERE, ex.getMessage());
                    }
                }
                entradas = null;
                
                exibirSubMenus(4);
                this.nivelMenu = 1;
                break;
            case 3:
                //Funcao buscar por código de AlunoAtivo
                System.out.println("Opção selecionada : Buscar entrada por código.");
                System.out.print("Digite o código: ");
                codigo = entrada.nextInt();
                
                try{
                    catraca=arquivoCatraca.buscaEntradaCodigo(codigo);
                    System.out.println("-------------Entrada Nº "+codigo+"-------------");
                    System.out.println("Horário de Entrada55: "+catraca.getData_entrada());
                    try {
                        AlunoAtivo=arquivoAtivo.buscaAtivoCodigo(catraca.getCod_aluno());
                        System.out.println("Código do aluno:"+catraca.getCod_aluno());
                        System.out.println("Nome: "+AlunoAtivo.getNome());
                        System.out.println("RG: "+AlunoAtivo.getRG());
                        System.out.println("Telefone: "+AlunoAtivo.getTelefone());
                    }catch(NaoExisteException ex){
                       log.getLogger().log(Level.SEVERE, ex.getMessage());
                    }
                }catch(NaoExisteException ex){
                    log.getLogger().log(Level.SEVERE, ex.getMessage());
                }
                entradas=null;
                    
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

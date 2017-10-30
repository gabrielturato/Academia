/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.bean;

import academia.arquivo.AtivoArquivo;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 * Classe principal
 * @author Turato
 */
public class Academia extends JFrame{
    
    public static void main(String[] args){
        
        Menu menu;
        menu = new Menu();
        Scanner entrada = new Scanner(System.in);
        AtivoArquivo arquivo = new AtivoArquivo();
        int escolhaPrincipal=0;
        int escolhaSub;
        int escolhaFuncao;
        Ativo aluno;
        aluno = new Ativo();
        //Menu Principal
        while(escolhaPrincipal!=5)
        {
        if(menu.getNivelMenu() == 0){
        menu.exibirMenuPrincipal();
        System.out.print("Escolha uma opção do menu : ");
        escolhaPrincipal = entrada.nextInt();
        System.out.println("Item escolhido : " + escolhaPrincipal);
        menu.exibirSubMenus(escolhaPrincipal);
        }
        if(menu.getNivelMenu() == 1){
        //Sub Menu
        System.out.print("Escolha uma opção do menu : ");
        escolhaSub = entrada.nextInt();
        System.out.println("Item escolhido : " + escolhaSub);
        }
        }              
    }
}

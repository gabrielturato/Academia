/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.exceptions;

/**
 * Exceção para caso o usuário busque algo no documento e não ache
 * @author Turato
 */
public class NaoExisteException extends Exception{
    public NaoExisteException(String mensagem){
        super(mensagem);
    }
}

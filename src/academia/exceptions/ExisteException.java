/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.exceptions;

/**
 * Exceção caso o usuário digite um código novo no documento e ele já
 * exista em outro registro.
 * @author Turato
 */
public class ExisteException extends Exception {
    public ExisteException(String mensagem){
        super(mensagem);
    }
}

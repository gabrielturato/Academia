/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.exceptions;

import java.io.IOException;
import java.util.logging.*;

/**
 *
 * @author Turato
 */
public class Log {
    private static final Logger LOGGER = Logger.getLogger("Erros LOG");
    
    public Log() {
        LogManager.getLogManager().reset();
        LOGGER.setLevel(Level.SEVERE);
        
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        LOGGER.addHandler(ch);
        
        try{
            FileHandler fh = new FileHandler("myLogger.log", true);
            fh.setLevel(Level.WARNING);
            LOGGER.addHandler(fh);
        }catch(IOException e){
            LOGGER.log(Level.SEVERE,"Arquivo de log não está funcionando.",e);
        }
    }
    
    public Logger getLogger(){
        return LOGGER;
    }
}

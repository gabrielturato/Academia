/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.arquivo;
import academia.bean.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.*;
import academia.exceptions.Log;
/**
 *
 * @author Turato
 */
public class Operacoes {
    private final Log log = new Log();    
    
    public boolean salvarListaAtivo(String caminho,ArrayList<Ativo> aluno){
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho);
            ObjectOutputStream oos = new ObjectOutputStream(arquivo);
            oos.writeObject(aluno);
            oos.close();
            arquivo.close();
        }catch(FileNotFoundException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista, documento inexistente", e);   
        }catch(IOException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista", e);
        }
        return true;
    }
    
    public ArrayList<Ativo> lerListaAtivo(String caminho){
        if(new File(caminho).canRead()==true){
            try{
                FileInputStream arquivo = new FileInputStream(caminho);
                ObjectInputStream oos = new ObjectInputStream(arquivo);
                ArrayList<Ativo> alunos = (ArrayList<Ativo>) oos.readObject();
                return alunos;
            }catch(FileNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista, documento inexistente", e);   
            }catch(IOException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }catch(ClassNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }
        }
        return null;
    }
    
    public boolean salvarListaInativo(String caminho,ArrayList<Inativo> aluno){
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho);
            ObjectOutputStream oos = new ObjectOutputStream(arquivo);
            oos.writeObject(aluno);
            oos.close();
            arquivo.close();
        }catch(FileNotFoundException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista, documento inexistente", e);   
        }catch(IOException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista", e);
        }
        return true;
    }
    
    public ArrayList<Inativo> lerListaInativo(String caminho){
        if(new File(caminho).canRead()==true){
            try{
                FileInputStream arquivo = new FileInputStream(caminho);
                ObjectInputStream oos = new ObjectInputStream(arquivo);
                ArrayList<Inativo> alunos = (ArrayList<Inativo>) oos.readObject();
                return alunos;
            }catch(FileNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista, documento inexistente", e);   
            }catch(IOException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }catch(ClassNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }
        }
        return null;
    }

    public boolean salvarListaCatraca(String caminho,ArrayList<Catraca> entradas){
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho);
            ObjectOutputStream oos = new ObjectOutputStream(arquivo);
            oos.writeObject(entradas);
            oos.close();
            arquivo.close();
        }catch(FileNotFoundException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista, documento inexistente", e);   
        }catch(IOException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista", e);
        }
        return true;
    }
    
    public ArrayList<Catraca> lerListaCatraca(String caminho){
        if(new File(caminho).canRead()==true){
            try{
                FileInputStream arquivo = new FileInputStream(caminho);
                ObjectInputStream oos = new ObjectInputStream(arquivo);
                ArrayList<Catraca> entradas = (ArrayList<Catraca>) oos.readObject();
                return entradas;
            }catch(FileNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista, documento inexistente", e);   
            }catch(IOException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }catch(ClassNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }
        }
        return null;
    }
    
    public boolean salvarListaMensalidade(String caminho,ArrayList<Mensalidade> mensalidade){
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho);
            ObjectOutputStream oos = new ObjectOutputStream(arquivo);
            oos.writeObject(mensalidade);
            oos.close();
            arquivo.close();
        }catch(FileNotFoundException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista, documento inexistente", e);   
        }catch(IOException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista", e);
        }
        return true;
    }
    
    public ArrayList<Mensalidade> lerListaMensalidade(String caminho){
        if(new File(caminho).canRead()==true){
            try{
                FileInputStream arquivo = new FileInputStream(caminho);
                ObjectInputStream oos = new ObjectInputStream(arquivo);
                ArrayList<Mensalidade> mensalidades = (ArrayList<Mensalidade>) oos.readObject();
                return mensalidades;
            }catch(FileNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista, documento inexistente", e);   
            }catch(IOException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }catch(ClassNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }
        }
        return null;
    }
    
    public boolean salvarListaTreino(String caminho,ArrayList<Treinos> treino){
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho);
            ObjectOutputStream oos = new ObjectOutputStream(arquivo);
            oos.writeObject(treino);
            oos.close();
            arquivo.close();
        }catch(FileNotFoundException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista, documento inexistente", e);   
        }catch(IOException e){
            log.getLogger().log(Level.SEVERE, "Não foi possível salvar a lista", e);
        }
        return true;
    }
    
    public ArrayList<Treinos> lerListaTreino(String caminho){
        if(new File(caminho).canRead()==true){
            try{
                FileInputStream arquivo = new FileInputStream(caminho);
                ObjectInputStream oos = new ObjectInputStream(arquivo);
                ArrayList<Treinos> treinos = (ArrayList<Treinos>) oos.readObject();
                return treinos;
            }catch(FileNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista, documento inexistente", e);   
            }catch(IOException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }catch(ClassNotFoundException e){
                log.getLogger().log(Level.SEVERE, "Não foi possível ler a lista", e);
            }
        }
        return null;
    }
}

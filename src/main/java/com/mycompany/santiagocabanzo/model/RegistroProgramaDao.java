/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.santiagocabanzo.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author santi
 */
public class RegistroProgramaDao implements IDao {
    private File file = new File("C:\\temp\\archivo.txt");
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public RegistroProgramaDao() throws IOException {
        file.createNewFile();
        oos = new ObjectOutputStream(new FileOutputStream(file));
        ois = new ObjectInputStream(new FileInputStream(file));
    }
    
    @Override
    public String save(RegistroProgramaDto u) {
       String respuesta="Registro exitoso"; 
           try {
            oos.writeObject(u);
        } catch (IOException ex) {
            Logger.getLogger(RegistroProgramaDto.class.getName()).log(Level.SEVERE, null, ex);
            respuesta = "se ha podució un error";
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(RegistroProgramaDto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }

    @Override
    public String update(RegistroProgramaDto u) {
        
        String respuesta="Se actualizo correctamente";
        RegistroProgramaDto udtosalida = null;
        Object aux = null;
        
        try {
            aux = ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(RegistroProgramaDto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroProgramaDto.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(aux!=null){
               if (aux instanceof RegistroProgramaDto) {
                if(((RegistroProgramaDto)aux).equals(aux)){
                    udtosalida= (RegistroProgramaDto)aux;
                }
                
            }
            try {
                aux = ois.readObject();
            } catch (IOException ex) {
                Logger.getLogger(RegistroProgramaDto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistroProgramaDto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        udtosalida.getCreditos(udtosalida.setCreditos(creditos))
        return respuesta;
    }

    @Override
    public String delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RegistroProgramaDto getById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<RegistroProgramaDto> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
    
    
    
    
    
    
    
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Gestion {
    private HashMap<Integer, Persona> personas = new HashMap<Integer, Persona>();
    private File file;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public Gestion(String ruta) {
        this.file = new File(ruta);
        this.crearArchivo();
    }
    public boolean add(int edad, String nombre){
        Persona p = new Persona(edad, nombre);
        return personas.put(personas.size()+1, p) != null;
    }

    public HashMap<Integer, Persona> obtenerTodo() {
        try {
            HashMap<Integer, Persona> personasTemp = new HashMap<>();
            boolean buffer = false;
            fis = new FileInputStream(file);
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Persona p = (Persona) ois.readObject();
                if (p != null) {
                    personasTemp.put(personasTemp.size() + 1, p);
                }
                buffer = true;
            }
            if (buffer) {
                ois.close();
            }
            fis.close();
            return personasTemp;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            return null;
        }

    }

    public void obtener(){
        try {
            fis = new FileInputStream(file);
            boolean buffer = false;
            while(fis.available() > 0){
                ois = new ObjectInputStream(fis);
                HashMap<Integer, Persona> personasTemp = (HashMap<Integer, Persona>) ois.readObject();
                if (personasTemp != null){
                    this.personas = personasTemp;
                }
                buffer = true;
            }
            if (buffer){
                ois.close();
            }
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void guardar(){
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(this.personas);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearArchivo() {
        if(!this.file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void imprimirTodo(){
        if(this.personas.isEmpty()){
            System.out.println("No hay nada...");
            return;
        }
        for(int i = 0 ; i < this.personas.size(); i++){
            System.out.println(personas.get(i+1));
        }
    }
}
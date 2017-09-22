/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeancasoto_labexamen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jeansoto
 */
public class AdminAlbum implements Serializable{
    
    
    private ArrayList<Album> listaalbums = new ArrayList();
    private File archivo = null;

    
    
   
    public AdminAlbum(String path){
    archivo = new File(path);
    }

    public ArrayList<Album> getListaalbums() {
        return listaalbums;
    }

    public void setListaalbums(ArrayList<Album> listaalbums) {
        this.listaalbums = listaalbums;
    }

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    

    
    
    
    //MUTADOR EXTRA
    
    public void setAlbum(Album p){
    this.listaalbums.add(p);
    
    }
    
    public void cargarArchivo(){
        try {
            listaalbums = new ArrayList();
            Album temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(Album) objeto.readObject())!=null){
                    listaalbums.add(temp);
                    }
                } catch (EOFException e) {
                    //Encontro final del archivo
                }
                objeto.close();
                entrada.close();
                //fin if
            }
        } catch (Exception e) {
            
        }
    
    }//Fin del metodo
    
    public void escribirArchivo(){
    FileOutputStream fw = null;
    ObjectOutputStream bw = null;
    
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Album t : listaalbums) {
                bw.writeObject(t);
            }
        } catch (Exception ex) {
        } finally{
            try {
                fw.close();
                bw.close();
            } catch (Exception e) {
            }
        }
    
    
    }
    
}

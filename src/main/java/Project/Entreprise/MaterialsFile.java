/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Entreprise;

/**
 *
 * @author LAULAU
 */

import java.io.*; // importation de l'instruction en rapport avec IOException

public class MaterialsFile {
    private ObjectOutputStream ofW; //flux d'écriture
    private ObjectInputStream ofR; //flux de lecture
    private String fileName = "Inventory.dat"; //où se trouve mémorisé le nom de fichier de sauvegarde des données (Inventory.dat)
    private char mode; // type d'ouverture du fichier et une chaîne de caractères (fileName)


    public boolean open (String tmp, String s){
        try {
            mode = (s.toUpperCase()).charAt(0);
                fileName = tmp;
            if (mode == 'R')
                ofR = new ObjectInputStream(new FileInputStream(fileName));
            else if (mode == 'W')
                ofW = new ObjectOutputStream(new FileOutputStream(fileName));
            return true;
        }
        catch (IOException e){
            return false;
        }
    }
    // Traitement du fichier
    public void write (Inventory tmp){
        try {
            if (tmp != null) ofW.writeObject(tmp);
        }
        catch ( IOException e ) {
            System.out.println( "Cannot write objects into the stream" );
        }
    }

    public Inventory read(){
        try {
            Inventory tmp = (Inventory) ofR.readObject();
            return tmp;
        }
        catch (IOException e) {
            System.out.println(fileName + " : Reading error !");
        }
        catch (ClassNotFoundException e){
            System.out.println(fileName + " is not of the correct format !");
        }
        return null;
    }

    public void close(){
        try{
            if (mode == 'R') ofR.close();
            else if (mode == 'W') ofW.close();
        }
        catch (IOException e) {
            System.out.println(fileName + ": Error at closing time !");
        }
    }

}

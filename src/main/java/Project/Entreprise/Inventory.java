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
import java.util.*;
import java.io.*;

public class Inventory implements Serializable {
    private String typeMaterial;
    private String reference;
    private double initQuantity, remaining, securityStockPt;
    private ArrayList<LogisticsLine> logLine;
    // Constante représentant le nombre maximal de lignes logistiques possible.
    public static final int NumberOfLine = 10;

    //Création d'une nouvelle référence dans le stock avec les méthodes qui sont
    // intégrées graçe au constructeur de classe "Inventory"
    public Inventory(String ref, String nType, double initVal, double securStock) {
        typeMaterial = nType;
        reference = ref;
        initQuantity = initVal;
        securityStockPt = securStock;
        logLine = new ArrayList<LogisticsLine> ();
        remaining = initQuantity;
    }

   
    

    //Méthodes d'accès en lecture pour les données de la classe

    public String getTypeMaterial() {
        return typeMaterial;
    }

    public String getReference() {
        return reference;
    }
    
    public String getInitQuantity(){
        return Double.toString(initQuantity);
    }
    
     public double getSecurityStockPt(){
        return securityStockPt;
    }
    
    public double getRemaining(){
        int lineNum = logLine.size();
        double remainingCalc = initQuantity;
    if (lineNum > 0){
        for (LogisticsLine tmp : logLine) remainingCalc+=tmp.getLogisticsQuantity();
    }  
            remaining = remainingCalc;
            return remaining;
    }
    
    public void setLogLine(LogisticsLine tmp){
        logLine.add((LogisticsLine)tmp);
    }
    
    public ArrayList<LogisticsLine> getLogLine(){
        return logLine;
    }

    //Méthode qui permet de demander le type du compte voulu
    private String typeChecked() { //A REVOIR
        Scanner lectureClavier = new Scanner(System.in);
        boolean result;
        char tmpC;
        String tpe = "";
        do {
            System.out.print("Please enter your Type of Account (C = Checking Account, J = Joint Account) ! :");
            tmpC = lectureClavier.next().charAt(0);
            switch (tmpC) {
                case 'C':
                    result = true;
                    tpe = "Checking";
                    break;
                case 'J':
                    result = true;
                    tpe = "Joint";
                    break;
                default:
                    result = false;
                    break;
            }
        } while (result == false);

        return tpe;
    }


    //Méthode qui demande le numéro de compte à créer
    private String accountNumberChecked() {
        String accountNum;
        Scanner lectureClavier = new Scanner(System.in);
        do {
            accountNum = lectureClavier.next();
            if (accountNum.length() == 5);
            else if (accountNum.length() != 5)
                System.out.print("Please enter your Account Number as (000.0) : ");
        } while (accountNum.length() != 5);
        return accountNum;
    }

    //Méthode qui permet d'inscrire la première valeure sur le compte
    private double initialValueChecked() {
        Scanner lectureClavier = new Scanner(System.in);
        try{
            do {
                System.out.print("Please enter the Initial Value of the Account : ");
                initQuantity = lectureClavier.nextDouble();
            } while (initQuantity <= 0);
            return initQuantity;
        }
        catch (InputMismatchException e){
            System.out.println("This response is not the correct character format except !!! ");
            System.out.println("Be careful to put a comma (,) and not a dot (.) !!!");
            System.out.println("");
            initialValueChecked();
            return 0;
        }
    }

    // Permet de savoir si le numéro entré existe bel et bien
    public void compare(String a, String b) {
        boolean will = false;
        do {
            if ((a.equals(b))) {
                System.out.println("The account number exists !");
            } else if (!(a.equals(b))) {
                System.out.println("Your account number is not valid !");
            }
        } while (!(a.equals(b)));

    }

    // Création d'une ligne comptable graçe à l'objet implémenté "line" pour l'option 3

    public void accountResult(double m, double v) {
        remaining = (m) + (v);
        System.out.println("There's on your Account : " + remaining);
    }


    // Permet d'afficher le résumé du nouveau compte ajouté
    public void displayReference() {
        System.out.println("Your Account Number is n° : " + reference);
        System.out.println("You are on a " + typeMaterial + " account !");
        System.out.println("Money : " + remaining + " € ! ");
        if (remaining <0)
            System.out.println("Your Bank Account is debtor !");
                int lineNum = logLine.size();
     if (lineNum > 0){
         for(LogisticsLine tmp : logLine) tmp.display();
     }
     else {
         System.out.println("The list is empty !");
     } 
    }    
    
}

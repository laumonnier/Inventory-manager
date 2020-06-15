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
import java.io.*;


public class LogisticsLine implements Serializable{
    private double logisticsQuantity;
    private String date;
    private String transaction;
    private String reason;
 


    // Méthode d'accés en lecture pour les variables de la class

    public double getLogisticsQuantity() {
        return logisticsQuantity;
    }

    public String getDate() {
        return date;
    }

    public String getTransaction() {
        return transaction;
    }

    public String getReason() {
        return reason;
    }


    //Constructeur d'une ligne logistique

    /**
     *
     * @param rson
     * @param trans
     * @param dte
     * @param logQ
     */
    public LogisticsLine(String rson, String trans, String dte, double logQ) {
        reason = rson;
        transaction = trans;
        date = dte;
        logisticsQuantity = logQ;       
    }
    
    public void display(){
        System.out.println("--------------------------------------");
        System.out.println("reason : " + reason);
        System.out.println("transaction :" + transaction);
        System.out.println("date : " + date);
        System.out.println("quantity : " + logisticsQuantity);
    }
}


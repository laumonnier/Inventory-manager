/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Entreprise;

import java.util.*;
import java.awt.Color;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author LAULAU
 */
public class EditMaterial extends javax.swing.JFrame {

    /**
     * Creates new form EditAccount
     * @param inv
     * @throws java.text.ParseException
     */
    public EditMaterial(Inventory inv) throws ParseException {
        ImageIcon iconPhoto;
        initComponents();
        headerBox.setBackground(new Color(240,240,240,190));
        reasonLabel.setBackground(new Color(204,204,204,80));
        transactionLabel.setBackground(new Color(204,204,204,80));
        dateLabel.setBackground(new Color(204,204,204,80));
        quantityLabel.setBackground(new Color(204,204,204,80));
        lineBox.setBackground(new Color(240,240,240,190));
        remainingLabel.setBackground(new Color(255,255,255,90));
        remainingValue.setBackground(new Color(255,255,255,90));
        weightLabel.setBackground(new Color(255,255,255,90));        
        // Afficher la Référence, le type de produit, le reste dans le stock 
        //et le point de STock de Sécurité au sein du cadre du composant
        Border framework = BorderFactory.createTitledBorder("Reference : " 
                + inv.getReference() + ",    Product : " + inv.getTypeMaterial()
                + ",    Remaining : " + inv.getRemaining() 
                + " KG,    SecurityStock :" + inv.getSecurityStockPt());
        headerBox.setBorder(framework);
        setBounds (500, 230, 640, 670);
        setVisible(true);
        
        //Afficher une image en fond de fenêtre en fonction du produit choisi auparavant
        switch(inv.getTypeMaterial()){
            case "Steel":
                iconPhoto = new ImageIcon ("C:\\Users\\LAULAU\\Documents\\"
                            + "NetBeansProjects\\Entreprise\\Photos\\Steel\\"
                            + "BackgroundSteelEditMaterial1.png");
                backgroundPhoto.setIcon(iconPhoto);
                break;
            case "Wood":
                iconPhoto = new ImageIcon ("C:\\Users\\LAULAU\\Documents\\"
                            + "NetBeansProjects\\Entreprise\\Photos\\Wood\\"
                            + "BackgroundWoodEditMaterial1.png");
                backgroundPhoto.setIcon(iconPhoto);
                break;
            case "Plastic":
                iconPhoto = new ImageIcon ("C:\\Users\\LAULAU\\Documents\\"
                            + "NetBeansProjects\\Entreprise\\Photos\\Plastic\\"
                            + "BackgroundPlasticEditMaterial1.png");
                backgroundPhoto.setIcon(iconPhoto);
                break;
            case "Glass":
                iconPhoto = new ImageIcon ("C:\\Users\\LAULAU\\Documents\\"
                            + "NetBeansProjects\\Entreprise\\Photos\\Glass\\"
                            + "BackgroundGlassEditMaterial2.png");
                backgroundPhoto.setIcon(iconPhoto);
                break;
            default:
                
        }
        
        // Récupérer le contenu des "LogisticsLine"
        ArrayList<LogisticsLine> tmp = inv.getLogLine();
        int nbLine = tmp.size();
        
        // Récupérer le reste en stock
        double remaining = inv.getRemaining();
        double securityStock = inv.getSecurityStockPt();
        
        // Si le reste en stock est inférieur 
        // ou égal au "SecurityStock" : l'afficher en ORANGE
        if ((remaining <= securityStock)&&(remaining > 0)) {
            remainingValue.setForeground(new Color(255,102,0));
            remainingValue.setText(Double.toString(inv.getRemaining()));
        }
            // Si le reste en stock est égale à 0 : l'afficher en ROUGE
        else if (remaining == 0){
                remainingValue.setForeground(new Color(251,0,0));
                remainingValue.setText(Double.toString(inv.getRemaining()));
            }
                
        // Sinon à l'inversement l'afficher en NOIR
        else remainingValue.setForeground(Color.BLACK);
             remainingValue.setText(Double.toString(inv.getRemaining()));
        
        if (nbLine > 0){
            for (LogisticsLine logL : tmp){
                // A chaque ligne logistique récupérée, 
                // créer un objet de type "EditLogisticsLine"
                // L'ajouter au conteneur "lineBox"
                if (remaining >= 0)
                lineBox.add(new EditLogisticsLine(logL));
            }
        }
        else {
            System.out.println("The list is empty !!!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lineBox = new javax.swing.JPanel();
        headerBox = new javax.swing.JPanel();
        reasonLabel = new javax.swing.JLabel();
        transactionLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        okBtn = new javax.swing.JButton();
        remainingLabel = new javax.swing.JLabel();
        remainingValue = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        backgroundPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Referenced Product Edition");
        setBackground(new java.awt.Color(190, 190, 190));
        setResizable(false);
        getContentPane().setLayout(null);

        lineBox.setForeground(new java.awt.Color(163, 163, 163));
        lineBox.setToolTipText("Represents Stock lines by reference in Storage");
        lineBox.setLayout(new java.awt.GridLayout(25, 1, 1, 0));
        getContentPane().add(lineBox);
        lineBox.setBounds(30, 90, 560, 400);

        headerBox.setBackground(new java.awt.Color(190, 190, 190));
        headerBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)), "Product :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        headerBox.setPreferredSize(new java.awt.Dimension(400, 40));
        headerBox.setLayout(new java.awt.GridLayout(1, 4));

        reasonLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        reasonLabel.setText("Reason");
        reasonLabel.setOpaque(true);
        headerBox.add(reasonLabel);

        transactionLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        transactionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transactionLabel.setText("Transaction");
        transactionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        transactionLabel.setOpaque(true);
        headerBox.add(transactionLabel);

        dateLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateLabel.setText("Date");
        dateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dateLabel.setOpaque(true);
        headerBox.add(dateLabel);

        quantityLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        quantityLabel.setText("Quantity");
        quantityLabel.setOpaque(true);
        headerBox.add(quantityLabel);

        getContentPane().add(headerBox);
        headerBox.setBounds(20, 20, 580, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 500, 640, 0);

        okBtn.setBackground(new java.awt.Color(190, 190, 190));
        okBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        okBtn.setText("OK");
        okBtn.setToolTipText("Click here to close the window and return to the main window ");
        okBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        getContentPane().add(okBtn);
        okBtn.setBounds(380, 570, 83, 37);

        remainingLabel.setBackground(new java.awt.Color(255, 255, 255));
        remainingLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        remainingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remainingLabel.setText("Remaining");
        remainingLabel.setOpaque(true);
        getContentPane().add(remainingLabel);
        remainingLabel.setBounds(140, 510, 130, 40);

        remainingValue.setBackground(new java.awt.Color(255, 255, 255));
        remainingValue.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        remainingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remainingValue.setText("0");
        remainingValue.setToolTipText("Indicates the remainder of the reference Stock");
        remainingValue.setOpaque(true);
        getContentPane().add(remainingValue);
        remainingValue.setBounds(310, 510, 100, 40);

        weightLabel.setBackground(new java.awt.Color(255, 255, 255));
        weightLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        weightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightLabel.setText("Kg");
        weightLabel.setOpaque(true);
        getContentPane().add(weightLabel);
        weightLabel.setBounds(440, 510, 80, 40);
        getContentPane().add(backgroundPhoto);
        backgroundPhoto.setBounds(10, 10, 600, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // Fermer la fenêtre sans fermer l'application
        this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundPhoto;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel headerBox;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel lineBox;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel reasonLabel;
    private javax.swing.JLabel remainingLabel;
    private javax.swing.JLabel remainingValue;
    private javax.swing.JLabel transactionLabel;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}

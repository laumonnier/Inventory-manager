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
public class PresentationPage extends javax.swing.JFrame {

    /**
     * Creates new form PresentationPage
     */
    public PresentationPage() {
        initComponents();
        this.setBounds (450,450,680,550);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helloLabel = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        text1Label = new javax.swing.JLabel();
        plasticLabel = new javax.swing.JLabel();
        steelLabel = new javax.swing.JLabel();
        woodLabel = new javax.swing.JLabel();
        glassLabel = new javax.swing.JLabel();
        continueBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(60, 144, 243));

        helloLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        helloLabel.setForeground(new java.awt.Color(204, 0, 102));
        helloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helloLabel.setText("Hello ! ");

        textLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLabel.setText("I am an Application allowing the Inventory ");

        text1Label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        text1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1Label.setText("of a Industrial Company about :");

        plasticLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        plasticLabel.setText("- > The Plastic ");

        steelLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        steelLabel.setText("- > The Steel ");

        woodLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        woodLabel.setText("- > The Wood");

        glassLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        glassLabel.setText("- > The Glass");

        continueBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        continueBtn.setText("Continue");
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(helloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(steelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plasticLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(woodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(glassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(helloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(plasticLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(steelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(woodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(glassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(continueBtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_continueBtnActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel glassLabel;
    private javax.swing.JLabel helloLabel;
    private javax.swing.JLabel plasticLabel;
    private javax.swing.JLabel steelLabel;
    private javax.swing.JLabel text1Label;
    private javax.swing.JLabel textLabel;
    private javax.swing.JLabel woodLabel;
    // End of variables declaration//GEN-END:variables
    }

public class test extends javax.swing.JFrame {


    public test() {
        initComponents();
        this.setTitle("Love Compatibility Test");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtyourName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLOYLName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnMatch = new javax.swing.JButton();
        lblvalidation = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblnames = new javax.swing.JLabel();
        lblnames2 = new javax.swing.JLabel();
        lblremarks = new javax.swing.JLabel();
        lblpercent = new javax.swing.JLabel();
        lblvalidationn = new javax.swing.JLabel();
        btnRetry = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Love-O-Meter Test");

        jLabel3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Name");

        txtyourName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" ♡");

        txtLOYLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOYL Name");

        btnMatch.setText("Match");
        btnMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchActionPerformed(evt);
            }
        });

        lblvalidation.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 10)); // NOI18N
        lblvalidation.setForeground(new java.awt.Color(204, 0, 0));
        lblvalidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jLabel7.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Results ~");

        lblnames.setFont(new java.awt.Font("MingLiU-ExtB", 0, 14)); // NOI18N
        lblnames.setForeground(new java.awt.Color(255, 255, 255));
        lblnames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnames.setText("-");

        lblnames2.setFont(new java.awt.Font("MingLiU-ExtB", 0, 14)); // NOI18N
        lblnames2.setForeground(new java.awt.Color(255, 255, 255));
        lblnames2.setText("@j-archives © 2023");

        lblremarks.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        lblremarks.setForeground(new java.awt.Color(255, 255, 255));
        lblremarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblremarks.setText(".");

        lblpercent.setFont(new java.awt.Font("MingLiU-ExtB", 1, 36)); // NOI18N
        lblpercent.setForeground(new java.awt.Color(255, 255, 255));
        lblpercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpercent.setText("_");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblnames2)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnames, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblremarks, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                        .addGap(71, 71, 71))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(lblnames)
                .addGap(18, 18, 18)
                .addComponent(lblpercent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblremarks, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(lblnames2)
                .addContainerGap())
        );

        lblvalidationn.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 12)); // NOI18N
        lblvalidationn.setForeground(new java.awt.Color(255, 0, 0));
        lblvalidationn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvalidationn.setText("*");

        btnRetry.setText("Retry");
        btnRetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetryActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lblvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtyourName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(jLabel3))
                                        .addComponent(txtLOYLName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(jLabel5))))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblvalidationn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnRetry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMatch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtyourName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLOYLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblvalidationn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMatch)
                            .addComponent(btnRetry)
                            .addComponent(btnExit)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(252, 252, 252)
                .addComponent(lblvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    String yourName, loylName;
    int percentage = 0;
    
    
    private void Checker(){
        switch (percentage) {
            case 2:
                lblremarks.setText("Make bawi na lang next life");
                break;
            case 12:
                lblremarks.setText("TOXIC yan so run na");
                break;
            case 10:
                lblremarks.setText("You deserve better.");
                break;
            case 30:
                lblremarks.setText("Basta Happy ka, go lang..");
                break;
            case 5:
                lblremarks.setText("Make bawi na lang next life");
                break;
            case 69:
                lblremarks.setText("Yummers :P");
                break;
            case -100:
                lblremarks.setText("Better stay as friends.");
                break;
            case 0:
                lblremarks.setText("Make bawi na lang next life");
                break;
            case 99:
                lblremarks.setText("Match made from Heaven");
                break;
            case 70:
                lblremarks.setText("You deserve better.");
                break;
            default:
                break;
        }
                    
    }
    
    
    private void btnMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchActionPerformed
        //if button was CLICKED
        yourName = txtyourName.getText();
        loylName = txtLOYLName.getText();
        
        int stringYourNameSize = yourName.length();
        int stringLOYLnameSize = loylName.length();
       

        
        //NAMES
        lblnames.setText(yourName + " and " + loylName);
        
        //VALIDATION
        //YOURNAME
        if (yourName.isEmpty() || loylName.isEmpty()) {
            lblvalidationn.setText("*Please Complete the form");
        }
        
        else if (stringYourNameSize == 1 || stringLOYLnameSize == 1 ) {
            lblpercent.setText("2%");
            percentage = 2;
            Checker();
        }
        
        else if (stringYourNameSize == 1 || stringLOYLnameSize == 2 ) {
            lblpercent.setText("12%");
            percentage = 12;
            Checker();
        }
        
        else if (stringYourNameSize == 2 || stringLOYLnameSize ==3 ) {
            lblpercent.setText("10%");
            percentage = 10;
            Checker();
        }
        
        else if (stringYourNameSize == 3 || stringLOYLnameSize ==4 ) {
            lblpercent.setText("30%");
            percentage = 30;
            Checker();
        }
        
        else if (stringYourNameSize == 4 || stringLOYLnameSize ==5 ) {
            lblpercent.setText("5%");
            percentage = 5;
            Checker();
        }
        
       else if (stringYourNameSize == 5 || stringLOYLnameSize ==6 ) {
            lblpercent.setText("69%");
            percentage = 69;
            Checker();
        }
        
        else if (stringYourNameSize == 6 || stringLOYLnameSize ==7 ) {
            lblpercent.setText("-100%");
            percentage = -100;
            Checker();
        }
        
        else if (stringYourNameSize == 7 || stringLOYLnameSize ==8 ) {
            lblpercent.setText("0%");
            percentage = 0;
            Checker();
        }
        
        else if (stringYourNameSize == 8 || stringLOYLnameSize ==9 ) {
            lblpercent.setText("99%");
            percentage = 99;
            Checker();
        }
        
        else if (stringYourNameSize == 9 || stringLOYLnameSize ==10 ) {
            lblpercent.setText("70%");
            percentage = 70;
            Checker();
        }
       
    }//GEN-LAST:event_btnMatchActionPerformed

    private void btnRetryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetryActionPerformed
        txtyourName.setText(null);
        txtLOYLName.setText(null);
        lblnames.setText(" ");
        lblpercent.setText(" ");
        lblremarks.setText(" ");
        
        percentage = 0;
    }//GEN-LAST:event_btnRetryActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMatch;
    private javax.swing.JButton btnRetry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblnames;
    private javax.swing.JLabel lblnames2;
    private javax.swing.JLabel lblpercent;
    private javax.swing.JLabel lblremarks;
    private javax.swing.JLabel lblvalidation;
    private javax.swing.JLabel lblvalidationn;
    private javax.swing.JTextField txtLOYLName;
    private javax.swing.JTextField txtyourName;
    // End of variables declaration//GEN-END:variables
}

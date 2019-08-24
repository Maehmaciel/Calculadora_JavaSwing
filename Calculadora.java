
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBinario = new javax.swing.JButton();
        btnOctal = new javax.swing.JButton();
        btnHexa = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBinario.setText("Binario");
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });

        btnOctal.setText("Octal");
        btnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctalActionPerformed(evt);
            }
        });

        btnHexa.setText("Hexadecimal");
        btnHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexaActionPerformed(evt);
            }
        });

        btnDecimal.setText("Decimal");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        btnDecimal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnDecimalPropertyChange(evt);
            }
        });

        jLabel1.setText("Insira um número");

        entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                entradaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHexa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOctal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entrada))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBinario)
                    .addComponent(btnOctal))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHexa)
                    .addComponent(btnDecimal))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
        int numero = Integer.parseInt(entrada.getText());
        String result = "";

        do {
            result += numero % 2;
            numero /= 2;
        } while (numero != 0);
        result = new StringBuilder(result).reverse().toString();
        entrada.setText(result);

    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctalActionPerformed
        int numero = Integer.parseInt(entrada.getText());
        String result = "";

        do {
            result += numero % 8;
            numero /= 8;
        } while (numero != 0);

        result = new StringBuilder(result).reverse().toString();
        entrada.setText(result);


    }//GEN-LAST:event_btnOctalActionPerformed

    private void btnHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexaActionPerformed
        int numero = Integer.parseInt(entrada.getText());
        String result = "";

        do {
            int t = numero % 16;
            if (t < 10) {
                result += numero % 16;
            } else {
                switch (t) {
                    case 10:
                        result += 'A';
                        break;
                    case 11:
                        result += 'B';
                        break;
                    case 12:
                        result += 'C';
                        break;
                    case 13:
                        result += 'D';
                        break;
                    case 14:
                        result += 'E';
                        break;
                    case 15:
                        result += 'F';
                        break;

                }

            }
            numero /= 16;
        } while (numero != 0);

        result = new StringBuilder(result).reverse().toString();
        entrada.setText(result);

    }//GEN-LAST:event_btnHexaActionPerformed

    private void entradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaKeyReleased
        String a=entrada.getText();
       int j=0;
       int i=0;
       if(a.equals("")){
       btnDecimal.setVisible(false);
       }else{
       for(;i<a.length();i++){     
       if (a.charAt(i)!='0' && a.charAt(i)!='1'){        
               j=0;
               btnDecimal.setVisible(false);
               break;
       }else{
               j++;
               }
       }
        if(j>0){
        btnDecimal.setVisible(true);
                }
       }
    }//GEN-LAST:event_entradaKeyReleased

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        double um,dois,soma=0;
        double tamanho=entrada.getText().length();
        double aux=tamanho-1;
        for(int i=0;i<tamanho;i++){
       um=Character.getNumericValue(entrada.getText().charAt(i));
       dois=Math.pow(2, aux);
        soma+=um*dois;
        aux--;
        }
        String s=Double.toString(soma).replaceAll(".0","");
        
        entrada.setText(s);
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnDecimalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnDecimalPropertyChange
        btnDecimal.setVisible(false);
    }//GEN-LAST:event_btnDecimalPropertyChange

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnHexa;
    private javax.swing.JButton btnOctal;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

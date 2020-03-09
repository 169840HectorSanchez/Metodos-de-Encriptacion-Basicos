package seguridad.parcial.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hector
 */
public class Atbash extends javax.swing.JFrame {

    /**
     * Creates new form Atbash
     */
    public Atbash() {
        initComponents();
    }

        public static String Encriptar( String message )
    {
        //Basado de aqui
        //https://exercism.io/tracks/java/exercises/atbash-cipher/solutions/ce7f9a7a88124b8298c1de831037f051
        //A mutable sequence of characters.
        //https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
        StringBuilder decoded = new StringBuilder();
        for (char c : message.toCharArray()) {
             //loop foreach. Ni sabia que hacia
            //https://www.geeksforgeeks.org/for-each-loop-in-java/
            //Pasar por un array mas util
            if (Character.isLetter(c)) {
                int newChar = ('Z' - c) + 'A';
                //Solamente voltea el abecedario desde la letra tomada
                decoded.append((char) newChar);
                //append anexa al decoded
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }
    
    
    public static String Original(String mensaje){
        //A mutable sequence of characters.
        StringBuilder coded = new StringBuilder();
        for(char c: mensaje.toCharArray()){
            //loop foreach. Ni sabia que hacia
            //https://www.geeksforgeeks.org/for-each-loop-in-java/
            //Pasar por un array mas util
            if(Character.isLetter(c)){
                //En vez de voltear la vuelve normal
            int newChar = ('A'-c)+'Z';
            coded.append((char) newChar);
        } else{
            coded.append(c);
        }
        }
        return coded.toString();
    }
    
    
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_Original = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_Encriptado = new javax.swing.JTextArea();
        btn_Encriptar = new javax.swing.JButton();
        btn_Desencriptar = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AtBash");

        txtarea_Original.setColumns(20);
        txtarea_Original.setRows(5);
        jScrollPane1.setViewportView(txtarea_Original);

        txtarea_Encriptado.setColumns(20);
        txtarea_Encriptado.setRows(5);
        jScrollPane2.setViewportView(txtarea_Encriptado);

        btn_Encriptar.setText("Encriptar");
        btn_Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EncriptarActionPerformed(evt);
            }
        });

        btn_Desencriptar.setText("Desencriptar");
        btn_Desencriptar.setToolTipText("");
        btn_Desencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DesencriptarActionPerformed(evt);
            }
        });

        btn_Borrar.setText("Borrar");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Encriptar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Desencriptar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Encriptar)
                    .addComponent(btn_Desencriptar)
                    .addComponent(btn_Borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EncriptarActionPerformed
        // TODO add your handling code here:
        String entrada = txtarea_Original.getText();
        entrada=entrada.toUpperCase();
        entrada=entrada.replaceAll("\n","");
        String salida=Encriptar(entrada);
        txtarea_Encriptado.setText(salida);
    }//GEN-LAST:event_btn_EncriptarActionPerformed

    private void btn_DesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DesencriptarActionPerformed
        String entrada = txtarea_Encriptado.getText();
        entrada=entrada.toUpperCase();
        entrada=entrada.replaceAll("\n","");
        entrada=entrada.replaceAll(".","");
        entrada=entrada.replaceAll("!","");
        String salida=Original(entrada);
        txtarea_Original.setText(salida);
    }//GEN-LAST:event_btn_DesencriptarActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        // TODO add your handling code here:
        txtarea_Original.setText("");
        txtarea_Encriptado.setText("");
    }//GEN-LAST:event_btn_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Atbash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atbash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atbash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atbash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atbash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Desencriptar;
    private javax.swing.JButton btn_Encriptar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtarea_Encriptado;
    private javax.swing.JTextArea txtarea_Original;
    // End of variables declaration//GEN-END:variables
}
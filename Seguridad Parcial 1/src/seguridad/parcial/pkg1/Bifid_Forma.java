/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.parcial.pkg1;

/*import static bifid.Bifid.cipher;
import static bifid.Bifid.crearPolybius;
import static bifid.Bifid.removeDupsInPlace;
import java.util.Scanner;*/

/**
 *
 * @author hector
 */
public class Bifid_Forma extends javax.swing.JFrame {

    /**
     * Creates new form Bifid_Forma
     */
    public Bifid_Forma() {
        initComponents();
    }

      public static String removeDupsInPlace(String word) {
    final StringBuilder output = new StringBuilder();
 
    for (int i = 0; i < word.length(); i++) {
        //revisa toda la palabra
      String character = word.substring(i, i + 1);
      //si el caracter ya esta dentro del output no lo mete
      //Si no esta, lo mete
      if (output.indexOf(character) < 0) // if not contained
        output.append(character);
    }
    //Conversion a String
    return output.toString();
  }
    
    
    public static char[][] crearPolybius(String clave){
        char[][] polyb = { 
            //Tabla de como quedara el cuadro Polybius primero
            {'A', 'B', 'C', 'D', 'E'}, 
            {'F', 'G', 'H','I','K'}, 
            {'L', 'M', 'N' ,'O', 'P'}, 
            {'Q', 'R', 'S', 'T', 'U'}, 
            {'V', 'W', 'X', 'Y', 'Z'} };
        char[] polybClave = new char[25];
        int Inicial=0;
        //Lo que hara el for es meter todo dentro de un array llamado polybClave
        for(; Inicial<clave.length(); Inicial++){
            polybClave[Inicial] = clave.charAt(Inicial);
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int k = 0;
                for(; k<Inicial; k++)
                   //Elimina las letras que ya estaban o las pone en el arrray
                    if(polyb[i][j]==polybClave[k]) //En caso de que sea el mismo detro de Polyb y el de la polybClave se movera al siguiente
                        break;
                if(polyb[i][j]!=polybClave[k])
                    polybClave[Inicial++] = polyb[i][j];   //Aqui se muestra la diferencia
            }}
        //Rellena el cuadro con lo que se realizo anteriormente
        for(int i=0; i<5; i++){ 
            for(int j=0; j<5; j++){
                polyb[i][j] = polybClave[(i*5)+j]; 
               // System.out.println(polyb[i][j]);
            }}
        return polyb;
    }
    /**
     * @param args the command line arguments
     */
    
    public  String cipher(String texto,char[][] poli)
    {
       texto=texto.toUpperCase();
       texto=texto.replaceAll(" ","");
       texto=texto.replaceAll("J","I");
       
    
        /*char allchar[][] = {{'A','B','C','D','E'},{'F','G','H','I','K'},
            {'L','M','N','O','P'}, {'Q','R','S','T','U'},{'V','W','X','Y','Z'}};
        char allchar2[][];*/
        String sawa = "";
        
        
        int len=texto.length();
         char b;
         //Esta parte primero me sirve para checar si esta bien
         
        System.out.println("Cipher Text is Here :");
        //El for pasa por todas las "areas" necesarias
                for(int i=0; i<len; i++)
                {
                    b=texto.charAt(i);
                    for(int j=0; j<5; j++)
                    {
                        for(int k=0; k<5; k++)
                        {
                            if(b==poli[j][k])
                            {
                                int f=j+1;
                                int s=k+1;
                                //sawa solo sirve para almacenar todo y dejarlo 
                                //txt_Encriptado
                                sawa = sawa+f+s+" ";
                                
                                System.out.print(f+" "+s);
                                
                                System.out.print("\t");
                                
                        }
                    }
                }
                }
                //Creo que el return no me sirve para nada
                // EL RETURN NO SIRVE PARA NADA. SOLO NECESITAS EL OTRO GET
                
                txt_Encriptado.setText(sawa);
                return sawa;
}
    
        private static void search(int[][] mat, int n, int x) 
    { 
        //Tecnicamente aun no lo utilizo
  //Literal solo busca el elemento, el rollo va a hacer. Que busque ls numeros en el array 3d
        int i = 0, j = n - 1; // set indexes for top right 
        // element 
  
        while (i < n && j >= 0) { 
            if (mat[i][j] == x) { 
                System.out.print("n Found at " + i + " " + j); 
                return; 
            } 
            if (mat[i][j] > x) 
                j--; 
            else // if mat[i][j] < x 
                i++; 
        } 
  
        System.out.print("n Element not found"); 
        return; // if ( i==n || j== -1 ) 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Original = new javax.swing.JTextArea();
        btn_Encriptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Llave = new javax.swing.JTextField();
        btn_Desencriptar = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Encriptado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bifid");

        jLabel1.setText("Texto Original");

        txt_Original.setColumns(20);
        txt_Original.setRows(5);
        jScrollPane1.setViewportView(txt_Original);

        btn_Encriptar.setText("Encriptar");
        btn_Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EncriptarActionPerformed(evt);
            }
        });

        jLabel2.setText("Llave");

        btn_Desencriptar.setText("Desencriptar");
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

        jLabel3.setText("Texto Encriptado");

        txt_Encriptado.setColumns(20);
        txt_Encriptado.setRows(5);
        jScrollPane2.setViewportView(txt_Encriptado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Encriptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Llave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Desencriptar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Borrar))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Encriptar)
                    .addComponent(jLabel2)
                    .addComponent(txt_Llave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Desencriptar)
                    .addComponent(btn_Borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        // TODO add your handling code here:
        txt_Original.setText("");
        txt_Encriptado.setText("");
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void btn_EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EncriptarActionPerformed
        // TODO add your handling code here:
        String s=txt_Llave.getText();
        s=removeDupsInPlace(s);
        //System.out.println(s);
        s=s.toUpperCase();
        s=s.replaceAll(" ","");
        s=s.replaceAll("J","I");
        s=s.replaceAll("Ñ","N");
        char[][] poli =  crearPolybius(s);
        String texto=txt_Original.getText();
        cipher(texto,poli);
    }//GEN-LAST:event_btn_EncriptarActionPerformed

    private void btn_DesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DesencriptarActionPerformed
        // TODO add your handling code here:
        String s=txt_Encriptado.getText();
        String x=txt_Llave.getText();
        x=removeDupsInPlace(s);
        //System.out.println(s);
        x=x.toUpperCase();
        x=x.replaceAll(" ","");
        x=x.replaceAll("J","I");
        x=x.replaceAll("Ñ","N");
        char[][] poli =  crearPolybius(x);
        //Hallar forma para desencriptar ya tengo el String de donde se encuentra
        //Solo falta separa por dos y buscar
        //Maybe https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
        
    }//GEN-LAST:event_btn_DesencriptarActionPerformed

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
            java.util.logging.Logger.getLogger(Bifid_Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bifid_Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bifid_Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bifid_Forma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bifid_Forma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Desencriptar;
    private javax.swing.JButton btn_Encriptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea txt_Encriptado;
    private javax.swing.JTextField txt_Llave;
    private javax.swing.JTextArea txt_Original;
    // End of variables declaration//GEN-END:variables
}

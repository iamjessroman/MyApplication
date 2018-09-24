/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.awt.Image;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Tesis
 */
public class Parqueos extends javax.swing.JFrame {

    /**
     * Creates new form Parqueos
     */
    public Parqueos() {
        initComponents();
    }

    public void images() throws MalformedURLException, IOException {
//        String s = Text.getText();
//        String[] parts = s.split("\"image\":\"");
//        String urls[] = new String[8];
////        for (int j = 0; j < parts.length; j++) {
//////                    int fin = parts[j].length();
//////                    urls[j]=parts[j].substring(0, fin-1);
////            System.out.println(urls[j]);
////        }
//
//        for (int i = 0; i < parts.length; i++) {
//            System.out.println(parts[i]);
//             String ruta = "C:\\Users\\Tesis\\Desktop\\archivo.txt";
//        File archivo = new File(ruta);
//        BufferedWriter bw;
//        if(archivo.exists()) {
//            bw = new BufferedWriter(new FileWriter(archivo));
//            bw.write(parts[i]);
//        } else {
//            bw = new BufferedWriter(new FileWriter(archivo));
//            bw.write(parts[i]);
//        }
//        bw.close();
//        }

        String base64String = "data:image/png;base64,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Fm/WGvWq/eqr57fefuuN1Wq5nB0bOZC96+wd2bZkInvj2tvZ6enZVctysul0euf69eu2umZB3ia6RgmEg4D2WgrHOegulIASCEBABSsAJF2iBJRAOAioYIXjHHQXSkAJBCCgghUAki5RAkogHARUsMJxDroLJaAEAhBQwQoASZcoASUQDgIqWOE4B92FElACAQioYAWApEuUgBIIBwEVrHCcg+5CCSiBAARUsAJA0iVKQAmEg4AKVjjOQXehBJRAAAIqWAEg6RIloATCQUAFKxznoLtQAkogAAEVrACQdIkSUALhIKCCFY5z0F0oap45/wAACnFJREFUASUQgIAKVgBIukQJKIFwEFDBCsc56C6UgBIIQEAFKwAkXaIElEA4CKhgheMcdBdKQAkEIKCCFQCSLlECSiAcBFSwwnEOugsloAQCEFDBCgBJlygBJRAOAipY4TgH3YUSUAIBCKhgBYCkS5SAEggHARWscJyD7kIJKIEABFSwAkDSJUpACYSDgApWOM5Bd6EElEAAAipYASDpEiWgBMJBQAUrHOegu1ACSiAAARWsAJB0iRJQAuEgoIIVjnPQXSgBJRCAgApWAEi6RAkogXAQUMEKxznoLpSAEghAQAUrACRdogSUQDgIqGCF4xx0F0pACQQgoIIVAJIuUQJKIBwEVLDCcQ66CyWgBAIQUMEKAEmXKAElEA4CKljhOAfdhRJQAgEIqGAFgKRLlIASCAcBFaxwnIPuQgkogQAEVLACQNIlSkAJhIOAClY4zkF3oQSUQAACKlgBIOkSJaAEwkFABSsc56C7UAJKIAABFawAkHSJElAC4SCgghWOc9BdKAElEICAClYASLpECSiBcBBQwQrHOegulIASCEBABSsAJF2iBJRAOAioYIXjHHQXSkAJBCCgghUAki5RAkogHARUsMJxDroLJaAEAhBQwQoASZcoASUQDgIqWOE4B92FElACAQioYAWApEuUgBIIBwEVrHCcg+5CCSiBAARUsAJA0iVKQAmEg4AKVjjOQXehBJRAAAIqWAEg6RIloATCQUAFKxznoLtQAkogAAEVrACQdIkSUALhIKCCFY5z0F0oASUQgIAKVgBIukQJKIFwEFDBCsc56C6UgBIIQEAFKwAkXaIElEA4CKhgheMcdBdKQAkEIKCCFQCSLlECSiAcBFSwwnEOugsloAQCEFDB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";
        String[] strings = base64String.split(",");
        String extension;
        switch (strings[0]) {//check image's extension
            case "data:image/jpeg;base64":
                extension = "jpeg";
                break;
            case "data:image/png;base64":
                extension = "png";
                break;
            default://should write cases for more images types
                extension = "jpg";
                break;
        }
        //convert base64 string to binary data
        byte[] data = DatatypeConverter.parseBase64Binary(strings[1]);
        String path = "C:\\Users\\Tesis\\Desktop\\test_image." + extension;
        File file = new File(path);
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        jLabel1.setText("jLabel1");

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        try {
            this.images();
        } catch (IOException ex) {
            Logger.getLogger(Parqueos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        try {
            this.images();
        } catch (IOException ex) {
            Logger.getLogger(Parqueos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        String base64String = "data:image/png;base64,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";
        String[] strings = base64String.split(",");
        String extension;
        switch (strings[0]) {//check image's extension
            case "data:image/jpeg;base64":
                extension = "jpeg";
                break;
            case "data:image/png;base64":
                extension = "png";
                break;
            default://should write cases for more images types
                extension = "jpg";
                break;
        }
        //convert base64 string to binary data
        byte[] data = DatatypeConverter.parseBase64Binary(strings[1]);
        String path = "C:\\Users\\Tesis\\Desktop\\test_image." + extension;
        File file = new File(path);
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Parqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parqueos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

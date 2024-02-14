/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author Usuario
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    private final DefaultListModel<String> listModel;
    private JList<String> fileList;

    public Pantalla() {
        initComponents();
        buttonGroup1.add(jRBSinTLS);
        buttonGroup1.add(jRBConTLS);
        jBEnviar.setEnabled(false);
        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        JScrollPane fileScrollPane = new JScrollPane(fileList);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLSSMTP = new javax.swing.JLabel();
        jTFSMTP = new javax.swing.JTextField();
        jLPuerto = new javax.swing.JLabel();
        jTFPuerto = new javax.swing.JTextField();
        jRBSinTLS = new javax.swing.JRadioButton();
        jRBConTLS = new javax.swing.JRadioButton();
        jLUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLClave = new javax.swing.JLabel();
        jTFClave = new javax.swing.JTextField();
        jLRemitente = new javax.swing.JLabel();
        jTFRemitente = new javax.swing.JTextField();
        jLDestinatario = new javax.swing.JLabel();
        jTFDestinatario = new javax.swing.JTextField();
        jLCuerpo = new javax.swing.JLabel();
        jTBConectar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBEnviar = new javax.swing.JButton();
        jBFichero = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad 2 - Juan Antonio Uceda Luque");

        jLSSMTP.setText("Servidor SMTP");

        jTFSMTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSMTPActionPerformed(evt);
            }
        });

        jLPuerto.setText("Puerto:");

        jRBSinTLS.setText("Sin TLS");
        jRBSinTLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSinTLSActionPerformed(evt);
            }
        });

        jRBConTLS.setSelected(true);
        jRBConTLS.setText("Con TLS");

        jLUsuario.setText("Usuario:");

        jLClave.setText("Clave:");

        jLRemitente.setText("Remitente:");

        jLDestinatario.setText("Destinatario:");

        jTFDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDestinatarioActionPerformed(evt);
            }
        });

        jLCuerpo.setText("Redacta el cuerpo del mensaje:");

        jTBConectar.setText("Conectar");
        jTBConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBConectarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jBEnviar.setText("Enviar mensaje");

        jBFichero.setText("Adjuntar Fichero");
        jBFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFicheroActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLSSMTP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFSMTP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLRemitente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPuerto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBSinTLS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBConTLS))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLDestinatario)
                                .addGap(18, 18, 18)
                                .addComponent(jTFDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFClave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTBConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLCuerpo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFichero)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRBConTLS)
                    .addComponent(jRBSinTLS)
                    .addComponent(jTFPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPuerto)
                    .addComponent(jTFSMTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSSMTP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLClave)
                    .addComponent(jTFClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRemitente)
                    .addComponent(jTFRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDestinatario)
                    .addComponent(jTFDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCuerpo)
                    .addComponent(jBFichero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEnviar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRBSinTLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSinTLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBSinTLSActionPerformed

    private void jTFDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDestinatarioActionPerformed

    private void jTFSMTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSMTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSMTPActionPerformed

    private void jTBConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBConectarActionPerformed
        if (jTBConectar.isSelected()) {
            jTBConectar.setText("Desconectar");
        } else {
            jTBConectar.setText("Conectar");
        }    }//GEN-LAST:event_jTBConectarActionPerformed

    private void jBFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFicheroActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        int option = fileChooser.showOpenDialog(Pantalla.this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            for (File file : files) {
                listModel.addElement(file.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_jBFicheroActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JButton jBFichero;
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLCuerpo;
    private javax.swing.JLabel jLDestinatario;
    private javax.swing.JLabel jLPuerto;
    private javax.swing.JLabel jLRemitente;
    private javax.swing.JLabel jLSSMTP;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRBConTLS;
    private javax.swing.JRadioButton jRBSinTLS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jTBConectar;
    private javax.swing.JTextField jTFClave;
    private javax.swing.JTextField jTFDestinatario;
    private javax.swing.JTextField jTFPuerto;
    private javax.swing.JTextField jTFRemitente;
    private javax.swing.JTextField jTFSMTP;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Properties;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author Usuario
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    // vumrstopzczjlqvl JAKARTA CONTRASEÑA
    private final DefaultListModel<String> listModel;
    private final JList<String> fileList;
    private Session mailSession;

    public Pantalla() {
        initComponents();
        buttonGroup1.add(jRBSinTLS);
        buttonGroup1.add(jRBConTLS);
        jBEnviar.setEnabled(false);
        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        jList1.setModel(listModel);
        jBBorrarFichero.setEnabled(false);
        JScrollPane fileScrollPane = new JScrollPane(fileList);

    }

    public Session conectar(String username, String password, String host, String port, boolean starttls) throws MessagingException {
        Properties prop = new Properties();
        prop.put("mail.smtp.username", username);
        prop.put("mail.smtp.password", password);
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", port);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", String.valueOf(starttls));

        mailSession = Session.getInstance(prop, new jakarta.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Transport transport = mailSession.getTransport("smtp");
            transport.connect();
            return mailSession;

        } catch (MessagingException e) {
            throw new MessagingException("No se pudo conectar al servidor SMTP. Verifique sus configuraciones.", e);
        }
    }

    public void enviarMensaje(String de, String para, String asunto, String contenido) throws MessagingException {
        Message mensaje = new MimeMessage(mailSession);
        mensaje.setFrom(new InternetAddress(de));
        mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(para));
        mensaje.setSubject(asunto);
        mensaje.setText(contenido);
        Transport.send(mensaje);
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
        jLRemitente = new javax.swing.JLabel();
        jTFRemitente = new javax.swing.JTextField();
        jLDestinatario = new javax.swing.JLabel();
        jTFPara = new javax.swing.JTextField();
        jLCuerpo = new javax.swing.JLabel();
        jTBConectar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBEnviar = new javax.swing.JButton();
        jBFichero = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jBBorrarFichero = new javax.swing.JButton();
        jPFClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTFAsunto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad 2 - Juan Antonio Uceda Luque");

        jLSSMTP.setText("Servidor SMTP");

        jTFSMTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSMTPActionPerformed(evt);
            }
        });

        jLPuerto.setText("Puerto:");

        jTFPuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPuertoKeyTyped(evt);
            }
        });

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

        jTFPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFParaActionPerformed(evt);
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
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });

        jBFichero.setText("Adjuntar Fichero");
        jBFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFicheroActionPerformed(evt);
            }
        });

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jBBorrarFichero.setText("Borrar Fichero");
        jBBorrarFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarFicheroActionPerformed(evt);
            }
        });

        jLabel1.setText("Asunto:");

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
                                .addComponent(jTFPara, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLClave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPFClave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTBConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLCuerpo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTFAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBFichero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBorrarFichero)))
                .addGap(65, 65, 65))
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
                    .addComponent(jTBConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPFClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRemitente)
                    .addComponent(jTFRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDestinatario)
                    .addComponent(jTFPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBFichero)
                            .addComponent(jBBorrarFichero)
                            .addComponent(jLabel1)
                            .addComponent(jTFAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLCuerpo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEnviar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRBSinTLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSinTLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBSinTLSActionPerformed

    private void jTFParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFParaActionPerformed

    private void jTFSMTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSMTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSMTPActionPerformed

    private void jTBConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBConectarActionPerformed
        if (jTBConectar.isSelected()) {
            String username = jTFUsuario.getText();
            String password = new String(jPFClave.getPassword());
            String host = jTFSMTP.getText();
            String port = jTFPuerto.getText();
            boolean starttls = jRBConTLS.isSelected();

            try {
                Session session = conectar(username, password, host, port, starttls);
                if (session != null) {
                    JOptionPane.showMessageDialog(this, "Conexión realizada con éxito", "Conexión", JOptionPane.INFORMATION_MESSAGE);
                    jTBConectar.setText("Desconectar");
                    jBEnviar.setEnabled(true);

                    jTFUsuario.setEnabled(false);
                    jPFClave.setEnabled(false);
                    jTFSMTP.setEnabled(false);
                    jTFPuerto.setEnabled(false);
                    jRBConTLS.setEnabled(false);
                    jRBSinTLS.setEnabled(false);

                } else {
                    throw new Exception("Falló la conexión");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                jTBConectar.setSelected(false);
                jTBConectar.setText("Conectar");
                jBEnviar.setEnabled(false);
            }
        } else {
            jTFUsuario.setEnabled(true);
            jPFClave.setEnabled(true);
            jTFSMTP.setEnabled(true);
            jTFPuerto.setEnabled(true);
            jRBConTLS.setEnabled(true);
            jRBSinTLS.setEnabled(true);

            jTBConectar.setText("Conectar");
            jBEnviar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Desconexión realizada", "Desconexión", JOptionPane.INFORMATION_MESSAGE);

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

    private void jBBorrarFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarFicheroActionPerformed
        int selectedIndex = jList1.getSelectedIndex();
        listModel.remove(selectedIndex);
     }//GEN-LAST:event_jBBorrarFicheroActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (!evt.getValueIsAdjusting()) {
            jBBorrarFichero.setEnabled(!jList1.isSelectionEmpty());
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jTFPuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPuertoKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        if (jTFPuerto.getText().length() >= 3) {
            evt.consume();
        }    }//GEN-LAST:event_jTFPuertoKeyTyped

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed

        String de = jTFUsuario.getText();
        String para = jTFPara.getText();
        String asunto = jTFAsunto.getText();
        String contenido = jTextArea1.getText();
        try {
            enviarMensaje(de, para, asunto, contenido);
            JOptionPane.showMessageDialog(this, "Mensaje enviado con éxito", "Envío de Correo", JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(this, "Error al enviar el mensaje: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEnviarActionPerformed

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
    private javax.swing.JButton jBBorrarFichero;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JButton jBFichero;
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLCuerpo;
    private javax.swing.JLabel jLDestinatario;
    private javax.swing.JLabel jLPuerto;
    private javax.swing.JLabel jLRemitente;
    private javax.swing.JLabel jLSSMTP;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPasswordField jPFClave;
    private javax.swing.JRadioButton jRBConTLS;
    private javax.swing.JRadioButton jRBSinTLS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jTBConectar;
    private javax.swing.JTextField jTFAsunto;
    private javax.swing.JTextField jTFPara;
    private javax.swing.JTextField jTFPuerto;
    private javax.swing.JTextField jTFRemitente;
    private javax.swing.JTextField jTFSMTP;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

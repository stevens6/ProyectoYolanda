package Sistema.model.vista;

import Sistema.model.bean.Permisos;
import Sistema.model.bo.PermisosBo;
import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class frmPermisos extends javax.swing.JFrame {

    private int Codigo;
    private int idPrograma;
    private int idUsuario;
    private int Registro;
    private int Actualiza;
    private int Elimina;
    private Permisos oPermisos;
    private char opt;

    public frmPermisos(java.awt.Frame parent, boolean modal) {

        initComponents();
        lblcodigo.setVisible(false);
        txtPermisos.setVisible(false);
        cargarDatos();
        btnsEdicionHabilitar();
        btnsConfirmarDeshabilitar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcodigo = new javax.swing.JLabel();
        txtPermisos = new javax.swing.JTextField();
        txtPrograma = new javax.swing.JTextField();
        jla = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPermisos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        checkRegistro = new javax.swing.JCheckBox();
        checkActualizar = new javax.swing.JCheckBox();
        checkEliminar = new javax.swing.JCheckBox();
        btnBuscaPrograma = new javax.swing.JButton();
        btnBuscaUsuario = new javax.swing.JButton();
        lblIdPrograma = new javax.swing.JLabel();
        lblIdUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcodigo.setText("Permisos");
        getContentPane().add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        getContentPane().add(txtPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, -1));
        getContentPane().add(txtPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 280, -1));

        jla.setText("Programa");
        getContentPane().add(jla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, -1));

        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 56, 16));

        tblPermisos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblPermisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PERMISOS", "PROGRAMA", "USUARIO", "REGISTRO", "ACTUALIZA", "ELIMINA"
            }
        ));
        tblPermisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPermisosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPermisos);
        if (tblPermisos.getColumnModel().getColumnCount() > 0) {
            tblPermisos.getColumnModel().getColumn(0).setHeaderValue("PERMISOS");
            tblPermisos.getColumnModel().getColumn(1).setHeaderValue("PROGRAMA");
            tblPermisos.getColumnModel().getColumn(2).setHeaderValue("USUARIO");
            tblPermisos.getColumnModel().getColumn(3).setHeaderValue("REGISTRO");
            tblPermisos.getColumnModel().getColumn(4).setHeaderValue("ACTUALIZA");
            tblPermisos.getColumnModel().getColumn(5).setHeaderValue("ELIMINA");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 590, 130));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnBuscar.jpg"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 40, 40));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/btnNuevo.jpg"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, 30));

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/Guardar1.JPG"))); // NOI18N
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 30, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PERMISOS");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/modiicar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 40, 30));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/eliminar1.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 40, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/cancelar2.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 40, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/iconfinder_Exit_button_132189.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 40, 30));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 280, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activas/desactivar Permisos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        checkRegistro.setText("Registrar");
        jPanel1.add(checkRegistro);

        checkActualizar.setText("Actualizar");
        checkActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(checkActualizar);

        checkEliminar.setText("Eliminar");
        jPanel1.add(checkEliminar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 280, 60));

        btnBuscaPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
        btnBuscaPrograma.setText("Buscar");
        btnBuscaPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        btnBuscaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/model.img/buscar.gif"))); // NOI18N
        btnBuscaUsuario.setText("Buscar");
        btnBuscaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        lblIdPrograma.setEnabled(false);
        getContentPane().add(lblIdPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 30, 20));

        lblIdUsuario.setEnabled(false);
        getContentPane().add(lblIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 50, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        opt = 'N';
        lblcodigo.setVisible(true);
        txtPermisos.setVisible(true);
        txtPermisos.setEditable(false);
        txtPrograma.setEditable(true);
        txtPrograma.setText("");

        btnsConfirmarHabilitar();
        btnsEdicionDeshabilitar();
        camposHabilitado();
        limpiarCampos();
    }

    private void cargarDatos() {
        try {
            TableColumn columna;
            DefaultTableModel PermisosTableModel = PermisosBo.obtenerListaPermisos();
            tblPermisos.setModel(PermisosTableModel);
            setAnchoColumnas();
            columna = tblPermisos.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cargarDatosBuscar() {
        try {
            TableColumn columna;
            DefaultTableModel PermisosTableModel = PermisosBo.obtenerListaPermisosBuscar(txtPermisos.getText());
            tblPermisos.setModel(PermisosTableModel);
            setAnchoColumnas();
            columna = tblPermisos.getColumnModel().getColumn(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAnchoColumnas() {
        JViewport scroll = (JViewport) tblPermisos.getParent();
        int ancho = scroll.getWidth();
        int anchoColumna = 0;
        TableColumnModel modeloColumna = tblPermisos.getColumnModel();
        TableColumn columnaTabla;
        for (int i = 0; i < tblPermisos.getColumnCount(); i++) {
            columnaTabla = modeloColumna.getColumn(i);
            switch (i) {
                case 0:
                    anchoColumna = (4 * ancho) / 100;
                    break;
                case 1:
                    anchoColumna = (6 * ancho) / 100;
                    break;
                case 2:
                    anchoColumna = (10 * ancho) / 100;
                    break;
                case 3:
                    anchoColumna = (23 * ancho) / 100;
                case 4:
                    anchoColumna = (23 * ancho) / 100;
                case 5:
                    anchoColumna = (23 * ancho) / 100;

            }
            columnaTabla.setPreferredWidth(anchoColumna);
        }

    }

    private void btnsEdicionDeshabilitar() {
        btnNuevo.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    private void btnsEdicionHabilitar() {
        btnNuevo.setEnabled(true);
        btnModificar.setEnabled(true);
    }

    private void btnsConfirmarHabilitar() {
        btnGrabar.setEnabled(true);
    }

    private void btnsConfirmarDeshabilitar() {
        btnGrabar.setEnabled(false);
    }

    private void limpiarCampos() {
        txtPrograma.setText("");
        txtUsuario.setText("");
        checkRegistro.setSelected(false);
        checkActualizar.setSelected(false);
        checkEliminar.setSelected(false);
    }

    private void camposHabilitado() {
        txtPrograma.setEnabled(true);
        txtUsuario.setEnabled(true);
        checkRegistro.setEnabled(true);
        checkActualizar.setEnabled(true);
        checkEliminar.setEnabled(true);
    }

    private void camposDeshabilitado() {
        txtPrograma.setEnabled(false);
        txtUsuario.setEnabled(false);
//        checkRegistro.setEnabled(false);
//        checkActualizar.setEnabled(false);
//        checkEliminar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed

        idPrograma = Integer.parseInt(txtPrograma.getText());
        idUsuario = Integer.parseInt(txtUsuario.getText());
        Registro = (checkRegistro.isSelected()) ? 1 : 0;
        Actualiza = (checkActualizar.isSelected()) ? 1 : 0;
        Elimina = (checkEliminar.isSelected()) ? 1 : 0;
        oPermisos = new Permisos();
        switch (opt) {
            case 'N':
                oPermisos.setIdPrograma(idPrograma);
                oPermisos.setIdUsuario(idUsuario);
                oPermisos.setRegistro(Registro);
                oPermisos.setActualiza(Actualiza);
                oPermisos.setElimina(Elimina);
                try {
                    if (PermisosBo.grabarPermisos(oPermisos)) {
                        JOptionPane.showMessageDialog(this, "Se Registró Correctamente", "MENSAJE --> PERMISOS", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Registrar", "MENSAJE --> PERMISOS", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "MENSAJE --> PERMISOS", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 'M':
                Codigo = Integer.parseInt(txtPermisos.getText());
                oPermisos.setIdPermisos(Codigo);
                oPermisos.setIdPrograma(idPrograma);
                oPermisos.setIdUsuario(idUsuario);
                oPermisos.setRegistro(Registro);
                oPermisos.setActualiza(Actualiza);
                oPermisos.setElimina(Elimina);

                try {
                    if (PermisosBo.modificarPermisos(oPermisos)) {
                        JOptionPane.showMessageDialog(this, "Se Modificó Correctamente", "PERMISOS", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo Modificar", "PERMISOS", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "PERMISOS", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
        camposDeshabilitado();
        lblcodigo.setVisible(false);
        txtPermisos.setVisible(false);
        cargarDatos();
        btnsConfirmarDeshabilitar();
        btnsEdicionHabilitar();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (Codigo != 0) {
            opt = 'M';
            camposHabilitado();
            txtPermisos.setText("");
            txtPrograma.setText("");
            txtUsuario.setText("");
            checkEliminar.setSelected(false);
            checkActualizar.setSelected(false);
            checkEliminar.setSelected(false);
            lblcodigo.setVisible(true);
            txtPermisos.setVisible(true);
            txtPermisos.setText("" + Codigo);
            txtPermisos.requestFocus();
            txtPrograma.setText(String.valueOf(idPrograma));
            txtUsuario.setText(String.valueOf(idUsuario));
            checkRegistro.setText(String.valueOf(Registro));
            checkActualizar.setText(String.valueOf(Actualiza));
            checkEliminar.setText(String.valueOf(Elimina));

            btnsConfirmarHabilitar();
            btnsEdicionDeshabilitar();
//            JOptionPane.showMessageDialog(this, "Seleccione el Remitente", "REMITENTE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (Codigo != 0) {
            opt = 'E';
            lblcodigo.setVisible(true);
            txtPermisos.setVisible(true);
            txtPermisos.setText("" + Codigo);
            txtPrograma.setText(String.valueOf(idPrograma));
            txtUsuario.setText(String.valueOf(idUsuario));
            checkRegistro.setText(String.valueOf(Registro));
            checkActualizar.setText(String.valueOf(Actualiza));
            checkEliminar.setText(String.valueOf(Elimina));

            try {
                Codigo = Integer.parseInt(txtPermisos.getText());

                if (opt == 'E') {
                    oPermisos = new Permisos();
                    oPermisos.setIdPermisos(Codigo);
                    int rpta = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar",
                            "PERMISOS", JOptionPane.YES_NO_OPTION);
                    if (rpta == 0) {
                        if (PermisosBo.eliminarPermisos(oPermisos)) {
                            JOptionPane.showMessageDialog(this, "Se Eliminó Correctamente", "PERMISOS",
                                    JOptionPane.INFORMATION_MESSAGE);
                            cargarDatos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo Eliminar", "PERMISOS",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "PERMISOS", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el Permisos", "PERMISOS", JOptionPane.ERROR_MESSAGE);
        }
        btnsEdicionHabilitar();
        btnsConfirmarDeshabilitar();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (opt == 'M') {
            lblcodigo.setVisible(false);
            txtPermisos.setVisible(false);
        }
        btnsEdicionHabilitar();
        btnsConfirmarDeshabilitar();
        limpiarCampos();
        camposDeshabilitado();


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        opt = 'B';
//        txtPermisos.setEnabled(true);
//        txtPrograma.setEnabled(false);
        checkRegistro.setEnabled(false);
        checkActualizar.setEnabled(false);
        checkEliminar.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtPermisos.setVisible(false);
        lblcodigo.setVisible(false);
        txtPermisos.requestFocus();
        cargarDatosBuscar();
//               try {
//            frmBuscarPrograma frmBuscaProgr = new frmBuscarPrograma(this, true);
//            frmBuscaProgr.toFront();
//            frmBuscaProgr.setVisible(true);
//            
//            this.btnBuscaUsuario.requestFocus();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error al cargar la vista: " + e.getMessage());
//        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblPermisosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPermisosMouseClicked
        try {
            int index = tblPermisos.getSelectedRow();
            Codigo = Integer.parseInt(tblPermisos.getValueAt(index, 0).toString());
            idPrograma = Integer.parseInt(tblPermisos.getValueAt(index, 1).toString());
            idUsuario = Integer.parseInt(tblPermisos.getValueAt(index, 2).toString());
            Registro = Integer.parseInt(tblPermisos.getValueAt(index, 3).toString());
            Actualiza = Integer.parseInt(tblPermisos.getValueAt(index, 4).toString());
            Elimina = Integer.parseInt(tblPermisos.getValueAt(index, 5).toString());

        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblPermisosMouseClicked

    private void checkActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActualizarActionPerformed

    private void btnBuscaProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProgramaActionPerformed
        try {
            frmBuscaProgramaPer frmBuscaPrograma = new frmBuscaProgramaPer(this, true);
            frmBuscaPrograma.toFront();
            frmBuscaPrograma.setVisible(true);

            this.btnBuscaUsuario.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la vista: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscaProgramaActionPerformed

    private void btnBuscaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaUsuarioActionPerformed
//       try {
//            frmBuscaProgramaPer frmBuscaPrograma = new frmBuscaProgramaPer(this, true);
//            frmBuscaPrograma.toFront();
//            frmBuscaPrograma.setVisible(true);
//
//            this.btnBuscaUsuario.requestFocus();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error al cargar la vista: " + e.getMessage());
//        }
                                          
    }//GEN-LAST:event_btnBuscaUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPermisos dialog = new frmPermisos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaPrograma;
    private javax.swing.JButton btnBuscaUsuario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkActualizar;
    private javax.swing.JCheckBox checkEliminar;
    private javax.swing.JCheckBox checkRegistro;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jla;
    private javax.swing.JLabel lblIdPrograma;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JTable tblPermisos;
    private javax.swing.JTextField txtPermisos;
    private javax.swing.JTextField txtPrograma;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
void getTxtPrograma(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JTextField getTxtPrograma() {
        return txtPrograma;
    }

    public void setTxtPrograma(JTextField txtPrograma) {
        this.txtPrograma = txtPrograma;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JLabel getTxtIdPrograma() {
        return lblIdPrograma;
    }

    public void setTxtIdPrograma(JLabel lblIdPrograma) {
        this.lblIdPrograma = lblIdPrograma;
    }

    public JLabel getTxtIdUsuario() {
        return lblIdUsuario;
    }

    public void setTxtIdUsuario(JLabel lblIdUsuario) {
        this.lblIdUsuario = lblIdUsuario;
    }
}

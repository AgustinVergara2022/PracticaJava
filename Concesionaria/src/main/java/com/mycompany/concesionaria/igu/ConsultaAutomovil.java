package com.mycompany.concesionaria.igu;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.logica.ControladoraLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaAutomovil extends javax.swing.JFrame {

    ControladoraLogica controladora = null;
    
    public ConsultaAutomovil() {
        controladora = new ControladoraLogica();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Visualización de datos");

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        // Controlo que la tabla no esté vacía
         if (tablaAutos.getRowCount() > 0) {
            // Controlo que se haya seleccionado un automóvil
            if (tablaAutos.getSelectedRow() != -1) {
                
                int id = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
                
                ModificarAuto modificar = new ModificarAuto(id);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);
                
                this.dispose();
                
             } else {
                        mostrarMensaje("No seleccionó ningún registro para modificar", "Error", "Error al eliminar");
                    }
            } else {
                        mostrarMensaje("No hay nada para modificar en la tabla", "Error", "Error al eliminar");
                    }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
         // Controlo que la tabla no esté vacía
         if (tablaAutos.getRowCount() > 0) {
            // Controlo que se haya seleccionado un automóvil
            if (tablaAutos.getSelectedRow() != -1) {
            int id = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
            controladora.borrarAuto(id);

            // Agregamos un aviso utilizando un método mostrarMensaje();
            mostrarMensaje("Automóvil eliminado correctamente", "Info", "Auto borrado");
            cargarTabla(); // Volvemos a cargar la tabla para que los datos se actualicen
            } else {
                        mostrarMensaje("No seleccionó ningún auto", "Error", "Error al eliminar");
                    }
            } else {
                        mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
                    }
    }
            
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
            JOptionPane optionPane = new JOptionPane(mensaje);
            if (tipo.equals("Info")){
		optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }	
            else if (tipo.equals("Error")){
		optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
    }//GEN-LAST:event_btnEliminar1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
            
        };
        
        String titulos [ ] = {"Modelo","Marca","Motor","Color","Patente","Cant. Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        tablaAutos.setModel(modeloTabla);
        
        List <Automovil> listaAutomoviles = controladora.traerAutos();
        
        if (listaAutomoviles != null){
            
            for (Automovil auto : listaAutomoviles) {
                Object[] object = {auto.getModelo(),auto.getMarca(),auto.getMotor(),auto.getColor(),auto.getPatente(),
                    auto.getCantPuertas()};
                
                modeloTabla.addRow(object);
                
                }
            
            }
            tablaAutos.setModel(modeloTabla);
        }
        
    }


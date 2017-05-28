package proyectopoo;


import dao.DAOEventoImpl;
import interfaces.DAOEvento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import projectline.Evento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel
 */
public class frmVerEventos extends javax.swing.JFrame {

    /**
     * Creates new form frmVerEventos
     */
    public frmVerEventos() throws SQLException, ClassNotFoundException {
        initComponents();
        Evento event = new Evento();
        DAOEvento dao = new DAOEventoImpl();
        try{
            DefaultTableModel modelo = (DefaultTableModel) tblEventos.getModel();
            for(Evento ev : dao.verEventos()){
                Object[] fila = new Object[8];
                for (int i=0;i < fila.length; i++){
                    fila[i]=ev.getClass();
                }
                modelo.addRow(fila);
            }
            tblEventos.setModel(modelo);
        } catch (Exception ex) {
            Logger.getLogger(frmVerEventos.class.getName()).log(Level.SEVERE, null, ex);
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
        tblEventos = new javax.swing.JTable();

        tblEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Evento", "Fecha", "Asistentes", "Entretenimiento_id", "Ambientacion_id", "Area_id", "Costo"
            }
        ));
        jScrollPane1.setViewportView(tblEventos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEventos;
    // End of variables declaration//GEN-END:variables
}

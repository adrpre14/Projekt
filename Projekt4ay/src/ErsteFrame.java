//Alle Importe, die wir brauchen
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adriano Preçaj
 */
public class ErsteFrame extends javax.swing.JFrame {
    Connection con;
    Integer pkPosition;
    String primary_key;
    OurTable t;
    //Variablen deklariert, die später im Code verwendet werden.
    public ErsteFrame() {
        initComponents();
        //Driver hinzugefügt
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Could not load Driver!");
            javax.swing.JOptionPane.showMessageDialog(this, "thank you!");
            
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServerL = new javax.swing.JLabel();
        DatabaseL = new javax.swing.JLabel();
        ServerT = new javax.swing.JTextField();
        DatabaseT = new javax.swing.JTextField();
        Connect = new javax.swing.JButton();
        Disconnect = new javax.swing.JButton();
        PortT = new javax.swing.JTextField();
        PortL = new javax.swing.JLabel();
        UsernameL = new javax.swing.JLabel();
        UsernameT = new javax.swing.JTextField();
        PasswordL = new javax.swing.JLabel();
        PasswordT = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ServerL.setText("Server:");

        DatabaseL.setText("Database:");

        ServerT.setText("localhost");
        ServerT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerTActionPerformed(evt);
            }
        });

        DatabaseT.setText("world");

        Connect.setText("Connect");
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });

        Disconnect.setText("Disconnect");
        Disconnect.setEnabled(false);
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });

        PortT.setText("3306");
        PortT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortTActionPerformed(evt);
            }
        });

        PortL.setText("Port:");

        UsernameL.setText("Username:");

        UsernameT.setText("root");
        UsernameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTActionPerformed(evt);
            }
        });

        PasswordL.setText("Password:");

        PasswordT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabelle:");

        Deletebutton.setText("Delete");
        Deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(DatabaseL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DatabaseT, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(ServerL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ServerT)))
                                .addGap(18, 18, 18)
                                .addComponent(PortL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PortT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordL)
                                    .addComponent(UsernameL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Disconnect, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Connect, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 1010, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Deletebutton)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServerL)
                    .addComponent(ServerT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Connect)
                    .addComponent(PortT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PortL)
                    .addComponent(UsernameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameL))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatabaseL)
                    .addComponent(Disconnect)
                    .addComponent(DatabaseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordL)
                    .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Wenn wir auf Connect klicken, wird diese Methode ausgefuhrt
    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
        try {
            //Connection mit Database erreichen
            con =DriverManager.getConnection("jdbc:mysql://"+ServerT.getText()+":"+PortT.getText()+"/"+DatabaseT.getText(),UsernameT.getText(), PasswordT.getText());
            
            Connect.setEnabled(false);
            Disconnect.setEnabled(true);
            //Hier werden die Namen der Tabellen geholt und in Dropdown eingefugt
            ResultSet rs=con.getMetaData().getTables(null, null, "%", null);
            while (rs.next()) {
                Combo.addItem(rs.getString(3));
              }
            
            
            
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ConnectActionPerformed

    private void ServerTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServerTActionPerformed

    private void PortTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PortTActionPerformed

    private void PasswordTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTActionPerformed
    //Eine Methode wenn wir die Zellen aendern in der Tabelle
    private void tableModelChanged(TableModelEvent e){
        //Wir speichern die geaenderte Zeile
        int row=e.getFirstRow();
        int lastrow=t.getRowCount()-1;
        if(row!=lastrow){
        
        //Wir speichern die primarykey, die Spaltenname und die Werte der geaenderten Zelle
        String id=jTable1.getModel().getValueAt(row, pkPosition).toString();
        String columnname=jTable1.getModel().getColumnName(e.getColumn());
        String changed=(String) jTable1.getValueAt(row, e.getColumn());
        
        //Erstellen wir eine Prepared Statement, eine Update
        try {
            
            PreparedStatement update=con.prepareStatement("UPDATE "+Combo.getSelectedItem()+" set "+columnname+"=? "
                                                        + "WHERE "+primary_key+"=?;");
            update.setString(1, changed);            
            update.setString(2, id);
            
            update.executeUpdate();
            
        } catch (SQLException ex) {
            
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());        
        }
}
    }
    private void UsernameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTActionPerformed
//Wenn wir auf Disconnect Button klicken
    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
        //Wir müssen die Datenbankverbindung schliessen, Connect button wieder klickbar machen und Disconnect das umgekehrte und auch die Elemente der Dropdownliste loeschen
        try {
            con.close();
            Connect.setEnabled(true);
            Disconnect.setEnabled(false);
            Combo.removeAllItems();
            //javax.swing.JOptionPane.showMessageDialog(this, "Disconnected");
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_DisconnectActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        
    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        
    }//GEN-LAST:event_jTable1InputMethodTextChanged
//Wenn wir auf einer der Elementen der Dropdownliste klicken, wird dieses Block Code ausgefuhrt
    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        //Es soll das machen, wenn es etwas, wo es nicht leer ist, geklickt hat.
        if(Combo.getSelectedItem()!=null){
        try {
            
            //Wir speichern die Tabellenname und fuhren es in ein Prepared Statement ein und fuhren es aus.
            String clas=(String) Combo.getSelectedItem();
            PreparedStatement state=con.prepareStatement("select * from "+clas+";");
            
            //Wir speichern die Daten aus dieser Tabelle
            ResultSet r=state.executeQuery();
            ResultSetMetaData rsmd=r.getMetaData();
            //Wir speichern die Daten aus dieser Database
            DatabaseMetaData md=con.getMetaData();
            //Wir speichern die PrimaryKey Daten aus dieser Tabelle
            ResultSet res_prim=md.getPrimaryKeys(null,null, clas);
            if(res_prim.next()){
            primary_key=res_prim.getString(4); //Spaltenname der Primarykey
            pkPosition = res_prim.getInt("KEY_SEQ")-1;//PrimaryKey Position
            }
            int count=rsmd.getColumnCount();//Wie viele Spalten gibt es
            
            t=new OurTable(pkPosition);//Tabelle erstellt
            //Die Spalten mit Name einsetzen
            t.setColumnCount(count);

            String[] column=new String[count];

            for(int i=1; i<count+1;i++){
                column[i-1]=rsmd.getColumnLabel(i);
            }
            
            int rows=0;
            //Wir speichern wie viele Zeilen wir haben
            while (r.next()) {
                rows++;
            }
            r.beforeFirst();//Dann noch einmal den Cursor im Anfang setzen
            Object[][] resultSet = new Object[rows][count];
            int row = 0;
            //Die Zeilen mit Daten fuellen
            while (r.next()) {
                for (int i = 0; i < count; i++) {
                   resultSet[row][i] = r.getObject(i+1);
                }
                row++;
            }
            
            
            t.setColumnIdentifiers(column);//Setzt wie viele Spalten da gibt
            t.setRowCount(rows);//Setzt wie viele Zeilen da gibt
            t.setDataVector(resultSet, column);//Die Daten in der Tabelle setzen
            t.addRow(new Object[count]);//Eine leeres Zeile am Ende damit wir die Insert Option haben
            jTable1.setModel(t);//Tabelle wird fertig als ein Modell und ist bereit zum Visualisieren
            
            //Wir haben hier Listener erstellt, damit wir wissen, wenn etwas in der Tabelle geaendert wird.
            t.addTableModelListener(new TableModelListener(){
            @Override
            //Wir mussen selbst die Methode uberschreiben und unsere Version verwenden.
            public void tableChanged(TableModelEvent e){
                tableModelChanged(e);
                
           }
            
        });
            
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }
    }//GEN-LAST:event_ComboActionPerformed
//Wenn wir auf diesem Button druecken
    private void DeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebuttonActionPerformed
        //Wir lesen, welche Zeile haben wir selektiert mit dem Maus
        int row=jTable1.getSelectedRow();
        String id=jTable1.getModel().getValueAt(row, pkPosition).toString();//Wir holen die Primary Key
        
        try {
            //Wir loeschen diese Zeile mit einem Prepared Statement
            PreparedStatement update=con.prepareStatement("DELETE FROM "+Combo.getSelectedItem()+" WHERE "+primary_key+"="+id);
            
            
            update.executeUpdate();
            t.removeRow(row);
        } catch (SQLException ex) {
            
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());        
        }
        
    
        
    }//GEN-LAST:event_DeletebuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ErsteFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ErsteFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ErsteFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ErsteFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ErsteFrame().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JButton Connect;
    private javax.swing.JLabel DatabaseL;
    private javax.swing.JTextField DatabaseT;
    private javax.swing.JButton Deletebutton;
    private javax.swing.JButton Disconnect;
    private javax.swing.JLabel PasswordL;
    private javax.swing.JPasswordField PasswordT;
    private javax.swing.JLabel PortL;
    private javax.swing.JTextField PortT;
    private javax.swing.JLabel ServerL;
    private javax.swing.JTextField ServerT;
    private javax.swing.JLabel UsernameL;
    private javax.swing.JTextField UsernameT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

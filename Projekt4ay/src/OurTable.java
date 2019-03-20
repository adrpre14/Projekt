
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adriano Preçaj
 */
//Wir erstellen eine Klasse die die DefaultTableModel vererbt, damit wir UNSERE Model der Tabelle machen 
public class OurTable extends DefaultTableModel{
    int columnDisabled=0;
    //Wir erstellen eine Konstruktor, die die DefaultTableModel Konstruktor aufruft und aendert die variable columnDisabled
    public OurTable(int columnDisabled){
        super();
        this.columnDisabled=columnDisabled;
    }
    @Override
    //Macht die Spalte nicht bearbeitbar
    public boolean isCellEditable(int row, int column){
        if(column==columnDisabled){
            return false;
        }
        else
            return true;
    }
}

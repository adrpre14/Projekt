
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
public class OurTable extends DefaultTableModel{
    int columnDisabled=0;
    public OurTable(int columnDisabled){
        super();
        this.columnDisabled=columnDisabled;
    }
    @Override
    public boolean isCellEditable(int row, int column){
        if(column==columnDisabled){
            return false;
        }
        else
            return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Leo
 */
public class Modelo  extends AbstractTableModel{
    private ArrayList<Bolsas> data;

    public Modelo() {
    }

    public Modelo(ArrayList<Bolsas> data) {
        this.data = data;
    }



    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName="";
        switch (columnIndex) {
            case 0:
                    columnName = "color";
                break;
            case 1:
                    columnName = "Modelo";
                break;
            case 2:
                    columnName = "Material";
                break;
            case 3:
                    columnName = "Marca";
                break;
            case 4:
                    columnName = "# de compartimentos";
                break;
            case 5:
                    columnName = "$ Precio";
                break;
            case 6:
                    columnName = " Tiene Aza";
                break;

            default:
                columnName="ND";
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return Float.class;
            case 6:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bolsas tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getColor();
            case 1:
                return tmp.getModelo();
            case 2:
                return tmp.getMaterial();
            case 3:
                return tmp.getMarca();
            case 4:
                return tmp.getNumcompar();
            case 5:
                return tmp.getPrecio();
            case 6:
                return tmp.getAza();        
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       Bolsas tmp= data.get(rowIndex);
       switch (columnIndex) {
            case 0:
                    tmp.setColor((String)aValue);
                break;
                 case 1:
                    tmp.setModelo((String)aValue);
                break;
                 case 2:
                    tmp.setMaterial((String)aValue);
                break;
                 case 3:
                    tmp.setMarca((String)aValue);
                break;
                 case 4:
                    tmp.setNumcompar((int)aValue);
                break;
                 case 5:
                    tmp.setPrecio((float)aValue);
                break;
                 case 6:
                   tmp.setAza((String)aValue);
                break;
                default:
                    throw new AssertionError();

    }
        data.set(rowIndex, tmp);
       this.fireTableCellUpdated(rowIndex, columnIndex);
       

}
    public void agregarBolsas (Bolsas c){
        data.add(c);
        this.fireTableDataChanged();
        
    }
    
    


}

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leo
 */
public class caja extends AbstractTableModel {

    private ArrayList<Araña> data;

    public caja() {
    }

    public caja (ArrayList<Araña> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "nombre";
                break;
            case 1:
                columnName = "alias";
                break;
            case 2:
                columnName = "pais de origen";
                break;
            case 3:
                columnName = "poder";
                break;
            case 4:
                columnName = "edad";
                break;

            default:
                columnName = "ND";
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
        Araña tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getNombre();
            case 1:
                return tmp.getAlias();
            case 2:
                return tmp.getPais();
            case 3:
                return tmp.getPoder();
            case 4:
                return tmp.getEdad();
            case 5:

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Araña tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setNombre((String) aValue);
                break;
            case 1:
                tmp.setAlias((String) aValue);
                break;
            case 2:
                tmp.setPais((String) aValue);
                break;
            case 3:
                tmp.setPoder((String) aValue);
                break;
            case 4:
                tmp.setEdad((String) aValue);

            default:
                throw new AssertionError();

        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);

    }

    public void agregarAraña(Araña c) {
        data.add(c);
        this.fireTableDataChanged();

    }

}

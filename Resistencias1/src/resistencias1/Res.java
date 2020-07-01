/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistencias1;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Leo
 */
public class Res extends AbstractTableModel {

    private ArrayList<Resistencia> data;

    public Res() {
    }

    public Res(ArrayList<Resistencia> data) {
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
                columnName = "tipos";
                break;
            case 1:
                columnName = "valor nominal";
                break;
            case 2:
                columnName = "tolerancia";
                break;
            case 3:
                columnName = "potencia";
                break;
            case 4:
                columnName = "codigo de colores";
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
                return Float.class;
            case 2:
                return String.class;
            case 3:
                return Float.class;
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
        Resistencia tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getTipos();
            case 1:
                return tmp.getValorNominal();
            case 2:
                return tmp.getTolerancia();
            case 3:
                return tmp.getPotencia();
            case 4:
                return tmp.getCodigoDeColores();
            case 5:

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Resistencia tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setTipos((String) aValue);
                break;
            case 1:
                tmp.setValorNominal((float) aValue);
                break;
            case 2:
                tmp.setTolerancia((String) aValue);
                break;
            case 3:
                tmp.setPotencia((float) aValue);
                break;
            case 4:
                tmp.setCodigoDeColores((String) aValue);

            default:
                throw new AssertionError();

        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);

    }

    public void agregarBolsas(Resistencia c) {
        data.add(c);
        this.fireTableDataChanged();

    }

}

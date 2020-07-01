
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
public class array extends AbstractTableModel {

    private ArrayList<Pati> data;

    public array() {
    }

    public array(ArrayList<Pati> data) {
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
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Marca";
                break;
            case 1:
                columnName = "Color";
                break;
            case 2:
                columnName = "Tamaño De Bota";
                break;
            case 3:
                columnName = "Tipo De Rueda";
                break;
            case 4:
                columnName = "Protectores";
                break;
            case 5:
                columnName = "chasis";
                break;
            case 6:
                columnName = "Precio";
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
            case 5:
                return String.class;
            case 6:
                return float.class;

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
        Pati tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getMarca();
            case 1:
                return tmp.getColor();
            case 2:
                return tmp.getTamañoDeBota();
            case 3:
                return tmp.getTipoDeRueda();
            case 4:
                return tmp.getProtectores();
            case 5:
                return tmp.getChasis();
            case 6:
                return tmp.getPrecio();

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Pati tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setMarca((String) aValue);
                break;
            case 1:
                tmp.setColor((String) aValue);
                break;
            case 2:
                tmp.setTamañoDeBota((String) aValue);
                break;
            case 3:
                tmp.setTipoDeRueda((String) aValue);
                break;
            case 4:
                tmp.setProtectores((String) aValue);
            case 5:
                tmp.setChasis((String) aValue);
            case 6:
                tmp.setPrecio((float) aValue);
                break;

            default:
                throw new AssertionError();

        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);

    }

    public void agregarpati(Pati c) {
        data.add(c);
        this.fireTableDataChanged();
    }
}

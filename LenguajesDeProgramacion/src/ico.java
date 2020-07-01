
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
public class ico extends AbstractTableModel{
    private ArrayList<Progra> data;

    public ico() {
    }

    public ico(ArrayList<Progra> data) {
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
        String columnName="";
        switch (columnIndex) {
            case 0:
                    columnName = "Nombre";
                break;
            case 1:
                    columnName = "Paradiga Principal";
                break;
            case 2:
                    columnName = "Paradigma Secundario";
                break;
            case 3:
                    columnName = "AñoDePrimerVersion";
                break;
            case 4:
                    columnName = "PaisDeOrigen";
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
                return String.class;
            case 5:
                return String.class;
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
        Progra tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getNombre();
            case 1:
                return tmp.getParadigaPrincipal();
            case 2:
                return tmp.getParadigmaSecundario();
            case 3:
                return tmp.getAñoDePrimerVersion();
            case 4:
                return tmp.getPaisDeOrigen();
                   
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       Progra tmp= data.get(rowIndex);
       switch (columnIndex) {
            case 0:
                    tmp.setNombre((String)aValue);
                break;
                 case 1:
                    tmp.setParadigaPrincipal((String)aValue);
                break;
                 case 2:
                    tmp.setParadigmaSecundario((String)aValue);
                break;
                 case 3:
                    tmp.setAñoDePrimerVersion((String)aValue);
                break;
                 case 4:
                    tmp.setPaisDeOrigen((String)aValue);
                break;
                 
                default:
                    throw new AssertionError();

    }
        data.set(rowIndex, tmp);
       this.fireTableCellUpdated(rowIndex, columnIndex);
       

    
    }
     public void agregarprograma (Progra c){
        data.add(c);
        this.fireTableDataChanged();
}
}
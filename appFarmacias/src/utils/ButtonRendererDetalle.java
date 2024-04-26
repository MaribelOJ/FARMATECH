package utils;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class ButtonRendererDetalle extends DefaultTableCellRenderer {
   @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof Component) {
            return (Component) value;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
    
}

package utility;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ComboBoxRenderer extends DefaultListCellRenderer {
	
	public Component getListCellRendererComponent(JList<?> list,Object value, int index,boolean isSelected,boolean cellHasFocus) {
		super.setBackground(Color.BLACK);
		JLabel lbl = (JLabel)super.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
		lbl.setBackground(Color.WHITE);
		lbl.setBorder(new EmptyBorder(5, 10, 0, 0));
		return lbl;
	} /* end getListCellRendererComponent */
	
} /* EOF */

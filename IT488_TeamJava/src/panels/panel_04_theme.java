package panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import main.start;

@SuppressWarnings("serial")
public class panel_04_theme extends JPanel{
	
	/**
	 *  UI Elements
	 */
	JPanel contentPanel;
	TitledBorder titleBorder;
	JLabel lblTitle;
	JLabel lblSubTitle;
	JComboBox<String> boxSubject;
	JComboBox<String> boxType;
	JLabel lblQlen;
	JTextField txfQlen;
	JButton btnStart;
	
	/**
	 *  Fields, Variables
	 */
	String txtSubTitle = "English";
	String[] listSubject = {
		"English, Vocabulary",
		"English, Reading Comprehension",
		"English, Antonyms and Synonyms",
		"Math, Addition",
		"Math, Subtraction",
		"Math, Multiplication",
		"Math, Division",
		"History, Civil Wars of the World",
		"History, World War II",
		"History, World War III",
		"History, World Culture",
		"Science, Earth",
		"Science, Chemistry",
		"Science, Engineering",
		"Science, Biology"
	};
	String[] listType = { "Multiple Choice", "Fill in Form" };
	String txtLblQlen = "Number of Questions";
	String txtBtnStart = "Start Quiz";
	int numQuizLen = 20;

	/**
	 * Create the panel.
	 */
	public panel_04_theme(JPanel panel) {
		setPreferredSize(new Dimension(start.WIDTH, start.HEIGHT));
		setLayout(null);
		setFocusable(true);
		requestFocus();
		contentPanel = panel;
		createGUI();
	} /* end panel_00_test */
	
	
	/**
	 * Create the UI
	 */
	private void createGUI(){
		
		/* adjustable sizing */
		int borderX = 3;
		int borderY = 5;
		int width = start.WIDTH - 9;
		int height = start.HEIGHT - 30;
		
		int elementWidth  = 250;
		int elementHeight = 35;
		int elementX = (int)(elementWidth * 0.5f);
		int elementY = 30;
		
		int spread = 55;
		
		/* title label */
		lblTitle = new JLabel(start.TITLE);
		lblTitle.setFont(new Font(start.defaultFont.toString(), Font.BOLD, (int)(spread * 0.70f)));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(lblTitle);
		
		/* subtitle label */
		elementY += (int)(spread * 0.50f);
		lblSubTitle = new JLabel(txtSubTitle);
		lblSubTitle.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(lblSubTitle);
		
		/* subject drop down */
		elementY += spread;
		boxSubject = new JComboBox<String>(listSubject);
		boxSubject.setBackground(Color.WHITE);
		boxSubject.setBounds(elementX, elementY, elementWidth, elementHeight);
		boxSubject.setRenderer( new DefaultListCellRenderer() {
		    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		        JComponent comp = (JComponent) super.getListCellRendererComponent(list,value, index, isSelected, cellHasFocus);
		        comp.setBorder(new EmptyBorder(5, 5, 0, 0));
		        return comp;
		    }
		});
		add(boxSubject);
		
		/* subject type drop down */
		elementY += spread;
		boxType = new JComboBox<String>(listType);
		boxType.setBackground(Color.WHITE);
		boxType.setBounds(elementX, elementY, elementWidth, elementHeight);
		boxType.setRenderer( new DefaultListCellRenderer() {
		    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		        JComponent comp = (JComponent) super.getListCellRendererComponent(list,value, index, isSelected, cellHasFocus);
		        comp.setBorder(new EmptyBorder(5, 5, 0, 0));
		        return comp;
		    }
		});
		
		add(boxType);
		
		/* number of questions */
		elementY += spread;
		lblQlen = new JLabel(txtLblQlen); 
		lblQlen.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblQlen.setBounds(elementX + 5, elementY - (int)(elementHeight * 0.75f) + 2, elementWidth, elementHeight);
		add(lblQlen);
		
		/* number of questions */
		txfQlen = new JTextField(String.valueOf(numQuizLen));
		txfQlen.setBounds(elementX, elementY, elementWidth, elementHeight);
		txfQlen.setMargin(new Insets(0, 5, 0, 0));
		add(txfQlen);
		
		/* spacer */
		elementY += spread;
		
		/* start button */
		elementY += spread;
		btnStart = new JButton(txtBtnStart);
		btnStart.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(btnStart);
		
		/* return to panel 00 button */
		if(start.DEBUG) {
			JButton btnPanel00 = new JButton("Return to Panel 00");
			btnPanel00.setBounds(332, 432, 130, 35);
			btnPanel00.addActionListener( new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
	        		cardlayout.show(contentPanel, "Panel 00");
	            }
	        });
			add(btnPanel00);
		}
		
		/* outline boarder */
		JPanel panelBorder = new JPanel();
		panelBorder.setBounds(borderX,  borderY, width, height);
		panelBorder.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray)));
		add(panelBorder);
		
	} /* createGUI */
	
	
} /* EOF */

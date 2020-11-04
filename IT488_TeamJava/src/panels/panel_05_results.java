package panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import main.start;

@SuppressWarnings("serial")
public class panel_05_results extends JPanel{
	
	/**
	 *  UI Elements
	 */
	JPanel contentPanel;
	TitledBorder titleBorder;
	JLabel lblTitle;
	JLabel lblSubTitle;
	JButton btnNext;
	JButton btnResults;
	
	/**
	 *  Fields, Variables
	 */
	String subTitle = "Past Results";
	/* THE TABLE */
	String[] columnNames = {
		"Subject", "Theme", "#", "A+", "%", "Start", "End", "TOTAL"
	};
	Object[][] data = {
		{"Math", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
		{"Science", "Earth", 10, 7, 70, "11:03:35am", "11:13:55am", "0:10:20"},
		{"Physical Education", "Civil Wars of the World", 10, 7, 70, "11:03:35am", "11:13:55am", "0:10:20"},
		{"English", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
		{"History", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
		{"Foreign Languages", "Addition", 100, 100, 100, "10:23:15am", "10:47:15am", "0:24:00"},
		{"Music", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
		{"Food Preparation", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
		{"Technology", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
		{"Modern studies", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
		{"The Arts", "Addition", 20, 18, 90, "10:23:15am", "10:47:15am", "0:24:00"},
	};
	String txtBtnNext = "Next =>";
	String txtBtnResult = "Past Results";
	
	/**
	 * Create the panel.
	 */
	public panel_05_results(JPanel panel) {
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
		lblSubTitle = new JLabel(subTitle);
		lblSubTitle.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(lblSubTitle);
		
		/* adjust column size */
		elementWidth = 452;
		elementX = 13;
		
		/* table */
		JTable table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setIntercellSpacing(new Dimension(5, 0));
		table.setRowHeight(20);
		table.setAutoCreateRowSorter(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		/* table header */
		JTableHeader header = table.getTableHeader();
	    header.setBackground(Color.WHITE);
	    
		/* table columns */
		TableColumn column = null;
		int colSize[] = {110, 110, 35, 35, 35, 80, 80, 60};
		for (int i = 0; i < colSize.length; i++) {
			column = table.getColumnModel().getColumn(i);
			column.setMinWidth(colSize[i]);
			column.setPreferredWidth(colSize[i]);
		}
		
		/* scrollPane for the table */
		elementY += spread;
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(elementX, elementY - 20, elementWidth, (int)(spread * 3.5f) + 40);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scrollPane);
		
		/* adjust column size */
		elementWidth = 250;
		elementX = (int)(elementWidth * 0.5f);
		
		/* spacer */
		elementY += spread;
		elementY += spread;
		elementY += spread;
		
		/* next button */
		elementY += spread;
		btnNext = new JButton(txtBtnNext);
		btnNext.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(btnNext);
		
		/* results button */
		elementY += spread;
		btnResults = new JButton(txtBtnResult);
		btnResults.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(btnResults);
		
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

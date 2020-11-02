package panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

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
import utility.RoundedBorder;

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
	Font defaultFont;
	String subTitle;
	JButton btnPanel00;
	
	
	/**
	 * Create the panel.
	 */
	public panel_05_results(JPanel panel) {
		setPreferredSize(new Dimension(start.WIDTH, start.HEIGHT));
		setLayout(null);
		setFocusable(true);
		requestFocus();
		subTitle = "Past Results";
		contentPanel = panel;
		createGUI();
	} /* end panel_00_test */
	
	
	/**
	 * Create the UI
	 */
	private void createGUI(){
		
		/* adjustable sizing */
		int x = 3;
		int y = 5;
		int width = start.WIDTH - 9;
		int height = start.HEIGHT - 30;
		int elementWidth  = 250;
		int elementHeight = 35;
		int elementX = (int)((x + width - elementWidth) * 0.50f);
		int elementY = 30;
		int spread = 55;
		
		/* get default font */
		Graphics g = new BufferedImage(start.WIDTH, start.HEIGHT, BufferedImage.TYPE_INT_RGB).getGraphics();
		defaultFont = new Font(g.getFont().toString(), 0, 12);
        g.dispose();
		
		/* title label */
		lblTitle = new JLabel(start.TITLE);
		lblTitle.setFont(new Font(defaultFont.toString(), Font.BOLD, (int)(spread * 0.70f)));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(lblTitle);
		
		/* subtitle label */
		lblSubTitle = new JLabel(subTitle);
		elementY += (int)(spread * 0.50f);
		lblSubTitle.setFont(new Font(defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(lblSubTitle);
		
		
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
		
		int resultsWidth = 200;
		elementWidth += resultsWidth;
		elementX = (int)((x + width - elementWidth) * 0.50f);
		
		JTable table = new JTable(data, columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setIntercellSpacing(new Dimension(10, 0));
		table.setRowHeight(20);
		table.setAutoCreateRowSorter(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JTableHeader header = table.getTableHeader();
	    header.setBackground(Color.WHITE);
	    
		TableColumn column = null;
		int colSize[] = {110, 110, 35, 35, 35, 80, 80, 60};
		for (int i = 0; i < colSize.length; i++) {
			column = table.getColumnModel().getColumn(i);
			column.setMinWidth(colSize[i]);
			column.setPreferredWidth(colSize[i]);
		}
		
		JScrollPane scrollPane = new JScrollPane(table);
		elementY += spread;
		scrollPane.setBounds(elementX, elementY - 20, elementWidth, (int)(spread * 3.5f) + 40);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scrollPane);
		elementWidth -= resultsWidth;
		elementX = (int)((x + width - elementWidth) * 0.50f);
		
		
		/* spacer */
		elementY += spread;
		elementY += spread;
		elementY += spread;
		
		/* next button */
		btnNext = new JButton("Next =>");
		elementY += spread;
		btnNext.setBounds(elementX, elementY, elementWidth, elementHeight);
		btnNext.setBorder(new RoundedBorder(10));
		add(btnNext);
		
		/* results button */
		btnResults = new JButton("Past Results");
		elementY += spread;
		btnResults.setBounds(elementX, elementY, elementWidth, elementHeight);
		btnResults.setBorder(new RoundedBorder(10));
		add(btnResults);
		
		/* return to panel 00 button */
		btnPanel00 = new JButton("Return to Panel 00");
		btnPanel00.setBounds(332, 432, 130, 35);
		btnPanel00.setBorder(new RoundedBorder(10));
		btnPanel00.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 00");
            }
        });
		add(btnPanel00);
		
		/* outline boarder */
		JPanel conTitle = new JPanel();
		conTitle.setBounds(x,  y, width, height);
		titleBorder = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray));
		conTitle.setBorder(titleBorder);
		add(conTitle);
		
	} /* createGUI */
	
	
} /* EOF */

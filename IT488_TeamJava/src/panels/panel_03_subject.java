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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import main.start;

@SuppressWarnings("serial")
public class panel_03_subject extends JPanel{
	
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
	String txtSubTitle = "Pick a Subject";
	String[] txtSubject = {
		"English",
		"Math",
		"History",
		"Science",
		"Foreign Languages",
		"Music",
		"Food Preparation",
		"Technology",
		"Modern studies",
		"The Arts",
		"Physical Education"
	};
	String txtBtnNext = "Next =>";
	String txtBtnResult = "Past Results";
	
	/**
	 * Create the panel.
	 */
	public panel_03_subject(JPanel panel) {
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
		
		/* subject area */
		elementY += spread;
		JList<String> lstSubjects = new JList<String>(txtSubject);
		lstSubjects.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstSubjects.setLayoutOrientation(JList.VERTICAL);
		lstSubjects.setBorder(new EmptyBorder(0, 5, 0, 5));
		lstSubjects.setVisibleRowCount(-1);
		
		JScrollPane scrollPane = new JScrollPane(lstSubjects);
		scrollPane.setBounds(elementX, elementY, elementWidth, (int)(spread * 2.5f));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane);
		
		/* spacer */
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

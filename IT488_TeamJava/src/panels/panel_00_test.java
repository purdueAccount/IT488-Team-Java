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
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import main.start;

@SuppressWarnings("serial")
public class panel_00_test extends JPanel {
	
	/**
	 *  UI Elements
	 */
	JPanel contentPanel;
	TitledBorder titleBorder;
	JLabel lblTitle;
	JLabel lblSubTitle;
	JButton btnPanel01;
	JButton btnPanel02;
	JButton btnPanel03;
	JButton btnPanel04;
	JButton btnPanel05;
	JButton btnPanel06;
	JButton btnPanel07;
	JButton btnExit;
	
	/**
	 *  Fields, Variables
	 */
	String txtSubTitle = "This is a Test Panel";
	String txtBtnPanel01 = "Panel 01 Sign In";
	String txtBtnPanel02 = "Panel 02 Sign Up";
	String txtBtnPanel03 = "Panel 03 Subject";
	String txtBtnPanel04 = "Panel 04 Theme";
	String txtBtnPanel05 = "Panel 05 Past Results";
	String txtBtnPanel06 = "Panel 06 Quiz Type 1";
	String txtBtnPanel07 = "Panel 07 Quiz Type 2";
	String txtBtnExit    = "Exit";
	
	/**
	 * Create the panel.
	 */
	public panel_00_test(JPanel panel) {
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
		int elementX0 = 30;
		int elementX1 = 250;
		int elementY = 30;
		
		int spread = 55;
		
		/* title label */
		lblTitle = new JLabel(start.TITLE);
		lblTitle.setFont(new Font(start.defaultFont.toString(), Font.BOLD, (int)(spread * 0.50f)));
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
		
		/* align two column layout */
		elementWidth -= 50;
		
		/* panel 01 button */
		elementY += spread;
		btnPanel01 = new JButton(txtBtnPanel01);
		btnPanel01.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel01.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 01");
            }
        });
		add(btnPanel01);
		
		/* panel 05 button */
		btnPanel05 = new JButton(txtBtnPanel05);
		btnPanel05.setBounds(elementX1, elementY, elementWidth, elementHeight);
		btnPanel05.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 05");
            }
        });
		add(btnPanel05);
		
		/* panel 02 button */
		elementY += spread;
		btnPanel02 = new JButton(txtBtnPanel02);
		btnPanel02.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel02.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 02");
            }
        });
		add(btnPanel02);
		
		/* panel 06 button */
		btnPanel06 = new JButton(txtBtnPanel06);
		btnPanel06.setBounds(elementX1, elementY, elementWidth, elementHeight);
		btnPanel06.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 06");
            }
        });
		add(btnPanel06);
		
		/* panel 03 button */
		elementY += spread;
		btnPanel03 = new JButton(txtBtnPanel03);
		btnPanel03.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel03.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 03");
            }
        });
		add(btnPanel03);
		
		/* panel 07 button */
		btnPanel07 = new JButton(txtBtnPanel07);
		btnPanel07.setBounds(elementX1, elementY, elementWidth, elementHeight);
		btnPanel07.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 07");
            }
        });
		add(btnPanel07);
		
		/* panel 04 button */
		elementY += spread;
		btnPanel04 = new JButton(txtBtnPanel04);
		btnPanel04.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel04.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 04");
            }
        });
		add(btnPanel04);
		
		/* align single column layout */
		elementWidth += 50;
		
		/* exit button */
		elementY += spread;
		btnExit = new JButton(txtBtnExit);
		btnExit.setBounds(elementX, elementY, elementWidth, elementHeight);
		ActionListener actExit = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		};
		btnExit.addActionListener(actExit);
		add(btnExit);
		
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
		
		/* outline border */
		JPanel panelBorder = new JPanel();
		panelBorder.setBounds(borderX,  borderY, width, height);
		panelBorder.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray)));
		add(panelBorder);
		
	} /* createGUI */
	
	
} /* EOF */

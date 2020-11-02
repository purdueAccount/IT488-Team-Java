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
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import main.start;
import utility.RoundedBorder;

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
	JButton btnPanel08;
	JButton btnExit;
	Font defaultFont;
	String subTitle;
	JButton btnPanel00;
	
	
	/**
	 * Create the panel.
	 */
	public panel_00_test(JPanel panel) {
		setPreferredSize(new Dimension(start.WIDTH, start.HEIGHT));
		setLayout(null);
		setFocusable(true);
		requestFocus();
		subTitle = "Subject, Type";
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
		int elementX0 = 4 + 25;
		int elementX1 = (width + 3) - elementWidth + 50 - 25;
		int elementY = 30;
		int spread = 55;
		
		/* get default font */
		Graphics g = new BufferedImage(start.WIDTH, start.HEIGHT, BufferedImage.TYPE_INT_RGB).getGraphics();
		defaultFont = new Font(g.getFont().toString(), 0, 12);
        g.dispose();
		
		/* title label */
		lblTitle = new JLabel(start.TITLE);
		lblTitle.setFont(new Font(defaultFont.toString(), Font.BOLD, (int)(spread * 0.50f)));
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
		
		elementWidth -= 50;
		
		/* panel 01 button */
		btnPanel01 = new JButton("Panel 01 Sign In");
		elementY += spread;
		btnPanel01.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel01.setBorder(new RoundedBorder(10));
		btnPanel01.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 01");
            }
        });
		add(btnPanel01);
		
		/* panel 05 button */
		btnPanel05 = new JButton("Panel 05 Past Results");
		btnPanel05.setBounds(elementX1, elementY, elementWidth, elementHeight);
		btnPanel05.setBorder(new RoundedBorder(10));
		btnPanel05.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 05");
            }
        });
		add(btnPanel05);
		
		/* panel 02 button */
		btnPanel02 = new JButton("Panel 02 Sign Up");
		elementY += spread;
		btnPanel02.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel02.setBorder(new RoundedBorder(10));
		btnPanel02.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 02");
            }
        });
		add(btnPanel02);
		
		/* panel 06 button */
		btnPanel06 = new JButton("Panel 06 Quiz Type 1");
		btnPanel06.setBounds(elementX1, elementY, elementWidth, elementHeight);
		btnPanel06.setBorder(new RoundedBorder(10));
		btnPanel06.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 06");
            }
        });
		add(btnPanel06);
		
		/* panel 03 button */
		btnPanel03 = new JButton("Panel 03 Subject");
		elementY += spread;
		btnPanel03.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel03.setBorder(new RoundedBorder(10));
		btnPanel03.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 03");
            }
        });
		add(btnPanel03);
		
		/* panel 07 button */
		btnPanel07 = new JButton("Panel 07 Quiz Type 2");
		btnPanel07.setBounds(elementX1, elementY, elementWidth, elementHeight);
		btnPanel07.setBorder(new RoundedBorder(10));
		btnPanel07.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 07");
            }
        });
		add(btnPanel07);
		
		/* panel 04 button */
		btnPanel04 = new JButton("Panel 04 Theme");
		elementY += spread;
		btnPanel04.setBounds(elementX0, elementY, elementWidth, elementHeight);
		btnPanel04.setBorder(new RoundedBorder(10));
		btnPanel04.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 04");
            }
        });
		add(btnPanel04);
		
		/* panel 08 button */
		btnPanel08 = new JButton("Panel 08 Empty");
		btnPanel08.setBounds(elementX1, elementY, elementWidth, elementHeight);
		btnPanel08.setBorder(new RoundedBorder(10));
		btnPanel08.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CardLayout cardlayout = (CardLayout)(contentPanel.getLayout());
        		cardlayout.show(contentPanel, "Panel 08");
            }
        });
//		add(btnPanel08);
		
		elementWidth += 50;
		
		/* exit button */
		btnExit = new JButton("Exit");
		elementY += spread;
		btnExit.setBounds(elementX, elementY, elementWidth, elementHeight);
		btnExit.setBorder(new RoundedBorder(10));
		ActionListener actExit = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		};
		btnExit.addActionListener(actExit);
		add(btnExit);
		
		/* return to panel 00 button */
		btnPanel00 = new JButton("Return to Panel 00");
		btnPanel00.setBounds(332, 432, 130, 35);
//				(int)(elementX + elementWidth * 0.6f), (int)(elementY + (spread * 2) - 10),(int)(elementWidth * 0.75f), elementHeight);
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

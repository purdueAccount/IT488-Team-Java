package main;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.panel_00_test;
import panels.panel_01_login;
import panels.panel_02_register;
import panels.panel_03_subject;
import panels.panel_04_theme;
import panels.panel_05_results;
import panels.panel_06_quiz_0;
import panels.panel_07_quiz_1;

public class start {
	
	public static final int WIDTH = 480;
	public static final int HEIGHT = 500;
	public static final String TITLE = "Quiznator";

	public static void main(String[] args) {
		
		JFrame window = new JFrame("IT488 " + TITLE);
		
		/* create the panels */
		CardLayout cardlayout = new CardLayout();
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(cardlayout);
		panel_00_test		panel_00 = new panel_00_test(contentPanel);
		panel_01_login		panel_01 = new panel_01_login(contentPanel);
		panel_02_register	panel_02 = new panel_02_register(contentPanel);
		panel_03_subject	panel_03 = new panel_03_subject(contentPanel);
		panel_04_theme		panel_04 = new panel_04_theme(contentPanel);
		panel_05_results	panel_05 = new panel_05_results(contentPanel);
		panel_06_quiz_0		panel_06 = new panel_06_quiz_0(contentPanel);
		panel_07_quiz_1		panel_07 = new panel_07_quiz_1(contentPanel);
		contentPanel.add(panel_00, "Panel 00");
		contentPanel.add(panel_01, "Panel 01");
		contentPanel.add(panel_02, "Panel 02");
		contentPanel.add(panel_03, "Panel 03");
		contentPanel.add(panel_04, "Panel 04");
		contentPanel.add(panel_05, "Panel 05");
		contentPanel.add(panel_06, "Panel 06");
		contentPanel.add(panel_07, "Panel 07");
		window.setContentPane(contentPanel);
		cardlayout.show(contentPanel, "Panel 00");
		
		window.setPreferredSize(new Dimension(WIDTH + 3, HEIGHT + 9));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		/* add and remove panels as needed */
//		frame.add(panel_00);
		
	} // end main

} // EOF




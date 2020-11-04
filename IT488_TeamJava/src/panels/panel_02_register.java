package panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import main.start;

@SuppressWarnings("serial")
public class panel_02_register extends JPanel{
	
	/**
	 *  UI Elements
	 */
	JPanel contentPanel;
	TitledBorder titleBorder;
	JLabel lblTitle;
	JLabel lblSubTitle;
	JLabel lblEmail;
	JTextField txfEmail;
	JLabel lblUser;
	JTextField txfUser;
	JLabel lblPass;
	JTextField txfPass;
	JLabel lblPass2;
	JTextField txfPass2;
	JButton btnRegister;
	
	/**
	 *  Fields, Variables
	 */
	String txtSubTitle = "Sign Up for LEARNING";
	String txtEmail  = "Email Address";
	String txtUser   = "Username";
	String txtPass   = "Password";
	String txtPass2  = "Password Again";
	String txtSignUp = "Sign Up";
	
	/**
	 * Create the panel.
	 */
	public panel_02_register(JPanel panel) {
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
		
		/* email text field */
		elementY += spread;
		lblEmail = new JLabel(txtEmail); 
		lblEmail.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblEmail.setBounds(elementX + 5, elementY - (int)(elementHeight * 0.75f) + 2, elementWidth, elementHeight);
		add(lblEmail);
		
		txfEmail = new JTextField();
		txfEmail.setBounds(elementX, elementY, elementWidth, elementHeight);
		txfEmail.setMargin(new Insets(0, 5, 0, 0));
		add(txfEmail);
		
		/* username text field */
		elementY += spread;
		lblUser = new JLabel(txtUser); 
		lblUser.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblUser.setBounds(elementX + 5, elementY - (int)(elementHeight * 0.75f) + 2, elementWidth, elementHeight);
		add(lblUser);
		
		txfUser = new JTextField();
		txfUser.setBounds(elementX, elementY, elementWidth, elementHeight);
		txfUser.setMargin(new Insets(0, 5, 0, 0));
		add(txfUser);
		
		/* password text field */
		elementY += spread;
		lblPass = new JLabel(txtPass); 
		lblPass.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblPass.setBounds(elementX + 5, elementY - (int)(elementHeight * 0.75f) + 2, elementWidth, elementHeight);
		add(lblPass);
		
		txfPass = new JTextField();
		txfPass.setBounds(elementX, elementY, elementWidth, elementHeight);
		txfPass.setMargin(new Insets(0, 5, 0, 0));
		add(txfPass);
		
		/* password text field */
		elementY += spread;
		lblPass2 = new JLabel(txtPass2); 
		lblPass2.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblPass2.setBounds(elementX + 5, elementY - (int)(elementHeight * 0.75f) + 2, elementWidth, elementHeight);
		add(lblPass2);
		
		txfPass2 = new JTextField();
		txfPass2.setBounds(elementX, elementY, elementWidth, elementHeight);
		txfPass2.setMargin(new Insets(0, 5, 0, 0));
		add(txfPass2);
		
		/* login button */
		btnRegister = new JButton(txtSignUp);
		elementY += spread;
		btnRegister.setBounds(elementX, elementY, elementWidth, elementHeight);
		add(btnRegister);
		
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

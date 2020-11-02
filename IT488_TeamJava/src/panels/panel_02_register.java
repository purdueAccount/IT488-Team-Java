package panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
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
import utility.JTextFieldPlaceholder;
import utility.RoundedBorder;

@SuppressWarnings("serial")
public class panel_02_register extends JPanel{
	
	/**
	 *  UI Elements
	 */
	JPanel contentPanel;
	TitledBorder titleBorder;
	JLabel lblTitle;
	JLabel lblSubTitle;
	JTextFieldPlaceholder txtEmail;
	JTextFieldPlaceholder txtUser;
	JTextFieldPlaceholder txtPass;
	JTextFieldPlaceholder txtPass2;
	JButton btnRegister;
	Font defaultFont;
	String subTitle;
	JButton btnPanel00;
	
	
	/**
	 * Create the panel.
	 */
	public panel_02_register(JPanel panel) {
		setPreferredSize(new Dimension(start.WIDTH, start.HEIGHT));
		setLayout(null);
		setFocusable(true);
		requestFocus();
		subTitle = "Sign Up for LEARNING";
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
		
		/* email text field */
		txtEmail = new JTextFieldPlaceholder();
		txtEmail.setPlaceholder("Email Address");
		elementY += spread;
		txtEmail.setBounds(elementX, elementY, elementWidth, elementHeight);
		txtEmail.setBorder(new RoundedBorder(10));
		txtEmail.setMargin(new Insets(0, 5, 0, 0));
		add(txtEmail);
		
		/* username text field */
		txtUser = new JTextFieldPlaceholder();
		txtUser.setPlaceholder("Username");
		elementY += spread;
		txtUser.setBounds(elementX, elementY, elementWidth, elementHeight);
		txtUser.setBorder(new RoundedBorder(10));
		txtUser.setMargin(new Insets(0, 5, 0, 0));
		add(txtUser);
		
		/* password text field */
		txtPass = new JTextFieldPlaceholder();
		txtPass.setPlaceholder("Password");
		elementY += spread;
		txtPass.setBounds(elementX, elementY, elementWidth, elementHeight);
		txtPass.setBorder(new RoundedBorder(10));
		add(txtPass);
		
		/* password text field */
		txtPass2 = new JTextFieldPlaceholder();
		txtPass2.setPlaceholder("Password Again");
		elementY += spread;
		txtPass2.setBounds(elementX, elementY, elementWidth, elementHeight);
		txtPass2.setBorder(new RoundedBorder(10));
		add(txtPass2);
		
		/* login button */
		btnRegister = new JButton("Sign Up");
		elementY += spread;
		btnRegister.setBounds(elementX, elementY, elementWidth, elementHeight);
		btnRegister.setBorder(new RoundedBorder(10));
		add(btnRegister);
		
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

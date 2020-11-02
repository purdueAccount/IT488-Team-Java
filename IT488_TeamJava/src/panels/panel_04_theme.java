package panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import main.start;
import utility.ComboBoxRenderer;
import utility.JTextFieldPlaceholder;
import utility.RoundedBorder;
import utility.RoundedCornerBorder;

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
	ComboBoxRenderer renderer;
	JTextFieldPlaceholder txtQlen;
	JButton btnStart;
	Font defaultFont;
	String subTitle;
	JButton btnPanel00;
	
	
	/**
	 * Create the panel.
	 */
	public panel_04_theme(JPanel panel) {
		setPreferredSize(new Dimension(start.WIDTH, start.HEIGHT));
		setLayout(null);
		setFocusable(true);
		requestFocus();
		subTitle = "English";
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
		
		
		/* drop down lists */
		List<String> listSubject = new ArrayList<String>();
		listSubject.add("English, Vocabulary");
		listSubject.add("English, Reading Comprehension");
		listSubject.add("English, Antonyms and Synonyms");
		listSubject.add("Math, Addition");
		listSubject.add("Math, Subtraction");
		listSubject.add("Math, Multiplication");
		listSubject.add("Math, Division");
		listSubject.add("History, Civil Wars of the World");
		listSubject.add("History, World War II");
		listSubject.add("History, World War III");
		listSubject.add("History, World Culture");
		listSubject.add("Science, Earth");
		listSubject.add("Science, Chemistry");
		listSubject.add("Science, Engineering");
		listSubject.add("Science, Biology");
		
		List<String> listType = new ArrayList<String>();
		listType.add("Multiple Choice");
		listType.add("Fill in Form");
		
		/* drop down settings */
		UIManager.put("ComboBox.border", new RoundedCornerBorder(0, 0, 0, 0));
		renderer = new ComboBoxRenderer();
		Component c[];
		
		/* subject drop down */
		boxSubject = new JComboBox<String>(listSubject.toArray(new String[listSubject.size()]));
		boxSubject.setBackground(Color.WHITE);
		c = boxSubject.getComponents();
		for (int i = 0; i < c.length; i++) {
			if(c[i] instanceof JButton) {
				JButton btn = (JButton)c[i];
				btn.setBorder(new RoundedBorder(5));
			}
		}
		elementY += spread;
		boxSubject.setBounds(elementX, elementY, elementWidth, elementHeight);
		boxSubject.setRenderer(renderer);
		add(boxSubject);
		
		/* subject type drop down */
		boxType = new JComboBox<String>(listType.toArray(new String[listType.size()]));
		boxType.setBackground(Color.WHITE);
		c = boxType.getComponents();
		for (int i = 0; i < c.length; i++) {
			if(c[i] instanceof JButton) {
				JButton btn = (JButton)c[i];
				btn.setBorder(new RoundedBorder(5));
			}
		}
		elementY += spread;
		boxType.setBounds(elementX, elementY, elementWidth, elementHeight);
		boxType.setRenderer(renderer);
		add(boxType);
		
		/* number of questions */
		txtQlen = new JTextFieldPlaceholder("20");
		txtQlen.setPlaceholder("Number of Questions");
		elementY += spread;
		txtQlen.setBounds(elementX, elementY, elementWidth, elementHeight);
		txtQlen.setBorder(new RoundedBorder(10));
		add(txtQlen);
		
		/* spacer */
		elementY += spread;
		
		/* start button */
		btnStart = new JButton("Start Quiz");
		elementY += spread;
		btnStart.setBounds(elementX, elementY, elementWidth, elementHeight);
		btnStart.setBorder(new RoundedBorder(10));
		add(btnStart);
		
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

package panels;

import java.awt.CardLayout;
import java.awt.Color;
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
import utility.RoundedBorder;

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
	Font defaultFont;
	String subTitle;
	JButton btnPanel00;
	
	
	/**
	 * Create the panel.
	 */
	public panel_03_subject(JPanel panel) {
		setPreferredSize(new Dimension(start.WIDTH, start.HEIGHT));
		setLayout(null);
		setFocusable(true);
		requestFocus();
		subTitle = "Pick a Subject";
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
		
		/* subjects list */
		List<String> listModel = new ArrayList<String>();
		listModel.add("English");
		listModel.add("Math");
		listModel.add("History");
		listModel.add("Science");
		listModel.add("Foreign Languages");
		listModel.add("Music");
		listModel.add("Food Preparation");
		listModel.add("Technology");
		listModel.add("Modern studies");
		listModel.add("The Arts");
		listModel.add("Physical Education");
		
		/* subject area */
		JList<String> lstSubjects = new JList<String>(listModel.toArray(new String[listModel.size()]));
		lstSubjects.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstSubjects.setLayoutOrientation(JList.VERTICAL);
		lstSubjects.setBorder(new EmptyBorder(0, 10, 0, 0));
		lstSubjects.setVisibleRowCount(-1);
		JScrollPane scrollPane = new JScrollPane(lstSubjects);
		elementY += spread;
		scrollPane.setBounds(elementX, elementY, elementWidth, (int)(spread * 2.5f));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane);
		
		/* spacer */
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

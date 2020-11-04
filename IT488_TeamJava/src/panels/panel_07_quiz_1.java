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
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import main.start;

@SuppressWarnings("serial")
public class panel_07_quiz_1 extends JPanel{
	
	/**
	 *  UI Elements
	 */
	JPanel contentPanel;
	TitledBorder titleBorder;
	JLabel lblTitle;
	JLabel lblSubTitle;
	
	JLabel lblBarQuiz;
	JProgressBar barQuiz;
	ActionListener onClick;
	JButton btnNext;
	JButton btnFinish;
	
	/**
	 *  Fields, Variables
	 */
	String subTitle = "Quiz Type 1";
	String txtBtnNext = "Next Question";
	String txtBtnFinish = "Finish Quiz";
	int numQuizLen = 20;
	int numQuizCur = 1;
	
	/**
	 * Create the panel.
	 */
	public panel_07_quiz_1(JPanel panel) {
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
		
		/* spacer */
		elementY += spread;
		elementY += spread;
		elementY += spread;
		
		
		/* quiz progress bar label */
		elementY += spread;
		lblBarQuiz = new JLabel(numQuizCur + " of " + numQuizLen);
		lblBarQuiz.setFont(new Font(start.defaultFont.toString(), Font.PLAIN, (int)(spread * 0.25f)));
		lblBarQuiz.setHorizontalAlignment(SwingConstants.LEFT);
		lblBarQuiz.setBounds(elementX - 50, elementY + 12, elementWidth + 100, elementHeight - 20);
		add(lblBarQuiz);
		
		/* quiz progress bar */
		barQuiz = new JProgressBar(numQuizCur - 1, numQuizLen);
		barQuiz.setValue(numQuizCur);
		barQuiz.setBounds(elementX - 50, elementY + 30, elementWidth + 100, elementHeight - 20);
		barQuiz.setPreferredSize(new Dimension(getWidth() + 100, 50));
		add(barQuiz);
		
		/* next button click listener */
		onClick = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        		barQuiz.setValue(++numQuizCur);
        		lblBarQuiz.setText(numQuizCur + " of " + numQuizLen);
        		if(numQuizCur >= numQuizLen) {
        			btnNext.removeActionListener(onClick);
        		}
            }
        };
		
		/* next button */
		elementY += spread;
		btnNext = new JButton(txtBtnNext);
		btnNext.setBounds(elementX, elementY, elementWidth, elementHeight);
		btnNext.addActionListener(onClick);
		add(btnNext);
		
		/* results button */
		elementY += spread;
		btnFinish = new JButton(txtBtnFinish);
		btnFinish.setBounds(elementX, elementY, elementWidth, elementHeight);
		btnFinish.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	numQuizCur = 1;
        		barQuiz.setValue(numQuizCur);
        		lblBarQuiz.setText(numQuizCur + " of " + numQuizLen);
        		btnNext.removeActionListener(onClick);
        		btnNext.addActionListener(onClick);
            }
        });
		add(btnFinish);
		
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

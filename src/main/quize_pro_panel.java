package main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class quize_pro_panel extends JPanel implements ActionListener{

	JButton home,page2,page3,page3btn;
	JLabel desc;
	JTextArea desc_txt;
	quize_pro_frame frame;
	public GridBagConstraints gc;
	
	public quize_pro_panel(quize_pro_frame f) {
		super();
		frame = f;
		setLayout(new GridBagLayout());
		//grid
		gc = new GridBagConstraints();
		
		top_btns();
		screen1();
	}//end constructor
	
	public void top_btns() 
	{
		home = new JButton("home");
		page2 = new JButton("page2");
		page3 = new JButton("page3");
		
		home.addActionListener(this);
		page2.addActionListener(this);
		page3.addActionListener(this);
		
		gc.gridx = 0;
		gc.gridy = 0;
	
		Insets i = new Insets(0, 0, 10, 0);//bottom margin 10px
		gc.insets = i;
		
		add(home,gc);
		gc.gridx = 1;
		add(page2,gc);
		gc.gridx = 2;
		add(page3,gc);
	    i = new Insets(0, 0, 0, 0);//bottom margin 10px
		gc.insets = i;
		
	}//end top_btns
	
	public void screen1() 
	{
		 desc = new JLabel("description");
		 desc_txt = new JTextArea(10,100);
		 
		 Insets i = new Insets(0, 20, 0, 0);//left margin 20px
		 gc.insets = i;
		 
		 gc.gridx = 0;
		 gc.gridy = 1;
		 gc.gridwidth = 2;
		 add(desc,gc);
		 
		 gc.gridx = 2;
		 gc.gridwidth = 8;
		 add(desc_txt,gc);
		 
		 gc.gridwidth = 1;
		 i = new Insets(0, 0, 0, 0);//bottom margin 10px
		 gc.insets = i;
	}//end screen1
	
	public void screen2() 
	{
		desc = new JLabel("im screen 2");
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(desc,gc);

	}//end screen2
	
	public void screen3() 
	{
		page3btn = new JButton("i will not disappear!");
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridwidth = 3;
		add(page3btn,gc);
		gc.gridwidth = 1;
	}//end screen3

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton click = (JButton) e.getSource();//get btn clicked var name
		
		
		removeAll();
		revalidate();    
        repaint();
        
        if(click == home) 
        {
        	top_btns();
    		screen1();
        }
        
        if(click == page2) 
        {
        	top_btns();
        	screen2();
    		
        }
        
        if(click == page3) 
        {
        	top_btns();
        	screen3();
        }

	}//end actionPerformed
	
}

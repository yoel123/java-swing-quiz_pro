package main;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class quize_pro_frame extends JFrame {

	public quize_pro_frame(String title, int w, int h) throws HeadlessException {
		
		super(title);//send title to super constractor
		setSize( w,h);//set frame width and height 
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	
		

		JScrollPane pane = new JScrollPane(new quize_pro_panel(this)
				,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        setContentPane(pane);
        pack();
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}

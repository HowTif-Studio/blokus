package Model;

import javax.swing.JButton;
import View.Game_Frame;
import java.awt.event.*;  

public class Button_Quit {
	
	public JButton b_quit = new JButton("離開");
	
	JButton Button_Quit (){
		
		//b_quit.setText("離開");
		b_quit.setBounds(600,300,80,30);

		
		b_quit.addActionListener ( new ActionListener() {
			 public void actionPerformed( ActionEvent e )  {
				 
			  
			 }
			
		});
		
		return b_quit;
		 	
	}  
}

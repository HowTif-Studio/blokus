package Model;

import javax.swing.JButton; 
import java.awt.event.*;  

public class Button_Restart {
	
	public JButton b_restart = new JButton("重新開始");
	
	JButton Button_Restart (){
		
		//b_restart.setText("重新開始");
		b_restart.setBounds(600,400,80,30);
		
		b_restart.addActionListener ( new ActionListener() {
			 public void actionPerformed( ActionEvent e )  {
				 
				 
			 }
			
		});
		
		return b_restart;	
		
	}  
}

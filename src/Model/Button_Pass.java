package Model;

import javax.swing.JButton; 
import java.awt.event.*;  

public class Button_Pass {
	
	public JButton b_pass = new JButton();
	
	JButton Button_Pass(){
		
		b_pass.setText("跳過");
		b_pass.setBounds(600,200,80,30);
		
		b_pass.addActionListener ( new ActionListener() {
			 public void actionPerformed( ActionEvent e )  {
				 
				 
			 }
			
		});
		
		return b_pass;
	}  
}

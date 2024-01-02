package Model;

import javax.swing.JButton;
import View.Game_Frame;
import java.awt.event.*;  


public class Button_Home {
	
	public JButton b_home = new JButton("回首頁");
	
	JButton Button_Home(){
		
		//b_home.setText("回首頁");
		b_home.setBounds(600,100,80,30);
		
		b_home.addActionListener ( new ActionListener() {
			 public void actionPerformed( ActionEvent e )  {

			 }			
		});
		
		return b_home;
	}  
}

package Model;

import javax.swing.*;    

public class Button_Home {
	
	public JButton b_home = new JButton();
	
	JButton Button_Home(){
		
		b_home.setText("回首頁");
		b_home.setBounds(600,100,80,30);
		
		return b_home;
	}  

}

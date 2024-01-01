package View;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Model.Board;
import Model.Button_Home;
import Model.Button_Pass;
import Model.Button_Quit;
import Model.Button_Restart;
import Model.Piece;

public class Chess_Panel {
	
	 //JPanel panel5 = new JPanel();
	 //Board board = new Board();
	
	 public JPanel Panel5(){
		 
		 Board board = new Board();
		 JPanel panel_board = board.Board();
		 
		 JPanel panel5 = new JPanel();
		 panel5.setBounds(600,0,600,800);
		 //panel1.setBackground(Color.gray);
		 
		 //panel.setPreferredSize(new Dimension(100, 100));
		 //使用 BorderFactory 類別來建立邊框
		 
		 panel5.setBorder(BorderFactory.createLineBorder(Color.black));
		 
		 
		 panel_board.setBounds(0,0,600,800);
		 panel5.add(panel_board);
		 
		 // 加按鈕
		 
		 Button_Home button_home = new Button_Home();
		 panel5.add(button_home.b_home);
		 
		 Button_Pass button_pass = new Button_Pass();
		 panel5.add(button_pass.b_pass);
		 
		 Button_Quit button_quit = new Button_Quit();
		 panel5.add(button_quit.b_quit);
		 
		 Button_Restart button_restart = new Button_Restart();
		 panel5.add(button_restart.b_restart);
		 
//		 panel5.add(board.Board());
		 
		 return panel5;
		 
		 //Board board = new Board();
		 //panel5.add(board);
		 
		 }

}

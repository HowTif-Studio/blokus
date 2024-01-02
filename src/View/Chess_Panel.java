package View;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
		 
		 JPanel panel5 = new JPanel(new GridBagLayout());
		 panel5.setBounds(600,0,600,800);
		 //panel1.setBackground(Color.gray);
		 
		 //panel.setPreferredSize(new Dimension(100, 100));
		 //使用 BorderFactory 類別來建立邊框
		 
		 panel5.setBorder(BorderFactory.createLineBorder(Color.black));
		 
		 GridBagConstraints gbc = new GridBagConstraints();
		 gbc.gridx = 20;
		 gbc.gridy = 30;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 2;

		 panel5.add(panel_board,gbc);
		 
		 // 加按鈕
		 
		 Button_Home button_home = new Button_Home();
		 gbc.gridx = 10;
		 gbc.gridy = 800;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 2;
		 panel5.add(button_home.b_home);
		 
		 
		 Button_Pass button_pass = new Button_Pass();
		 gbc.gridx = 20;
		 gbc.gridy = 800;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 2;
		 panel5.add(button_pass.b_pass,gbc);
		 
		 Button_Quit button_quit = new Button_Quit();
		 gbc.gridx = 30;
		 gbc.gridy = 800;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 2;
		 panel5.add(button_quit.b_quit,gbc);
		 
		 Button_Restart button_restart = new Button_Restart();
		 gbc.gridx = 40;
		 gbc.gridy = 800;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 2;
		 panel5.add(button_restart.b_restart,gbc);
		 
//		 panel5.add(board.Board());
		 
		 return panel5;
		 
		 //Board board = new Board();
		 //panel5.add(board);
		 
		 }

}

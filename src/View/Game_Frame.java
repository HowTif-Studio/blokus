package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import Model.Board;
import Model.Piece;




public class Game_Frame {
	
	JFrame frame = new JFrame();
	Chess_Panel chess_panel = new Chess_Panel();
	Players_Panel players_panel = new Players_Panel();  
	Home_Panel home_panel = new Home_Panel();
	Choose_Dialog choose_dialog = new Choose_Dialog();
	
//	JFrame Game_Frame(){
	Game_Frame(boolean needChoose){
		
        if(needChoose){
            frame.add(choose_dialog.Choose_Dialog(frame , "Dialog Example", true));
        }

        frame.add(players_panel.Panel1());
        frame.add(players_panel.Panel2());
        frame.add(players_panel.Panel3());
        frame.add(players_panel.Panel4());
        frame.add(chess_panel.Panel5());

        frame.setLayout(null);
        frame.setSize(1200, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        };

//        	return frame;

    public static void main(String[] args) {
        new Game_Frame(true);
    }
}
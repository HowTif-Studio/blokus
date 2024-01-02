package Model;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;



public class Board extends JPanel{
	
//	public void Board_Setup () {
//    	
//        setBackground(Color.GRAY);
//        setBorder(BorderFactory.createLineBorder(Color.black));
//        
//    }
	
	public JPanel Board (){

		JPanel Board_panel = new JPanel(new GridBagLayout());
		GridBagConstraints Board = new GridBagConstraints();
		
		Board_panel.setBounds(0,0,0,0);
		
		for ( int x = 0 ; x < 20 ; x++ ) {
			
			for ( int y = 0 ; y < 20 ; y++ ) {
			
			Board.gridy = y;	
			Board.gridx = x;
			
			Board.ipadx = 15;
			Board.ipady = 15;
			
			Board_panel.add(new Default_Panel(Color.GRAY), Board);

				Board.gridy = y;
				Board.gridx = x;

				Board.ipadx = 15;
				Board.ipady = 15;

				Default_Panel square = new Default_Panel(Color.GRAY);
				square.setPos_x(x);
				square.setPos_y(y);
				square.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						square.setColor(Color.BLUE);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						square.setColor(Color.GRAY);
					}
				});
				Board_panel.add(square, Board);


			}
		}
		
		return Board_panel;
		
	}
	
}

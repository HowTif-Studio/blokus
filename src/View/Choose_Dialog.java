package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Choose_Dialog {
	
	//JFrame frame = new JFrame();
	Home_Panel home_panel = new Home_Panel();
	
	public JDialog Choose_Dialog(Frame owner, String title, boolean modal){

		JDialog dialog = new JDialog();

		if(home_panel.Home() != 1){

			String players[] = { "1" , "2" , "3" , "4" };
			JComboBox cb = new JComboBox(players);

			dialog.setLayout( new FlowLayout() );
			dialog.add(new JLabel ("請選擇玩家人數"));

			cb.setBounds(50,50,50,20);
			dialog.add(cb);

			JButton b1 = new JButton ("開始遊戲");
			JButton b2 = new JButton ("離開");


			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 在此處放置按鈕被點擊時的行為
					//frame.setVisible(true);

					Game_Frame game_frame = new Game_Frame(false); // 創建 Game_Frame 的實例
	//            	game_frame.createAndShowGUI(); // 顯示 Game_Frame 中的 frame
	//                dialog.dispose(); // 關閉目前的對話框

				}
			});

			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 在此處放置按鈕被點擊時的行為
					dialog.dispose();
				}
			});
			dialog.add(b1);
			dialog.add(b2);
			dialog.setSize(200, 200);
			dialog.setVisible(true);
		} else {
			dialog.setVisible(false);
		}

		return dialog;
	}
	
}

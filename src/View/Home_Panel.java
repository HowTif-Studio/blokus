package View;

import javax.swing.*;
import java.awt.*;


public class Home_Panel {
	
	public int Home(){

		JOptionPane home_pane = new JOptionPane();
		
//	    String players[]={ "1" , "2" , "3" , "4" };
//	    JComboBox cb = new JComboBox (players);    
//	    
//	    cb.setBounds(50,50,90,20);
//	    //JOptionPane.showOptionDialog
//	    		(Component parent, 父容器元件，例如JFrame、JApplet、JDialog等
//	    		Object message, 放置要顯示的訊息
//	    		String title,intoptionType, 放置要顯示的訊息標題
//	    		intmessageType, 設定要顯示的訊息類型
//	    		Icon icon, 若傳入一個Icon或ImageIcon物件，則可以自訂圖示
//	    		Object[] options, 此參數用於按鈕之文字
//	    		Object initialValue 此參數用於設定預設之按鈕 )
		
	    Object[] options = { "確認", "取消" };
	   // 所有 class 的副類別都有繼承 Object 型態
	    int result = home_pane.showOptionDialog ( null ,
	    		"遊戲介紹：\n"
	    		+ "每個玩家各選一角，努力把自己所有的幾何板塊拓展出自己的新領域！\n"
	    		+ "記住！鞏固自己的地盤，並同時觀察對手的一舉一動，才是上上策。",
	    		"歡迎來到：格格不入 Blokus",
	    		JOptionPane.OK_CANCEL_OPTION,
	    		JOptionPane.INFORMATION_MESSAGE ,
	    		null, 
	    		options, 
	    		options[0]
	    		); 

	    return result ;
	    
	    //frame.add(cb);        
//	    frame.setLayout(null);    
//	    frame.setSize(400,500);    
//	    frame.setVisible(true);         
	}    

}

package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import Model.Piece;

public class Players_Panel {
	 //JFrame frame = new JFrame();
	 //JPanel panel = new JPanel(null); 
	
	 public JPanel Panel1(){  
	 JPanel panel1 = new JPanel();
	 panel1.setBounds(0,0,600,200);
	 //panel1.setBackground(Color.gray);
	 
	 //panel.setPreferredSize(new Dimension(100, 100));
	 //使用 BorderFactory 類別來建立邊框
	 panel1.setBorder(BorderFactory.createLineBorder(Color.black));
	 
	 
	 //加上拼圖
//	 GridBagLayout gridBagLayout = new GridBagLayout();
//	 panel1.setLayout(gridBagLayout);
	 Piece piece = new Piece();
	 panel1.add(piece.Piece01(Color.BLUE));
	 panel1.add(piece.Piece02(Color.BLUE));
	 panel1.add(piece.Piece03(Color.BLUE));
	 panel1.add(piece.Piece04(Color.BLUE));
	 panel1.add(piece.Piece05(Color.BLUE));
	 panel1.add(piece.Piece06(Color.BLUE));
	 panel1.add(piece.Piece07(Color.BLUE));
	 panel1.add(piece.Piece08(Color.BLUE));
	 panel1.add(piece.Piece09(Color.BLUE));
	 panel1.add(piece.Piece10(Color.BLUE));
	 panel1.add(piece.Piece11(Color.BLUE));
	 panel1.add(piece.Piece12(Color.BLUE));
	 panel1.add(piece.Piece13(Color.BLUE));
	 panel1.add(piece.Piece14(Color.BLUE));
	 panel1.add(piece.Piece15(Color.BLUE));
	 panel1.add(piece.Piece16(Color.BLUE));
	 panel1.add(piece.Piece17(Color.BLUE));
	 panel1.add(piece.Piece18(Color.BLUE));
	 panel1.add(piece.Piece19(Color.BLUE));
	 panel1.add(piece.Piece20(Color.BLUE));
	 panel1.add(piece.Piece21(Color.BLUE));
	 
	 
	 return panel1;
	 //frame.setLayout(null);  
	 //frame.add(panel1);
	 
	 
	 }
	
	 public JPanel Panel2(){
		 
	 JPanel panel2 = new JPanel();
	 panel2.setBounds(0,200,600,200);
	 //panel1.setBackground(Color.gray);
	 
	 //panel.setPreferredSize(new Dimension(100, 100));
	 //使用 BorderFactory 類別來建立邊框
	 panel2.setBorder(BorderFactory.createLineBorder(Color.black));
//	 frame.setLayout(null);  
//	 frame.add(panel2);

	 
	 Piece piece = new Piece();
	 panel2.add(piece.Piece01(Color.RED));
	 panel2.add(piece.Piece02(Color.RED));
	 panel2.add(piece.Piece03(Color.RED));
	 panel2.add(piece.Piece04(Color.RED));
	 panel2.add(piece.Piece05(Color.RED));
	 panel2.add(piece.Piece06(Color.RED));
	 panel2.add(piece.Piece07(Color.RED));
	 panel2.add(piece.Piece08(Color.RED));
	 panel2.add(piece.Piece09(Color.RED));
	 panel2.add(piece.Piece10(Color.RED));
	 panel2.add(piece.Piece11(Color.RED));
	 panel2.add(piece.Piece12(Color.RED));
	 panel2.add(piece.Piece13(Color.RED));
	 panel2.add(piece.Piece14(Color.RED));
	 panel2.add(piece.Piece15(Color.RED));
	 panel2.add(piece.Piece16(Color.RED));
	 panel2.add(piece.Piece17(Color.RED));
	 panel2.add(piece.Piece18(Color.RED));
	 panel2.add(piece.Piece19(Color.RED));
	 panel2.add(piece.Piece20(Color.RED));
	 panel2.add(piece.Piece21(Color.RED));
	 
	 return panel2;
	 
	 }
	
	 public JPanel Panel3(){  
	 JPanel panel3 = new JPanel();
	 panel3.setBounds(0,400,600,200);
	 //panel1.setBackground(Color.gray);
	 
	 //panel.setPreferredSize(new Dimension(100, 100));
	 //使用 BorderFactory 類別來建立邊框
	 panel3.setBorder(BorderFactory.createLineBorder(Color.black));
	 //frame.setLayout(null);  
	 //frame.add(panel3);
	 
	 Piece piece = new Piece();
	 panel3.add(piece.Piece01(Color.YELLOW));
	 panel3.add(piece.Piece02(Color.YELLOW));
	 panel3.add(piece.Piece03(Color.YELLOW));
	 panel3.add(piece.Piece04(Color.YELLOW));
	 panel3.add(piece.Piece05(Color.YELLOW));
	 panel3.add(piece.Piece06(Color.YELLOW));
	 panel3.add(piece.Piece07(Color.YELLOW));
	 panel3.add(piece.Piece08(Color.YELLOW));
	 panel3.add(piece.Piece09(Color.YELLOW));
	 panel3.add(piece.Piece10(Color.YELLOW));
	 panel3.add(piece.Piece11(Color.YELLOW));
	 panel3.add(piece.Piece12(Color.YELLOW));
	 panel3.add(piece.Piece13(Color.YELLOW));
	 panel3.add(piece.Piece14(Color.YELLOW));
	 panel3.add(piece.Piece15(Color.YELLOW));
	 panel3.add(piece.Piece16(Color.YELLOW));
	 panel3.add(piece.Piece17(Color.YELLOW));
	 panel3.add(piece.Piece18(Color.YELLOW));
	 panel3.add(piece.Piece19(Color.YELLOW));
	 panel3.add(piece.Piece20(Color.YELLOW));
	 panel3.add(piece.Piece21(Color.YELLOW));
	 
	 return panel3;
	 }
	 	
	 public JPanel Panel4(){  
	 JPanel panel4 = new JPanel();
	 panel4.setBounds(0,600,600,200);
	 //panel1.setBackground(Color.gray);
	 
	 //panel.setPreferredSize(new Dimension(100, 100));
	 //使用 BorderFactory 類別來建立邊框
	 panel4.setBorder(BorderFactory.createLineBorder(Color.black));
	 
	 //frame.setLayout(null);  
	 //frame.add(panel4);
	 
	 Piece piece = new Piece();
	 panel4.add(piece.Piece01(Color.GREEN));
	 panel4.add(piece.Piece02(Color.GREEN));
	 panel4.add(piece.Piece03(Color.GREEN));
	 panel4.add(piece.Piece04(Color.GREEN));
	 panel4.add(piece.Piece05(Color.GREEN));
	 panel4.add(piece.Piece06(Color.GREEN));
	 panel4.add(piece.Piece07(Color.GREEN));
	 panel4.add(piece.Piece08(Color.GREEN));
	 panel4.add(piece.Piece09(Color.GREEN));
	 panel4.add(piece.Piece10(Color.GREEN));
	 panel4.add(piece.Piece11(Color.GREEN));
	 panel4.add(piece.Piece12(Color.GREEN));
	 panel4.add(piece.Piece13(Color.GREEN));
	 panel4.add(piece.Piece14(Color.GREEN));
	 panel4.add(piece.Piece15(Color.GREEN));
	 panel4.add(piece.Piece16(Color.GREEN));
	 panel4.add(piece.Piece17(Color.GREEN));
	 panel4.add(piece.Piece18(Color.GREEN));
	 panel4.add(piece.Piece19(Color.GREEN));
	 panel4.add(piece.Piece20(Color.GREEN));
	 panel4.add(piece.Piece21(Color.GREEN));
	 
	 return panel4;
	 
	 }
	
	 
}

package Model;

import java.awt.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;  
import javax.swing.JFrame;
import javax.swing.*;


public class Piece {
	Board board = new Board();
    
	public JPanel Piece01 (Color color){
		
		JPanel piece01_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape1 = new GridBagConstraints(); 
		
		shape1.gridx = 0;
        shape1.gridy = 0;
		
        shape1.ipadx = 5;
        shape1.ipady = 5;
		
		piece01_panel.add(new Default_Panel(color), shape1);
		piece01_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece01_panel);
				board.revalidate();
				board.repaint();
			}
		});
//		https://blog.csdn.net/john_bian/article/details/52818599 參考文章
//		
//		piece01_panel.addMouseListener(new MouseListener() {
//			
//			Point point = new Point(0,0);
//			
//			@Override
//			public void mousePressed(MouseEvent e) {
//				point = SwingUtilities.convertPoint(piece01_panel,e.getPoint(),piece01_panel.getParent());
//				
//			}
//			
//			public void mouseDragged(MouseEvent e)
//			   {
//			      Point newPoint=SwingUtilities.convertPoint(piece01_panel,e.getPoint(),piece01_panel.getParent()); //转换坐标系统
//			      piece01_panel.setLocation(piece01_panel.getX()+(newPoint.x-point.x),piece01_panel.getY()+(newPoint.y-point.y)); //设置标签图片的新位置
//			      point=newPoint; //更改坐标点
//			   }
//
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				
//  				Point newPoint = SwingUtilities.convertPoint(piece01_panel,e.getPoint(),piece01_panel.getParent()); //转换坐标系统
//  				piece01_panel.setLocation(piece01_panel.getX()+(newPoint.x-point.x),piece01_panel.getY()+(newPoint.y - point.y)); //设置标签图片的新位置
//  			    point = newPoint;
//
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		return piece01_panel;
		}
		
	public JPanel Piece02 (Color color){
		
		JPanel piece02_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape2 = new GridBagConstraints(); 
		
		shape2.gridx = 0;
        shape2.gridy = 0;
        
        shape2.ipadx = 5;
        shape2.ipady = 5;
        
        shape2.insets = new Insets(0,10,0,0); //調整間距
        
        piece02_panel.add(new Default_Panel(color), shape2);
        
        shape2.gridx = 0;
        shape2.gridy = 1;
		
        shape2.ipadx = 5;
        shape2.ipady = 5;
		
		//shape2.fill = GridBagConstraints.BOTH;
		
		shape2.insets = new Insets(0,10,0,0); //調整間距
		piece02_panel.add(new Default_Panel(color), shape2);

		piece02_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece02_panel);
				board.revalidate();
				board.repaint();
			}
		});

        return piece02_panel;
		
	}		

	// 三個方塊開始	
	public JPanel Piece03 (Color color){
		
		JPanel piece03_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape3 = new GridBagConstraints(); 
		
		shape3.gridx = 0;
        shape3.gridy = 0;
        
        shape3.ipadx = 5;
        shape3.ipady = 5;
        
        shape3.insets = new Insets(0,10,0,0); //調整間距     
        piece03_panel.add(new Default_Panel(color), shape3);
        	
		shape3.gridx = 0;
        shape3.gridy = 1;
        
        shape3.ipadx = 5;
        shape3.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape3.insets = new Insets(0,10,0,0); //調整間距  
		piece03_panel.add(new Default_Panel(color), shape3);
		
		shape3.gridx = 0;
        shape3.gridy = 2;
        
        shape3.ipadx = 5;
        shape3.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape3.insets = new Insets(0,10,0,0); //調整間距  
		piece03_panel.add(new Default_Panel(color), shape3);

		piece03_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece03_panel);
				board.revalidate();
				board.repaint();
			}
		});

        return piece03_panel;
		
	}
	public JPanel Piece04 (Color color){

		
		JPanel piece04_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape4 = new GridBagConstraints(); 
		
		shape4.gridx = 0;
        shape4.gridy = 0;
        
        shape4.ipadx = 5;
        shape4.ipady = 5;
        
        shape4.insets = new Insets(0,10,0,0); //調整間距     
        piece04_panel.add(new Default_Panel(color), shape4);
        	
		shape4.gridx = 0;
        shape4.gridy = 1;
        
        shape4.ipadx = 5;
        shape4.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape4.insets = new Insets(0,10,0,0); //調整間距  
		piece04_panel.add(new Default_Panel(color), shape4);
		
		shape4.gridx = 1;
        shape4.gridy = 0;
        
        shape4.ipadx = 5;
        shape4.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape4.insets = new Insets(0,0,0,0); //調整間距 
		piece04_panel.add(new Default_Panel(color), shape4);

		piece04_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece04_panel);
				board.revalidate();
				board.repaint();
			}
		});
		
        return piece04_panel;
	
	}
	
	// 四個方塊開始
	public JPanel Piece05 (Color color){

		
		JPanel piece05_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape5 = new GridBagConstraints(); 
		
		shape5.gridx = 0;
        shape5.gridy = 0;
        
        shape5.ipadx = 5;
        shape5.ipady = 5;
        
        shape5.insets = new Insets(0,10,0,0); //調整間距     
        piece05_panel.add(new Default_Panel(color), shape5);
        	
		shape5.gridx = 0;
        shape5.gridy = 1;
        
        shape5.ipadx = 5;
        shape5.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape5.insets = new Insets(0,10,0,0); //調整間距  
		piece05_panel.add(new Default_Panel(color), shape5);
		
		shape5.gridx = 0;
        shape5.gridy = 2;
        
        shape5.ipadx = 5;
        shape5.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape5.insets = new Insets(0,10,0,0); //調整間距 
		piece05_panel.add(new Default_Panel(color), shape5);
		
		
		shape5.gridx = 0;
        shape5.gridy = 3;
        
        shape5.ipadx = 5;
        shape5.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape5.insets = new Insets(0,10,0,0); //調整間距 
		piece05_panel.add(new Default_Panel(color), shape5);
		piece05_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece05_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece05_panel;
	
	}
	public JPanel Piece06 (Color color){

		
		JPanel piece06_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape6 = new GridBagConstraints(); 
		
		shape6.gridx = 0;
        shape6.gridy = 0;
        
        shape6.ipadx = 5;
        shape6.ipady = 5;
        
        shape6.insets = new Insets(0,10,0,0); //調整間距     
        piece06_panel.add(new Default_Panel(color), shape6);
        	
		shape6.gridx = 0;
        shape6.gridy = 1;
        
        shape6.ipadx = 5;
        shape6.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape6.insets = new Insets(0,10,0,0); //調整間距  
		piece06_panel.add(new Default_Panel(color), shape6);
		
		shape6.gridx = 1;
        shape6.gridy = 0;
        
        shape6.ipadx = 5;
        shape6.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape6.insets = new Insets(0,0,0,0); //調整間距 
		piece06_panel.add(new Default_Panel(color), shape6);
		
		
		shape6.gridx = 1;
        shape6.gridy = 1;
        
        shape6.ipadx = 5;
        shape6.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape6.insets = new Insets(0,0,0,0); //調整間距 
		piece06_panel.add(new Default_Panel(color), shape6);
		piece06_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece06_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece06_panel;
	
	}
	public JPanel Piece07 (Color color){

		
		JPanel piece07_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape7 = new GridBagConstraints(); 
		
		shape7.gridx = 0;
        shape7.gridy = 0;
        
        shape7.ipadx = 5;
        shape7.ipady = 5;
        
        shape7.insets = new Insets(0,10,0,0); //調整間距     
        piece07_panel.add(new Default_Panel(color), shape7);
        	
		shape7.gridx = 0;
        shape7.gridy = 1;
        
        shape7.ipadx = 5;
        shape7.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape7.insets = new Insets(0,10,0,0); //調整間距  
		piece07_panel.add(new Default_Panel(color), shape7);
		
		shape7.gridx = 1;
        shape7.gridy = 1;
        
        shape7.ipadx = 5;
        shape7.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape7.insets = new Insets(0,0,0,0); //調整間距 
		piece07_panel.add(new Default_Panel(color), shape7);
		
		
		shape7.gridx = 1;
        shape7.gridy = 2;
        
        shape7.ipadx = 5;
        shape7.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape7.insets = new Insets(0,0,0,0); //調整間距 
		piece07_panel.add(new Default_Panel(color), shape7);
		piece07_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece07_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece07_panel;
	
	}
	public JPanel Piece08 (Color color){

		
		JPanel piece08_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape8 = new GridBagConstraints(); 
		
		shape8.gridx = 0;
        shape8.gridy = 0;
        
        shape8.ipadx = 5;
        shape8.ipady = 5;
        
        shape8.insets = new Insets(0,10,0,0); //調整間距     
        piece08_panel.add(new Default_Panel(color), shape8);
        	
		shape8.gridx = 0;
        shape8.gridy = 1;
        
        shape8.ipadx = 5;
        shape8.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape8.insets = new Insets(0,10,0,0); //調整間距  
		piece08_panel.add(new Default_Panel(color), shape8);
		
		shape8.gridx = 1;
        shape8.gridy = 1;
        
        shape8.ipadx = 5;
        shape8.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape8.insets = new Insets(0,0,0,0); //調整間距 
		piece08_panel.add(new Default_Panel(color), shape8);
		
		
		shape8.gridx = 2;
        shape8.gridy = 1;
        
        shape8.ipadx = 5;
        shape8.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape8.insets = new Insets(0,0,0,0); //調整間距 
		piece08_panel.add(new Default_Panel(color), shape8);
		piece08_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece08_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece08_panel;
	
	}
	public JPanel Piece09 (Color color){

		
		JPanel piece09_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape9 = new GridBagConstraints(); 
		
		shape9.gridx = 0;
        shape9.gridy = 1;
        
        shape9.ipadx = 5;
        shape9.ipady = 5;
        
        shape9.insets = new Insets(0,10,0,0); //調整間距     
        piece09_panel.add(new Default_Panel(color), shape9);
        	
		shape9.gridx = 1;
        shape9.gridy = 0;
        
        shape9.ipadx = 5;
        shape9.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape9.insets = new Insets(0,0,0,0); //調整間距  
		piece09_panel.add(new Default_Panel(color), shape9);
		
		shape9.gridx = 1;
        shape9.gridy = 1;
        
        shape9.ipadx = 5;
        shape9.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape9.insets = new Insets(0,0,0,0); //調整間距 
		piece09_panel.add(new Default_Panel(color), shape9);
		
		
		shape9.gridx = 1;
        shape9.gridy = 2;
        
        shape9.ipadx = 5;
        shape9.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape9.insets = new Insets(0,0,0,0); //調整間距 
		piece09_panel.add(new Default_Panel(color), shape9);
		piece09_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece09_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece09_panel;
	
	}
	
	// 五個方塊開始
	public JPanel Piece10 (Color color){

		
		JPanel piece10_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape10 = new GridBagConstraints(); 
		
		shape10.gridx = 0;
		shape10.gridy = 0;
        
		shape10.ipadx = 5;
		shape10.ipady = 5;
        
        shape10.insets = new Insets(0,10,0,0); //調整間距     
        piece10_panel.add(new Default_Panel(color), shape10);
        
		shape10.gridx = 0;
		shape10.gridy = 1;
        
		shape10.ipadx = 5;
		shape10.ipady = 5;
        
        shape10.insets = new Insets(0,10,0,0); //調整間距     
        piece10_panel.add(new Default_Panel(color), shape10);
        	
		shape10.gridx = 1;
        shape10.gridy = 0;
        
        shape10.ipadx = 5;
        shape10.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape10.insets = new Insets(0,0,0,0); //調整間距  
		piece10_panel.add(new Default_Panel(color), shape10);
		
		shape10.gridx = 1;
        shape10.gridy = 1;
        
        shape10.ipadx = 5;
        shape10.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape10.insets = new Insets(0,0,0,0); //調整間距 
		piece10_panel.add(new Default_Panel(color), shape10);
		
		
		shape10.gridx = 1;
        shape10.gridy = 2;
        
        shape10.ipadx = 5;
        shape10.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape10.insets = new Insets(0,0,0,0); //調整間距 
		piece10_panel.add(new Default_Panel(color), shape10);
		piece10_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece10_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece10_panel;
	
	}
	public JPanel Piece11 (Color color){

		
		JPanel piece11_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape11 = new GridBagConstraints(); 
		
		shape11.gridx = 0;
		shape11.gridy = 0;
        
		shape11.ipadx = 5;
		shape11.ipady = 5;
        
        shape11.insets = new Insets(0,10,0,0); //調整間距     
        piece11_panel.add(new Default_Panel(color), shape11);
        
		shape11.gridx = 0;
		shape11.gridy = 1;
        
		shape11.ipadx = 5;
		shape11.ipady = 5;
        
        shape11.insets = new Insets(0,10,0,0); //調整間距     
        piece11_panel.add(new Default_Panel(color), shape11);
        	
		shape11.gridx = 0;
        shape11.gridy = 2;
        
        shape11.ipadx = 5;
        shape11.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape11.insets = new Insets(0,10,0,0); //調整間距  
		piece11_panel.add(new Default_Panel(color), shape11);
		
		shape11.gridx = 0;
        shape11.gridy = 3;
        
        shape11.ipadx = 5;
        shape11.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape11.insets = new Insets(0,10,0,0); //調整間距 
		piece11_panel.add(new Default_Panel(color), shape11);
		
		
		shape11.gridx = 0;
        shape11.gridy = 4;
        
        shape11.ipadx = 5;
        shape11.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape11.insets = new Insets(0,10,0,0); //調整間距 
		piece11_panel.add(new Default_Panel(color), shape11);
		piece11_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece11_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece11_panel;
	
	}
	public JPanel Piece12 (Color color){

		
		JPanel piece12_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape12 = new GridBagConstraints(); 
		
		shape12.gridx = 0;
		shape12.gridy = 0;
        
		shape12.ipadx = 5;
		shape12.ipady = 5;
        
        shape12.insets = new Insets(0,10,0,0); //調整間距     
        piece12_panel.add(new Default_Panel(color), shape12);
        
		shape12.gridx = 0;
		shape12.gridy = 1;
        
		shape12.ipadx = 5;
		shape12.ipady = 5;
        
        shape12.insets = new Insets(0,10,0,0); //調整間距     
        piece12_panel.add(new Default_Panel(color), shape12);
        	
		shape12.gridx = 0;
        shape12.gridy = 2;
        
        shape12.ipadx = 5;
        shape12.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape12.insets = new Insets(0,10,0,0); //調整間距  
		piece12_panel.add(new Default_Panel(color), shape12);
		
		shape12.gridx = 0;
        shape12.gridy = 3;
        
        shape12.ipadx = 5;
        shape12.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape12.insets = new Insets(0,10,0,0); //調整間距 
		piece12_panel.add(new Default_Panel(color), shape12);
		
		
		shape12.gridx = 1;
        shape12.gridy = 1;
        
        shape12.ipadx = 5;
        shape12.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
        shape12.insets = new Insets(0,0,0,0); //調整間距 
		piece12_panel.add(new Default_Panel(color), shape12);
		piece12_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece12_panel);
				board.revalidate();
				board.repaint();
			}
		});
        return piece12_panel; 
	}
	public JPanel Piece13 (Color color){
	
		JPanel piece13_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape13 = new GridBagConstraints(); 
		
		shape13.gridx = 0;
		shape13.gridy = 0;
	    
		shape13.ipadx = 5;
		shape13.ipady = 5;
	    
	    shape13.insets = new Insets(0,10,0,0); //調整間距     
	    piece13_panel.add(new Default_Panel(color), shape13);
	    
		shape13.gridx = 0;
		shape13.gridy = 1;
	    
		shape13.ipadx = 5;
		shape13.ipady = 5;
	    
	    shape13.insets = new Insets(0,10,0,0); //調整間距     
	    piece13_panel.add(new Default_Panel(color), shape13);
	    	
		shape13.gridx = 0;
	    shape13.gridy = 2;
	    
	    shape13.ipadx = 5;
	    shape13.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape13.insets = new Insets(0,10,0,0); //調整間距  
		piece13_panel.add(new Default_Panel(color), shape13);
		
		shape13.gridx = 0;
	    shape13.gridy = 3;
	    
	    shape13.ipadx = 5;
	    shape13.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape13.insets = new Insets(0,10,0,0); //調整間距 
		piece13_panel.add(new Default_Panel(color), shape13);
		
		
		shape13.gridx = 1;
	    shape13.gridy = 0;
	    
	    shape13.ipadx = 5;
	    shape13.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape13.insets = new Insets(0,0,0,0); //調整間距 
		piece13_panel.add(new Default_Panel(color), shape13);
		piece13_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece13_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece13_panel;
	}
	public JPanel Piece14 (Color color){
		
		JPanel piece14_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape14 = new GridBagConstraints(); 
		
		shape14.gridx = 0;
		shape14.gridy = 0;
	    
		shape14.ipadx = 5;
		shape14.ipady = 5;
	    
	    shape14.insets = new Insets(0,10,0,0); //調整間距     
	    piece14_panel.add(new Default_Panel(color), shape14);
	    
		shape14.gridx = 0;
		shape14.gridy = 1;
	    
		shape14.ipadx = 5;
		shape14.ipady = 5;
	    
	    shape14.insets = new Insets(0,10,0,0); //調整間距     
	    piece14_panel.add(new Default_Panel(color), shape14);
	    	
		shape14.gridx = 0;
	    shape14.gridy = 2;
	    
	    shape14.ipadx = 5;
	    shape14.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape14.insets = new Insets(0,10,0,0); //調整間距  
		piece14_panel.add(new Default_Panel(color), shape14);
		
		shape14.gridx = 1;
	    shape14.gridy = 0;
	    
	    shape14.ipadx = 5;
	    shape14.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape14.insets = new Insets(0,0,0,0); //調整間距 
		piece14_panel.add(new Default_Panel(color), shape14);
		
		
		shape14.gridx = 1;
	    shape14.gridy = 2;
	    
	    shape14.ipadx = 5;
	    shape14.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape14.insets = new Insets(0,0,0,0); //調整間距 
		piece14_panel.add(new Default_Panel(color), shape14);
		piece14_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece14_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece14_panel;
	}
	public JPanel Piece15 (Color color){
		
		JPanel piece15_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape15 = new GridBagConstraints(); 
		
		shape15.gridx = 0;
		shape15.gridy = 0;
	    
		shape15.ipadx = 5;
		shape15.ipady = 5;
	    
	    shape15.insets = new Insets(0,10,0,0); //調整間距     
	    piece15_panel.add(new Default_Panel(color), shape15);
	    
		shape15.gridx = 1;
		shape15.gridy = 0;
	    
		shape15.ipadx = 5;
		shape15.ipady = 5;
	    
	    shape15.insets = new Insets(0,0,0,0); //調整間距     
	    piece15_panel.add(new Default_Panel(color), shape15);
	    	
		shape15.gridx = 1;
	    shape15.gridy = 1;
	    
	    shape15.ipadx = 5;
	    shape15.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape15.insets = new Insets(0,0,0,0); //調整間距  
		piece15_panel.add(new Default_Panel(color), shape15);
		
		shape15.gridx = 1;
	    shape15.gridy = 2;
	    
	    shape15.ipadx = 5;
	    shape15.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape15.insets = new Insets(0,0,0,0); //調整間距 
		piece15_panel.add(new Default_Panel(color), shape15);
		
		
		shape15.gridx = 2;
	    shape15.gridy = 1;
	    
	    shape15.ipadx = 5;
	    shape15.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape15.insets = new Insets(0,0,0,0); //調整間距 
		piece15_panel.add(new Default_Panel(color), shape15);
		piece15_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece15_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece15_panel;
	}
	public JPanel Piece16 (Color color){
		
		JPanel piece16_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape16 = new GridBagConstraints(); 
		
		shape16.gridx = 0;
		shape16.gridy = 1;
	    
		shape16.ipadx = 5;
		shape16.ipady = 5;
	    
	    shape16.insets = new Insets(0,10,0,0); //調整間距     
	    piece16_panel.add(new Default_Panel(color), shape16);
	    
		shape16.gridx = 1;
		shape16.gridy = 0;
	    
		shape16.ipadx = 5;
		shape16.ipady = 5;
	    
	    shape16.insets = new Insets(0,0,0,0); //調整間距     
	    piece16_panel.add(new Default_Panel(color), shape16);
	    	
		shape16.gridx = 1;
	    shape16.gridy = 1;
	    
	    shape16.ipadx = 5;
	    shape16.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape16.insets = new Insets(0,0,0,0); //調整間距  
		piece16_panel.add(new Default_Panel(color), shape16);
		
		shape16.gridx = 1;
	    shape16.gridy = 2;
	    
	    shape16.ipadx = 5;
	    shape16.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape16.insets = new Insets(0,0,0,0); //調整間距 
		piece16_panel.add(new Default_Panel(color), shape16);
		
		
		shape16.gridx = 2;
	    shape16.gridy = 1;
	    
	    shape16.ipadx = 5;
	    shape16.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape16.insets = new Insets(0,0,0,0); //調整間距 
		piece16_panel.add(new Default_Panel(color), shape16);
		piece16_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece16_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece16_panel;
	}
	public JPanel Piece17 (Color color){
		
		JPanel piece17_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape17 = new GridBagConstraints(); 
		
		shape17.gridx = 0;
		shape17.gridy = 0;
	    
		shape17.ipadx = 5;
		shape17.ipady = 5;
	    
	    shape17.insets = new Insets(0,10,0,0); //調整間距     
	    piece17_panel.add(new Default_Panel(color), shape17);
	    
		shape17.gridx = 1;
		shape17.gridy = 0;
	    
		shape17.ipadx = 5;
		shape17.ipady = 5;
	    
	    shape17.insets = new Insets(0,0,0,0); //調整間距     
	    piece17_panel.add(new Default_Panel(color), shape17);
	    	
		shape17.gridx = 1;
	    shape17.gridy = 1;
	    
	    shape17.ipadx = 5;
	    shape17.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape17.insets = new Insets(0,0,0,0); //調整間距  
		piece17_panel.add(new Default_Panel(color), shape17);
		
		shape17.gridx = 1;
	    shape17.gridy = 2;
	    
	    shape17.ipadx = 5;
	    shape17.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape17.insets = new Insets(0,0,0,0); //調整間距 
		piece17_panel.add(new Default_Panel(color), shape17);
		
		
		shape17.gridx = 2;
	    shape17.gridy = 2;
	    
	    shape17.ipadx = 5;
	    shape17.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape17.insets = new Insets(0,0,0,0); //調整間距 
		piece17_panel.add(new Default_Panel(color), shape17);
		piece17_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece17_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece17_panel;
	}
	public JPanel Piece18 (Color color){
		
		JPanel piece18_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape18 = new GridBagConstraints(); 
		
		shape18.gridx = 0;
		shape18.gridy = 0;
	    
		shape18.ipadx = 5;
		shape18.ipady = 5;
	    
	    shape18.insets = new Insets(0,10,0,0); //調整間距     
	    piece18_panel.add(new Default_Panel(color), shape18);
	    
		shape18.gridx = 0;
		shape18.gridy = 1;
	    
		shape18.ipadx = 5;
		shape18.ipady = 5;
	    
	    shape18.insets = new Insets(0,10,0,0); //調整間距     
	    piece18_panel.add(new Default_Panel(color), shape18);
	    	
		shape18.gridx = 1;
	    shape18.gridy = 1;
	    
	    shape18.ipadx = 5;
	    shape18.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape18.insets = new Insets(0,0,0,0); //調整間距  
		piece18_panel.add(new Default_Panel(color), shape18);
		
		shape18.gridx = 1;
	    shape18.gridy = 2;
	    
	    shape18.ipadx = 5;
	    shape18.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape18.insets = new Insets(0,0,0,0); //調整間距 
		piece18_panel.add(new Default_Panel(color), shape18);
		
		
		shape18.gridx = 1;
	    shape18.gridy = 3;
	    
	    shape18.ipadx = 5;
	    shape18.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape18.insets = new Insets(0,0,0,0); //調整間距 
		piece18_panel.add(new Default_Panel(color), shape18);
		piece18_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece18_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece18_panel;
	}
	public JPanel Piece19 (Color color){
		
		JPanel piece19_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape19 = new GridBagConstraints(); 
		
		shape19.gridx = 0;
		shape19.gridy = 0;
	    
		shape19.ipadx = 5;
		shape19.ipady = 5;
	    
	    shape19.insets = new Insets(0,10,0,0); //調整間距     
	    piece19_panel.add(new Default_Panel(color), shape19);
	    
		shape19.gridx = 0;
		shape19.gridy = 1;
	    
		shape19.ipadx = 5;
		shape19.ipady = 5;
	    
	    shape19.insets = new Insets(0,10,0,0); //調整間距     
	    piece19_panel.add(new Default_Panel(color), shape19);
	    	
		shape19.gridx = 0;
	    shape19.gridy = 2;
	    
	    shape19.ipadx = 5;
	    shape19.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape19.insets = new Insets(0,10,0,0); //調整間距  
		piece19_panel.add(new Default_Panel(color), shape19);
		
		shape19.gridx = 1;
	    shape19.gridy = 1;
	    
	    shape19.ipadx = 5;
	    shape19.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape19.insets = new Insets(0,0,0,0); //調整間距 
		piece19_panel.add(new Default_Panel(color), shape19);
		
		
		shape19.gridx = 2;
	    shape19.gridy = 1;
	    
	    shape19.ipadx = 5;
	    shape19.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape19.insets = new Insets(0,0,0,0); //調整間距 
		piece19_panel.add(new Default_Panel(color), shape19);
		piece19_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece19_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece19_panel;
	}
	public JPanel Piece20 (Color color){
		
		JPanel piece20_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape20 = new GridBagConstraints(); 
		
		shape20.gridx = 0;
		shape20.gridy = 0;
	    
		shape20.ipadx = 5;
		shape20.ipady = 5;
	    
	    shape20.insets = new Insets(0,10,0,0); //調整間距     
	    piece20_panel.add(new Default_Panel(color), shape20);
	    
		shape20.gridx = 1;
		shape20.gridy = 0;
	    
		shape20.ipadx = 5;
		shape20.ipady = 5;
	    
	    shape20.insets = new Insets(0,0,0,0); //調整間距     
	    piece20_panel.add(new Default_Panel(color), shape20);
	    	
		shape20.gridx = 1;
	    shape20.gridy = 1;
	    
	    shape20.ipadx = 5;
	    shape20.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape20.insets = new Insets(0,0,0,0); //調整間距  
		piece20_panel.add(new Default_Panel(color), shape20);
		
		shape20.gridx = 2;
	    shape20.gridy = 1;
	    
	    shape20.ipadx = 5;
	    shape20.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape20.insets = new Insets(0,0,0,0); //調整間距 
		piece20_panel.add(new Default_Panel(color), shape20);
		
		
		shape20.gridx = 2;
	    shape20.gridy = 2;
	    
	    shape20.ipadx = 5;
	    shape20.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape20.insets = new Insets(0,0,0,0); //調整間距 
		piece20_panel.add(new Default_Panel(color), shape20);
		piece20_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece20_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece20_panel;
	}
	public JPanel Piece21 (Color color){
		
		JPanel piece21_panel = new JPanel(new GridBagLayout());
		
		//GridBagLayout gLayout = new GridBagLayout();
		
		GridBagConstraints shape21 = new GridBagConstraints(); 
		
		shape21.gridx = 0;
		shape21.gridy = 0;
	    
		shape21.ipadx = 5;
		shape21.ipady = 5;
	    
	    shape21.insets = new Insets(0,10,0,0); //調整間距     
	    piece21_panel.add(new Default_Panel(color), shape21);
	    
		shape21.gridx = 0;
		shape21.gridy = 1;
	    
		shape21.ipadx = 5;
		shape21.ipady = 5;
	    
	    shape21.insets = new Insets(0,10,0,0); //調整間距     
	    piece21_panel.add(new Default_Panel(color), shape21);
	    	
		shape21.gridx = 0;
	    shape21.gridy = 2;
	    
	    shape21.ipadx = 5;
	    shape21.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape21.insets = new Insets(0,10,0,0); //調整間距  
		piece21_panel.add(new Default_Panel(color), shape21);
		
		shape21.gridx = 2;
	    shape21.gridy = 2;
	    
	    shape21.ipadx = 5;
	    shape21.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape21.insets = new Insets(0,0,0,0); //調整間距 
		piece21_panel.add(new Default_Panel(color), shape21);
		
		
		shape21.gridx = 3;
	    shape21.gridy = 2;
	    
	    shape21.ipadx = 5;
	    shape21.ipady = 5;
		
		//shape3.fill = GridBagConstraints.BOTH;
	    shape21.insets = new Insets(0,0,0,0); //調整間距 
		piece21_panel.add(new Default_Panel(color), shape21);
		piece21_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				board.removeAll(); //清除 board 上的所有元件
				board.add(piece21_panel);
				board.revalidate();
				board.repaint();
			}
		});
	    return piece21_panel;
	}

}
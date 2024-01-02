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


public class Piece_Move implements MouseListener,MouseMotionListener{
	
	Piece piece = new Piece();
	Point startpoint = new Point(0,0); //坐标点

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Point newPoint = SwingUtilities.convertPoint(piece.Piece01(null),e.getPoint(),piece.Piece01(null).getParent()); //转换坐标系统
		piece.Piece01(null).setLocation(piece.Piece01(null).getX()+(newPoint.x-startpoint.x),piece.Piece01(null).getY()+(newPoint.y-startpoint.y)); //设置标签图片的新位置
		startpoint = newPoint; //更改坐标点
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		startpoint = SwingUtilities.convertPoint(piece.Piece01(null),e.getPoint(),piece.Piece01(null));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

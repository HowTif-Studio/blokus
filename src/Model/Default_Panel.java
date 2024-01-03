package Model;

import javax.swing.*;
import javax.swing.border.Border;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Default_Panel extends JPanel {
	
	
    Color color;
    int pos_x;
    int pos_y;
    
    
//    private PieceClickListener listener;
//    private Piece piece; // 引用 Piece 類 ？？？


    Default_Panel (Color color){

        setBackground(color);
        setBorder(BorderFactory.createLineBorder(Color.black));
//        this.piece = piece; // 將 Piece 實例儲存在 Default_Panel 中
        
    }
    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        this.setBackground(color);
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }
    
    // 新增點擊事件的方法
//    
//    public interface PieceClickListener {
//        void onPieceClicked(Color color);
//    }
//	
//    public void setPieceClickListener(PieceClickListener listener) {
//        this.listener = listener;
//    }
//
//    public void onPieceClick(Color color) {
//        if (listener != null) {
//            listener.onPieceClicked(color);
//        }
//    }
//
//    public void setPiecePanelListener() {
//        // 設定 piece01_panel 的點擊事件
//        piece.piece01_panel.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                // 觸發 piece01_panel 的點擊事件
//                onPieceClick(Color.RED); // 假設這裡是點擊時的顏色
//            }
//        });
//    }
	
}



package Model;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Default_Panel extends JPanel {

    Color color;
    int pos_x;
    int pos_y;

    Default_Panel (Color color){

        setBackground(color);
        setBorder(BorderFactory.createLineBorder(Color.black));
        
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
}

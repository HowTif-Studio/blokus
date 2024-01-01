package Model;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Default_Panel extends JPanel {
	
    Default_Panel (Color color){
    	
        setBackground(color);
        setBorder(BorderFactory.createLineBorder(Color.black));
        
    }
}

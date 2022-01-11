/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */

import java.util.*;
import java.awt.*;
import javax.swing.JPanel;

public class Gcanvas extends JPanel {
    
    private Drawing2d myDrawing;
    
    public void setDrawing(Drawing2d inDrawing) {
        myDrawing = inDrawing;
    }
    
    public void paintComponent(Graphics g) {
        myDrawing.draw(g);
    }//paintComponenet
    
}

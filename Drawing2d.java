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

public class Drawing2d {
    
    private Vector shapes = new Vector();
    int numberOfShapes=0;
    
    public void addShape(Shaping2d inShape) {
        shapes.add(inShape);
        numberOfShapes = numberOfShapes + 1;
    }//end addShapes
    
    public void draw(Graphics g) {
        for (int i=0; i < numberOfShapes; i = i+1) {
            ((Shaping2d)shapes.get(i)).draw(g);
        }//end for i
    }//end draw
    
}

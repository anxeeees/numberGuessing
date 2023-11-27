/*
 *  Jangan lupa SUBSCRIBE https://www.youtube.com/@FOSALGO/videos
 *  Tetap Semangat...!!! Semua orang Bisa Belajar Coding
 *  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package numberguessing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author FOSALGO
 */
public class FTextField extends JTextField{
    private Color backgroundColor = Color.WHITE; 
    private Color fieldColor = Color.BLACK; 
    
    
    
    public FTextField() {
       
        setBackground(new Color(255,255,0));
       
        setOpaque(false);
        setBorder(new EmptyBorder(10,10,10,50));
        setFont(new java.awt.Font("sansserif",0,14)); 
        setSelectionColor(new Color(80,199,255));
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getFieldColor() {
        return fieldColor;
    }

    public void setFieldColor(Color fieldColor) {
        this.fieldColor = fieldColor;
    }
    
    

  

  
  
    
    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(backgroundColor);
        
        
        g2.fillRoundRect(0, 0, width, height, height, height);
        super.paintComponent(g);        
    }
    
}

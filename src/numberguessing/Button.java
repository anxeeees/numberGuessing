/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberguessing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Ester
 */
public class Button extends  JButton {
    
  private Color fillOriginal;
    private Color fillOver;
    private Color fillClick;
    private Color lineOriginal;
    private Color lineOver;

    private int strokeWidth = 2;

    public Button() {
        fillOriginal = new Color(52, 152, 219);
        fillOver = new Color(72, 172, 239);
        fillClick = new Color(100, 112, 189);
        lineOriginal = new Color(236, 240, 241);
        lineOver = new Color(189, 195, 199);

        setOpaque(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBackground(fillOriginal);
        setForeground(Color.WHITE);

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleState();
            }
        });
    }

    private void toggleState() {
        setSelected(!isSelected());
        if (isSelected()) {
            setBackground(fillClick);
            setForeground(Color.BLACK);  // Adjust text color if needed
        } else {
            setBackground(fillOriginal);
            setForeground(Color.WHITE);  // Adjust text color if needed
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int s = strokeWidth;
            int w = getWidth() - (2 * s);
            int h = getHeight() - (2 * s);
            g2d.setColor(getBackground());
            g2d.fillRoundRect(s, s, w, h, h, h);

            g2d.setStroke(new BasicStroke(s));
            g2d.setColor(getForeground());
            g2d.drawRoundRect(s, s, w, h, h, h);
        }
        super.paintComponent(g);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JTextArea;

/**
 *
 * @author Ghomez
 */
public class Display {

    /**Attributes*/
    
    /**x variable of Display*/
    private final int x;
    
    /**y variable of Display*/
    private final int y;
    
    /**displayWidth variable of Display*/
    private final int displayWidth;
    
    /**displayHeight variable of Display*/
    private final int displayHeight;
    
    /**value variable of Display*/
    public String value;
    
    /**displayFont variable of Display*/
    private final Font displayFont = new Font("Arial", Font.BOLD, 35);
    
    /**textArea variable of Display*/
    public JTextArea textArea;
    
    /**Links*/
    
    
    
    /**Constructor*/
    
    /**
     * Display Constructor
     * 
     * @param _x
     * @param _y
     * @param _w
     * @param _h
     * @param _value
     */
    public Display(int _x, int _y, int _w, int _h, String _value){
        this.x = _x;
        this.y = _y;
        this.displayWidth = _w;
        this.displayHeight = _h;
        this.value = _value;
        this.textArea = new JTextArea(this.value);
        textArea.setBounds(new Rectangle(this.x, this.y, this.displayWidth, this.displayHeight));
        textArea.setPreferredSize(new Dimension(this.displayWidth, this.displayHeight));
        textArea.setFont(displayFont);
        textArea.setLineWrap(false);
        textArea.setEditable(false);
        textArea.setColumns(10);
        textArea.setRows(1);
        textArea.setVisible(true);
        
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     */
    public void init(){

    }
    
    
    /**
     * tick()
     * 
     */
    public void tick(){}
    
    
    /**
     * render(Graphics2D g2d)
     * 
     * @param g2d
     */
    public void render(Graphics2D g2d){}
    
}

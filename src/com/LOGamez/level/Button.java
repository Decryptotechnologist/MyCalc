/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.mycalc.Calc;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Ghomez
 */
public class Button {

    /**Attributes*/
    
    /**x variable of Button*/
    private int x;
    
    /**y variable of Button*/
    private int y;
    
    /**btnWidth variable of Button*/
    private int btnWidth;
    
    /**btnHeight variable of Button*/
    private int btnHeight;
    
    /**symbol variable of Button*/
    private String symbol;
    
    /**type variable of Button*/
    private int type;
    
    /**btnFont variable of Button*/
    private final Font btnFont = new Font("Arial", Font.BOLD, 40);
    
    /**btnCol variable of Button*/
    private final Color btnCol = Color.lightGray;
    
    /**clickedBtnCol variable of Button*/
    private final Color clickedBtnCol = Color.DARK_GRAY;
    
    /**button variable of Button*/
    private JButton button;
    
    /**buttons variable of Button*/
    private List<Button> buttons;
    
    /**enteredBtnBorder variable of Button*/
    private Border enteredBtnBorder = new LineBorder(Color.ORANGE, 2, true);
    
    /**clickedBtnBorder variable of Button*/
    private Border clickedBtnBorder = new LineBorder(Color.YELLOW, 2, true);
    
    /**cancel variable of Button*/
    private Button cancel;
    
    /**divide variable of Button*/
    private Button divide;
    
    /**multiply variable of Button*/
    private Button multiply;
    
    /**one variable of Button*/
    private Button one;
    
    /**two variable of Button*/
    private Button two;
    
    /**three variable of Button*/
    private Button three;
    
    /**minus variable of Button*/
    private Button minus;
    
    /**four variable of Button*/
    private Button four;
    
    /**five variable of Button*/
    private Button five;
    
    /**six variable of Button*/
    private Button six;
    
    /**add variable of Button*/
    private Button add;
    
    /**seven variable of Button*/
    private Button seven;
    
    /**eight variable of Button*/
    private Button eight;
    
    /**nine variable of Button*/
    private Button nine;
    
    /**period variable of Button*/
    private Button period;
    
    /**zero variable of Button*/
    private Button zero;
    
    /**equals variable of Button*/
    private Button equals;
    
    /**delete variable of Button*/
    private Button delete;
    
    /**openBracket variable of Button*/
    private Button openBracket;
    
    /**closeBracket variable of Button*/
    private Button closeBracket;
    
    private Border roundedBorder = new LineBorder(Color.BLACK, 2, true);
    
    
    /**Links*/
    
    /**Constructor*/
    
    /**
     * Button Constructor
     * 
     * @param _type
     */
    public Button(int _type){
        this.type = _type;
        buttons = new ArrayList<>();
    }
    
    
    /**
     * Button Constructor
     * 
     * @param _x
     * @param _y
     * @param _w
     * @param _h
     * @param _c
     * @param col
     */
    public Button(int _x, int _y, int _w, int _h, String _c, Color col){
        this.x = _x;
        this.y = _y;
        this.btnWidth = _w;
        this.btnHeight = _h;
        this.symbol = _c;
        this.button = new JButton(this.symbol);
        button.setBounds(new Rectangle(this.x, this.y, this.btnWidth, this.btnHeight));
        button.setPreferredSize(new Dimension(this.btnWidth, this.btnHeight));
        button.setBackground(col);
        button.setBorder(roundedBorder);
        button.setFont(btnFont);
        button.setVisible(true);
    }
    
    
    
    /**Public Protocol*/
    
    /**
     * init()
     * 
     */
    public void init(){
        GridLayout experimentLayout = new GridLayout(1, 0, 2, 2);
        
        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(experimentLayout);
        buttonPanel1.setBounds(new Rectangle(0, 5, Calc.getMainWidth(), 40));
        buttonPanel1.setPreferredSize(new Dimension(Calc.getMainWidth(), 40));
        buttonPanel1.setBackground(Color.decode("#8D8D8D"));
        
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(experimentLayout);
        buttonPanel2.setBounds(new Rectangle(0, 5, Calc.getMainWidth(), 40));
        buttonPanel2.setPreferredSize(new Dimension(Calc.getMainWidth(), 40));
        buttonPanel2.setBackground(Color.decode("#8D8D8D"));
        
        JPanel buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(experimentLayout);
        buttonPanel3.setBounds(new Rectangle(0, 5, Calc.getMainWidth(), 40));
        buttonPanel3.setPreferredSize(new Dimension(Calc.getMainWidth(), 40));
        buttonPanel3.setBackground(Color.decode("#8D8D8D"));
        
        JPanel buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(experimentLayout);
        buttonPanel4.setBounds(new Rectangle(0, 5, Calc.getMainWidth(), 40));
        buttonPanel4.setPreferredSize(new Dimension(Calc.getMainWidth(), 40));
        buttonPanel4.setBackground(Color.decode("#8D8D8D"));
        
        JPanel buttonPanel5 = new JPanel();
        buttonPanel5.setLayout(experimentLayout);
        buttonPanel5.setBounds(new Rectangle(0, 5, Calc.getMainWidth(), 40));
        buttonPanel5.setPreferredSize(new Dimension(Calc.getMainWidth(), 40));
        buttonPanel5.setBackground(Color.decode("#8D8D8D"));
        
        //Simple Calculator 
        if(type == 0){
            cancel = new Button(10, 55, 80, 40, "C", Color.RED);
            divide = new Button(85, 55, 40, 40, "/", btnCol);
            multiply = new Button(130, 55, 40, 40, "x", btnCol);
            delete = new Button(130, 55, 40, 40, "Del", btnCol);
            delete.button.setFont(new Font("Arial", Font.BOLD, 20));
            delete.button.setBackground(Color.ORANGE);
            buttons.add(cancel);
            buttons.add(divide);
            buttons.add(multiply);
            buttons.add(delete);
            buttonPanel1.add(cancel.button);
            buttonPanel1.add(divide.button);
            buttonPanel1.add(multiply.button);
            buttonPanel1.add(delete.button);
            
            one = new Button(10, 100, 40, 40, "1", btnCol);
            two = new Button(55, 100, 40, 40, "2", btnCol);
            three = new Button(90, 100, 40, 40, "3", btnCol);
            minus = new Button(135, 100, 40, 40, "-", btnCol);
            buttons.add(one);
            buttons.add(two);
            buttons.add(three);
            buttons.add(minus);
            buttonPanel2.add(one.button);
            buttonPanel2.add(two.button);
            buttonPanel2.add(three.button);
            buttonPanel2.add(minus.button);
            
            four = new Button(10, 145, 40, 40, "4", btnCol);
            five = new Button(55, 145, 40, 40, "5", btnCol);
            six = new Button(90, 145, 40, 40, "6", btnCol);
            add = new Button(135, 145, 40, 80, "+", btnCol);
            buttons.add(four);
            buttons.add(five);
            buttons.add(six);
            buttons.add(add);
            buttonPanel3.add(four.button);
            buttonPanel3.add(five.button);
            buttonPanel3.add(six.button);
            buttonPanel3.add(add.button);
            
            seven = new Button(10, 190, 40, 40, "7", btnCol);
            eight = new Button(55, 190, 40, 40, "8", btnCol);
            nine = new Button(90, 190, 40, 40, "9", btnCol);
            period = new Button(10, 235, 40, 40, ".", btnCol);
            buttons.add(seven);
            buttons.add(eight);
            buttons.add(nine);
            buttons.add(period);
            buttonPanel4.add(seven.button);
            buttonPanel4.add(eight.button);
            buttonPanel4.add(nine.button);
            buttonPanel4.add(period.button);
            
            zero = new Button(55, 235, 40, 40, "0", btnCol);
            openBracket = new Button(55, 235, 40, 40, "(", btnCol);
            closeBracket = new Button(55, 235, 40, 40, ")", btnCol);
            equals = new Button(90, 235, 80, 40, "=", btnCol);
            buttons.add(openBracket);
            buttons.add(zero);
            buttons.add(closeBracket);
            buttons.add(equals);
            buttonPanel5.add(openBracket.button);
            buttonPanel5.add(zero.button);
            buttonPanel5.add(closeBracket.button);
            buttonPanel5.add(equals.button);
        }
        
        //Scientific Calculator 
        if(type == 1){
            cancel = new Button(10, 55, 80, 40, "C", Color.RED);
            divide = new Button(85, 55, 40, 40, "/", btnCol);
            multiply = new Button(130, 55, 40, 40, "X", btnCol);
            buttons.add(cancel);
            buttons.add(divide);
            buttons.add(multiply);
            
            one = new Button(10, 100, 40, 40, "1", btnCol);
            two = new Button(55, 100, 40, 40, "2", btnCol);
            three = new Button(90, 100, 40, 40, "3", btnCol);
            minus = new Button(135, 100, 40, 40, "-", btnCol);
            buttons.add(one);
            buttons.add(two);
            buttons.add(three);
            buttons.add(minus);
            
            four = new Button(10, 145, 40, 40, "4", btnCol);
            five = new Button(55, 145, 40, 40, "5", btnCol);
            six = new Button(90, 145, 40, 40, "6", btnCol);
            add = new Button(135, 145, 40, 80, "+", btnCol);
            buttons.add(four);
            buttons.add(five);
            buttons.add(six);
            buttons.add(add);
            
            seven = new Button(10, 190, 40, 40, "7", btnCol);
            eight = new Button(55, 190, 40, 40, "8", btnCol);
            nine = new Button(90, 190, 40, 40, "9", btnCol);
            buttons.add(seven);
            buttons.add(eight);
            buttons.add(nine);
            
            period = new Button(10, 235, 40, 40, ".", btnCol);
            zero = new Button(55, 235, 40, 40, "0", btnCol);
            equals = new Button(90, 235, 80, 40, "=", btnCol);
            buttons.add(period);
            buttons.add(zero);
            buttons.add(equals);
            
        }
        
        
        
        cancel.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                cancelBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                cancelBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                cancelBtnMouseReleased(evt);
            }
        });

        divide.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                divideBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                divideBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                divideBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                divideBtnMouseReleased(evt);
            }
        });

        multiply.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                multiplyBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                multiplyBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                multiplyBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                multiplyBtnMouseReleased(evt);
            }
        });
        
        delete.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                deleteBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                deleteBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                deleteBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                deleteBtnMouseReleased(evt);
            }
        });
            
        one.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                oneBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                oneBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                oneBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                oneBtnMouseReleased(evt);
            }
        });

        two.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                twoBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                twoBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                twoBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                twoBtnMouseReleased(evt);
            }
        });

        three.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                threeBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                threeBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                threeBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                threeBtnMouseReleased(evt);
            }
        });

        minus.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                minusBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                minusBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                minusBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                minusBtnMouseReleased(evt);
            }
        });    
        
        four.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                fourBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                fourBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                fourBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                fourBtnMouseReleased(evt);
            }
        });

        five.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                fiveBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                fiveBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                fiveBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                fiveBtnMouseReleased(evt);
            }
        });

        six.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                sixBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                sixBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                sixBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                sixBtnMouseReleased(evt);
            }
        });

        add.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                addBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                addBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                addBtnMouseReleased(evt);
            }
        });
            
        seven.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                sevenBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                sevenBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                sevenBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                sevenBtnMouseReleased(evt);
            }
        });

        eight.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                eightBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                eightBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                eightBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                eightBtnMouseReleased(evt);
            }
        });

        nine.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                nineBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                nineBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                nineBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                nineBtnMouseReleased(evt);
            }
        });
            
        period.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                periodBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                periodBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                periodBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                periodBtnMouseReleased(evt);
            }
        });

        zero.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                zeroBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                zeroBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                zeroBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                zeroBtnMouseReleased(evt);
            }
        });

        equals.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                equalsBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                equalsBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                equalsBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                equalsBtnMouseReleased(evt);
            }
        });
        
        openBracket.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                openBracketBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                openBracketBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                openBracketBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                openBracketBtnMouseReleased(evt);
            }
        });
        
        closeBracket.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                closeBracketBtnMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                closeBracketBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                closeBracketBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                closeBracketBtnMouseReleased(evt);
            }
        });
        
        
        JPanel buttonPanel = new JPanel();
        BoxLayout experimentLayout1 = new BoxLayout(buttonPanel, 1);
        
        buttonPanel.setLayout(experimentLayout1);
        buttonPanel.setBounds(new Rectangle(0, 50, Calc.getMainWidth(), Calc.getMainHeight()-90));
        buttonPanel.setPreferredSize(new Dimension(Calc.getMainWidth(), Calc.getMainHeight()-90));
        buttonPanel.add(buttonPanel1);
        buttonPanel.add(buttonPanel2);
        buttonPanel.add(buttonPanel3);
        buttonPanel.add(buttonPanel4);
        buttonPanel.add(buttonPanel5);
        
        Level.panel.add(buttonPanel);    
    }
    
    
    
    /**
     * tick()
     * 
     */
    public void tick(){
        for(int i = 0; i < buttons.size(); i++){
            buttons.get(i).button.repaint();
        }
    }
    
    
    /**
     * render(Graphics2D g2d)
     * 
     * @param g2d
     */
    public void render(Graphics2D g2d){}
    
    
    
    
    //Cancel Button Functions
    private void cancelBtnMouseEntered(MouseEvent evt) {
        cancel.button.setBackground(clickedBtnCol);
        cancel.button.setBorder(enteredBtnBorder);
    }                                     

    private void cancelBtnMouseExited(MouseEvent evt) { 
        cancel.button.setBackground(Color.RED);
        cancel.button.setBorder(roundedBorder);
    }                                    

    private void cancelBtnMousePressed(MouseEvent evt) { 
        cancel.button.setBackground(clickedBtnCol);
        cancel.button.setBorder(clickedBtnBorder);
    }                                     

    private void cancelBtnMouseReleased(MouseEvent evt) {                                       
        cancel.button.setBackground(clickedBtnCol);
        cancel.button.setBorder(roundedBorder);
        cancel();
    }

    private void cancel() {
        Level.display.value = "0";
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    
    //Divide Button Functions
    private void divideBtnMouseEntered(MouseEvent evt) {
        divide.button.setBackground(clickedBtnCol);
        divide.button.setBorder(enteredBtnBorder);
    }                                     

    private void divideBtnMouseExited(MouseEvent evt) { 
        divide.button.setBackground(btnCol);
        divide.button.setBorder(roundedBorder);
    }                                    

    private void divideBtnMousePressed(MouseEvent evt) { 
        divide.button.setBackground(clickedBtnCol);
        divide.button.setBorder(clickedBtnBorder);
    }                                     

    private void divideBtnMouseReleased(MouseEvent evt) {                                       
        divide.button.setBackground(clickedBtnCol);
        divide.button.setBorder(roundedBorder);
        divide();
    }

    private void divide() {
        Level.display.value += "/";
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Multiply Button Functions
    private void multiplyBtnMouseEntered(MouseEvent evt) {
        multiply.button.setBackground(clickedBtnCol);
        multiply.button.setBorder(enteredBtnBorder);
    }                                     

    private void multiplyBtnMouseExited(MouseEvent evt) { 
        multiply.button.setBackground(btnCol);
        multiply.button.setBorder(roundedBorder);
    }                                    

    private void multiplyBtnMousePressed(MouseEvent evt) { 
        multiply.button.setBackground(clickedBtnCol);
        multiply.button.setBorder(clickedBtnBorder);
    }                                     

    private void multiplyBtnMouseReleased(MouseEvent evt) {                                       
        multiply.button.setBackground(clickedBtnCol);
        multiply.button.setBorder(roundedBorder);
        multiply();
    }

    private void multiply() {
        Level.display.value += "x";
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Delete Button Functions
    private void deleteBtnMouseEntered(MouseEvent evt) {
        delete.button.setBackground(clickedBtnCol);
        delete.button.setBorder(enteredBtnBorder);
    }                                     

    private void deleteBtnMouseExited(MouseEvent evt) { 
        delete.button.setBackground(Color.ORANGE);
        delete.button.setBorder(roundedBorder);
    }                                    

    private void deleteBtnMousePressed(MouseEvent evt) { 
        delete.button.setBackground(clickedBtnCol);
        delete.button.setBorder(clickedBtnBorder);
    }                                     

    private void deleteBtnMouseReleased(MouseEvent evt) {                                       
        delete.button.setBackground(clickedBtnCol);
        delete.button.setBorder(roundedBorder);
        delete();
    }

    private void delete() {
        String newValue = Level.display.value.substring(0, Level.display.value.length()-1);
        if(newValue.length() < 1) newValue = "0";
        Level.display.value = newValue;
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //One Button Functions
    private void oneBtnMouseEntered(MouseEvent evt) {
        one.button.setBackground(clickedBtnCol);
        one.button.setBorder(enteredBtnBorder);
    }                                     

    private void oneBtnMouseExited(MouseEvent evt) { 
        one.button.setBackground(btnCol);
        one.button.setBorder(roundedBorder);
    }                                    

    private void oneBtnMousePressed(MouseEvent evt) { 
        one.button.setBackground(clickedBtnCol);
        one.button.setBorder(clickedBtnBorder);
    }                                     

    private void oneBtnMouseReleased(MouseEvent evt) {                                       
        one.button.setBackground(clickedBtnCol);
        one.button.setBorder(roundedBorder);
        one();
    }

    private void one() {
        if(Level.display.value == "0"){
            Level.display.value = "1";
        } else {
            Level.display.value += "1";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Two Button Functions
    private void twoBtnMouseEntered(MouseEvent evt) {
        two.button.setBackground(clickedBtnCol);
        two.button.setBorder(enteredBtnBorder);
    }                                     

    private void twoBtnMouseExited(MouseEvent evt) { 
        two.button.setBackground(btnCol);
        two.button.setBorder(roundedBorder);
    }                                    

    private void twoBtnMousePressed(MouseEvent evt) { 
        two.button.setBackground(clickedBtnCol);
        two.button.setBorder(clickedBtnBorder);
    }                                     

    private void twoBtnMouseReleased(MouseEvent evt) {                                       
        two.button.setBackground(clickedBtnCol);
        two.button.setBorder(roundedBorder);
        two();
    }

    private void two() {
        if(Level.display.value == "0"){
            Level.display.value = "2";
        } else {
            Level.display.value += "2";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Three Button Functions
    private void threeBtnMouseEntered(MouseEvent evt) {
        three.button.setBackground(clickedBtnCol);
        three.button.setBorder(enteredBtnBorder);
    }                                     

    private void threeBtnMouseExited(MouseEvent evt) { 
        three.button.setBackground(btnCol);
        three.button.setBorder(roundedBorder);
    }                                    

    private void threeBtnMousePressed(MouseEvent evt) { 
        three.button.setBackground(clickedBtnCol);
        three.button.setBorder(clickedBtnBorder);
    }                                     

    private void threeBtnMouseReleased(MouseEvent evt) {                                       
        three.button.setBackground(clickedBtnCol);
        three.button.setBorder(roundedBorder);
        three();
    }

    private void three() {
        if(Level.display.value == "0"){
            Level.display.value = "3";
        } else {
            Level.display.value += "3";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Minus Button Functions
    private void minusBtnMouseEntered(MouseEvent evt) {
        minus.button.setBackground(clickedBtnCol);
        minus.button.setBorder(enteredBtnBorder);
    }                                     

    private void minusBtnMouseExited(MouseEvent evt) { 
        minus.button.setBackground(btnCol);
        minus.button.setBorder(roundedBorder);
    }                                    

    private void minusBtnMousePressed(MouseEvent evt) { 
        minus.button.setBackground(clickedBtnCol);
        minus.button.setBorder(clickedBtnBorder);
    }                                     

    private void minusBtnMouseReleased(MouseEvent evt) {                                       
        minus.button.setBackground(clickedBtnCol);
        minus.button.setBorder(roundedBorder);
        minus();
    }

    private void minus() {
        if(Level.display.value == "0"){
            Level.display.value = "-";
        } else {
            Level.display.value += "-";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Four Button Functions
    private void fourBtnMouseEntered(MouseEvent evt) {
        four.button.setBackground(clickedBtnCol);
        four.button.setBorder(enteredBtnBorder);
    }                                     

    private void fourBtnMouseExited(MouseEvent evt) { 
        four.button.setBackground(btnCol);
        four.button.setBorder(roundedBorder);
    }                                    

    private void fourBtnMousePressed(MouseEvent evt) { 
        four.button.setBackground(clickedBtnCol);
        four.button.setBorder(clickedBtnBorder);
    }                                     

    private void fourBtnMouseReleased(MouseEvent evt) {                                       
        four.button.setBackground(clickedBtnCol);
        four.button.setBorder(roundedBorder);
        four();
    }

    private void four() {
        if(Level.display.value == "0"){
            Level.display.value = "4";
        } else {
            Level.display.value += "4";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Five Button Functions
    private void fiveBtnMouseEntered(MouseEvent evt) {
        five.button.setBackground(clickedBtnCol);
        five.button.setBorder(enteredBtnBorder);
    }                                     

    private void fiveBtnMouseExited(MouseEvent evt) { 
        five.button.setBackground(btnCol);
        five.button.setBorder(roundedBorder);
    }                                    

    private void fiveBtnMousePressed(MouseEvent evt) { 
        five.button.setBackground(clickedBtnCol);
        five.button.setBorder(clickedBtnBorder);
    }                                     

    private void fiveBtnMouseReleased(MouseEvent evt) {                                       
        five.button.setBackground(clickedBtnCol);
        five.button.setBorder(roundedBorder);
        five();
    }

    private void five() {
        if(Level.display.value == "0"){
            Level.display.value = "5";
        } else {
            Level.display.value += "5";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Six Button Functions
    private void sixBtnMouseEntered(MouseEvent evt) {
        six.button.setBackground(clickedBtnCol);
        six.button.setBorder(enteredBtnBorder);
    }                                     

    private void sixBtnMouseExited(MouseEvent evt) { 
        six.button.setBackground(btnCol);
        six.button.setBorder(roundedBorder);
    }                                    

    private void sixBtnMousePressed(MouseEvent evt) { 
        six.button.setBackground(clickedBtnCol);
        six.button.setBorder(clickedBtnBorder);
    }                                     

    private void sixBtnMouseReleased(MouseEvent evt) {                                       
        six.button.setBackground(clickedBtnCol);
        six.button.setBorder(roundedBorder);
        six();
    }

    private void six() {
        if(Level.display.value == "0"){
            Level.display.value = "6";
        } else {
            Level.display.value += "6";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Add Button Functions
    private void addBtnMouseEntered(MouseEvent evt) {
        add.button.setBackground(clickedBtnCol);
        add.button.setBorder(enteredBtnBorder);
    }                                     

    private void addBtnMouseExited(MouseEvent evt) { 
        add.button.setBackground(btnCol);
        add.button.setBorder(roundedBorder);
    }                                    

    private void addBtnMousePressed(MouseEvent evt) { 
        add.button.setBackground(clickedBtnCol);
        add.button.setBorder(clickedBtnBorder);
    }                                     

    private void addBtnMouseReleased(MouseEvent evt) {                                       
        add.button.setBackground(clickedBtnCol);
        add.button.setBorder(roundedBorder);
        add();
    }

    private void add() {
        if(Level.display.value == "0"){
            Level.display.value = "+";
        } else {
            Level.display.value += "+";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Seven Button Functions
    private void sevenBtnMouseEntered(MouseEvent evt) {
        seven.button.setBackground(clickedBtnCol);
        seven.button.setBorder(enteredBtnBorder);
    }                                     

    private void sevenBtnMouseExited(MouseEvent evt) { 
        seven.button.setBackground(btnCol);
        seven.button.setBorder(roundedBorder);
    }                                    

    private void sevenBtnMousePressed(MouseEvent evt) { 
        seven.button.setBackground(clickedBtnCol);
        seven.button.setBorder(clickedBtnBorder);
    }                                     

    private void sevenBtnMouseReleased(MouseEvent evt) {                                       
        seven.button.setBackground(clickedBtnCol);
        seven.button.setBorder(roundedBorder);
        seven();
    }

    private void seven() {
        if(Level.display.value == "0"){
            Level.display.value = "7";
        } else {
            Level.display.value += "7";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Eight Button Functions
    private void eightBtnMouseEntered(MouseEvent evt) {
        eight.button.setBackground(clickedBtnCol);
        eight.button.setBorder(enteredBtnBorder);
    }                                     

    private void eightBtnMouseExited(MouseEvent evt) { 
        eight.button.setBackground(btnCol);
        eight.button.setBorder(roundedBorder);
    }                                    

    private void eightBtnMousePressed(MouseEvent evt) { 
        eight.button.setBackground(clickedBtnCol);
        eight.button.setBorder(clickedBtnBorder);
    }                                     

    private void eightBtnMouseReleased(MouseEvent evt) {                                       
        eight.button.setBackground(clickedBtnCol);
        eight.button.setBorder(roundedBorder);
        eight();
    }

    private void eight() {
        if(Level.display.value == "0"){
            Level.display.value = "8";
        } else {
            Level.display.value += "8";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Nine Button Functions
    private void nineBtnMouseEntered(MouseEvent evt) {
        nine.button.setBackground(clickedBtnCol);
        nine.button.setBorder(enteredBtnBorder);
    }                                     

    private void nineBtnMouseExited(MouseEvent evt) { 
        nine.button.setBackground(btnCol);
        nine.button.setBorder(roundedBorder);
    }                                    

    private void nineBtnMousePressed(MouseEvent evt) { 
        nine.button.setBackground(clickedBtnCol);
        nine.button.setBorder(clickedBtnBorder);
    }                                     

    private void nineBtnMouseReleased(MouseEvent evt) {                                       
        nine.button.setBackground(clickedBtnCol);
        nine.button.setBorder(roundedBorder);
        nine();
    }

    private void nine() {
        if(Level.display.value == "0"){
            Level.display.value = "9";
        } else {
            Level.display.value += "9";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Period Button Functions
    private void periodBtnMouseEntered(MouseEvent evt) {
        period.button.setBackground(clickedBtnCol);
        period.button.setBorder(enteredBtnBorder);
    }                                     

    private void periodBtnMouseExited(MouseEvent evt) { 
        period.button.setBackground(btnCol);
        period.button.setBorder(roundedBorder);
    }                                    

    private void periodBtnMousePressed(MouseEvent evt) { 
        period.button.setBackground(clickedBtnCol);
        period.button.setBorder(clickedBtnBorder);
    }                                     

    private void periodBtnMouseReleased(MouseEvent evt) {                                       
        period.button.setBackground(clickedBtnCol);
        period.button.setBorder(roundedBorder);
        period();
    }

    private void period() {
        if(Level.display.value == "0"){
            Level.display.value = ".";
        } else {
            Level.display.value += ".";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Zero Button Functions
    private void zeroBtnMouseEntered(MouseEvent evt) {
        zero.button.setBackground(clickedBtnCol);
        zero.button.setBorder(enteredBtnBorder);
    }                                     

    private void zeroBtnMouseExited(MouseEvent evt) { 
        zero.button.setBackground(btnCol);
        zero.button.setBorder(roundedBorder);
    }                                    

    private void zeroBtnMousePressed(MouseEvent evt) { 
        zero.button.setBackground(clickedBtnCol);
        zero.button.setBorder(clickedBtnBorder);
    }                                     

    private void zeroBtnMouseReleased(MouseEvent evt) {                                       
        zero.button.setBackground(clickedBtnCol);
        zero.button.setBorder(roundedBorder);
        zero();
    }

    private void zero() {
        if(Level.display.value == "0"){
            Level.display.value = "0";
        } else {
            Level.display.value += "0";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    //OpenBracket Button Functions
    private void openBracketBtnMouseEntered(MouseEvent evt) {
        openBracket.button.setBackground(clickedBtnCol);
        openBracket.button.setBorder(enteredBtnBorder);
    }                                     

    private void openBracketBtnMouseExited(MouseEvent evt) { 
        openBracket.button.setBackground(btnCol);
        openBracket.button.setBorder(roundedBorder);
    }                                    

    private void openBracketBtnMousePressed(MouseEvent evt) { 
        openBracket.button.setBackground(clickedBtnCol);
        openBracket.button.setBorder(clickedBtnBorder);
    }                                     

    private void openBracketBtnMouseReleased(MouseEvent evt) {                                       
        openBracket.button.setBackground(clickedBtnCol);
        openBracket.button.setBorder(roundedBorder);
        openBracket();
    }

    private void openBracket() {
        if(Level.display.value == "0"){
            Level.display.value = "(";
        } else {
            Level.display.value += "(";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    //CloseBracket Button Functions
    private void closeBracketBtnMouseEntered(MouseEvent evt) {
        closeBracket.button.setBackground(clickedBtnCol);
        closeBracket.button.setBorder(enteredBtnBorder);
    }                                     

    private void closeBracketBtnMouseExited(MouseEvent evt) { 
        closeBracket.button.setBackground(btnCol);
        closeBracket.button.setBorder(roundedBorder);
    }                                    

    private void closeBracketBtnMousePressed(MouseEvent evt) { 
        closeBracket.button.setBackground(clickedBtnCol);
        closeBracket.button.setBorder(clickedBtnBorder);
    }                                     

    private void closeBracketBtnMouseReleased(MouseEvent evt) {                                       
        closeBracket.button.setBackground(clickedBtnCol);
        closeBracket.button.setBorder(roundedBorder);
        closeBracket();
    }

    private void closeBracket() {
        if(Level.display.value == "0"){
            Level.display.value = ")";
        } else {
            Level.display.value += ")";
        }
        Level.display.textArea.setText(Level.display.value);
    }
    
    
    //Equals Button Functions
    private void equalsBtnMouseEntered(MouseEvent evt) {
        equals.button.setBackground(clickedBtnCol);
        equals.button.setBorder(enteredBtnBorder);
    }                                     

    private void equalsBtnMouseExited(MouseEvent evt) { 
        equals.button.setBackground(btnCol);
        equals.button.setBorder(roundedBorder);
    }                                    

    private void equalsBtnMousePressed(MouseEvent evt) { 
        equals.button.setBackground(clickedBtnCol);
        equals.button.setBorder(clickedBtnBorder);
    }                                     

    private void equalsBtnMouseReleased(MouseEvent evt) {                                       
        equals.button.setBackground(clickedBtnCol);
        equals.button.setBorder(roundedBorder);
        equals();
    }

    private void equals() {
        Level.display.value = calculate(Level.display.value);
        Level.display.textArea.setText(Level.display.value);
    }
    
    

    private String calculate(String equation) {
        String answer = "";
        String equationType = "";
        String[] numbers;
        
        if(equation.isEmpty() || equation == "0" || equation == null) answer = "0";
        
        //BIDMAS
        //Brackets
        if(equation.contains("(")){
            numbers = equation.split("\\W");
        }
        //Indicies
        if(equation.contains(")")){
        }
        //Division
        if(equation.contains("/")){
            numbers = equation.split("/");
            equationType = "Division";
            if(numbers.length == 2){
                if(numbers[0].contains(".") || numbers[1].contains(".")){
                    double first = Double.parseDouble(numbers[0]);
                    double second = Double.parseDouble(numbers[1]);
                    double equalz = solve('/', first, second);
                    answer = String.valueOf(equalz);
                } else {
                    int first = Integer.parseInt(numbers[0]);
                    int second = Integer.parseInt(numbers[1]);
                    int equalz = solve('/', first, second);
                    answer = String.valueOf(equalz);
                }
            }
        }
        //Multiplication
        if(equation.contains("x")){
            numbers = equation.split("x");
            equationType = "Multiplication";
            if(numbers.length == 2){
                if(numbers[0].contains(".") || numbers[1].contains(".")){
                    double first = Double.parseDouble(numbers[0]);
                    double second = Double.parseDouble(numbers[1]);
                    double equalz = solve('*', first, second);
                    answer = String.valueOf(equalz);
                } else {
                    int first = Integer.parseInt(numbers[0]);
                    int second = Integer.parseInt(numbers[1]);
                    int equalz = solve('*', first, second);
                    answer = String.valueOf(equalz);
                }
            }
        }
        //Addition
        if(equation.contains("+")){
            numbers = equation.split("\\+");
            equationType = "Addition";
            if(numbers.length == 2){
                if(numbers[0].contains(".") || numbers[1].contains(".")){
                    double first = Double.parseDouble(numbers[0]);
                    double second = Double.parseDouble(numbers[1]);
                    double equalz = solve('+', first, second);
                    answer = String.valueOf(equalz);
                } else {
                    int first = Integer.parseInt(numbers[0]);
                    int second = Integer.parseInt(numbers[1]);
                    int equalz = solve('+', first, second);
                    answer = String.valueOf(equalz);
                }
            }
        }
        //Subtraction
        if(equation.contains("-")){
            numbers = equation.split("-");
            equationType = "Subtraction";
            
            if(numbers.length == 2){
                if(numbers[0].contains(".") || numbers[1].contains(".")){
                    double first = Double.parseDouble(numbers[0]);
                    double second = Double.parseDouble(numbers[1]);
                    double equalz = solve('-', first, second);
                    answer = String.valueOf(equalz);
                } else {
                    int first = Integer.parseInt(numbers[0]);
                    int second = Integer.parseInt(numbers[1]);
                    int equalz = solve('-', first, second);
                    answer = String.valueOf(equalz);
                }
            }
        }
        
        return answer;
    }
    
    private int solve(char op, int a, int b){
        switch (op){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
    
    private double solve(char op, double a, double b){
        switch (op){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
    
}

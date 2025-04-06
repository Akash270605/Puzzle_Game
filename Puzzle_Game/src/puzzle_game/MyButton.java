/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puzzle_game;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class MyButton extends JButton{
    private boolean isLastButton;
    
    public MyButton(){
        super();
        initUI();
    }
    
    public MyButton(Image image){
        super(new ImageIcon(image));
        
        initUI();
    }
    
    private void initUI(){
        isLastButton= false;
        BorderFactory.createLineBorder(Color.gray);
        
        addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(MouseEvent e){
                setBorder(BorderFactory.createLineBorder(Color.yellow));
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });               
    }
    
    public void setLastButton(){
        isLastButton= true;
    }
    
    public boolean isLastButton(){
        return isLastButton;
    }
}

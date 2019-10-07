package Tela;


import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
public class Player extends JLabel{
    public int x = 50, y = 50;    
    ImageIcon lastImage;
    ImageIcon walkR;
    ImageIcon standR;
    ImageIcon punchR;
    ImageIcon punchedR;
    ImageIcon walkL;
    ImageIcon standL;
    ImageIcon punchL;
    ImageIcon punchedL;
    public boolean wasPunched = false;;
    public int points = 0;
    public void setup(){
        walkR = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/walk.gif")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT)); 
        standR = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/stand.gif")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT)); 
        punchR = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/punch.png")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        punchedR = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/punched.png")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT));
         walkL = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/walk inverse.gif")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT)); 
        standL = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/stand inverse.gif")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT)); 
        punchL = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/punch inverse.png")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT)); 
        punchedL = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/punched inverse.png")).getImage().getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        setIcon(standR);
        lastImage = standR;
        setBounds(x, y, 90, 127);
    }
    
    public void moveLeft(){
     x--;
     lastImage = walkL;
     setIcon(walkL);
     setBounds(x, y, 90, 127);
    }
    
     public void moveRight(){
        x++; 
        lastImage = walkR;
        setIcon(walkR);
        setBounds(x, y, 90, 127);
    }
     
    public void moveUp(){
        y--;
        setBounds(x, y, 90, 127);
    }
    
    public void moveDown(){
         y++;
        setBounds(x, y, 90, 127);
    }
    
    public void punch(){
      if(lastImage == walkR || lastImage == standR || lastImage == punchR || lastImage == punchedR)
         setIcon(punchR);
      else
         setIcon(punchL); 
    }
    
    public void punched(){
      if(lastImage == walkR || lastImage == standR || lastImage == punchR || lastImage == punchedR)
         setIcon(punchedR);
      else
         setIcon(punchedL); 
      
      wasPunched = true;
    }
    
    public void stand(){
      if(lastImage == walkR || lastImage == standR || lastImage == punchR || lastImage == punchedR)
            setIcon(standR);
          else
            setIcon(standL);
         wasPunched = false;
    }
  
    

}
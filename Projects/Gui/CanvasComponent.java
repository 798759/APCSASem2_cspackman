import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class CanvasComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    private int xPos;
    private int yPos;
    private int width;
    private int height; 
    private int mouseFromX;
    private int mouseFromY;
    private boolean shapeSelected;
    public CanvasComponent(int w, int h)
    {
    width=w;
    height=h;
    setSize(width,height);   
    xPos=150;
    yPos=150;
    
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.green);
        g.fillRect(width, height, xPos, yPos);
    }
    // public boolean mousePressed(MouseEvent e){
        // mouseFromX=e.getX();
        // mouseFromY=e.getY();
        // if(mouseFromX<xPos&&mouseFromY<mouseFromY){
            // return shapeSelected=true;
        // }else{
            // return shapeSelected=false;
        // }
    
    public void mouseClicked(MouseEvent e){
    }
    /**
     * Method mousePressed
     *
     * @param e A parameter
     */
    public void mousePressed(MouseEvent e){
        mouseFromX=e.getX();
        mouseFromY=e.getY();
       if(mouseFromX<xPos&&mouseFromY<mouseFromY){
              shapeSelected=true;
       }else{
              shapeSelected=false;
        }
        if(shapeSelected==true){
        System.out.println("hi");
    }
    }
    public void mouseReleased(MouseEvent e){
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
    public void mouseMoved(MouseEvent e){
    }
    public void mouseDragged(MouseEvent e){
    }
    
}

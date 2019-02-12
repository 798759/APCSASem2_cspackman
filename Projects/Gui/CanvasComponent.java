import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class CanvasComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener
{
    private int xPos;
    private int yPos;
    private int width;
    private int height; 
    private int mouseFromX;
    private int mouseFromY;
    private boolean shapeSelected;
    private int mouseToX;
    private int mouseToY;
    private int colorR;
    private int colorG;
    private int colorB;
    private int animationDeltaX;
    private int animationDeltaY;
    private int gutterX;
    private int gutterY;
    private int rectWidth;
    private int rectHeight;
    public CanvasComponent(int w, int h)
    {
        width=w;
        height=h;
        setSize(width,height);   
        xPos=150;
        yPos=150;
        rectWidth=90;
        rectHeight=100;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        colorR=(int)(Math.random()*189)+66;
        colorG=(int)(Math.random()*155)+100;
        colorB=(int)(Math.random()*55)+200;
        animationDeltaX = 1;
        animationDeltaY =0;
        gutterX =10;
        gutterY=10;

    }
    public void paintComponent(Graphics g){
        //colorR=(int)(Math.random()*189)+66;
        //colorG=(int)(Math.random()*155)+100;
        //colorB=(int)(Math.random()*55)+200;
        //System.out.println(colorR);
        //System.out.println(colorG);
        //System.out.println(colorB);
        Color nc = new Color(colorR,colorG,colorB);
        g.setColor(nc);
        g.fillRect(xPos,yPos, rectWidth, rectHeight);
    }
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

    }
    public void mouseReleased(MouseEvent e){
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
    }
    public void mouseMoved(MouseEvent e){
    }
    public void actionPerformed(ActionEvent e){
          Dimension componentSizeDimension= getSize();
          if(xPos+yPos+gutterX>width){
             xPos=rectWidth-gutterX;
             animationDeltaY=1;
             animationDeltaX=0;
             rectHeight+=animationDeltaY;
           }
           if(xPos+yPos+gutterY>height){
             xPos=rectWidth-gutterX;
             animationDeltaY=0;
             animationDeltaX=-1;
             rectHeight+=animationDeltaY;
           }
    }
    public void mouseDragged(MouseEvent e){
        mouseToX=e.getX();
        mouseToY=e.getY();
        xPos=mouseToX;//-mouseFromX;
        yPos=mouseToY;//-mouseFromY;
        repaint();
    }
}

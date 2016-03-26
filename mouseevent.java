import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="mouseevent.class" height=200 width=200>
</applet>*/
public class mouseevent extends Applet implements MouseListener,MouseMotionListener,KeyListener
{ 
    String msg="";
    public void init()
    {
      
      addMouseListener(this);
      addMouseMotionListener(this);
      addKeyListener(this);
      setBackground(Color.CYAN);
    }
    public void mousePressed(MouseEvent evt)
    {
        evt.getX();
        evt.getY();
        showStatus(" mouse is pressed "+evt);
        repaint();
    }
    public void mouseReleased(MouseEvent evt)
    {
       showStatus(" mouse released ");
    }
    public void mouseClicked(MouseEvent evt)
    {
       showStatus(" mouse clicked ");
    }
    public void mouseEntered(MouseEvent evt)
    {
       showStatus(" mouse entered ");
    }
    public void mouseExited(MouseEvent evt)
    {
       showStatus(" mouse exited ");
    }
    public void mouseDragged(MouseEvent evt)
    {
       msg=" mouse dragged "+evt;
       repaint();       
    }
    public void mouseMoved(MouseEvent evt)
    { 
       msg=" mouse moved ";
       repaint();
    }
    public void keyPressed(KeyEvent ke)
    {
       showStatus("key pressed");
      
    }
    public void keyReleased(KeyEvent ke)
    {
        msg=" key released ";
        repaint();
    }
    public void keyTyped(KeyEvent ke)
    {
       msg=" key typed is "+ke.getKeyChar();
       repaint();
    }
    public void paint(Graphics g)
    {
         g.drawString(msg,20,20);
    }
  } 
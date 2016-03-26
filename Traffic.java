import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="Traffic.class" width=200 height=200>
</applet>
*/
public class Traffic extends Applet implements ActionListener
{
   Button b1,b2,b3;
   int i;
   public void init()
   {
      b1=new Button("red");                            
      b2=new Button("yellow");
      b3=new Button("green");
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      add(b1);
      add(b2);
      add(b3);
   }
   public void actionPerformed(ActionEvent ae)
   {
     
       if(ae.getActionCommand()=="red")
       {
           i=1;
       }
       else if(ae.getActionCommand()=="yellow")
       {
          i=2;
       }
       else if(ae.getActionCommand()=="green")
       {
           i=3;
       }
         repaint();
  } 
     

      public void paint(Graphics g)
      {
        g.setColor(Color.BLACK);
	g.drawRect(100,100,150,300);
	g.fillRect(100,100,150,300);
        g.drawOval(150,150,50,50);
        g.drawOval(150,250,50,50);
        g.drawOval(150,350,50,50);
        g.setColor(Color.BLACK);
	g.drawLine(175,250,175,900);
       if(i==1)
       { 
         g.setColor(Color.red);  
         g.fillOval(150,150,50,50);
       }
       else if(i==2)
       {
         g.setColor(Color.yellow);  
         g.fillOval(150,250,50,50);        
       }
       else if(i==3)
       {
          g.setColor(Color.green);  
          g.fillOval(150,350,50,50);     
       }
     }
 }            
import java.applet.*;
import java.awt.*;
import java.io.*;
/*<applet code="Draw.class" width=200 height=200>
  </applet>*/
public class Draw extends Applet
{
    int x;
     public  void init()throws IOException
     {
        System.out.println("1.Oval 2.line 3.rect ");    
        DataInputStream dis=new DataInputStream(System.in);
        x=Integer.parseInt(dis.readLine());
       do
       {
        switch(x)
        {
          case 1:
               repaint();
          case 2:
               repaint();
          case 3:
               repaint();
         }
       
       }while(x!=4);
   }
   public void paint(Graphics g)
   {
     
             
       if(x==1)
       {
               g.drawOval(150,150,50,50);
               g.setColor(Color.RED);
               g.fillOval(150,150,50,50);
       }
       else if(x==2)
       {        
               g.drawLine(150,150,50,0);
               g.setColor(Color.RED);
       }
       else if(x==3)
       {
               g.drawRect(150,150,50,50);
               g.setColor(Color.RED);
               g.fillRect(150,250,50,50);
       }
    }
}

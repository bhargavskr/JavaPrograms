import java.applet.*;
import java.awt.*;
/*<applet code="App1.class" height=400 width=400>
</applet>*/
public class App1 extends Applet
{	String s=new String();
	public void init()
	{
          System.out.println("created");	
	  s=s+"My First Applet Program";
	}
        public void start()
        {
           System.out.println("start");
        }
        public void stop()
        {
           System.out.println("stop");
        }
        public void destroy()
        {
           System.out.println("destroyed");
        }
	public void paint(Graphics g)	
	{
		g.drawString(s,100,100);
	}
}

import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="Appq12.class" height=310 width=400>
</applet>*/
public class Appq12 extends Applet implements ActionListener
{
	Button b[]=new Button[10];
	int in;
	public void init()
	{
		b[0]=new Button("Line");
		b[1]=new Button("Rectangle");
		b[2]=new Button("FilledRectangle");
		b[3]=new Button("RoundedRectangle");
		b[4]=new Button("FilledRoundedRectangle");
		b[5]=new Button("Oval");
		b[6]=new Button("FilledOval");
		b[7]=new Button("Arc");
		b[8]=new Button("FilledArc");
		b[9]=new Button("Polygon");
		for(int i=0;i<10;i++)
		{
			add(b[i]);
			b[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		for(int j=0;j<10;j++)
		{
			if(ae.getSource()==b[j])
			{
				in=j+1;
				break;
			}
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		if(in==1)
			g.drawLine(150, 150, 250, 300);
		if(in==2)
			g.drawRect(150, 150, 60, 50);
		if(in==3)
			g.fillRect(150,150, 60, 50);
		if(in==4)
			g.drawRoundRect(150, 150, 60, 50, 15, 15);
		if(in==5)
			g.fillRoundRect(150, 150, 60, 50, 15, 15);
		if(in==6)
			g.drawOval(150, 150, 60, 50);
		if(in==7)
			g.fillOval(150, 150, 60, 50);
		if(in==8)
			g.drawArc(150, 150, 60, 50, 0, 75);
		if(in==9)
			g.fillArc(150, 150, 60, 50, 0, 75);
		if(in==10)
		{
			int xpoints[] = {50, 200,250, 250,200};
			int ypoints[] = {250, 200,250, 300,300};
			int num = 5;
			g.drawPolygon(xpoints, ypoints, num);
		}
	}
}
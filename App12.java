import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="App2.class" height=600 width=600>
</applet>*/
public class App2 extends Applet implements ActionListener
{
	TextField t1,t2;
	Button b;
	Label l1,l2;
	int a,fact;
	public void init()
	{	l1=new Label("Enter a number",Label.LEFT);
		l2=new Label("Result",Label.RIGHT);
		t1=new TextField(5);
		t2=new TextField(10);
		b=new Button("Compute");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{	a=Integer.parseInt(t1.getText());
		fact=1;
		if(a<0)
		{
			t2.setText("Wrong input");
		}
		else
		{
			for(int i=a;i>1;i--)
				fact*=i;
		}
		t2.setText(""+fact);
		//repaint();
	}
}
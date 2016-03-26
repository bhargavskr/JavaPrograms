import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="Division.class" width=200 height=200>
 </applet>
*/
public class Division extends Applet implements ActionListener
{
  TextField t1,t2,t3;
  Label l1,l2,l3;
  int a;
  int b;
  double res;

  Button b1;
 public void init()
 {
  
   l1=new Label(" num1 ",Label.LEFT);
   l2=new Label(" num2 ",Label.LEFT);
   l3=new Label(" result ",Label.LEFT);
   t1=new TextField(20);
   t2=new TextField(20);
   t3=new TextField(20);
   add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(l3);
   add(t3);
   b1=new Button("compute");
   b1.addActionListener(this);
   add(b1);
}
public void actionPerformed(ActionEvent ae)
{
   try
    {
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        res=a/b;
        t3.setText(""+res);
    }
    catch(NumberFormatException nfe)
    {
        t3.setText(" numberformatexception ");
    }
    catch(ArithmeticException a)
    {
        t3.setText(" arithmetic exception ");
    }		
  }
}  
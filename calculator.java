
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="Calculator.class" width=200 height=200>
 </applet>
*/
public class Calculator extends Applet implements ActionListener
{
TextField t1;
String a="";
String oper="";
int first=0,result=0;
Panel p1;
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
Button add,sub,mul,div,mod,res,space;
public void init()
{
Panel p2,p3;
p1=new Panel();
p2=new Panel();
p3=new Panel();
t1=new TextField(a,20);
p1.setLayout(new BorderLayout());
p2.add(t1);
b0=new Button("0");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
add=new Button("+");
sub=new Button("-");
mul=new Button("*");
div=new Button("/");
mod=new Button("%");
res=new Button("=");
space=new Button("c");
p3.setLayout(new GridLayout(4,4));
b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
mod.addActionListener(this);
res.addActionListener(this);
space.addActionListener(this);
p3.add(b0);
p3.add(b1);
p3.add(b2);
p3.add(b3);
p3.add(b4);
p3.add(b5);
p3.add(b6);
p3.add(b7);
p3.add(b8);
p3.add(b9);
p3.add(add);
p3.add(sub);
p3.add(mul);
p3.add(div);
p3.add(mod);
p3.add(res);
p3.add(space);
p1.add(p2,BorderLayout.NORTH);
p1.add(p3,BorderLayout.CENTER);
add(p1);
}
public void actionPerformed(ActionEvent ae)
{
a=ae.getActionCommand();
if(a=="0"||a=="1"||a=="2"||a=="3"||a=="4"||a=="5"||a=="6"||a=="7"||a=="8"||
a=="9")
{
  t1.setText(t1.getText()+a);
}
if(a=="+"||a=="-"||a=="*"||a=="/"||a=="%")
{
   first=Integer.parseInt(t1.getText());
   oper=a;
   t1.setText("");
} 
if(a=="=")
{
  if(oper=="+")
  result=first+Integer.parseInt(t1.getText());
  if(oper=="-")
  result=first-Integer.parseInt(t1.getText());
  if(oper=="*") 
  result=first*Integer.parseInt(t1.getText());
  if(oper=="/")
  result=first/Integer.parseInt(t1.getText());
  if(oper=="%")
  result=first%Integer.parseInt(t1.getText());
   t1.setText(result+"");
}
 if(a=="c")
t1.setText("");
}
}

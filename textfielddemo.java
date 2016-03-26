import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="textfielddemo.class" width=400 height=400>
</applet>
*/
public class textfielddemo extends Applet implements ActionListener
{
   TextField name,pass;
   public void init()
   {
         Label namep=new Label("name:",Label.RIGHT);
         Label passp=new Label("password:",Label.RIGHT);
         name= new TextField(12);
         pass=new TextField(8);
         pass.setEchoChar('*');
         add(namep);
         add(name);
         add(passp);
         add(pass);
         name.addActionListener(this);
         pass.addActionListener(this);
    }
   public void actionPerformed(ActionEvent ae)
   {
        repaint();
   }
    public void paint(Graphics g)
    {
        g.drawString("name:"+name.getText(),6,60);
        g.drawString("selected text in name:"+name.getSelectedText(),6,70);
        g.drawString("password:"+pass.getText(),6,80);
    }
}
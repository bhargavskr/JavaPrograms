import javax.swing.*;

import java.awt.*;
/*<applet code="Appq13b.class" height=310 width=400>
</applet>*/	
Public class Appq13b extends JApplet
{
Public void init()
{
Container contentpane=getContentPane();
Contentpane.setLayout(new BorderLayout());
Final String[] colheads={“Name”,”Phone”,”Fax”};
Final object[][]data={{“vijay”,”1234”,”1234”},
   			{“Vinod”,”3456”,”3456”},
 			{“siva”,”1256”,”1256”}};
Jtable table=new Jtable(data,colheads);
Int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
Int h=ScrollPaneConstants.HORIZANTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp=new JSCrollpane(table,v,h);
contentPane.add(jsp,BorderLayout.CENTER);
}
}
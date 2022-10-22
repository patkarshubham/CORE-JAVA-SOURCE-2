import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ColorButton extends JFrame
{
  JPanel pa=new JPanel();
  JButton b1=new JButton("Red");
  JButton b2=new JButton("Green");
  JButton b3=new JButton("Blue");
  JButton b4=new JButton("Black");
  public ColorButton()
  {
      super("Event Handling");
      setSize(500,500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      add(pa);
      pa.add(b1);
      pa.add(b2);
      pa.add(b3);
      pa.add(b4);
      ColorListener listener=new ColorListener();
      b1.addActionListener(listener);
      b2.addActionListener(listener);
      b3.addActionListener(listener);
      b4.addActionListener(listener);
      setVisible(true);
  }
  class ColorListener implements ActionListener
  {
   public void actionPerformed(ActionEvent evt)
    {
      JButton bc=(JButton)evt.getSource();  
      if(bc==b1)
       pa.setBackground(Color.red);
      if(bc==b2)
       pa.setBackground(Color.green);
      if(bc==b3)
       pa.setBackground(Color.blue);
      if(bc==b4)
       pa.setBackground(Color.black);
    }
  }
 public static void main(String []args)
  {
    new ColorButton();
  }
}
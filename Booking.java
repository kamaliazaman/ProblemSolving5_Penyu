/**
 * @author PENYU
 * Title: Sample Java awt
 * Date Modified: 19/04/2020
 * File Name: Booking.java
 */



import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Booking extends Frame implements ActionListener
{String msg;
  Button b1=new Button("Submit");
  Label l11=new Label("Booking Form");
  Label l1=new Label("Name:",Label.LEFT);
  Label l3=new Label("Gender(M/F):",Label.LEFT);
  Label l4=new Label("Address:",Label.LEFT);
  Label l5=new Label("Facility:",Label.LEFT);
  Label l6=new Label("Capacity:",Label.LEFT);
  Label l7=new Label("");
  Label l8=new Label(" ");

  TextField t1=new TextField(); // textbox for name
  //Choice c1=new Choice(); //create object for age, facility and quantity
  CheckboxGroup cbg=new CheckboxGroup(); //creat object for more option
  Checkbox ck1=new Checkbox("Male",false,cbg);
  Checkbox ck2=new Checkbox("Female",false,cbg);
  TextArea t2=new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY); // textarea for address
  TextField t3=new TextField(); // textbox for phone number
  Choice facility=new Choice();
  Choice capacity=new Choice();

public Booking()
 {addWindowListener(new bookingWindowAdapter());
  setBackground(Color.white);
  setForeground(Color.black);
  setLayout(null);
  add(l11);
  add(l1);
  add(l3);
  add(l4);
  add(l5);
  add(l6);
  add(l7);
  add(t1);
  add(t2);
  add(ck1);
  add(ck2);
  add(facility);
  add(capacity);
  add(b1);
  add(l8);
  b1.addActionListener(this);
  add(b1);
  facility.add("Badminton Court");
  facility.add("Lecture Room");
  facility.add("Meeting Room");
  facility.add("Seminar Room");
  capacity.add("10-100");
  capacity.add("101-300");
  capacity.add("301-600");
  capacity.add("601-900");
  capacity.add("1000 above");
  l1.setBounds(25,65,90,20);
  l3.setBounds(25,120,90,20);
  l4.setBounds(25,185,90,20);
  l5.setBounds(25,260,90,20);
  l6.setBounds(25,290,90,20);
  l7.setBounds(25,260,90,20);
  l11.setBounds(10,40,280,20);
  t1.setBounds(120,65,170,20);
  t2.setBounds(120,185,170,60);
  ck1.setBounds(120,120,50,20);
  ck2.setBounds(170,120,60,20);
  facility.setBounds(120,260,100,20);
  capacity.setBounds(120,290,50,20);
  b1.setBounds(120,350,50,30);
}
public void paint(Graphics g)
{g.drawString(msg,200,450);}
public void actionPerformed(ActionEvent ae)
{
  l8.setText(t1.getText());
  if(ae.getActionCommand().equals("Submit"))
  {msg="Yours booking has been submitted. Any inquiries please call 07-4665421. Thank you.";
   setForeground(Color.red); }
}
public static void main(String g[])
{Booking stu=new Booking();
 stu.setSize(new Dimension(500,500));
 stu.setTitle("Booking Form -  Using Java AWT(Sample Coding)");
 stu.setVisible(true);
}
}
 class bookingWindowAdapter extends WindowAdapter
{public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}
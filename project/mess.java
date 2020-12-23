import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.*;
class mess
{
     static   JFrame jf2;
    JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;    
    mess()
      {
         jf2=new JFrame();
         jf2.setBounds(0,200,1370,570);
         jf2.setLayout(null);
         jf2.setUndecorated(true);
         jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
  Container c=jf2.getContentPane();
          c.setBackground( Color.pink);
    
      jf2.setAlwaysOnTop(true);                 
  
         JPanel jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf2.add(jp1);
         jp1.setBounds(20,0,1330,570); 
     
                         JButton   jb2 =new JButton("BACK");
    jb2.setBounds(1000,500,100,20);
   jp1.add(jb2);      

	jl=new JLabel("  Mess Facility");
	jl.setBounds(10,30,1130,50);
	jp1.add(jl);
                     jl.setFont(new Font("Courier",Font.BOLD,40));                  
jl2=new JLabel("> A large Mess Hall with a capacity of 2000 members to dine at the same time enables all students and staff to have lunch and breakfast.  A large modem kitchen with steam cooking is ");
	jl2.setBounds(10,80,1130,30);
	jp1.add(jl2);
                   jl3=new JLabel("  is attached to the mess hall. A modem bakery and ice-cream making unit are attached to the mess. There is a separate floor one each  for Vegetarian and Non-Vegetarian in the");
	jl3.setBounds(10,105,1130,30);
	jp1.add(jl3);
                   jl4=new JLabel("Mess Block to dine.  ");
	jl4.setBounds(10,130,1130,30);
	jp1.add(jl4);
                   jl5=new JLabel("+       Exclusive uninterrupted study room for students after college hours ");
	jl5.setBounds(10,470,1130,30);
	jp1.add(jl5);
                   jl6=new JLabel("+      Uninterrupted power supply , separate Generator for Students");
	jl6.setBounds(10,490,1130,30);
	jp1.add(jl6);
                   jl7=new JLabel("+      Banking Facility with ATM counter");
	jl7.setBounds(10,510,1130,30);
	jp1.add(jl7);
                   jl8=new JLabel("+       Medical facility available with free medicines provided to sick students");
	jl8.setBounds(10,530,1130,30);
	jp1.add(jl8);
                   jl9=new JLabel("+      Medical Lab facility also available. ");
	jl9.setBounds(10,550,1130,30);
	jp1.add(jl9);
                   jl10=new JLabel("+      Mineral water provided to all the rooms");
	jl10.setBounds(10,570,1130,30);
	jp1.add(jl10);
                   jl11=new JLabel("+     Open Air Theater - programes on every weekends");
	jl11.setBounds(10,590,1130,30);
	jp1.add(jl11);
                   jl12=new JLabel("+     Well equipped Gym ( Boys and Girls separately)");
	jl12.setBounds(10,610,1130,30);
	jp1.add(jl12);
jl.setForeground(Color.white); 
jl2.setForeground(Color.white); 
jl3.setForeground(Color.white); 
jl4.setForeground(Color.white); 
jl5.setForeground(Color.white); 
jl6.setForeground(Color.white); 
jl7.setForeground(Color.white); 
jl8.setForeground(Color.white); 
jl9.setForeground(Color.white); 
jl10.setForeground(Color.white); 
jl11.setForeground(Color.white); 
jl12.setForeground(Color.white); 

jb2.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     
                          try
                         { 
                      jf2.dispose();                                          
                   }catch(Exception e){System.out.println(e);}                       
                 }      	
         });

       ImageIcon ic = new ImageIcon("mess.jpg");

        Image im = ic.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(100,160,400,300);

        jp1.add(l);


ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf2.add(l12);


 
jf2.setVisible(true);
}

public static void main (String[] arg )
 { 
new mess();
}
}      
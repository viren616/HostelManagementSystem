import java.awt.*;
import java.awt.Image;

import java.util.*;
import java.awt.event.*;

import javax.swing.*;
class hostelfas 
{
   static     JFrame jf;
JLabel jlx,jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;    
    hostelfas()
      {
         jf=new JFrame();
         jf.setBounds(250,200,1200,570);
        jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jf.setAlwaysOnTop(true);                 
 
        JPanel jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf.add(jp1);
         jp1.setBounds(20,0,1080,570); 
   
                   JButton   jb2 =new JButton("<<BACK");
                   jb2.setBounds(970,500,100,20);
                   jp1.add(jb2);  
          

                    jlx=new JLabel("  Hostel Facilities");
	jlx.setBounds(10,30,1130,30);
                    jlx.setForeground(Color.white);
	  jp1.add(jlx);
                   jlx.setFont(new Font("Dialog",Font.BOLD,40));
                   jl=new JLabel(">     We provide Excellent Hostel Facilities");
	jl.setBounds(10,70,1130,30);
                    jl.setForeground(Color.white);
  	jp1.add(jl);
                     jl2=new JLabel(">  Spacious rooms with attached bath are available for both Boys and Girls.");
	jl2.setBounds(10,350,1130,30);
  	jp1.add(jl2);                     
                    jl2.setForeground(Color.white);
                   jl3=new JLabel(" >  Following facilities are provided in the Hoste ");
	jl3.setBounds(10,380,1130,30);
	  jp1.add(jl3);
                    jl3.setForeground(Color.white);
                   jl4=new JLabel("+  STD / ISD  Telephone Facilities are available ");
	jl4.setBounds(10,410,1130,30);
  	jp1.add(jl4);
                    jl4.setForeground(Color.white);
                   jl5=new JLabel("+  Exclusive uninterrupted study room for students after college hours ");
  	jl5.setBounds(10,440,1130,30);
	jp1.add(jl5);
                    jl5.setForeground(Color.white);
                   jl6=new JLabel("+  Uninterrupted power supply , separate Generator for Students");
  	jl6.setBounds(10,470,1130,30);
	jp1.add(jl6);
                    jl6.setForeground(Color.white);
                   jl7=new JLabel("+      Banking Facility with ATM counter");
  	jl7.setBounds(10,500,1130,30);
	jp1.add(jl7);
                    jl7.setForeground(Color.white);
                   jl8=new JLabel("+       Medical facility available with free medicines provided to sick students");
	jl8.setBounds(10,530,1130,30);
  	jp1.add(jl8);
                    jl8.setForeground(Color.white);
                   jl9=new JLabel("+      Medical Lab facility also available. ");
	jl9.setBounds(10,550,1130,30);
  	jp1.add(jl9);
                    jl9.setForeground(Color.white);
                   jl10=new JLabel("+      Mineral water provided to all the rooms");
	jl10.setBounds(10,570,1130,30);
  	jp1.add(jl10);
                    jl10.setForeground(Color.white);
                   jl11=new JLabel("+     Open Air Theater - programes on every weekends");
	jl11.setBounds(10,590,1130,30);
  	jp1.add(jl11);
	 jl11.setForeground(Color.white);
                   jl12=new JLabel("+     Well equipped Gym ( Boys and Girls separately)");
	jl12.setBounds(10,610,1130,30);
	jp1.add(jl12);
                    jl12.setForeground(Color.white);
  

jb2.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     
                          try
                        { 
      openform. jb.setVisible(true);
      openform.  jb1.setVisible(true);
      openform.jb2.setVisible(true);
      openform.jb3.setVisible(true);
      openform.jb4.setVisible(true);
      openform.jb5.setVisible(true);
      running.jf.setVisible(true);   
        Project.jf.setVisible(true);            
                     jf.dispose();                                          
                   facilities.jf2.dispose();
                   }catch(Exception e){System.out.println(e);}                       
                 }      	
         });


       ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);



        ImageIcon ic = new ImageIcon("hostelfas.jpg");

        Image im = ic.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(350,40,400,300);

        jp1.add(l);


 
jf.setVisible(true);
}
public static void main (String[] arg )
 { 
new hostelfas();
}
}      
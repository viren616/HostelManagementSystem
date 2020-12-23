import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.*;
class health
{
      static  JFrame jf2;
       JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;    
    health()
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
                 jb2.setBounds(1000,450,100,20);
                                jp1.add(jb2);      

 	jl=new JLabel("   Health & Fitness Center");
	jl.setBounds(10,30,1130,30);
	jp1.add(jl);
                    jl.setForeground(Color.white);
                     jl.setFont(new Font("Dialog",Font.BOLD,40));                  
	jl2=new JLabel(">       Full Time Medical officers are available in the Campus to take care of students.");
	jl2.setBounds(10,80,1130,30);
	jl2.setForeground(Color.white);
                 jp1.add(jl2);
                   jl3=new JLabel(" >    Following facilities are provided in the Hoste ");
	jl3.setBounds(10,420,1130,30);
                     jl3.setForeground(Color.white);
 	jp1.add(jl3);
                   jl4=new JLabel("+      STD / ISD  Telephone Facilities are available ");
	jl4.setBounds(10,450,1130,30);
	jl4.setForeground(Color.white);
                    jp1.add(jl4);
                   jl5=new JLabel("+       Exclusive uninterrupted study room for students after college hours ");
	jl5.setBounds(10,470,1130,30);
	jl5.setForeground(Color.white);
                   jp1.add(jl5);
	 jl6=new JLabel("+      Uninterrupted power supply , separate Generator for Students");
	jl6.setBounds(10,490,1130,30);
	jl6.setForeground(Color.white);
 	jp1.add(jl6);
                   jl7=new JLabel("+      Banking Facility with ATM counter");
	jl7.setBounds(10,510,1130,30);
	jl7.setForeground(Color.white);
 	jp1.add(jl7);
                   jl8=new JLabel("+       Medical facility available with free medicines provided to sick students");
	jl8.setBounds(10,530,1130,30);
	jl8.setForeground(Color.white);
 	jp1.add(jl8);
                   jl9=new JLabel("+      Medical Lab facility also available. ");
	jl9.setBounds(10,550,1130,30);
	jl9.setForeground(Color.white);
 	jp1.add(jl9);
                   jl10=new JLabel("+      Mineral water provided to all the rooms");
	jl10.setBounds(10,570,1130,30);
	jl10.setForeground(Color.white);
 	jp1.add(jl10);
                   jl11=new JLabel("+     Open Air Theater - programes on every weekends");
	jl11.setForeground(Color.white);
 	jl11.setBounds(10,590,1130,30);
	jp1.add(jl11);
                   jl12=new JLabel("+     Well equipped Gym ( Boys and Girls separately)");
	jl12.setForeground(Color.white);
 	jl12.setBounds(10,610,1130,30);
	jp1.add(jl12);

       ImageIcon ic = new ImageIcon("health.jpg");

        Image im = ic.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(100,120,400,300);

        jp1.add(l);



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
new health();
}
}      
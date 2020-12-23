import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.*;
class internet
{
      static  JFrame jf2;
       JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;    
    internet()
      {
         jf2=new JFrame();
         jf2.setBounds(0,200,1370,570);
         jf2.setLayout(null);
         jf2.setUndecorated(true);
         jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf2.setAlwaysOnTop(true);                 
  
           JPanel jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf2.add(jp1);
         jp1.setBounds(20,0,1330,570); 
   
        JButton   jb2 =new JButton("BACK");
    jb2.setBounds(1000,500,100,20);
   jp1.add(jb2);      

 	jl=new JLabel("  Internet");
	jl.setBounds(10,30,1130,30);
	jp1.add(jl);
                   jl.setFont(new Font("Courier",Font.BOLD,40));                  
   jl2=new JLabel(">We have dedicated Internet Leased line of 155 Mbps and a redundancy link of 100 Mbps, connected to all the terminals throughout the Campus. Students and faculty are free to access internet .");
	jl2.setBounds(10,80,1130,30);
	jp1.add(jl2);
                   jl3=new JLabel(" This helps the students to prepare papers on the latest technologies to be presented in various symposiums and seminars.");
	jl3.setBounds(10,105,1130,30);
	jp1.add(jl3);
                   jl4=new JLabel("Interested students who are willing to go abroad for further studies can take up tests such as GRE and TOEFL, take up online mock test and also browse through websites of various universities ");
	jl4.setBounds(10,150,1130,30);
	jp1.add(jl4);
                   jl5=new JLabel("and centres of higher education around the world. The access speed enables the Students and Staff to download and upload files at a fast rate. ");
	jl5.setBounds(10,175,1130,30);
	jp1.add(jl5);
                    jl5.setForeground(Color.white);
  	jl6=new JLabel("Wi-Fi Facility is also been provided in our hostels as well as in our central library.");
	jl6.setBounds(10,220,1130,30);
	jp1.add(jl6);
                    jl6.setForeground(Color.white);
                                       jl.setForeground(Color.white);
                      jl2.setForeground(Color.white);
                      jl3.setForeground(Color.white);
                      jl4.setForeground(Color.white);
  
       ImageIcon ic = new ImageIcon("wifi.png");

        Image im = ic.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(100,130,400,300);

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
new internet();
}
}      
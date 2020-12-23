import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
class transportation
{
       static JFrame jf2;
JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;    
        transportation()
      {
         jf2=new JFrame();
         jf2.setBounds(0,200,1370,570);
         jf2.setLayout(null);
         jf2.setUndecorated(true);
         jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         jf2.setAlwaysOnTop(true);                 
      
   
              
                  JButton   jb2 =new JButton("BACK");
                  jb2.setBounds(1000,450,100,20);
                  jf2.add(jb2);      

 	jl=new JLabel("  Bank and ATM");
	jl.setBounds(10,30,1130,30);
	jf2.add(jl);
        jl.setForeground(Color.white);
	jl.setFont(new Font("Courier",Font.BOLD,40));
       	jl2=new JLabel(">We have an Indian Bank Extension Counter at our Campus. This helps all our Students and Faculty to open a bank account and make transactions safer and faster. We have ATM facility.");
	jl2.setBounds(10,80,1130,30);
	jf2.add(jl2);
	jl2.setForeground(Color.white);
                     
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

        ImageIcon ic = new ImageIcon("sbi.jpg");

        Image im = ic.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(100,140,400,300);

        jf2.add(l);


	
	ImageIcon ic1=new ImageIcon("bc.jpg");
	Image im1=ic1.getImage().getScaledInstance(1370,570,Image.SCALE_SMOOTH);
	ic1=new ImageIcon(im1);
	JLabel l1=new JLabel(ic1);
	l1.setBounds(0,0,1370,570);
	jf2.add(l1); 

jf2.setVisible(true);
}

public static void main (String[] arg )
 { 
new transportation();
}
}



      
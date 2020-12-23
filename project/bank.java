import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.*;
class bank
{
      static  JFrame jf2;
JLabel jl,jl1,jl2,jl3,jl4;    
    bank()
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

 	jl=new JLabel("  Bank and ATM");
	jl.setBounds(10,30,1130,30);
	jp1.add(jl);
                     jl.setFont(new Font("Dialog",Font.BOLD,40));
                    jl.setForeground(Color.white);
  jl2=new JLabel(">We have ATM facility.We have an Indian Bank Extension Counter at our Campus. This helps all our Students and Faculty to open a bank account and make transactions safer and faster. ");
	jl2.setBounds(10,80,1130,30);
	jp1.add(jl2);
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

        l.setBounds(150,140,400,300);

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
new bank();
}
}
      
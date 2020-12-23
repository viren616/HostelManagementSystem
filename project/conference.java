import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
class conference
{
      static  JFrame jf2;
      JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;    
    
 conference()
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
                  jb2.setBounds(1000,450,100,20);
                  jp1.add(jb2);      
                 
 	jl=new JLabel(" Conference Halls");
	jl.setBounds(10,30,1130,30);
	jp1.add(jl);
                   jl.setForeground(Color.white);
                   jl.setFont(new Font("Dialog",Font.BOLD,40));
                   jl2=new JLabel(">Four Open Air Theaters  of 6500 sq.ft. each and three conference halls of 4000 sq.ft.");
	jl2.setBounds(10,80,1130,30);
                   jl2.setForeground(Color.white);
   	jp1.add(jl2);                      
                   jl3=new JLabel(">All A/c halls are equipped with the latest teaching aids like LCD projector, slide projector and over head projector.");
	jl3.setBounds(10,110,1130,30);
                   jl3.setForeground(Color.white);
  	jp1.add(jl3);           
                   jl4=new JLabel(">Conference halls are for conducting guest lectures symposiums, seminars, placement Training programs ., etc.");
	jl4.setBounds(10,140,1130,30);
	jl4.setForeground(Color.white);
  	 jp1.add(jl4);
                   jl5=new JLabel(">Educational cassettes are also projected in these theatres in consultation with subject staff.");
	jl5.setBounds(10,170,1130,30);
                    jl5.setForeground(Color.white);
  	jp1.add(jl5);
                   jl6=new JLabel(">Movies are also screened in the theatre for hostel students on holidays.");
	jl6.setBounds(10,200,1130,30);
	jp1.add(jl6);
                    jl6.setForeground(Color.white);
  

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

       ImageIcon ic = new ImageIcon("conference.jpg");

        Image im = ic.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(100,250,400,300);

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
new conference();
}
}      
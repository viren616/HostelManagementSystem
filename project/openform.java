  import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class openform  extends Thread
{
      static  JFrame jf1;
    static  JButton jb,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
      static   JPanel jp,jp1,jp2;  
       JScrollPane jsp;              
       JScrollBar jsb;              
       static   JLabel jl20,jl21;
   int i=0;
      openform()
      {
         jf1=new JFrame();
         jf1.setExtendedState(JFrame.MAXIMIZED_BOTH); 
         jf1.setLayout(null);
         jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf1.setUndecorated(true);

 	
          jp=new JPanel();
         jp.setLayout(null); 
         jp.setBackground(new Color(0,0,0,125));
         jf1.add(jp);
         jp.setBounds(0,180,1370,750); 
        jp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,1),""));

          jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(0,0,0,125));
         jf1.add(jp1);
         jp1.setBounds(0,0,1370,160); 
  
	 jl20=new JLabel(":: WISDOM :: JUSTICE :: COURAGE :: MORALE :: HUMANITY :: SERVICE :: DUTY :: COOPERATION :: SUCCESS ::");
         jp1.add(jl20);
	 jl20.setForeground(Color.white);         


                 jb=new JButton("HOME");
         jf1.add(jb);
         jb.setBounds(0,160,225,20);
        jb.setContentAreaFilled(false);
        jb.setForeground(Color.pink);         
         jb1=new JButton("FACILITIES");
        jf1.add(jb1) ;
         jb1.setBounds(225,160,225,20);
        jb1.setForeground(Color.pink);         
          jb1.setContentAreaFilled(false);
         jb2=new JButton("Administrator");
         jf1.add(jb2) ;
         jb2.setBounds(450,160,225,20);
         jb2.setForeground(Color.pink);         
         jb2.setContentAreaFilled(false);
        jb3=new JButton("JOIN");
        jf1.add(jb3) ;
        jb3.setContentAreaFilled(false);
         jb3.setBounds(675,160,225,20);
      jb3.setForeground(Color.pink);         
        jb4=new JButton("PAYMENT");
       jb4.setContentAreaFilled(false);
      jf1.add(jb4) ;
         jb4.setForeground(Color.pink);         
      jb4.setBounds(900,160,225,20);
       jb5=new JButton("ABOUT");
       jb5.setContentAreaFilled(false);
      jf1.add(jb5) ;
       jb5.setForeground(Color.pink);         
      jb5.setBounds(1125,160,240,20);
       jb6=new JButton("ADMIN LOGIN");
       jb6.setForeground(Color.pink);         
       jp.add(jb6) ;
       jb6.setBounds(450,0,225,40);
          jb6.setVisible(false);
        jb6.setContentAreaFilled(false);

 jb1.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {   
      jb.setVisible(false);
      jb1.setVisible(false);
      jb2.setVisible(false);
      jb3.setVisible(false);
      jb4.setVisible(false);
      jb5.setVisible(false);
      running.jf.setVisible(false);   
      Project.jf.setVisible(false);         
       jf1.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
}        
    });
 jb2.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
      jb.setVisible(false);
      jb1.setVisible(false);
      jb2.setVisible(false);
      jb3.setVisible(false);
      jb4.setVisible(false);
      jb5.setVisible(false);
      running.jf.setVisible(false);   
      Project.jf.setVisible(false);         
      jf1.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
  }      
    });

 jb3.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
      jb.setVisible(false);
      jb1.setVisible(false);
      jb2.setVisible(false);
      jb3.setVisible(false);
      jb4.setVisible(false);
      jb5.setVisible(false);
      running.jf.setVisible(false);   
      Project.jf.setVisible(false);         
jf1.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
}      
    });
 jb4.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
      jb.setVisible(false);
      jb1.setVisible(false);
      jb2.setVisible(false);
      jb3.setVisible(false);
      jb4.setVisible(false);
       jb5.setVisible(false);

    running.jf.setVisible(false);   
       Project.jf.setVisible(false);         
                jf1.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
}        
    });
 jb5.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
      jb.setVisible(false);
      jb1.setVisible(false);
      jb2.setVisible(false);
      jb3.setVisible(false);
      jb4.setVisible(false);
      jb5.setVisible(false);
      running.jf.setVisible(false);   
      Project.jf.setVisible(false);         
jf1.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
}
         });
  

jb.addActionListener(new ActionListener(){  
       public void actionPerformed(ActionEvent e){  
       running.jf.setVisible(true);   
       Project.jf.setVisible(true);         
       running.jf.setAlwaysOnTop(true);                 
       Project.jf.setAlwaysOnTop(true);     

    }  
    });  
jb1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){          
      
     new facilities(); 
      new hostelfas(); 
    }  
    });  

jb2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        running.jf.setVisible(false);   
        Project.jf.setVisible(false);         
          

    }  
    });  

jb3.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  

 
         new avail();  
     
    }  
    });  

jb4.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
   
      new payment();  
  }  
    });  



jb5.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  

      new about(); 

    }  
    });  
 

jb2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
          
     new adminlogin();  
    }  
    });  



 jb.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) { 
       jf1.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
}      
    });


  
  
        ImageIcon ic = new ImageIcon("bc.jpg");

        Image im = ic.getImage().getScaledInstance(1365,770 , Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(0,0,1365,770);

        jf1.add(l);



	
              

      
        ImageIcon ic1 = new ImageIcon("logo.png");

        Image im1 = ic1.getImage().getScaledInstance(250,150 , Image.SCALE_SMOOTH);

        ImageIcon ic2 = new ImageIcon(im1);


        JLabel l1 = new JLabel(ic2);

        l1.setBounds(10,10,250,150);

        jp1.add(l1);


 new right1().start();
jf1.setVisible(true);
}

public static void main (String[] arg )
 { 
 new openform();  
new firstform();
     }
}

 class right1 extends Thread         
{
       public void run()
       {
               int i;  
for(;;)
{
    for(i=300;i<1400;i++)
       {
	try
	{
                   Thread.sleep(5);
                 openform.jl20.setBounds(i,80,600,50);
                                                 openform.jf1.repaint();
                                                   
	openform.jf1.revalidate();
	openform.jp1.revalidate();
                                                   openform.jp1.repaint();

    }catch(Exception e){       }
  }
}
 }  
   }

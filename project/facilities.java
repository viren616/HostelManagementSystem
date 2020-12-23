import java.awt.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.Image;

import java.awt.Label;

import javax.swing.*;
import java.sql.*;
class facilities
{
      static  JFrame jf2;
      JLabel j,jl,jl1,jl2,jl3,jl4,jl5,jl6;    
      JButton jb,jb1,jb2,jb3,jb4;
     facilities()
      {
        jf2=new JFrame();
        jf2.setBounds(0,200,250,570);
        jf2.setLayout(null);
        jf2.setUndecorated(true);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf2.setAlwaysOnTop(true);                 
    	jl=new JLabel("Hostel Facilities");
	jl.setBounds(20,50,200,30);
	jf2.add(jl);
        jl.setFont(new Font("courier", Font.BOLD, 16));        
 	jl1=new JLabel("Health & Fitness Center");
	jl1.setBounds(20,100,230,30);
	jf2.add(jl1);
	jl1.setFont(new Font("courier", Font.BOLD, 16));        
 	jl2=new JLabel("Mess Facilities");
	jl2.setBounds(20,150,200,30);
	jf2.add(jl2);
	jl2.setFont(new Font("courier", Font.BOLD, 16));        
 	jl3=new JLabel("Internet");
	jl3.setBounds(20,200,200,30);
	jf2.add(jl3);
	jl3.setFont(new Font("courier", Font.BOLD, 16));        
 	jl4=new JLabel("Bank & ATM");
	jl4.setBounds(20,250,200,30);
	jf2.add(jl4);
	jl4.setFont(new Font("courier", Font.BOLD, 16));        
 	jl5=new JLabel("Transportaion");
	jl5.setBounds(20,300,200,30);
	jf2.add(jl5);
	jl5.setFont(new Font("courier", Font.BOLD, 16));
 	jl6=new JLabel("Conference Halls");
	jl6.setBounds(20,350,200,30);
	jf2.add(jl6);
	jl6.setFont(new Font("courier", Font.BOLD, 16));
                   jl.setForeground(Color.white);                 
jl1.setForeground(Color.white);                 
jl2.setForeground(Color.white);                 
jl3.setForeground(Color.white);                 
jl4.setForeground(Color.white);                 
jl5.setForeground(Color.white);                 
jl6.setForeground(Color.white);                 
   jl.setEnabled(false);                                            
 
 
jl.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
	{
		jl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		
}         
});

jl3.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
	{
		jl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		
}         
});
jl6.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
	{
		jl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		
}         
});

jl.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl.setFont(new Font("courier", Font.BOLD, 18));
                                          jf2.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl.setFont(new Font("courier", Font.BOLD, 16));
		   jf2.repaint();
    }  
}); 
jl1.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl1.setFont(new Font("courier", Font.BOLD, 18));
                                          jf2.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl1.setFont(new Font("courier", Font.BOLD, 16));
		   jf2.repaint();
    }  
}); 

jl2.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl2.setFont(new Font("courier", Font.BOLD, 18));
                                          jf2.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl2.setFont(new Font("courier", Font.BOLD, 16));
		   jf2.repaint();
    }  
}); 

jl3.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl3.setFont(new Font("courier", Font.BOLD, 18));
                                          jf2.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl3.setFont(new Font("courier", Font.BOLD, 16));
		   jf2.repaint();
    }  
}); 

jl4.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl4.setFont(new Font("courier", Font.BOLD, 18));
                                          jf2.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl4.setFont(new Font("courier", Font.BOLD, 16));
		   jf2.repaint();
    }  
}); 

jl5.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl5.setFont(new Font("courier", Font.BOLD, 18));
                                          jf2.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl5.setFont(new Font("courier", Font.BOLD, 16));
		   jf2.repaint();
    }  
}); 

jl6.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl6.setFont(new Font("courier", Font.BOLD, 18));
                                          jf2.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl6.setFont(new Font("courier", Font.BOLD, 16));
		   jf2.repaint();
    }  
}); 

jl.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    { 
     new hostelfas();
    }  
}); 

jl1.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
    new health();
    }  
}); 

jl2.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
       new mess();
    }  
}); 

jl3.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
       new internet();
}  
}); 

jl4.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
            new bank();
}  
}); 

jl5.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
       new transportation();
}  
}); 

jl6.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
       new conference();
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
new facilities();
}
}
      
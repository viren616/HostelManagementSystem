import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.*;
import java.sql.*;
class maindemo
{
      static  JFrame jf;
      JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9;
      maindemo()
      {
         jf=new JFrame();
         jf.setBounds(0,200,250,570);
         jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         jf.setAlwaysOnTop(true);
             
 	jl1=new JLabel("Change Password");
	jl1.setBounds(40,50,190,30);
	jf.add(jl1);
	jl1.setFont(new Font("courier", Font.BOLD, 16));
 	jl2=new JLabel("Update Profile");
	jl2.setBounds(40,100,190,30);
	jf.add(jl2);
	jl2.setFont(new Font("courier", Font.BOLD, 16));
 	jl3=new JLabel("View Profile");
	jl3.setBounds(40,150,190,30);
	jf.add(jl3);
	jl3.setFont(new Font("courier", Font.BOLD, 16));
        	jl4=new JLabel("View Admin List");
	jl4.setBounds(40,200,200,30);
	jf.add(jl4);
	jl4.setFont(new Font("courier", Font.BOLD, 16));
	jl5=new JLabel("View All Student");
	jl5.setBounds(40,250,190,30);
	jf.add(jl5);
	jl5.setFont(new Font("courier", Font.BOLD, 16));
 	jl6=new JLabel("View Available Room");
	jl6.setBounds(40,300,220,30);
	jf.add(jl6);
	jl6.setFont(new Font("courier", Font.BOLD, 16));
 	jl7=new JLabel("Delete Student");
	jl7.setBounds(40,350,200,30);
	jf.add(jl7);
	jl7.setFont(new Font("courier", Font.BOLD, 16));
                   jl8=new JLabel("Home");
	jl8.setBounds(40,5,200,30);
	jf.add(jl8);
	jl8.setFont(new Font("courier", Font.BOLD, 16));
                   jl9=new JLabel("Upload Photo");
	jl9.setBounds(40,400,200,30);
	jf.add(jl9);
	jl9.setFont(new Font("courier", Font.BOLD, 16));
   jl1.setForeground(Color.white);
   jl2.setForeground(Color.white);
   jl3.setForeground(Color.white);
   jl4.setForeground(Color.white);
   jl5.setForeground(Color.white);
   jl6.setForeground(Color.white);
   jl7.setForeground(Color.white);
   jl8.setForeground(Color.white);
   jl9.setForeground(Color.white);
 jl8.setEnabled(false);
jl1.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
	{
		jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
}         
});
jl3.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
	{
		jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
}         
});
jl6.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
	{
		jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
}         
});
jl9.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent e)
	{
		jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jl9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
}         
});


jl1.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl1.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl1.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
}); 


jl2.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl2.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl2.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
}); 

jl3.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl3.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl3.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
}); 

jl4.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl4.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl4.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
}); 

jl5.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl5.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl5.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
}); 

jl6.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl6.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl6.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
}); 

jl7.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl7.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl7.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
});
 
jl8.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl8.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl8.setFont(new Font("courier", Font.BOLD, 16));
		   jf.repaint();
    }  
}); 
jl8.addMouseListener(new MouseAdapter()  
{  
    public void mousePressed(MouseEvent e)  
    {  
jl8.setFont(new Font("courier", Font.BOLD, 18));
                                          jf.repaint();
    }  
    public void mouseReleased(MouseEvent e)  
    {  
  jl8.setFont(new Font("courier", Font.BOLD, 16));

		   jf.repaint();
    }  
}); 

jl1.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
        
       new changepwadmin();   
    jf.dispose();
   adminhome.jf.dispose();
     }  
}); 
jl2.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
   adminhome.jf.dispose();
         jf.dispose();
       new userinfo();   
    }  
}); 

jl3.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
 adminhome.jf.dispose();
jf.dispose();
new admintable1(); 
}  
}); 

jl4.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
      adminhome.jf.dispose();
       jf.dispose();
       new admintablesql();

    }  
}); 

jl5.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
       adminhome.jf.dispose();
     jf.dispose();
    new  studtablesql();
}  
}); 

jl6.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
   adminhome.jf.dispose();
   jf.dispose();
    new availadmin();
}  
}); 

jl7.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
  adminhome.jf.dispose();
  jf.dispose();
       new userdelinfo();
    }  
}); 


jl9.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
adminhome.jf.dispose();
  jf.dispose();   
    new img();
    }  
}); 


        ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);


           
jf.setVisible(true);
}

public static void main (String[] arg )
 { 
new maindemo();
}
}      
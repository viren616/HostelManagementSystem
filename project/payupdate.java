import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.imageio.*;

class payupdate 
{
          JFrame jf;
         JButton jb,jb1,jb2,jb3,jb4;
         JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16;  
          String str="",str1="",str2="",ollfinal1="";   
         int a,a1,a2,a3,a4,x=0;
          JTextField jtf;          
              JPopupMenu jpm;
         JMenuItem i1; 
    payupdate()
      {
         jf=new JFrame();
         jf.setBounds(0,200,1370,570);
         jf.setLayout(null);
        jf.setUndecorated(true);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setAlwaysOnTop(true);
          JPanel jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf.add(jp1);
         jp1.setBounds(20,0,1330,570); 
  
         jpm=new JPopupMenu();
            i1=new JMenuItem("Refresh");
            jpm.add(i1);
     
  
         jb=new JButton("Update");
         jb.setBounds(430,450,150,20);
        jp1.add(jb);
         jb2=new JButton("BACK");
         jb2.setBounds(1200,500,100,30);
         jp1.add(jb2);
      

         jl=new JLabel("USER ID");
         jp1.add(jl);
         jl.setBounds(50,100,150,20);											         jl.setFont(new Font("Courier", Font.BOLD, 20));
               jl.setForeground(Color.white);           
           jtf=new JTextField();
           jp1.add(jtf);
           jtf.setBounds(900,70,100,20);

         jl1=new JLabel("STUDENT NAME");
         jp1.add(jl1);
         jl1.setBounds(50,170,150,20);
         jl1.setFont(new Font("Courier", Font.BOLD, 20));
        jl1.setForeground(Color.white);
         jl2=new JLabel(" MESS FACILITY");
         jl2.setBounds(50,230,250,20);
         jl2.setFont(new Font("Courier", Font.BOLD, 20));
        jl2.setForeground(Color.white);
        jp1.add(jl2);
        jl3=new JLabel("AMOUNT PAID");
         jl3.setBounds(50,290,150,20);
         jl3.setFont(new Font("Courier", Font.BOLD, 20));
         jl3.setForeground(Color.white);
        jp1.add(jl3);
       jl4=new JLabel("AMOUNT HAVE TO PAY");
         jl4.setBounds(50,350,250,20);
         jl4.setFont(new Font("Courier", Font.BOLD, 20));
           jl4.setForeground(Color.white);
          jp1.add(jl4);
         jl5=new JLabel("BEDROOM TYPE");
         jl5.setBounds(50,410,250,20);
         jl5.setFont(new Font("Courier", Font.BOLD, 20));
          jl5.setForeground(Color.white);
           jp1.add(jl5);
        jl6=new JLabel("6");
         jl6.setBounds(300,100,200,20);
         jl6.setFont(new Font("Courier", Font.BOLD, 20));
         jp1.add(jl6);
          jl6.setForeground(Color.white);
          jl11=new JLabel("11");
         jl11.setBounds(300,170,200,20);
         jl11.setFont(new Font("Courier", Font.BOLD, 20));
           jl11.setForeground(Color.white);
          jp1.add(jl11);
         jl7=new JLabel("7");
         jl7.setBounds(300,230,200,20);
         jl7.setFont(new Font("Courier", Font.BOLD, 20));
           jl7.setForeground(Color.white);
          jp1.add(jl7);
        jl8=new JLabel("8");
         jl8.setBounds(300,290,200,20);
         jl8.setFont(new Font("Courier", Font.BOLD, 20));
           jl8.setForeground(Color.white);
           jp1.add(jl8);
        jl9=new JLabel("9");
         jl9.setBounds(300,350,200,20);
         jl9.setFont(new Font("Courier", Font.BOLD, 20));
           jl9.setForeground(Color.white);
          jp1.add(jl9);
        jl10=new JLabel("A");
         jl10.setBounds(300,410,200,20);
         jl10.setFont(new Font("Courier", Font.BOLD, 20));
            jl10.setForeground(Color.white);
         jp1.add(jl10);
           jl12=new JLabel("no image");
          jl12.setBounds(600,70,140,140);
         jl12.setFont(new Font("Courier", Font.BOLD, 20));
         jl12.setForeground(Color.white);
          jp1.add(jl12);
          jl13=new JLabel();
          jl13.setBounds(600,200,100,100);
         jl13.setFont(new Font("Courier", Font.BOLD, 20));
           jl13.setForeground(Color.white);
          jp1.add(jl13);
          jl14=new JLabel("Payment");
          jl14.setBounds(500,0,500,50);
         jl14.setFont(new Font("Courier", Font.BOLD, 40));
          jl14.setForeground(Color.white);
          jp1.add(jl14);
        jl15=new JLabel("Payment");
          jl15.setBounds(800,50,400,50);
         jl15.setFont(new Font("Courier", Font.BOLD, 20));
        jp1.add(jl15);
   jl15.setForeground(Color.white);

         jp1.addMouseListener(new MouseAdapter()
           {
                public void mouseClicked(MouseEvent me)
                {
                      if(me.isMetaDown()) 
                          jpm.show(jp1,me.getX(),me.getY());       
                jf.repaint();
               jp1.revalidate();
               jp1.repaint();
                     }
           });
  
         i1.addActionListener(new ActionListener()
           {
                    public void actionPerformed(ActionEvent we)
                      {
                         jf.dispose();
	  new payupdate();    
                        }
           });
                                     try                                                                                                                        {
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select * from registration where userID=? ");
                                                               pt.setString(1,payment.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                           jl6.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 

              try                                                                                                                        {
                                                    Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select studname from registration where userID=? ");
                                                               pt.setString(1,payment.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str1=sr.getString(1);                                   
                         }
                            jl11.setText(str1);                    
                         }catch(Exception e){System.out.println(e);} 


              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select mess from registration where userID=? ");
                                                               pt.setString(1,payment.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                            jl7.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 

              try                                                                                                                        {
                                                    Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select amountyoupay from registration where userID=? ");
                                                               pt.setString(1,payment.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str1=sr.getString(1);                                   
                         }
                            jl8.setText(str1);                    
                         }catch(Exception e){System.out.println(e);} 


              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select havetopay from registration where userID=? ");
                                                               pt.setString(1,payment.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str2=sr.getString(1);                                   
                         }
                            jl9.setText(str2);                    
                         }catch(Exception e){System.out.println(e);} 

              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select bed_type from registration where userID=? ");
                                                               pt.setString(1,payment.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                            jl10.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 


              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select e_mail from registration where userID=? ");
                                                               pt.setString(1,payment.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                            jl13.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 



                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                   PreparedStatement pst=con.prepareStatement("select image from registration where userID=? ");
                     pst.setString(1,payment.x);
                   ResultSet rs=pst.executeQuery();
                   byte b[]=null; 
                   if(rs.next())
                   {
                           b=rs.getBytes(1);
                                                   ImageIcon ic2=new ImageIcon(ImageIO.read(new ByteArrayInputStream(b)));
                        Image img=ic2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH); 
                           jl12.setIcon(new ImageIcon(img));  
 }                   
                     
                      }catch(Exception e){System.out.println(e);}                       



jtf.addFocusListener (new FocusAdapter(){
   public void focusLost(FocusEvent e){
                     if(jtf.getText().equals(""))
                 {
                                                 
                   a4=Integer.valueOf(str1)+x;
                   a3=Integer.valueOf(str2)-x;                           
                         }
	else
	{
                a=Integer.valueOf(jtf.getText());
                   a4=Integer.valueOf(str1)+a;
                   a3=Integer.valueOf(str2)-a;
                        jl8.setText(a4+"");      
	jl9.setText(a3+"");
	}
jf.repaint();
jp1.revalidate();
jp1.repaint();
}
});
  
  jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        { 
           
                           Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                 PreparedStatement pt=con.prepareStatement("update registration set amountyoupay =?,havetopay=?  where userID=?");                   
                 pt.setString(1,a4+"");
                 pt.setString(2,a3+"");
                 pt.setString(3,payment.x);
                 pt.executeUpdate();
                 JOptionPane.showMessageDialog(jf," Update Sucessfully ");   
                                         //  jf.dispose();
                                          // new payment();
                      }catch(Exception e){System.out.println(e);}                       
                 }      	
         });
      
 jb2.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
           jf.dispose();
      payment.jf.setVisible(true); 
         }catch(Exception e){System.out.println(e);}                       
      }
 });
             ImageIcon  ic1    = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);

        ImageIcon ic = new ImageIcon("p1.png");

        Image im = ic.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l1 = new JLabel(ic);

        l1.setBounds(400,100,500,400);

       l12.add(l1);



             
jf.setVisible(true);

}

public static void main (String[] arg )
 { 
new payupdate();
}
}

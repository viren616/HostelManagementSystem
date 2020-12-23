import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import java.awt.Label;

import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.imageio.*;

class userinfo 
{
        JFrame jf;
        JButton jb,jb1,jb2,jb3,jb4;
        JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13;  
         String str="";   
                    
        JPanel jp;  

      userhome()
      {
         jf=new JFrame();
         jf.setBounds(250,200,1370,570);
         jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            jf.setBackground(new Color(1.0f,0.5f,1.0f,0.3f));

         jp=new JPanel();
        jp.setLayout(null); 
        jp.setBackground(new Color(225,62,50,100));        
        jp.setBounds(0,0,1130,570); 
        jf.add(jp);
        
        
  
         jb=new JButton("Che");
         jb.setBounds(430,300,150,20);
       //  jp.add(jb);
         jb2=new JButton("BACK");
         jb2.setBounds(1200,400,100,30);
         jp.add(jb2);
         jb3=new JButton("Registration");
      //   jp.add(jb3);        
         jb3.setBounds(600,300,150,20);
         jb3.setVisible(false);
      

        JComboBox  jcb3=new JComboBox();
	jp.add(jcb3);  
         jcb3.setBounds(10,20,180,30);


         jl=new JLabel("USER ID");
         jp.add(jl);
         jl.setBounds(50,50,150,20);											                 	jl.setFont(new Font("Courier", Font.BOLD, 20));
jl.setForeground(Color.white);



         jl1=new JLabel("STUDENT NAME");
         jp.add(jl1);
         jl1.setBounds(50,110,150,20);
         jl1.setFont(new Font("Courier", Font.BOLD, 20));
jl1.setForeground(Color.white);
      
   jl2=new JLabel("MESS FACILITY");
         jl2.setBounds(50,170,200,20);
         jl2.setFont(new Font("Courier", Font.BOLD, 20));
         jp.add(jl2);
 jl2.setForeground(Color.white);
        jl3=new JLabel("AMOUNT PAID");
         jl3.setBounds(50,230,150,20);
         jl3.setFont(new Font("Courier", Font.BOLD, 20));
      jl3.setForeground(Color.white);
   jp.add(jl3);
         jl4=new JLabel("AMOUNT HAVE TO PAY");
         jl4.setBounds(50,290,250,20);
         jl4.setFont(new Font("Courier", Font.BOLD, 20));
         jl4.setForeground(Color.white);
jp.add(jl4);
         jl5=new JLabel("BEDROOM TYPE");
         jl5.setBounds(50,350,200,20);
         jl5.setFont(new Font("Courier", Font.BOLD, 20));
         jl5.setForeground(Color.white);
jp.add(jl5);
         jl6=new JLabel("6");
         jl6.setBounds(300,50,50,20);
         jl6.setFont(new Font("Courier", Font.BOLD, 16));
         jl6.setForeground(Color.white);
jp.add(jl6);
         jl11=new JLabel("11");
         jl11.setBounds(300,110,50,20);
         jl11.setFont(new Font("Courier", Font.BOLD, 16));
        jl11.setForeground(Color.white);
 jp.add(jl11);
         jl7=new JLabel("7");
         jl7.setBounds(300,170,50,20);
         jl7.setFont(new Font("Courier", Font.BOLD, 16));
         jl7.setForeground(Color.white);
jp.add(jl7);
         jl8=new JLabel("8");
         jl8.setBounds(300,230,50,20);
         jl8.setForeground(Color.white);
jl8.setFont(new Font("Courier", Font.BOLD, 16));
         jp.add(jl8);
         jl9=new JLabel("9");
         jl9.setBounds(300,290,50,20);
         jl9.setFont(new Font("Courier", Font.BOLD, 16));
        jl9.setForeground(Color.white);
 jp.add(jl9);
         jl10=new JLabel("A");
         jl10.setBounds(300,350,50,20);
         jl10.setFont(new Font("Courier", Font.BOLD, 16));
          jp.add(jl10);
        jl10.setForeground(Color.white);
 jl12=new JLabel("no image");
          jl12.setBounds(600,70,100,100);
         jl12.setFont(new Font("Courier", Font.BOLD, 16));
         jp.add(jl12);
        jl12.setForeground(Color.white);
 jl13=new JLabel("no image");
          jl13.setBounds(600,200,100,100);
         jl13.setFont(new Font("Courier", Font.BOLD, 16));
         jp.add(jl13);
jl13.setForeground(Color.white);

        
                                               

                                     try                                                                                                                        {
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select * from registration where userID=? ");
                                                               pt.setString(1,userlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                        System.out.println(str); 
                           jl6.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 

              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select student_name from registration where userID=? ");
                                                               pt.setString(1,userlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                        System.out.println(str); 
                            jl11.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 



              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select mess_facility from registration where userID=? ");
                                                               pt.setString(1,userlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                        System.out.println(str); 
                            jl7.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 

              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select amount_paid from registration where userID=? ");
                                                               pt.setString(1,userlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                        System.out.println(str); 
                            jl8.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 


              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select amount_havetopay from registration where userID=? ");
                                                               pt.setString(1,userlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                        System.out.println(str); 
                            jl9.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 

              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select roomtype from registration where userID=? ");
                                                               pt.setString(1,userlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                        System.out.println(str); 
                            jl10.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 


              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");

 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select email from registration where userID=? ");
                                                               pt.setString(1,userlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                        System.out.println(str); 
                            jl13.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 




                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","viren");     
                 PreparedStatement pst=con.prepareStatement("select image from blyclg ");
                   //pst.setString(1,"1");
                   ResultSet rs=pst.executeQuery();
                   byte b[]=null; 
                   if(rs.next())
                   {
                           b=rs.getBytes(1);
                           Image img=ImageIO.read(new ByteArrayInputStream(b));
                            jl12.setIcon(new ImageIcon(img));                     
                   }                   
                     
                      }catch(Exception e){System.out.println(e);}                       




/*
       ImageIcon ic = new ImageIcon("room.jpg");

        Image im = ic.getImage().getScaledInstance(1365, 565, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(0,0,1365,565);

//        jf.add(l);


*/
      
jf.setVisible(true);

}

public static void main (String[] arg )
 { 
new userinfo();
}
}

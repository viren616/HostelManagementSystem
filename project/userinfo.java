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
     static   JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,jl19,jl20,jl21,jl22;  
       static  String str="",f,str13="",str12="",str3="",str4="",str5="",str1,str2;   
          static JComboBox jcb;         
        JPanel jp;  
 JPopupMenu jpm;
         JMenuItem i1; 
     
      userinfo()
      {
         jf=new JFrame();
         jf.setBounds(0,200,1370,570);
         jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setAlwaysOnTop(true);

         jp=new JPanel();
        jp.setLayout(null); 
        jp.setBackground(new Color(220,0,0,125));        
        jp.setBounds(20,0,1330,570); 
        jf.add(jp);
        
               jpm=new JPopupMenu();
            i1=new JMenuItem("Refresh");
            jpm.add(i1);
    
  
         jb2=new JButton("BACK");
         jb2.setBounds(1200,400,100,30);
         jp.add(jb2);
  
          jcb=new JComboBox();
         jcb.addItem("Select");	
         jp.add(jcb);  
         jcb.setBounds(10,20,180,30);


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
         jl6=new JLabel("");
         jl6.setBounds(300,50,250,20);
         jl6.setFont(new Font("Courier", Font.BOLD, 16));
         jl6.setForeground(Color.white);
jp.add(jl6);
         jl11=new JLabel("");
         jl11.setBounds(300,110,250,20);
         jl11.setFont(new Font("Courier", Font.BOLD, 16));
        jl11.setForeground(Color.white);
 jp.add(jl11);
         jl7=new JLabel("");
         jl7.setBounds(300,170,250,20);
         jl7.setFont(new Font("Courier", Font.BOLD, 16));
         jl7.setForeground(Color.white);
jp.add(jl7);
         jl8=new JLabel("");
         jl8.setBounds(300,230,250,20);
         jl8.setForeground(Color.white);
jl8.setFont(new Font("Courier", Font.BOLD, 16));
         jp.add(jl8);
         jl9=new JLabel("");
         jl9.setBounds(300,290,250,20);
         jl9.setFont(new Font("Courier", Font.BOLD, 16));
        jl9.setForeground(Color.white);
 jp.add(jl9);
         jl10=new JLabel("");
         jl10.setBounds(300,350,250,20);
         jl10.setFont(new Font("Courier", Font.BOLD, 16));
          jp.add(jl10);
        jl10.setForeground(Color.white);
 jl12=new JLabel("no image");
          jl12.setBounds(600,70,150,150);
         jl12.setFont(new Font("Courier", Font.BOLD, 16));
         jp.add(jl12);
        jl12.setForeground(Color.white);
       
 jp.addMouseListener(new MouseAdapter()
           {
                public void mouseClicked(MouseEvent me)
                {
                      if(me.isMetaDown()) 
                          jpm.show(jp,me.getX(),me.getY());       
                jf.repaint();
               jp.revalidate();
               jp.repaint();
                     }
           });
  
         i1.addActionListener(new ActionListener()
           {
                    public void actionPerformed(ActionEvent we)
                      {
	  new userinfo();    
                         jf.dispose();
                        }
           });

     try                                                                                                                       //id
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select *from registration");
                         while(sr.next())  
                         {
                               jcb.addItem(sr.getString(1));
                                }
                         }catch(Exception e){System.out.println(e);} 
   
  
      jb=new JButton("Proceed");
          jb.setBounds(500,450,150,30);
          jp.add(jb);


     jb2.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     

                          try
                        {  
                     new maindemo();
                     new adminhome();
                     jf.dispose();                                                             
                   }catch(Exception e){System.out.println(e);}                       
                 }      	
         });
   
         jl13=new JLabel("CAMPUS TOUR");
         jp.add(jl13);
         jl13.setBounds(850,50,150,20);
         jl13.setFont(new Font("Courier", Font.BOLD, 20));
jl13.setForeground(Color.white);
      
   jl14=new JLabel("H & F CENTER");
         jl14.setBounds(850,110,200,20);
         jl14.setFont(new Font("Courier", Font.BOLD, 20));
         jp.add(jl14);
 jl14.setForeground(Color.white);
        jl15=new JLabel("TRANSPORTATION");
         jl15.setBounds(850,170,200,20);
         jl15.setFont(new Font("Courier", Font.BOLD, 20));
      jl15.setForeground(Color.white);
   jp.add(jl15);
         jl16=new JLabel("INTERNET");
         jl16.setBounds(850,230,250,20);
         jl16.setFont(new Font("Courier", Font.BOLD, 20));
         jl16.setForeground(Color.white);
jp.add(jl16);
         jl17=new JLabel("SPORTS ACADMEY");
         jl17.setBounds(850,290,200,20);
         jl17.setFont(new Font("Courier", Font.BOLD, 20));
         jl17.setForeground(Color.white);
jp.add(jl17);
         jl18=new JLabel();
         jl18.setBounds(1200,50,50,20);
         jl18.setFont(new Font("Courier", Font.BOLD, 16));
         jl18.setForeground(Color.white);
jp.add(jl18);
         jl19=new JLabel();
         jl19.setBounds(1200,110,50,20);
         jl19.setFont(new Font("Courier", Font.BOLD, 16));
        jl19.setForeground(Color.white);
 jp.add(jl19);
         jl20=new JLabel();
         jl20.setBounds(1200,170,50,20);
         jl20.setFont(new Font("Courier", Font.BOLD, 16));
         jl20.setForeground(Color.white);
jp.add(jl20);
         jl21=new JLabel();
         jl21.setBounds(1200,230,50,20);
         jl21.setForeground(Color.white);
         jl21.setFont(new Font("Courier", Font.BOLD, 16));
         jp.add(jl21);
         jl22=new JLabel();
         jl22.setBounds(1200,290,50,20);
         jl22.setFont(new Font("Courier", Font.BOLD, 16));
        jl22.setForeground(Color.white);
 jp.add(jl22);

               jcb.addItemListener(new ItemListener()
         {
     public void itemStateChanged(ItemEvent event) {
      if (event.getStateChange() == ItemEvent.SELECTED) {    
              f = event.getItem().toString();

                                    try                                                                                                                        {
                          Class.forName("com.mysql.jdbc.Driver");
 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
                    PreparedStatement pt=connection.prepareStatement("select * from registration where userID=? ");
                                                               pt.setString(1,f);
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
              PreparedStatement pt=connection.prepareStatement("select studname from registration where userID=? ");
                                                               pt.setString(1,f);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                            jl11.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 


              try                                                                                                                        {
                          
                          Class.forName("com.mysql.jdbc.Driver");
 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
              PreparedStatement pt=connection.prepareStatement("select mess from registration where userID=? ");
                                                               pt.setString(1,f);
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
                                                               pt.setString(1,f);
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
                                                               pt.setString(1,f);
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
                                                               pt.setString(1,f);
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
              PreparedStatement pt=connection.prepareStatement("select * from facility where userID=? ");
                                            pt.setString(1,f);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                     str5=sr.getString(2);                                   
                     str13=sr.getString(3);                                   
                      str12=sr.getString(4);                                   
                      str3=sr.getString(5);                                   
                     str4=sr.getString(6);                                   
                       }      
                     jl18.setText(str5);                    
                     jl19.setText(str13);                    
                     jl20.setText(str12);                    
                     jl21.setText(str3);                    
                     jl22.setText(str4);                    
                         }catch(Exception e){System.out.println(e);} 

                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                           PreparedStatement pst=con.prepareStatement("select image from registration where userID=?");
                                 pst.setString(1,f);
		ResultSet rs=pst.executeQuery();
                   byte b[]=null; 
                   if(rs.next())
                   {      b=rs.getBytes(1);
                          ImageIcon ic2=new ImageIcon(ImageIO.read(new ByteArrayInputStream(b)));
                        Image img=ic2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH); 
                           jl12.setIcon(new ImageIcon(img));  
                       }                   
                     
                      }catch(Exception e){System.out.println(e);}                       
     
     }
    }    
});                                                       


jb.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
           {
             if(e.getSource()==jb)
              {
               if(jcb.getSelectedItem().equals("Select"))
                {
                   JOptionPane.showMessageDialog(jf,"Please Provide All Infomation"); 
               }
              else
       {
       new updateroom();
           jf.dispose();
          }
           }
        }
          });     


       ImageIcon ic = new ImageIcon("bc.jpg");

        Image im = ic.getImage().getScaledInstance(1365, 565, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(0,0,1365,565);

       jf.add(l);



      
       ImageIcon ic1 = new ImageIcon("us1.png");

        Image im1 = ic1.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l1 = new JLabel(ic1);

        l1.setBounds(400,100,500,400);

       l.add(l1);



jf.setVisible(true);

}

public static void main (String[] arg )
 { 
new userinfo();
}
}

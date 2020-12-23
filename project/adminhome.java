import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class adminhome 
{
       static JFrame jf;
        JButton jb,jb1,jb2,jb3,jb4;
        JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13;  
         String str="";   
        JPanel jp;  
      adminhome()
      {
         jf=new JFrame();
         jf.setBounds(250,200,1370,570);
         jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setAlwaysOnTop(true);              
         
         JPanel jp1=new JPanel();
          jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf.add(jp1);
         jp1.setBounds(20,0,1080,570); 

         jb2=new JButton("BACK");
         jb2.setBounds(960,500,100,30);
         jp1.add(jb2);

         jl=new JLabel("USER ID");
         jp1.add(jl);
         jl.setBounds(50,70,150,20);			                          
         jl.setFont(new Font("Courier", Font.BOLD, 20));
         jl.setForeground(Color.white);
         jl5=new JLabel("ADMINISTRATOR LOGIN ");
         jp1.add(jl5);
         jl5.setBounds(200,10,500,50);			         
         jl5.setFont(new Font("Courier", Font.BOLD, 40));
         jl5.setForeground(Color.white);
         jl1=new JLabel(" PASSWORD");
         jp1.add(jl1);
         jl1.setBounds(50,130,150,20);
         jl1.setFont(new Font("Courier", Font.BOLD, 20));
         jl1.setForeground(Color.white);
         jl6=new JLabel("6");
         jl6.setBounds(300,70,150,20);
         jl6.setFont(new Font("Courier", Font.BOLD, 16));
         jl6.setForeground(Color.white);
         jp1.add(jl6);
         jl11=new JLabel("11");
         jl11.setBounds(300,130,150,20);
         jl11.setFont(new Font("Courier", Font.BOLD, 16));
        jl11.setForeground(Color.white);
         jp1.add(jl11);
                                             

                                     try                                                                                                                        {
                          Class.forName("com.mysql.jdbc.Driver");
 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select * from admin where userID=? ");
                                                               pt.setString(1,adminlogin.x);
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
              PreparedStatement pt=connection.prepareStatement("select password from admin where userID=? ");
                                                               pt.setString(1,adminlogin.x);
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
                      str=sr.getString(1);                                   
                         }
                            jl11.setText(str);                    
                         }catch(Exception e){System.out.println(e);} 

 jb2.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     
                          try
                                {
                     jf.dispose();
                       maindemo.jf.dispose();
                       adminlogin.jf.setVisible(true);
                                  }catch(Exception e){System.out.println(e);}      
                   }      	
         });
         
   ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);



    ImageIcon ic = new ImageIcon("a1.png");

        Image im = ic.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l1 = new JLabel(ic);

        l1.setBounds(300,100,500,400);

       l12.add(l1);



jf.setVisible(true);
}
public static void main (String[] arg )
 { 
new adminhome();
}
}
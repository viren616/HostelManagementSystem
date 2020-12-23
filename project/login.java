import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class login 
{
      static JFrame jf;
      static JLabel jl,jl1,jl2,jl3,jl12;
       JTextField jf1;
       JComboBox jcb1;
       JButton jb,jb1,jb2;
       JPasswordField jf2;
static    String x="",y="";
      JPopupMenu jpm;
     JMenuItem i1,i2,i3;

      login()
      {
         jf=new JFrame();
         jf.setLayout(null);
         jf.setBounds(0,0,1370,800);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setUndecorated(true);
           
  Container c=jf.getContentPane();
          c.setBackground( Color.pink);
        jf.setAlwaysOnTop(true);      
         
         JPanel jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf.add(jp1);
         jp1.setBounds(400,200,400,400); 
   
              jpm=new JPopupMenu();
            i1=new JMenuItem("Refresh");
            jpm.add(i1);
  
                jf2=new JPasswordField();
          jf2.setBounds(200,100,140,30);
          jp1.add(jf2);
          jb=new JButton("Login");
          jb.setBounds(150,250,100,30);
          jp1.add(jb);
         jb1=new JButton("BACK");
         jb1.setBounds(275,250,100,30);
         jp1.add(jb1);
                
         jcb1=new JComboBox();
         jcb1.addItem("Select");
         jp1.add(jcb1);  
         jcb1.setBounds(200,30,140,30);
         jcb1.setCursor(new Cursor(Cursor.HAND_CURSOR));                                                          //combobox

 
         jl=new JLabel("ADMIN ID");
         jl.setBounds(20,30,190,30);            
        jl.setFont(new Font("Dialog",4,18));
        jp1.add(jl);
         jl.setForeground(Color.white);
        jl1=new JLabel("PASSWORD");
        jl1.setBounds(20,100,190,30);            
        jl1.setFont(new Font("Dialog",4,18));
       jp1.add(jl1);
        jl1.setForeground(Color.white);
         jl2=new JLabel("ADMINISTRATOR LOGIN ");
         jf.add(jl2);
         jl2.setBounds(400,10,500,50);											        jl2.setFont(new Font("Courier", Font.BOLD, 40));
       jl2.setForeground(Color.white);
       
       JCheckBox showPassword=new JCheckBox("Show Password");
       showPassword.setBounds(150,160,140,20);  
       jp1.add(showPassword);
        
         jf.addMouseListener(new MouseAdapter()
           {
                public void mouseClicked(MouseEvent me)
                {
                      if(me.isMetaDown()) 
                          jpm.show(jf,me.getX(),me.getY());       
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
	       new login();    
                   }
           });
    

     try                                                                                                                       //id
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select * from admin");
                         while(sr.next())  
                         {
                               jcb1.addItem(sr.getString(1));    
  //System.out.print(rs.getString(1));
    //     System.out.println();                              
                         }
                         }catch(Exception e){System.out.println(e);} 


 jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select *from admin");
                         int f=0;
                         while(sr.next())
                         {
                               x=sr.getString(1);
                               y=sr.getString(2);
                               if(x.equals(jcb1.getSelectedItem())) 
                               {
                                 if(y.equals(jf2.getText()))                                 
                                 { 
                                     f=1;  
                                     break; 
                                 }
                              }                                
                         } 
           if(f==1) 
{
      jf.dispose();         
      new running();  
      new Project();
   }  
        else
              JOptionPane.showMessageDialog(jf," Please Enter Correct ID Or Password "); 
                        }catch(Exception e){System.out.println(e);} 
                  }      	
         });


     jb1.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     

                          try
                        {  
                     jf.dispose();                                            
                   }catch(Exception e){System.out.println(e);}                       
                 }      	
         });

showPassword.addActionListener(new ActionListener()
         {
         public void actionPerformed(ActionEvent aae) {
                         try
                          {
                                if (aae.getSource() == showPassword) 
                           {
                                   if (showPassword.isSelected())
                               {
                                       jf2.setEchoChar((char) 0);
                                } 
                                   else
                                    {
                                        jf2.setEchoChar('*');
                                      } 
                               }      
                   }catch(Exception aaa){System.out.println(aaa);}  
           }
        });   

  ImageIcon ic1 = new ImageIcon("ll.png");

        Image im1 = ic1.getImage().getScaledInstance(1350,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1350,775);

        jf.add(l12);



         new logo().start();            
         jf.setVisible(true);   
      }
      public static void main(String [] argggs)
      {
        new login();
      }
}



class logo extends Thread
{
  int i=1;

  public void run()
  {
Font f=new Font("courier", Font.BOLD, 35);
Font f1=new Font("courier", Font.BOLD, 20);
   for(i=1;1<=5;i++)      
{
     try 
     {
        
       Thread.sleep(300);
       if(i%2==0)
       {
      login.jl2.setForeground(Color.blue);
      login.jl2.setFont(f);
        login.jf.repaint();	
        login.jf.revalidate();  
    }   
       else 
       {
         login.jl2.setForeground(Color.red);
              login. jl2.setFont(new Font("courier", Font.BOLD, 33));
       login.jf.repaint();
        login.jf.revalidate();	
        }    
     }catch(Exception e){ }
   }
  }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class adminlogin 
{
          static JFrame jf;
          JLabel jl,jl1,jl2,jl3;
          JTextField jf1;
          JComboBox jcb1;
          JButton jb,jb1,jb2;
          JPasswordField jf2;
          static    String x="",y="";
          JPopupMenu jpm;
          JMenuItem i1; 
      adminlogin()
      {
         jf=new JFrame();
         jf.setLayout(null);
         jf.setBounds(0,200,1370,570);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setUndecorated(true);
         jf.setAlwaysOnTop(true);
         JPanel jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf.add(jp1);
         jp1.setBounds(20,0,1330,570); 
   
         jpm=new JPopupMenu();
         i1=new JMenuItem("Refresh");
          jpm.add(i1);
         
          jf2=new JPasswordField();
         jf2.setBounds(500,230,140,30);
         jp1.add(jf2);
         jb=new JButton("Login");
         jb.setBounds(520,300,100,30);
         jp1.add(jb);
         jb1=new JButton("BACK");
         jb1.setBounds(1200,500,100,30);
         jp1.add(jb1);
                
         jcb1=new JComboBox();
         jcb1.addItem("Select");
         jp1.add(jcb1);  
         jcb1.setBounds(500,180,140,30);
         jcb1.setCursor(new Cursor(Cursor.HAND_CURSOR));                                                          //combobox
 
         jl=new JLabel("ADMIN ID");
         jl.setBounds(380,180,190,30);            
         jl.setFont(new Font("Courier",0,18));
         jp1.add(jl);
         jl.setForeground(Color.white);
         jl1=new JLabel("PASSWORD");
         jl1.setBounds(380,230,190,30);            
         jl1.setFont(new Font("Courier",0,18));
         jp1.add(jl1);
         jl1.setForeground(Color.white);
         jl2=new JLabel("ADMINISTRATOR LOGIN FORM ");
         jp1.add(jl2);
         jl2.setBounds(300,10,600,50);		
         jl2.setFont(new Font("Courier", Font.BOLD, 40));
         jl2.setForeground(Color.white);
 
       JCheckBox showPassword=new JCheckBox("Show Password");
       showPassword.setBounds(580,265,140,20);  
       jp1.add(showPassword);

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
	          new adminlogin();    
                        }
           });
    
        
     try                                                                                                                       //id
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select *from admin");
                         while(sr.next())  
                         {
                               jcb1.addItem(sr.getString(1));                                  
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
                               if(x .equals(jcb1.getSelectedItem())) 
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
     new maindemo();  
   new adminhome();  
          jf2.setText("");  
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
                        {    openform.jb.setVisible(true);
       openform.jb1.setVisible(true);
       openform.jb2.setVisible(true);
       openform.jb3.setVisible(true);
       openform.jb4.setVisible(true);
       openform.jb5.setVisible(true);       
        running.jf.setVisible(true);   
        Project.jf.setVisible(true);         
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
            

        ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);



        ImageIcon ic = new ImageIcon("a2.png");

        Image im = ic.getImage().getScaledInstance(800, 400, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l1 = new JLabel(ic);

        l1.setBounds(200,100,800,400);

       l12.add(l1);



         jf.setVisible(true);   
      }
      public static void main(String [] argggs)
      {
        new adminlogin();
      }
}
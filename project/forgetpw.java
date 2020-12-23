import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class forgetpw
{
       JLabel jl,jl1,jl2,jl3;
      JFrame jf;
      JTextField jf1,jtf2,jf3;
      JButton jb,jb1,jb2;
      JPopupMenu jpm;
      JMenuItem i1,i2,i3;
        int f=0;
   static  JComboBox jcb;
  static String f1=""; 
     forgetpw()
      {
         jf=new JFrame();
         jf.setBounds(100,100,1200,600);
         jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          jf.setAlwaysOnTop(true);
         JPanel jp1=new JPanel();
         jp1.setLayout(null); 
         jp1.setBackground(new Color(220,0,0,125));
         jf.add(jp1);
         jp1.setBounds(20,0,1160,600); 
  
            jpm=new JPopupMenu();
            i1=new JMenuItem("Refresh");
            jpm.add(i1);

          jcb= new JComboBox();
           jcb.setBounds(500,130,140,30);
           jp1.add(jcb);
             jcb.addItem("Select");

         JLabel  jl11=new JLabel("Select Your ID");
           jp1.add(jl11);
           jl11.setBounds(250,120,200,50);
            jl11.setFont(new Font("Courier", Font.BOLD, 16));     
           jl=new JLabel("Enter Your Name");
           jp1.add(jl);
           jl.setBounds(250,160,200,50);
            jl.setFont(new Font("Courier", Font.BOLD, 16));
           jl1=new JLabel("Enter Your Father Name");
           jp1.add(jl1) ;       
           jl1.setBounds(250,205,300,50);
           jl1.setFont(new Font("Courier", Font.BOLD, 16));
           jl2=new JLabel("Enter Your Mobile Number");
           jp1.add(jl2);         
           jl2.setBounds(250,250,300,50);
           jl2.setFont(new Font("Courier", Font.BOLD, 16));
           jl3=new JLabel("FORGET PASSWORD FORM");
           jp1.add(jl3);
           jl3.setBounds(300,10,600,50);
           jl3.setFont(new Font("Courier", Font.BOLD, 40));
          jl.setForeground(Color.white);
          jl11.setForeground(Color.white);
          jl1.setForeground(Color.white);
          jl2.setForeground(Color.white);
          jl3.setForeground(Color.white);
          jf3=new JTextField();
         jp1.add(jf3);
         jf3.setBounds(500,170,140,30);
         jf1=new JTextField();
         jp1.add(jf1);
         jf1.setBounds(500,215,140,30);
         jtf2=new JTextField();
         jp1.add(jtf2);
         jtf2.setBounds(500,260,140,30);
         
         jb=new JButton("Update");
         jp1.add(jb);
         jb.setBounds(450,400,100,30);
         jb1=new JButton("Back");
         jp1.add(jb1);
         jb1.setBounds(560,400,100,30);
         jb2=new JButton("Refresh");
         jp1.add(jb2);
         jb2.setBounds(340,400,100,30);

jb2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
jf1.setText("");
jtf2.setText("");
jf3.setText("");
}
});

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
	  new changepwadmin();    
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
        
try 
{
          Class.forName("com.mysql.jdbc.Driver");
          Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");              
            Statement st=cn.createStatement();
     ResultSet rs =st.executeQuery("select *from registration");
                                    while(rs.next())  
                         {
                           jcb.addItem(rs.getString(1));                                  
                         }

       }catch(Exception e){}



       jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                          PreparedStatement pt1 = con.prepareStatement("select *from registration where userID=?");      
                         pt1.setString(1,String.valueOf(jcb.getSelectedItem())); 
                       ResultSet rs=pt1.executeQuery( );
                       String x="",y="",z="";
                  while(rs.next())
                       {
                         x=rs.getString(2);
                         y=rs.getString(3);
                         z=rs.getString(8);
                        }
                  if((jf3.getText().equals(x))&&(jf1.getText().equals(y))&&(jtf2.getText().equals(z)))
                       {         
                             new changepwuser();
                              jf.dispose();
                       }      
                   
         }catch(Exception e){System.out.println(e);} 
       }     	
  });
  
   

       ImageIcon ic = new ImageIcon("bc.jpg");

        Image im = ic.getImage().getScaledInstance(1365,770 , Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(0,0,1365,770);

        jf.add(l);



      
        ImageIcon ic1 = new ImageIcon("c1.png");

        Image im1 = ic1.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l1 = new JLabel(ic1);

        l1.setBounds(400,100,500,400);

       l.add(l1);



         jf.setVisible(true);   
      }
      public static void main(String [] argggs)
      {
        new forgetpw();
      }
}
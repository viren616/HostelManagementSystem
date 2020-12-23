import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class changepwuser
{
       JLabel jl,jl1,jl2,jl3;
    static  JFrame jf;
      JTextField jf1,jtf2,jf3;
      JButton jb,jb1,jb2;
      JPopupMenu jpm;
      JMenuItem i1,i2,i3;
        int f=0;
      changepwuser()
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
     
           jl1=new JLabel("Enter New Password");
           jp1.add(jl1) ;       
           jl1.setBounds(250,150,200,50);
           jl1.setFont(new Font("Courier", Font.BOLD, 16));
           jl2=new JLabel("Confirm Password");
           jp1.add(jl2);         
           jl2.setBounds(250,250,200,50);
           jl2.setFont(new Font("Courier", Font.BOLD, 16));
           jl3=new JLabel("CHANGE PASSWORD FORM");
           jp1.add(jl3);
           jl3.setBounds(300,10,500,50);
           jl3.setFont(new Font("Courier", Font.BOLD, 28));
           jl1.setForeground(Color.white);
           jl2.setForeground(Color.white);
           jl3.setForeground(Color.white);
    
         jf1=new JTextField();
         jp1.add(jf1);
         jf1.setBounds(450,165,140,30);
         jtf2=new JTextField();
         jp1.add(jtf2);
         jtf2.setBounds(450,260,140,30);
         
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
	  new changepwuser();    
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
        
       jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select *from password");
                    String x1=jf1.getText();
                    String y1=jtf2.getText();
                        int f=0;
                        while(sr.next())
                          {
                 	     if(x1.equals(y1)) 
                                 	{
         		f=1;
                                  	 }	         
	       }          
	if (f==1)
                     {
                                PreparedStatement pt=con.prepareStatement("update password set pass=? where userID=? ");  
                                               pt.setString(1,jtf2.getText());
                                               pt.setString(2,String.valueOf(forgetpw.jcb.getSelectedItem()));
                                               pt.executeUpdate();
                    JOptionPane.showMessageDialog(jf,"Updated Sucessfully"); 
	                          
                                             jf.dispose();
	}    
                     else
                        {
                  JOptionPane.showMessageDialog(jf,"Incorrect Password");
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
        new  changepwuser();
      }
}
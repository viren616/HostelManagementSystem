import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class delete
{
	static JLabel jl,jl2;
 	static JFrame jf;
   	JButton jb,jb3;
	JComboBox jcb;   
                    JPopupMenu jpm;
                   JMenuItem i1; 
         
      delete()
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
  
           jl2=new JLabel("DELETE STUDENT FORM");
           jl2.setBounds(300,10,600,50);
           jl2.setFont(new Font("Courier", Font.BOLD, 40));
          jl2.setForeground(Color.white);
           jp1.add(jl2);
                                                 
        
         jb3=new JButton("DELETE");
         jp1.add(jb3);
         jb3.setBounds(550,200,100,20);
         jb=new JButton("BACK");
         jp1.add(jb);
         jb.setBounds(1200,500,100,30);


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
	  new delete();    
                        }
           });

 jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                                        new userdelinfo();
                                jf.dispose(); 
     }catch(Exception e){System.out.println(e);}                       
                 }      	
         });

    

         String f="";
     jb3.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                PreparedStatement pt=con.prepareStatement("delete from registration where userID=?");                   
	{
                 pt.setString(1,userdelinfo.f);
                      pt.executeUpdate();
	} 
                     }catch(Exception e){System.out.println(e);}                       
                 }      	
         });

     jb3.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                PreparedStatement pt=con.prepareStatement("delete from facility where userID=?");                   
	{
                 pt.setString(1,userdelinfo.f);
                 pt.executeUpdate();            
	} 
                     }catch(Exception e){System.out.println(e);}                       
                 }      	
         });

      jb3.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                PreparedStatement pt=con.prepareStatement("delete from password where userID=?");                   
	{
                 pt.setString(1,userdelinfo.f);
                 pt.executeUpdate();            
                 JOptionPane.showMessageDialog(jf,"Delete sucessfully"); 
                new userdelinfo();
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



 
        ImageIcon ic1=new ImageIcon("d1.png");
        Image im1=ic1.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH);
        ic1=new ImageIcon(im1);
        JLabel l2=new JLabel(ic1);
        l2.setBounds(800,100,300,300); 
        l.add(l2);       

  jf.setVisible(true);   
      }
      public static void main(String [] argggs)
      {
        new delete();
      }
}
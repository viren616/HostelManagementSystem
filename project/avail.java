import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.*;
import java.sql.*;
class avail 
{
         static  JFrame jf;
         JButton jb,jb2,jb3;
         JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7;  
         JPanel jp; 
         JPopupMenu jpm;
         JMenuItem i1; 
         int z,bed1,bed2,c;                    

      avail()
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

         jb=new JButton("Check Availablity");
         jb.setBounds(430,300,150,20);
         jp1.add(jb);
         jb2=new JButton("BACK");
         jb2.setBounds(1200,500,100,30);
         jp1.add(jb2);
         jb3=new JButton("Registration");
         jp1.add(jb3);        
         jb3.setBounds(600,300,150,20);
         jb3.setVisible(false);
      
         jl=new JLabel("One bedroom");
         jp1.add(jl);
         jl.setBounds(200,150,150,20);	
         jl.setFont(new Font("Courier", Font.BOLD, 18));
         jl1=new JLabel("Two bedroom");
         jp1.add(jl1);
         jl1.setBounds(200,200,150,20);
         jl1.setFont(new Font("Courier", Font.BOLD, 18));
         jl2=new JLabel("Available Rooms");
         jl2.setBounds(400,100,200,20);
         jl2.setFont(new Font("Courier", Font.BOLD, 18));
         jp1.add(jl2);
         jl3=new JLabel();
         jl3.setBounds(400,150,50,20);
         jl3.setFont(new Font("Courier", Font.BOLD, 18));
         jp1.add(jl3);
         jl4=new JLabel();
         jl4.setBounds(400,200,50,20);
         jl4.setFont(new Font("Courier", Font.BOLD, 18));
         jp1.add(jl4);
         jl5=new JLabel();
         jl5.setBounds(600,150,50,20);
         jl5.setFont(new Font("Courier", Font.BOLD, 18));
         jp1.add(jl5);
         jl6=new JLabel();
         jl6.setBounds(600,200,50,20);
         jl6.setFont(new Font("Courier", Font.BOLD, 18));
         jp1.add(jl6);
         jl7=new JLabel("CHECK AVAILABILITY FORM");
         jl7.setBounds(300,10,800,30);
         jl7.setFont(new Font("Courier", Font.BOLD, 40));
         jp1.add(jl7);
        JLabel  jl17=new JLabel("Occupied Room");
         jl17.setBounds(600,100,200,20);
         jl17.setFont(new Font("Dialog", Font.BOLD, 18));
         jp1.add(jl17);
        jl.setForeground(Color.white);
jl1.setForeground(Color.white);
jl2.setForeground(Color.white);
jl3.setForeground(Color.white);
jl4.setForeground(Color.white);
jl5.setForeground(Color.white);
jl6.setForeground(Color.white);
jl7.setForeground(Color.white);
jl17.setForeground(Color.white);


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
	  new avail();    
                        }
           });

         jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
	             {                                        
                                     try                                                                                                                        {
                                                    Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select count(bed_type) from registration where bed_type=1");
                      String str="";
                         while(sr.next())  //1room
                         {
                           str=sr.getString(1);                                   
                         }
                          bed1=Integer.parseInt(str);
                           z=20-bed1; 
                         }catch(Exception e){System.out.println(e);} 

              try                                                                                                                        {                          
                          Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select count(bed_type) from registration where bed_type=2");
                      String str="";
                         while(sr.next())  //1room
                         {
                           str=sr.getString(1);                                   
                         }
                          bed2=Integer.parseInt(str);
                           c=20-bed2; 
                         }catch(Exception e){System.out.println(e);} 

      		if ((z >=1)|| (c>=1))
                  		     { 
			String az = String.valueOf(z);
			jl3.setText(az);
			String a1 = String.valueOf(c);
			jl4.setText(a1);
			String aq = String.valueOf(bed1);
			jl5.setText(aq);
			String a2 = String.valueOf(bed2);
			jl6.setText(a2);     
  	                                      jb3.setVisible (true) ;          
                                                         jf.repaint();
                                           }     
     		else
		{
            		JOptionPane.showMessageDialog(jl1, "SORRY NO ROOM AVAILABLE");
		}
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
                  new room();                       
                  jf.dispose();
                        }catch(Exception e){System.out.println(e);} 
                  }      	
         });

     jb2.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     
                          try
                        {
       openform.jb.setVisible(true);
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

      
     ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);



        ImageIcon ic = new ImageIcon("r1.png");

        Image im = ic.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l1 = new JLabel(ic);

        l1.setBounds(400,100,500,400);

       l12.add(l1);



jf.setVisible(true);
}
public static void main (String[] arg )
 { 
new avail();
}
}

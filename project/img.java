import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.sql.*;

class img
  {
    JFrame jf;
    ImageIcon ic,ic1,ic3;
    JLabel l1,l2,l3;
   JButton b1,b2;
    Image img1;
    File f1;
       JPopupMenu jpm;
         JMenuItem i1; 
    img()
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
  
         b1=new JButton("SELECT");
        b1.setBounds(400,260,150,30); 
         jp1.add(b1);
         b2=new JButton("UPLOAD");
         b2.setBounds(600,260,150,30); 
         jp1.add(b2);          
        JButton  jb3=new JButton("BACK");
         jb3.setBounds(1200,500,100,30);
         jp1.add(jb3);

         JLabel jl1=new JLabel("Select ID");
         jp1.add(jl1);
          jl1.setBounds(100,50,140,140);
         jl1.setFont(new Font("Courier",1,20));
          jl1.setForeground(Color.white);
    JLabel      jl2=new JLabel("UPDATE PHOTO FORM");
         jp1.add(jl2);
          jl2.setBounds(300,0,600,50);
         jl2.setFont(new Font("Courier",1,40));
          jl2.setForeground(Color.white);
   
      JComboBox  jcb=new JComboBox(); 
         jp1.add(jcb);
        jcb.setBounds(300,100,140,30);

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
                     new img();    
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

 
    b1.addActionListener(new ActionListener()
      { 
       public void actionPerformed(ActionEvent ae)
        {
          JFileChooser jc= new JFileChooser();
               int x= jc.showOpenDialog(jf);            
               f1 = jc.getSelectedFile();        
               ic = new ImageIcon(f1.getPath());
               Image img = ic.getImage();
               img1= img.getScaledInstance(140,140,Image.SCALE_SMOOTH);
               ic1 = new ImageIcon(img1);          
               l1=new JLabel(ic1);
               jp1.add(l1);
              l1.setBounds(500,100,140,140);
              l1.setBackground(Color.cyan);  
         }       
      });   
      

     b2.addActionListener(new ActionListener()
      {
       public void actionPerformed(ActionEvent ae)
         {
          try
           {
              File f=new File(f1.toString());
              System.out.println("Inside234");                     
              FileInputStream fin=new FileInputStream(f);
      
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");
               PreparedStatement pt = con.prepareStatement("update registration set image=?  where userID=?");
               pt.setBinaryStream(1,(InputStream)fin,(int)f.length());                    
               pt.setString(2,jcb.getSelectedItem().toString());                                     
                                                                              
               pt.executeUpdate();
   JOptionPane.showMessageDialog(jf,"Update Sucessfully"); 
          }catch(Exception e){System.out.println(e);}
         }
      });
  
     jb3.addActionListener(new ActionListener()
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

     ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);



    ImageIcon ic = new ImageIcon("up1.png");

        Image im = ic.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l1 = new JLabel(ic);

        l1.setBounds(400,100,500,400);

       l12.add(l1);



     jf.setVisible(true); 
    }
   public static void main(String args[])
     {
     new img();
    }
  }
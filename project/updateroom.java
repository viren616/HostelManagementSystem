import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

import java.awt.Label;

import javax.swing.*;
import java.sql.*;
class updateroom
{
        JFrame jf;
     JButton jb,jb2,jcb;
JComboBox jcbx,jcb1,jcb2;
JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,jl19,jl20;
   public static Object f,f1,f2;   
   JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
 int a,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,s1,a11,a12,a13,a14,a15;
   JRadioButton Add_Facility,Cancel_Facility ;   
       ButtonGroup bg,cg; 
      JPopupMenu jpm;
         JMenuItem i1; 
         String s,s11,s2,s3,s4,s5;
      updateroom()
      {
         jf=new JFrame();
         jf.setBounds(0,200,1370,750);
         jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Font f3=new Font("Courier",Font.BOLD,24);
         Font f4=new Font("Courier",Font.BOLD,20);
         jf.setAlwaysOnTop(true); 
      
         JPanel jp=new JPanel();
         jp.setLayout(null); 
         jp.setBackground(new Color(220,0,0,125));
         jf.add(jp);
         jp.setBounds(20,0,1330,570); 

          Add_Facility= new JRadioButton("ADD FACILITY");
          Add_Facility.setBounds(980,50,160,30);
         Add_Facility.setSelected(true);
      Cancel_Facility = new JRadioButton("CANCEL FACILITY");
          Cancel_Facility.setBounds(1180,50,160,30);            
           bg = new ButtonGroup(); 
           bg.add(Add_Facility); 
           bg.add(Cancel_Facility);   
           jp.add(Add_Facility);
           jp.add(Cancel_Facility);
  
            
         jb=new JButton("UPDATE");
         jb.setBounds(400,400,100,30);
         jp.add(jb);   
         jb2=new JButton("BACK");
         jb2.setBounds(1200,500,100,30);
         jp.add(jb2);

         jcbx=new JComboBox();
         jcbx.addItem("Select");
         jcbx.addItem("One BedRoom");
         jcbx.addItem("Two BedRoom");
         jp.add(jcbx);  
         jcbx.setBounds(300,140,180,30);
         jcb1=new JComboBox();
         jcb1.addItem("Select");
         jcb1.addItem("Yes");
         jcb1.addItem("No");
 	jp.add(jcb1);  
         jcb1.setBounds(300,190,180,30);
         jcb2=new JComboBox();
         jcb2.addItem("Select");
         jcb2.addItem("Monthly");
         jcb2.addItem("Quaterly");
         jcb2.addItem("Annually");
	jp.add(jcb2);  
         jcb2.setBounds(300,240,180,30);
           jpm=new JPopupMenu();
            i1=new JMenuItem("Refresh");
            jpm.add(i1);
  

          jl=new JLabel("Room Type");
          jl.setBounds(120,140,150,30);
          jl.setFont(f3);
          jp.add(jl);
          jl.setFont(new Font("Courier", Font.BOLD, 24));
          jl.setForeground(Color.white);
          jl1=new JLabel("Mess Facility");
          jl1.setBounds(120,190,150,30);
          jl1.setFont(f3);
          jp.add(jl1);  
          jl1.setForeground(Color.white);
         jl1.setFont(new Font("Courier", Font.BOLD, 18));
         jl2=new JLabel("Mode Of Payment");
         jl2.setBounds(120,240,250,30);
         jl2.setFont(f3);
          jl2.setForeground(Color.white); 
        jp.add(jl2);
        jl2.setFont(new Font("Courier", Font.BOLD, 18));
        jl3=new JLabel("UPDATE SELECTIONS");
         jl3.setBounds(400,10,500,60);
          jl3.setForeground(Color.white);
           jp.add(jl3);
        jl3.setFont(new Font("Dialog", Font.BOLD, 42));
        jl3.setForeground(Color.blue);
         jl4=new JLabel("Our facilities");
         jl4.setBounds(750,75,300,30);
         jl4.setFont(f3);
           jl4.setForeground(Color.white);
           jp.add(jl4);
         jl11=new JLabel("Balance");
         jl11.setBounds(1030,100,250,30);
         jl11.setFont(f4);
           jl11.setForeground(Color.white);
          jp.add(jl11);
         jl5=new JLabel("Campus Tour");
         jl5.setBounds(650,140,250,30);
         jl5.setFont(f3);
           jl5.setForeground(Color.white);
         jp.add(jl5);
          c1=new JCheckBox("yes");
         c1.setBounds(910,140,120,30);
         c1.setFont(f4);
        jp.add(c1);
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
	  new updateroom();    
                         jf.dispose();
                        }
           });
  

     JLabel  jl111=new JLabel("5000");
         jl111.setBounds(1030,140,250,30);
         jl111.setVisible(false);
         jl111.setFont(f4);
         jp.add(jl111);
  jl111.setForeground(Color.white);
        c1.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
                 if(c1.isSelected()==true)
                 {       
                                 a1=5000;
                    s1=a1+a2+a3+a4+a5;                           
                    jl20.setText(s1+"");        
                    jl111.setText(a1+"");            
                                      jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
                  } 
                 else
          {           
                                        a1=0;
                      s1=a1+a2+a3+a4+a5;                        
                  jl20.setText(s1+""); 
               jl111.setVisible(false);              
                                jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
                  }
             }
           });


         jl6=new JLabel("H & F Center");
         jl6.setBounds(650,190,250,30);
         jl6.setFont(f3);
         jp.add(jl6);
         jl6.setForeground(Color.white);
         c2=new JCheckBox("yes");
         c2.setBounds(910,190,120,30);
         c2.setFont(f4);
        jp.add(c2);

         jl13=new JLabel("3000");
         jl13.setBounds(1030,190,250,30);
         jl13.setVisible(false);
         jl13.setFont(f4);
         jp.add(jl13);
         jl13.setForeground(Color.white);
     c2.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
                 if(c2.isSelected()==true)
               { 
                                                     a2=3000;
                    s1=a1+a2+a3+a4+a5;                           
                    jl20.setText(s1+"");        
                    jl13.setText(a2+"");            
                  jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
               }  
               else
             {  
                                          a2=0;
                      s1=a1+a2+a3+a4+a5;                        
                  jl20.setText(s1+""); 
              	 jl13.setText(a2+"");            
	             jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
                      
              }  
             }
           });

         jl7=new JLabel("Transportation");
         jl7.setBounds(650,240,250,30);
         jl7.setFont(f3);
         jp.add(jl7);
         jl7.setForeground(Color.white);
         c3=new JCheckBox("yes");
         c3.setBounds(910,240,120,30);
         c3.setFont(f4);
         jp.add(c3);

         jl14=new JLabel("3000");
         jl14.setBounds(1030,240,250,30);
         jl14.setVisible(false);
         jl14.setFont(f4);
         jp.add(jl14);
       jl14.setForeground(Color.white);
      c3.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
                 if(c3.isSelected()==true)
                 {  
                              a3=3000;
          s1=a1+a2+a3+a4+a5;
            jl20.setText(s1+"");
                jl14.setVisible(false);
	           jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
	}
                 else
	{  
                 a3=0;
                  s1=a1+a2+a3+a4+a5;
            jl20.setText(s1+"");          
                jl14.setVisible(false);
                   		jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
	}  
             }
           });

         jl8=new JLabel("Internet");
         jl8.setBounds(650,290,250,30);
         jl8.setFont(f3);
         jp.add(jl8);
         jl8.setForeground(Color.white);
         c4=new JCheckBox("yes");
         c4.setBounds(910,290,120,30);
         c4.setFont(f4);
        jp.add(c4);

         jl15=new JLabel("3000");
         jl15.setBounds(1030,290,250,30);
         jl15.setVisible(false);
         jl15.setFont(f4);
         jp.add(jl15);
        jl15.setForeground(Color.white);
      c4.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
                 if(c4.isSelected()==true)
	{  
  	                 a4=3000;   
                     s1=a1+a2+a3+a4+a5;
                       jl20.setText(s1+"");
                     jl15.setVisible(true);
		jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
	}
                 else
	{
                            a4=0;  
                s1=a1+a2+a3+a4+a5;
            jl20.setText(s1+"");
          jl15.setVisible(false);
	jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
	}	  
             }
           });

         jl9=new JLabel("Sports Academy");
         jl9.setBounds(650,340,250,30);
         jl9.setFont(f3);
         jp.add(jl9);
         jl9.setForeground(Color.white);
         c5=new JCheckBox("yes");
         c5.setBounds(910,340,120,30);
         c5.setFont(f4);
        jp.add(c5);

         jl16=new JLabel("3000");
         jl16.setBounds(1030,340,250,30);
         jl16.setVisible(false);
         jl16.setFont(f4);
         jp.add(jl16);
        jl16.setForeground(Color.white);
      c5.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
                 if(c5.isSelected()==true)
              {
                      a5=3000;
                  s1= a1+a2+a3+a4+a5;
                   jl20.setText(s1+""); 
                  jl16.setVisible(true);
                                                jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
              }  
               else
            {   
                       a5=0;
                  s1= a1+a2+a3+a4+a5;
                   jl20.setText(s1+""); 
                jl16.setVisible(false);
                                          jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
             }  
             }
           });

c1.setEnabled(false);
c2.setEnabled(false);
c3.setEnabled(false);
c4.setEnabled(false);
c5.setEnabled(false);

         jl18=new JLabel("Total Amount");
         jl18.setBounds(650,440,250,30);
         jl18.setFont(f3);
         jp.add(jl18);
        jl18.setForeground(Color.white);

         jl19=new JLabel("=");
         jl19.setBounds(910,440,250,30);
         jl19.setFont(f3);
         jp.add(jl19);
         jl19.setForeground(Color.white);
         jl20=new JLabel();
         jl20.setBounds(1030,440,250,30);
         jl20.setFont(f3);
         jp.add(jl20);        
        jl20.setForeground(Color.white);      




     jcbx.addItemListener(new ItemListener()
         {
 public void itemStateChanged(ItemEvent event) {
      if (event.getStateChange() == ItemEvent.SELECTED) {
         f = event.getItem();
         if(f.equals("One BedRoom"))
               {
            	               a=1;
               }										//comboboxbedroom
            else if(f.equals("Two BedRoom"))
             {
            	
                    a=2;
               }
       }
    }    
});  

   
     jcb1.addItemListener(new ItemListener()
         {
 public void itemStateChanged(ItemEvent event) {
      if (event.getStateChange() == ItemEvent.SELECTED) {
         f1= event.getItem();
          
       }
    }    
});                                                       
        jcb2.addItemListener(new ItemListener()
         {
 public void itemStateChanged(ItemEvent event) {
      if (event.getStateChange() == ItemEvent.SELECTED) {
       
  f2 = event.getItem();
       }
    }    
});      
                                                 
                
     Add_Facility .addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
                 if(  Add_Facility.isSelected()==true)
	{
                  if (userinfo.jl18.getText().equals("true"))
                   {   
             c1.setSelected(true);
            c1.setEnabled(false);
                     }
                else
                   {
                   c1.setSelected(false);
                    c1.setEnabled(true);
                    }
                   if (userinfo.jl19.getText().equals("true"))
                   {
            c2.setSelected(true);
            c2.setEnabled(false);
                     }
                  else
                   {
                   c2.setSelected(false);
                    c2.setEnabled(true);
                    }
                 if (userinfo.jl20.getText().equals("true"))
                   {
           c3.setSelected(true);
           c3.setEnabled(false);
                     }
               else
                   {
                   c3.setSelected(false);
                    c3.setEnabled(true);
                    }
                    if (userinfo.jl21.getText().equals("true"))
                   {
	c4.setSelected(true);
               c4.setEnabled(false);
                     }
                  else
                   {
                    c4.setSelected(false);
                   c4.setEnabled(true);
                    }
                 if (userinfo.jl22.getText().equals("true"))
                   {
               c5.setSelected(true);
               c5.setEnabled(false);
                     }
                      else
                   {
                    c5.setSelected(false);
                   c5.setEnabled(true);
                    }

                   
            jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                      {          
             try
                         {
                                Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
     PreparedStatement pt=con.prepareStatement("update facility set campustour=?,h_fcenter=?,transportation=?,internet=?,sports=? where userID=? ");                
                  pt.setString(1,(c1.isSelected())+"");
                  pt.setString(2,(c2.isSelected())+"");
                  pt.setString(3,(c3.isSelected())+"");
                  pt.setString(4,(c4.isSelected())+"");
                  pt.setString(5,(c5.isSelected())+"");
                  pt.setString(6,userinfo.jcb.getSelectedItem().toString());                                     
                 pt.executeUpdate();          
                   }catch(Exception e){System.out.println(e);}                       

               }      	
         });
                              	jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
                      }
                 }
           });
    

 Cancel_Facility .addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
                 if(  Cancel_Facility.isSelected()==true)
	{
                 if (userinfo.jl18.getText().equals("true"))
                   {   
               c1.setSelected(false);
               c1.setEnabled(true);
                     }
                else
                   {
                   c1.setSelected(true);
                    c1.setEnabled(false);
                    }
                   if (userinfo.jl19.getText().equals("true"))
                   {
            c2.setSelected(false);
            c2.setEnabled(true);
                     }
                  else
                   {
                   c2.setSelected(true);
                    c2.setEnabled(false);
                    }
                 if (userinfo.jl20.getText().equals("true"))
                   {
         c3.setSelected(false);
         c3.setEnabled(true);
                     }
               else
                   {
                   c3.setSelected(true);
                    c3.setEnabled(false);
                    }
                    if (userinfo.jl21.getText().equals("true"))
                   {
	c4.setSelected(false);
               c4.setEnabled(true);
                     }
                  else
                   {
                    c4.setSelected(true);
                   c4.setEnabled(false);
                    }
                 if (userinfo.jl22.getText().equals("true"))
                   {
               c5.setSelected(false);
               c5.setEnabled(true);
                     }
                      else
                   {
                    c5.setSelected(true);
                   c5.setEnabled(false);
                    }


            jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                      {          
             try
                        {                       
                           Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
     PreparedStatement pt=con.prepareStatement("update facility set campustour=?,h_fcenter=?,transportation=?,internet=?,sports=? where userID=? ");                
                 pt.setString(1,!(c2.isSelected())+"");
                  pt.setString(2,!(c2.isSelected())+"");
                pt.setString(3,!(c3.isSelected())+"");
                 pt.setString(4,!(c4.isSelected())+"");
                 pt.setString(5,!(c5.isSelected())+"");
                 pt.setString(6,userinfo.jcb.getSelectedItem().toString());                                     
                pt.executeUpdate();          
                   }catch(Exception e){System.out.println(e);}                       
               }      	
         });
                              	jf.repaint();
                                                   jp.revalidate();
                                                   jp.repaint();
                      }
                 }
           });




 jb.addActionListener(new ActionListener()
      {
       public void actionPerformed(ActionEvent ae)
         {
                 if(  Add_Facility.isSelected()==true)
	{
                   a10 =Integer.valueOf(jl20.getText());                                                             
                        a15=a10+Integer.valueOf(userinfo.str2);                                                                                 
               }   
                     else// if (Cancel_Facility.isSelected()==true)
	{
                   a11 =Integer.valueOf(jl20.getText());                                                             
                        a15=Integer.valueOf(userinfo.str2)-a11;                                                                                 
                   }  

          try
           { 
             
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");
               PreparedStatement pt = con.prepareStatement("update registration set bed_type=? , mess=?,paymentmode=? , havetopay=? where userID=?");
               pt.setString(1,String.valueOf(a));                                     
               pt.setString(2,jcb1.getSelectedItem().toString());                                     
               pt.setString(3,jcb2.getSelectedItem().toString());                                     
                pt.setString(4,String.valueOf(a15));
               pt.setString(5,userinfo.jcb.getSelectedItem().toString());                                     
               pt.executeUpdate();
               JOptionPane.showMessageDialog(jf,"Update Sucessfully"); 
               new userinfo();
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
              jf.dispose();              
        new userinfo();
               }catch(Exception e){System.out.println(e);}                       
                 }      	
         });


       ImageIcon ic = new ImageIcon("bc.jpg");

        Image im = ic.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l12 = new JLabel(ic);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);



       ImageIcon ic1 = new ImageIcon("u4.png");

        Image im1 = ic1.getImage().getScaledInstance(500,500 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l13 = new JLabel(ic1);

        l13.setBounds(100,50,1000,500);

        jp.add(l13);


      
jf.setVisible(true);
}

public static void main (String[] arg )
 { 
new updateroom();
}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.imageio.*;
import java.util.*;
import javax.swing.table.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;
import org.jdatepicker.graphics.*;
import java.text.*;
import java.awt.print.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JFormattedTextField.AbstractFormatter;

class print
  {
    JFrame jf;
    JPanel p1,p2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
    JComboBox cb1;
    JButton b1,b2,b3;
    JTable jtb;
     ResultSet rs;
    JScrollPane jsp;
    print()
     {
      jf=new JFrame();
      jf.setSize(1370,770);
      jf.setLayout(null);
      jf.getContentPane().setBackground(new Color(150,150,150));
      jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
      Font f=new Font("Arial",Font.BOLD,22);

     tf1=new JTextField();
     tf1.setBounds(800,650,200,35);
     tf1.setFont(f);
   jf.add(tf1);

    b2=new JButton("Print");
    b2.setBounds(1000,650,150,35);
    b2.setBackground(Color.white);
    b2.setFont(f);
   jf.add(b2);
  
   b3=new JButton("Back");
   b3.setBounds(1190,650,150,35);
   b3.setBackground(Color.white);
   b3.setFont(f);
   jf.add(b3);

   jtb=new JTable();
    jsp= new JScrollPane(jtb);
   jsp.setBounds(50,50,1280,550);   
  JTableHeader jth=jtb.getTableHeader();
 jf.add(jsp);

           try  
              {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");
                PreparedStatement pt=con.prepareStatement("select*from registration ");                        
                     ResultSet rs = pt.executeQuery();
                     while(rs.next())
                       {
                        jtb.setModel(DbUtils.resultSetToTableModel(rs));                        
                        MessageFormat h=new MessageFormat("Customer Detail");
                        MessageFormat ft=new MessageFormat("{0,number}");   
                       }        
           
              }catch(Exception e){System.out.println(e);}
          
      
   b2.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent ae)
           {
           try  
              {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");
                PreparedStatement pt=con.prepareStatement("select*from registration where userID=? ");                        
                     pt.setString(1,tf1.getText());
                     ResultSet rs = pt.executeQuery();
                     while(rs.next())
                       {
                        jtb.setModel(DbUtils.resultSetToTableModel(rs));                        
                        MessageFormat h=new MessageFormat("Customer Detail");
                        MessageFormat ft=new MessageFormat("{0,number}");   
                       }        
           
              }catch(Exception e){System.out.println(e);}          
           }
       });  

    b3.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent ae)
           {
             jf.dispose();
           }
       });  

      jf.setVisible(true);
     }
   public static void main(String args[])
      {
      new print();
      }
  }


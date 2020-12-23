import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
class Tablep extends JFrame
{
     JTable jt;   
     JScrollPane jp;
     DefaultTableModel dtm;                                                                           
    Tablep()
    {
         setSize(800,800);
         setLayout(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
                        	
    //creating table
        jt = new JTable();
       dtm = new DefaultTableModel(0, 0);
       String header[] = new String[] { "userId", "password","student_name","father_name", "gender","mob_no","date_of_birth","mail","age","city"};
      dtm.setColumnIdentifiers(header);
          
try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");
            System.out.println("connection successful");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from registration where userID='st0'");
            while(rs.next())
               {
                                              
	 String a = rs.getString(1);
	 String b = rs.getString(2);
	 String c = rs.getString(3);
	 String d = rs.getString(4);
	 String e = rs.getString(5);
	 String f = rs.getString(6);
                    String g = rs.getString(7);
	 String h = rs.getString(8);
	 String i = rs.getString(9);
	 String j = rs.getString(10);
                 
                 dtm.addRow(new Object[] { a,b,c,d,e,f,g,h,i,j});
               }
          }catch(Exception e) {System.out.println("error in connecting");}
     
            jt.setModel(dtm);
           add(jt);
         jp=new JScrollPane(jt);
      jp.setBounds(0,0,800,800);
add(jp,BorderLayout.CENTER);
	        
          setVisible(true);
     }
	
 public static void main(String args[])
      {
          new Tablep();
        }

}
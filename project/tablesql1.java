import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;
public class tablesql1   extends userlogin
{
       JFrame jf; 
       JButton jb; 
      JTable table;
  public tablesql1()
    {
        jf=new JFrame();
        jf.setBounds(0,260,1370,750);
        jf.setUndecorated(true);
        jf.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );
           
       jb =new JButton("Back");
        jb.setBounds(600,400,130,30);
        jf.add(jb);    
        String url = "jdbc:mysql://localhost:3306/bca";
        String userid = "root";
        String pass= "viren";
       table=new JTable();    

 jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                  {
       try
       { 
        Connection connection = DriverManager.getConnection(url, userid, pass);
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select *from admin");
//                                             pt.setString(1,"st0");
	
      ResultSet rs=pt.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));                

        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
      }
     });
       
        JScrollPane scrollPane = new JScrollPane( table );
        jf.getContentPane().add( scrollPane );

        JPanel bp = new JPanel();
        jf. getContentPane().add( bp, BorderLayout.SOUTH );
        jf.setVisible(true);    
}
      
    public static void main(String[] args)
    {
           new tablesql1();
       
    }
}
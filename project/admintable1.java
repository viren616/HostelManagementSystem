import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class admintable1   
{
       JFrame jf; 
       JButton jb; 
  public admintable1()
    {
        jf=new JFrame();
        jf.setBounds(0,200,1370,570);
        jf.setUndecorated(true);
        jf.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );     
 
        jf.setAlwaysOnTop(true);        
      
        jb =new JButton("Back");
        jb.setBounds(600,400,130,30);
        jf.add(jb);    
    
 jb.addActionListener(new ActionListener()
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
       
      ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

                                                                                                   //  Connect to an MySQL Database, run query, get result set
        String url = "jdbc:mysql://localhost:3306/bca";
        String userid = "root";
        String pass= "viren";
               
       try
       { 
        Connection connection = DriverManager.getConnection(url, userid, pass);
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement("select *from admin where userID=? ");
                                             pt.setString(1,adminlogin.x);
	                         ResultSet rs=pt.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

                                                                                                                             //  Get column names
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

                                                                                                                               //  Get row data
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }


        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

                                                                                                                              //  Create table with database data    
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        jf.getContentPane().add( scrollPane );

        JPanel bp = new JPanel();
       jf. getContentPane().add( bp, BorderLayout.SOUTH );
         jf.setVisible(true);    
}
      
    public static void main(String[] args)
    {
           new admintable1();       
    }
}
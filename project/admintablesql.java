import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class admintablesql 
{
      static JFrame jf;  
       JButton jb;
  public admintablesql()
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
                        {new maindemo();
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
        String sql = "SELECT * FROM admin";
 
       try (Connection connection = DriverManager.getConnection(url, userid, pass);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
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

        JPanel buttonPanel = new JPanel();
       jf. getContentPane().add( buttonPanel, BorderLayout.SOUTH );
 /*
        ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);


   */
 jf.setVisible(true);    
}
      
    public static void main(String[] args)
    {
           new admintablesql();       
    }
}
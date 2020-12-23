import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
class testfrm 

{

         JFrame jf;
       JTable jt;
     //  JScrollPane jp;
     
      testfrm()
      {

             jf=new JFrame();                                                    
             jf.setBounds(0,260,1350,750);
             jf.setLayout(null);

       //    jp=new JScrollPane();
         //    jp.setBounds(0,0,1350,750);
            //add(jp,BorderLayout.CENTER);

       JScrollPane jsp1 = new JScrollPane(jf, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                       jsp1.setBounds(0,0,1350,750);
                       jf.add(jsp1);
   jsp1.setVisible(true);
                 
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setVisible(true);
             
      }
      public static void main(String args[])
     {
          new testfrm();
     }
}
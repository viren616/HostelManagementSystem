import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 import java.sql.*;
 
class createpwd
{
 static JFrame jf;
JPanel jp;
JLabel jl,jl1,jl2,jl3,jl4;
JTextField jtf1;
JPasswordField jpf,jpf1;
JButton jb1,jb2,jb3;
createpwd()
{

jf=new JFrame();
jf.setTitle(" Create Password Form");
jf.setLayout(null);
jf.setBounds(100,100,1200,600);
jf.setUndecorated(true);
jf.setAlwaysOnTop(true);
         JPanel jp=new JPanel();
         jp.setLayout(null); 
         jp.setBackground(new Color(220,0,0,125));
         jf.add(jp);
         jp.setBounds(20,0,1160,600); 

jl1= new JLabel("Create Password Form");
jl2= new JLabel("User Id:");
jl3= new JLabel("Enter the password:");
jl4= new JLabel("Confirm password:");
Font f=new Font("Courier",Font.BOLD,40);
Font f1=new Font("Courier",Font.BOLD,25);
jl2.setBounds(300,130,370,30);
jl3.setBounds(300,200,370,30);
jl4.setBounds(300,270,370,30);
jl1.setBounds(300,20,500,40);
jp.add(jl1);
jp.add(jl2);
jp.add(jl3);
jp.add(jl4);
jl1.setFont(f);
jl2.setFont(f1);
jl3.setFont(f1);
jl4.setFont(f1);
jtf1=new JTextField();
jpf=new JPasswordField();
jpf1=new JPasswordField();
jtf1.setBounds(600,130,180,40);
jpf.setBounds(600,200,180,40);
jpf1.setBounds(600,270,180,40);
jtf1.setEnabled(false);
jp.add(jtf1);
jp.add(jpf);
jp.add(jpf1);

jtf1.setFont(f1);
jpf.setFont(f1);
jpf1.setFont(f1);
jb1=new JButton("RESET");
jb2=new JButton("OK");
jb3=new JButton("EXIT");
jb1.setBounds(380,400,160,30);
jb2.setBounds(550,400,120,30);
jb3.setBounds(680,400,100,30);
jl1.setForeground(Color.white);
jl2.setForeground(Color.white);
jl3.setForeground(Color.white);
jl4.setForeground(Color.white);
jp.add(jb1);
jp.add(jb2);
jp.add(jb3);


jb1.setFont(f1);
jb2.setFont(f1);
jb3.setFont(f1);

jtf1.setText(regform11.str);

jb1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
jpf.setText("");
jpf1.setText("");
}
});



jb2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
if (jtf1.getText().equals("") || jpf.getText().equals("") || jpf1.getText().equals(""))
{
JOptionPane.showMessageDialog(jf,"Please Fill all the Textfield");
}
else
{
if ( jpf.getText().equals(jpf1.getText()))
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren") ;
PreparedStatement pst=cn.prepareStatement("insert into password values(?,?)");
pst.setString(1,jtf1.getText());
pst.setString(2,jpf1.getText());
pst.executeUpdate();
JOptionPane.showMessageDialog(jf,"Password Created Successfully");
jf.dispose();
regform11.jf.dispose();

new avail();
}catch(Exception e){System.out.println(e);}

else
{
jpf.setBackground(Color.red);
jpf1.setBackground(Color.red);
JOptionPane.showMessageDialog(jf,"Sorry password does not match");
}
}
  }
  });


jb3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
             jf.dispose();
          regform11.jf.dispose();

       openform.jb.setVisible(true);
       openform.jb1.setVisible(true);
       openform.jb2.setVisible(true);
       openform.jb3.setVisible(true);
       openform.jb4.setVisible(true);
       openform.jb5.setVisible(true);       
        running.jf.setVisible(true);   
        Project.jf.setVisible(true);         
}
});

        ImageIcon ic1 = new ImageIcon("bc.jpg");

        Image im1 = ic1.getImage().getScaledInstance(1200,600 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(0,0,1200,600);

        jf.add(l12);


        ImageIcon ic = new ImageIcon("p3.png");

        Image im = ic.getImage().getScaledInstance(900,400 , Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l112 = new JLabel(ic);

        l112.setBounds(100,100,900,400);

        l12.add(l112);



jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
jf.setVisible(true);
}

public static void main(String [] arsss)
{
new createpwd();
}   
}


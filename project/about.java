import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class about 
{
   static     JFrame jf;
JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8;    
    about()
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
    
          JButton jb =new JButton("BACK");
          jb.setBounds(1200,400,100,30);
          jp1.add(jb);                  

           jl1 = new JLabel("Submitted By");
           jp1.add(jl1);
          jl1.setBounds(600,210,300,80);											          jl1.setFont(new Font("Courier",1, 25));
          jl1.setForeground(Color.white);
          jl2 = new JLabel("~  Virendra Singh");
          jl2.setBounds(430,420,300,80);											
          jp1.add(jl2);
          jl2.setFont(new Font("Courier",1, 20));
          jl2.setForeground(Color.white);
          jl3 = new JLabel("~  7181020137");
          jp1.add(jl3);
          jl3.setBounds(430,440,300,80);											
          jl3.setFont(new Font("Courier",1, 20));
          jl3.setForeground(Color.white);
         jl4 = new JLabel("~   REFERENCES & BIBLIOGRAPHY");
         jp1.add(jl4);
         jl4.setBounds(50,10,500,80);											
         jl4.setFont(new Font("Courier",1, 25));
         jl4.setForeground(Color.white);  
         jl5 = new JLabel(">   Java. [Online] : o  http://www.Java.");
         jp1.add(jl5);
         jl5.setBounds(50,50,500,80);											
         jl5.setFont(new Font("Courier",1, 20));
         jl5.setForeground(Color.white);
         jl6 = new JLabel(">   Java-tutorials. [Online] :o   http:// www.Java-tutorials.com");
         jp1.add(jl6);
         jl6.setBounds(50,90,800,80);											
         jl6.setFont(new Font("Courier",1, 20));
         jl6.setForeground(Color.white);
         jl7 = new JLabel(">   w3schools.[Online]:o   http://www.w3schools.com/java/");
         jp1.add(jl7);
         jl7.setBounds(50,130,800,80);											
         jl7.setFont(new Font("Courier",1, 20));
         jl7.setForeground(Color.white);
         jl8 = new JLabel(">   Code project.[Online]:o   http://www.codeproject.com/KB/java/");
          jp1.add(jl8);
         jl8.setBounds(50,170,800,80);											
         jl8.setFont(new Font("Courier",1, 20));
         jl8.setForeground(Color.white);

jb.addActionListener(new ActionListener()
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
         
       ImageIcon ic = new ImageIcon("a.jpeg");

        Image im = ic.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(500,280,100,150);

       jp1.add(l);



       ImageIcon ic3 = new ImageIcon("bc.jpg");

        Image im11 = ic3.getImage().getScaledInstance(1370,775 , Image.SCALE_SMOOTH);

        ic3 = new ImageIcon(im11);


        JLabel l12 = new JLabel(ic3);

        l12.setBounds(0,0,1370,775);

        jf.add(l12);



       ImageIcon ic1 = new ImageIcon("hostelfas1.jpg");

        Image im1 = ic1.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l1 = new JLabel(ic1);

        l1.setBounds(0,40,400,300);

//        jp.add(l1);


 
jf.setVisible(true);
}
public static void main (String[] arg )
 { 
new about();
}
}    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class firstform extends Thread
{
       static  JFrame jf1;
      JButton jb,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8;
      JProgressBar jbar;             
      static  JLabel l1,jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8;             

  firstform()
      {
         jf1=new JFrame();
         jf1.setExtendedState(JFrame.MAXIMIZED_BOTH); 
         jf1.setLayout(null);
         jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf1.setUndecorated(true);
         jf1.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));

         jl = new JLabel("Welcome To My");
          jf1.add(jl);
         jl.setBounds(100,250,300,80);											         jl.setFont(new Font("Courier",1, 28));
        jl.setForeground(Color.red);

         jl1 = new JLabel("Hostel");
         jf1.add(jl1);
         jl1.setBounds(340,250,300,80);											         jl1.setFont(new Font("Courier",1, 30));
         jl1.setForeground(Color.red);
         jl2 = new JLabel("Management");
         jf1.add(jl2);
         jl2.setBounds(105,300,300,80);											         jl2.setFont(new Font("Courier",1, 30));
         jl2.setForeground(Color.red);
         jl3 = new JLabel("Project");
         jf1.add(jl3);
         jl3.setBounds(290,300,300,80);											         jl3.setFont(new Font("Courier",1, 28));
         jl3.setForeground(Color.red);

        ImageIcon ic1 = new ImageIcon("12.png");

        Image im1 = ic1.getImage().getScaledInstance(130,130 , Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l12 = new JLabel(ic1);

        l12.setBounds(200,140,130,130);

        jf1.add(l12);



        ImageIcon ic = new ImageIcon("logo.png");

        Image im = ic.getImage().getScaledInstance(450,160 , Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(480,40,450,160);

        jf1.add(l);


        jf1.setVisible(true);
 
        JProgressBar jp = new JProgressBar(0,300);

        jp.setBounds(500, 500, 300, 30);

        jp.setStringPainted(true);


        l1 = new JLabel("");

        l1.setFont(new Font("Courier",1, 23));
        l1.setVisible(false);



        jf1.addKeyListener(
new KeyAdapter(){

                public void keyPressed(KeyEvent ke){

                    if(l1.getText().equals("Press Any Key To Enter")){

         newForm();

                    }

                }

            });


        
        jf1.add(jp);

        jf1.add(l1);


        int i=0;


        while(i<=300){

            try{

                Thread.sleep(10);

                jp.setValue(i);

                i++;

            }
            catch(Exception e){

            }

         
             if(i==300){

                l1.setText("Press Any Key To Enter");

                new blink().start();            
                l1.setVisible(true);

           }

        
}
   
jf1.setVisible(true);
  }
    
public void newForm(){


    jf1.dispose();

    new login();
   }



public static void main (String[] arg )
 { 
new firstform();
}
}

 class blink extends Thread
{
  int i=1;

  public void run()
  {
Font f=new Font("courier", Font.BOLD, 22);
Font f1=new Font("courier", Font.BOLD, 24);
   for(i=1;1<=5;i++)      
{
     try 
     {
        
       Thread.sleep(300);
       if(i%2==0)
       {
      firstform.l1.setForeground(Color.blue);
      firstform.l1.setFont(f);
      firstform.l1.setBounds(500, 550, 350, 25);  
      firstform.jf1.repaint();	
      firstform.jf1.revalidate();  
    }   
       else 
       {
        firstform.l1.setForeground(Color.red);
        firstform.l1.setFont(f1);
        firstform.l1.setBounds(500, 550, 350, 25);
        firstform.jf1.repaint();
        firstform.jf1.revalidate();	
        }    
     }catch(Exception e){ }
   }
  }
}

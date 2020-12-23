import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class running extends Thread
{
     
 static   JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,jl19,jl20,jl21;
  static   JFrame jf;
     static  JPanel jp,jp1,jp2;
     int i=0;
    
 running()
   {
      
         jf=new JFrame();
         jf.setBounds(0,200,1370,570);
         jf.setLayout(null);
         jf.setUndecorated(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jf.setAlwaysOnTop(true);                 
           jp=new JPanel();
         jf.add(jp);
          jp.setBounds(20,200,450,300);

           jp1=new JPanel();
         jf.add(jp1);
          jp1.setBounds(880,200,450,300);




                     jl=new JLabel("HOSTEL MANAGEMENT ");
                     jl.setFont(new Font("courier", Font.BOLD, 40));
	  jl.setForeground(Color.white);
                  
	 jl1=new JLabel("* We provide Excellent Hostel Facilities");
                    jl1.setFont(new Font("courier", Font.BOLD, 14));
                    jf.add(jl);
                     jp.add(jl1);
	 jl3=new JLabel("*  STD / ISD  Telephone Facilities are available ");
                    jl3.setFont(new Font("courier", Font.BOLD, 14));
                    jp.add(jl3);
	 jl4=new JLabel("* Uninterrupted power supply ,  Generator for Students");
                    jl4.setFont(new Font("courier", Font.BOLD, 14));
                    jp.add(jl4);
                    jl5=new JLabel("* Banking Facility with ATM counter");
                    jl5.setFont(new Font("courier", Font.BOLD, 14));
                    jp.add(jl5);
                   jl6=new JLabel("*  Medical Lab facility also available. ");
                    jl6.setFont(new Font("courier", Font.BOLD, 14));
	jp.add(jl6);
                   jl7 =new JLabel("* Mineral water provided to all the rooms");
                    jl7.setFont(new Font("courier", Font.BOLD, 14));
	jp.add(jl7);
                   jl8=new JLabel("*  Open Air Theater - programes on every weekends");
                    jl8.setFont(new Font("courier", Font.BOLD, 14));
	jp.add(jl8);
                   jl9=new JLabel("*  Well equipped Gym ( Boys and Girls separately)");
                    jl9.setFont(new Font("courier", Font.BOLD, 14));
	jp.add(jl9);

	 jl10=new JLabel("*  Residents shall not keep pets in the hostel.");
                    jl10.setFont(new Font("courier", Font.BOLD, 14));
                   jp1.add(jl10);
	 jl11=new JLabel("*  Gambling is strictly prohibited in the hostel. ");
                    jl11.setFont(new Font("courier", Font.BOLD, 14));
                    jp1.add(jl11);
	 jl12=new JLabel("*  Visitors are allowed in the common Room ");
                    jl12.setFont(new Font("courier", Font.BOLD, 14));
                    jp1.add(jl12);
                    jl13=new JLabel("*  The hostel shall not be used for business purposes of any kind.");
                    jl13.setFont(new Font("courier", Font.BOLD, 14));
                    jp1.add(jl13);
                   jl14=new JLabel("*  Residents should be properly dressed ");
                    jl14.setFont(new Font("courier", Font.BOLD, 14));
	jp1.add(jl14);
                   jl15 =new JLabel("*  Boys are not allowed in the girl’s hostel ");
                    jl15.setFont(new Font("courier", Font.BOLD, 14));
	jp1.add(jl15);
                   jl16=new JLabel("*  Girls are not allowed in the boy’s hostel.");
                    jl16.setFont(new Font("courier", Font.BOLD, 14));
	jp1.add(jl16);
                   jl17=new JLabel("*   Residents shall be in the hostel latest by 10.30 p.m. daily.");
                    jl17.setFont(new Font("courier", Font.BOLD, 14));
	jp1.add(jl17);
 

 ImageIcon ic = new ImageIcon("bc.jpg");

        Image im = ic.getImage().getScaledInstance(1365,770 , Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(0,0,1365,770);

        jf.add(l);



 
 
 new up().start();

           
 new right().start();

jf.setVisible(true);

 }
    public static void main(String [] argggs)
      {
 new running();
     }
}

class right extends Thread
{
       public void run()
       {
               int i,a=0,b=1,c,q;  
for(;;)
{
    for(i=-300;i<1400;i++)
       {
	try
	{
                     Thread.sleep(5);
        running.jl.setBounds(i,10,800,50);

     
  if(i>100)
{
running.jl.setForeground(Color.red);
 }
     if(i>300)
{
running.jl.setForeground(Color.blue);
 }
     if(i>500)
{
running.jl.setForeground(Color.green);
 } 
     if(i>700)
{
running.jl.setForeground(Color.cyan);
 }  
     if(i>900)
{
running.jl.setForeground(Color.gray);
 }
    }catch(Exception e){       }
  }
}
 }  
        }


class up extends Thread
{
  int i=1;

  public void run()
  {

			for(;;)
			{
  			  for(i=300;i>-220;i--)
       				{
				try
				    {
                				     Thread.sleep(50);
      				 running. jl1.setBounds(0,i,500,20);
    				   running.jl1.setForeground(Color.red);
     				running.jl3.setBounds(0,i+30,500,20);
     				 running. jl3.setForeground(Color.red);
     				running.  jl4.setBounds(0,i+60,500,20);
      				 running.jl4.setForeground(Color.red);
      				running. jl5.setBounds(0,i+90,500,20);
      				 running.jl5.setForeground(Color.red);
       				running.jl6.setBounds(0,i+120,500,20);
       				running.jl6.setForeground(Color.red);
    				   running.jl7.setBounds(0,i+150,500,20);
       				running.jl7.setForeground(Color.red);
     				 running. jl8.setBounds(0,i+180,500,20);
      				 running.jl8.setForeground(Color.red);
       				running.jl9.setBounds(0,i+210,500,20);
				       running.jl9.setForeground(Color.red);

       running. jl10.setBounds(0,i,500,20);
       running.jl10.setForeground(Color.red);
       running.jl11.setBounds(0,i+30,500,20);
       running.jl11.setForeground(Color.red);
       running.jl12.setBounds(0,i+60,500,20);
       running.jl12.setForeground(Color.red);
       running.jl13.setBounds(0,i+90,500,20);
       running.jl13.setForeground(Color.red);
       running.jl14.setBounds(0,i+120,500,20);
       running.jl14.setForeground(Color.red);
       running.jl15.setBounds(0,i+150,500,20);
       running.jl15.setForeground(Color.red);
       running.jl16.setBounds(0,i+180,500,20);
       running.jl16.setForeground(Color.red);
       running.jl17.setBounds(0,i+210,500,20);
       running.jl17.setForeground(Color.red);
         
			     }catch(Exception e){}
       			}

		}
}
}
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Project 
{
static JFrame jf;
 static JLabel  pic;
   static Timer tm;
   static int x = 0;
    String[] list = {
                      "E:/prog/p/aa.jpg",
                      "E:/prog/p/hostelfas.jpg",
                      "E:/prog/p/hostelfas1.jpg",
                      "E:/prog/p/mess.jpg",
                      "E:/prog/p/sbi.jpg",
                      "E:/prog/p/transport.jpg",
                      "E:/prog/p/h.jpg",
                      "E:/prog/p/hhh.jpg",
                      "E:/prog/p/hhhh.jpg",
                                  };
    
    public Project(){

       jf=new JFrame();
         jf.setLayout(null);
        jf.setBounds(470,400,410, 300);
         jf.setUndecorated(true);        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setAlwaysOnTop(true);                 
        
        pic = new JLabel();
        pic.setBounds(0, 0,450, 300);

        //Call The Function SetImageSize
        SetImageSize(1);
        
       //set a timer
        tm = new Timer(1000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        jf.add(pic);
        tm.start();
        jf.setVisible(true);
    }
         public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(450,300, Image.SCALE_SMOOTH);

 ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
}
public static void main(String[] args){ 
      
    new Project();
}
}

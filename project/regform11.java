import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.imageio.*;
import java.util.*;
import javax.swing.table.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;
import org.jdatepicker.graphics.*;
import java.text.*;
//import net.proteanit.sql.DbUtils;
import javax.swing.JFormattedTextField.AbstractFormatter;

class regform11 
{
       ImageIcon ic,ic1;
      static JFrame jf;
  static  JTextField jf1,jf2,jf3,jf4,jf5,jf6,jf7,jf8,jf9,jf10,jf11,jf123,jf13,jf14,jf15,jf16;
        JLabel  jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl15,jl14,jl16,jl17,jl18;
       JButton jb,jb1,jb2,jb3;
       JComboBox cb1,cb2,cb3,jcb4;
       JRadioButton male, female,other ;   
       ButtonGroup bg,cg; 
       int a1,a2,a3,a4,a5,a6,a7,a8,A;
       String gender = "",ds;
       public static int z,ss,ss1,c;  
       Image img1;
       File f1;
      JPopupMenu jpm;
         JMenuItem i1; 
                   static     String str="";
                  
      regform11()
      {
         jf=new JFrame();
         jf.setBounds(0,0,1370,770);
         jf.setLayout(null);
         jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         jf.setBackground(Color.cyan);
         jf.setAlwaysOnTop(true);
         jf.setUndecorated(true); 
              
           male = new JRadioButton("Male");
          male.setBounds(180,350,60,30);
          female = new JRadioButton("Female");
          female.setBounds(240,350,70,30);            
          other = new JRadioButton("other");
          other.setBounds(310,350,70,30);                                   //gender radio button           

         Properties p = new Properties(); 
         p.put("text.today", "Today"); 
         p.put("text.month", "Month"); 
         p.put("text.year", "Year");  

         JPanel jp=new JPanel();
         jp.setLayout(null); 
         jp.setBackground(new Color(220,0,0,125));
         jf.add(jp);
         jp.setBounds(20,0,1330,770); 


           bg = new ButtonGroup(); 
           bg.add(male); 
           bg.add(female);   
           bg.add(other);
           jp.add(male);
           jp.add(female);
           jp.add(other);     

         UtilDateModel model = new UtilDateModel();
         model.setDate(2017,04,20);
         JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
         JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
         datePicker.setBounds(30,390,130,30);
         jp.add(datePicker);    
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //jtb.setModel(DbUtils.resultSetToTableModel(rs));                

          

         jf1=new JTextField("+"); 
         jp.add(jf1);                                                    
         jf1.setBounds(180,90,80,30);
         jf2=new JTextField(); 
         jp.add(jf2);                                                     
        jf2.setBounds(180,145,140,30);
         jf3=new JTextField();
         jp.add(jf3);                                                     
         jf3.setBounds(180,190,140,30);
         jf4=new JTextField();                                                                //textfields
//         jf.add(jf4);                                                     
         jf4.setBounds(180,190,140,30);
         jf5=new JTextField();
         jp.add(jf5);
         jf5.setBounds(180,240,140,30);
         jf6=new JTextField(); 
         jp.add(jf6);
         jf6.setBounds(180,300,140,30);
         jf7=new JTextField(); 
         jp.add(jf7);
         jf7.setBounds(180,400,140,30);
         jf8=new JTextField();
         jp.add(jf8);
         jf8.setBounds(180,450,140,30);
        // jf9=new JTextField();
         jp.add(datePicker);
         datePicker.setBounds(180,500,140,30);
         jf10=new JTextField();
         jp.add(jf10);
         jf10.setBounds(180,550,140,30);
         jf11=new JTextField();
         //jf.add(jf11);
         jf11.setBounds(180,590,140,30);
          jf1.setEditable(false);                            
         jf123=new JTextField();
         jp.add(jf123);
         jf123.setBounds(1000,90,70,30);
          jf123.setEditable(false);                            
         jf13=new JTextField();
         jp.add(jf13);
         jf13.setBounds(1000,150,70,30);
         jf14=new JTextField();
         jp.add(jf14);
         jf14.setBounds(1000,210,70,30);
         jf15=new JTextField();
         jp.add(jf15);
         jf15.setBounds(1000,270,70,30);
         jf16=new JTextField();
       jp.add(jf16);
         jf16.setBounds(1000,320,70,30);
        jf16.setEditable(false);
         jf13.setEditable(false);
         jf14.setEditable(false);


         jl=new JLabel("Student UID");
         jl.setForeground(Color.white);
         jl2=new JLabel("Student Name");
         jl2.setForeground(Color.white);
         jl3=new JLabel("Father Name");
         jl3.setForeground(Color.white);
         jl4=new JLabel("Occupation");
         jl4.setForeground(Color.white);
         jl5=new JLabel("Qualifications");
         jl5.setForeground(Color.white);
         jl6=new JLabel("Gendre ");                                                               //labels
         jl6.setForeground(Color.white);
        jl7=new JLabel("Mobile No.");
       jl7.setForeground(Color.white);
       jl8=new JLabel("Date of Birth");
       jl8.setForeground(Color.white);
       jl9=new JLabel("Address");
       jl9.setForeground(Color.white);
       jl10=new JLabel("E-mail");
       jl10.setForeground(Color.white);
      jl11=new JLabel("Age");
      jl11.setForeground(Color.white);
      jl12=new JLabel("City");
      jl12.setForeground(Color.white);
      jl13=new JLabel("Bedroom Type");
       jl13.setForeground(Color.white);
      jl14=new JLabel("Mess Facility (YES/NO)");
       jl14.setForeground(Color.white);
       jl16=new JLabel("Mode Of Payment  (YEARLY/ MONTHLY)");
        jl16.setForeground(Color.white);
          jl15=new JLabel("No Image....");
         jl15.setForeground(Color.white);
         jl15.setBounds(500,100,100,100);        
//        jf.add(jl15);
       jl17=new JLabel("Amount You Pay");
       jl17.setForeground(Color.white);
      jl18=new JLabel("Amount Have To Pay");
      jl18.setForeground(Color.white);
      JLabel    jl119=new JLabel("REGISTRATION FORM");
       jp.add(jl119);
      jl119.setForeground(Color.white);
       jl119.setBounds(450,10,500,50);
          jl119.setFont(new Font("courier", Font.BOLD, 40));
            
      
       JCheckBox c1=new JCheckBox("I hereby declare that the details furnished above are true and correct to the best of my knowledge.");
      c1.setCursor(new Cursor(Cursor.HAND_CURSOR));             
      c1.setBounds(680,525,580,40);
     jp.add(c1);

JCheckBox      c2=new JCheckBox("I agree");
      c2.setBounds(680,555,120,40);
      c2.setCursor(new Cursor(Cursor.HAND_CURSOR));             
     jp.add(c2);


     c2.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent ae)
          {              
            if(c1.isSelected() && c2.isSelected()==true)
                 jb.setEnabled(true);           
          }
       });  

       
         jp.add(jl);
         jl.setBounds(60,90,140,35);
         jp.add(jl2);
         jl2.setBounds(60,140,140,35); 
         jp.add(jl3);
         jl3.setBounds(60,190,140,35);  
//         jf.add(jl4);
         jl4.setBounds(60,185,140,35);
         jp.add(jl5);                                                                                               ////labels
         jl5.setBounds(60,240,140,35);
         jp.add(jl6);
         jl6.setBounds(60,350,140,35);
         jp.add(jl7);
         jl7.setBounds(60,450,140,35);
         jp.add(jl8);
         jl8.setBounds(60,495,140,35);
         jp.add(jl9);
         jl9.setBounds(60,300,140,35);
         jp.add(jl10);
         jl10.setBounds(60,400,100,25);
         jp.add(jl11);
         jl11.setBounds(60,545,140,35);
//         jf.add(jl12);
         jl12.setBounds(60,590,140,35);
        jp.add(jl13);
        jl13.setBounds(780,90,140,40);
         jp.add(jl14);
        jl14.setBounds(780,150,140,40);
        jp.add(jl16);
        jl16.setBounds(780,210,220,40);
         jp.add(jl17);
        jl17.setBounds(780,270,140,40);
        jp.add(jl18);
        jl18.setBounds(780,320,140,40);
           jpm=new JPopupMenu();
            i1=new JMenuItem("Refresh");
            jpm.add(i1);
  
         jb=new JButton("submit");
         jp.add(jb) ;              
         jb.setBounds(680,650,100,25);
        jb.setEnabled(false);         
          jb1=new JButton("sub");
         jp.add(jb1) ;              
         jb1.setBounds(500,220,100,25);
         jb2=new JButton("<<BACK ");
         jp.add(jb2) ;              
         jb2.setBounds(800,650,100,25);
         jb.setCursor(new Cursor(Cursor.HAND_CURSOR));
         jb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
         jb2.setCursor(new Cursor(Cursor.HAND_CURSOR));

         jp.addMouseListener(new MouseAdapter()
           {
                public void mouseClicked(MouseEvent me)
                {
                      if(me.isMetaDown()) 
                          jpm.show(jp,me.getX(),me.getY());       
                jf.repaint();
               jp.revalidate();
               jp.repaint();
                     }
           });
  
         i1.addActionListener(new ActionListener()
           {
                    public void actionPerformed(ActionEvent we)
                      {
                     new regform11();    
                 JOptionPane.showMessageDialog(jp,"Please Go Back To Room Selection Form");
                         jf.dispose();

	     }
           });

//query 
                         int a=00;  
                        
                 try                                                                                                                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select *from registration" );
                         while(sr.next())  
                         {										//setid
                           str=sr.getString(1);                                   
                         }
                         a=Integer.parseInt(str.substring(2,3));
                         a=a+01; 
                         }catch(Exception e){System.out.println(e);} 

                       str="st"+a;
                       jf1.setText(str);         
try
{
                if(room.f.toString().equals("One BedRoom"))
             {
            	a1=5000; 			//one
		a6=  a1+room.s1;
              	jf123.setText("1");
	       jf16.setText(a6+"");
               }										//comboboxbedroom
                else if(room.f.toString().equals("Two BedRoom"))
             {
   		a2=7000;			//two
        	a6=  a2+room.s1;
               	jf123.setText("2");
       	jf16.setText(a6+"");
               }                              
  }         
 catch(Exception e){System.out.println(e);}
    

try
{
                if(room.f1.toString().equals("Yes"))
             {
                               if(room.f.toString().equals("One BedRoom"))
             {                 a3=10000;		//messyes
                               a6=  a1+a3+room.s1;
                     	       jf16.setText(a6+"");
                               jf13.setText("YES");
               }										//comboboxbedroom
                 if(room.f.toString().equals("Two BedRoom"))
             {                     a4=10000;			//messyes
                                    a6=  a2+a4+room.s1;
	       jf16.setText(a6+"");
                         jf13.setText("YES");
               }										//comboboxbedroom              
               }
                else if(room.f1.toString().equals("No"))
             {
            jf13.setText("NO");          
	
                     }
             }         
 catch(Exception e){System.out.println(e);}

            
    
try
{
                if(room.f2.toString().equals("Monthly"))
             {										//modeofpayment
            jf14.setText("Monthly");
               }
                else if(room.f2.toString().equals("Quaterly"))
             {
            jf14.setText("Quaterly");
               }
          else if(room.f2.toString().equals("Annually"))
             {
            jf14.setText("Annually");
               }

             }         
 catch(Exception e){System.out.println(e);}


    JLabel     jl19=new JLabel("Nationality");
      jl19.setBounds(780,380,150,30);
    //  jl19.setFont(f);
    jp.add(jl19);
    jl19.setForeground(Color.white);
      
      String x[]={"select","Indian"};
      cb1=new JComboBox(x);
      cb1.setBounds(1000,380,300,30);
      cb1.setCursor(new Cursor(Cursor.HAND_CURSOR));             
 //     cb1.setFont(f);
      jp.add(cb1);

     JLabel l16=new JLabel("State");
      l16.setBounds(780,430,150,30);
//      l16.setFont(f);
    jp.add(l16);
   l16.setForeground(Color.white);
      
      String y[]={"select","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal",};
      cb2=new JComboBox();
      cb2.setBounds(1000,430,300,30);
      cb2.setEnabled(false);
      cb2.setEditable(false);
      cb2.setCursor(new Cursor(Cursor.HAND_CURSOR));             
//      cb2.setFont(f);
      jp.add(cb2);

   cb1.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent e)
           {
             if(e.getSource()==cb1)
              {
               if(cb1.getSelectedItem().equals("select"))
                {
                cb2.setEnabled(false);                 
                }
               else if(cb1.getSelectedItem().equals("Indian"))
                {
               cb2.setEditable(false);                          
               cb2.setEnabled(true);                           
               for(int i=0;i<y.length;i++)
                cb2.addItem(y[i]);            
                }
             else if(cb1.getSelectedItem().equals("Other"))                
                 {
                  JOptionPane.showMessageDialog(null,"its not applicable ");                
                 cb3.setEditable(false);                          
                  cb3.setEditable(false);                          
                 }
              }
           }
         });          


 JLabel     l15=new JLabel("District");
      l15.setBounds(780,480,150,30);
//      l15.setFont(f);
    jp.add(l15);                               
   l15.setForeground(Color.white);
      
     String andhra[]={"select","Anantapur","Chittoor","East Godavari","Guntur","Krishna","Kurnool","Sri Potti Sri Ramulu Nellore","Prakasam","Srikakulam","Visakhapatnam","Vizianagaram","West Godavari","YSR Kadapa"};
     String aruna[]={"select","Tawang","West Kameng","East Kameng","Papum Pare","Kurung Kumey","Lower Subansiri","Upper Subansiri","West Siang","East Siang","Upper Siang","Lower Dibang Valley","Upper Dibang Valley","Anjaw","Lohit","Changlang","Tirap","Longding"};
     String assam[]={"select","Baksa","Barpeta","Biswanath","Bongaigaon","Cachar","Charaideo","Chirang","Darrang","Dhemaji","Dhubri","Dibrugarh","Dima Hasao","Goalpara","Golaghat","Hailakandi","Hojai","Jorhat","Kamrup Metropolitan","Kamrup","Karbi Anglong","Karimganj","Kokrajhar","Lakhimpur","Majuli","Morigaon","Nagaon","Nalbari","Sivasagar","Sonitpur","South Salmara-Mankachar","Tinsukia","Udalguri","West Karbi Anglong"};
     String bihar[]={"select","Araria","Arwal","Aurangabad","Banka","Begusarai","Bhabhua","Bhagalpur","Bhojpur","Buxar","Darbhanga","East Champaran","Gaya","Gopalganj","Jamui","Jehanabad","Katihar","Khagaria","Kishanganj","Lakhisarai","Madhepura","Madhubani","Monghyr","Muzaffarpur","Nalanda","Nawada","Patna","Purnea","Rohtas","Saharsa","Samastipur","Saran","Sheikhpura","Sheohar","Sitamarhi","Siwan","Supaul","Vaishali","West Champaran"};
     String chha[]={"select","Balod","Baloda Bazar","Balrampur","Bemetara","Bijapur","Bilaspur","Dantewada","Dantewada","Dhamtari","Durg","	Gariaband","Jagdalpur (Madhya Bastar)","Janjgir-Champa","Jashpur","Kabirdham","Kanker","Kondagaon","Korba","Koriya","Mahasamund","Mungeli","Narayanpur","Raigarh","Raipur","Rajnandgaon","Sukma","Surajpur","Surguja"};
     String del[]={"select","New Delhi","North Delhi","North West Delhi","West Delhi","South West Delhi","South Delhi","South East Delhi","Central Delhi","North East Delhi","Shahdara","East Delhi"};     
     String goa[]={"select","North Goa","South Goa"};
     String guj[]={"select","Ahmedabad","Amreli","Anand","Aravalli","Banaskantha","Bharuch","Bhavnagar","Botad","Chhota Udaipur","Dahod","Dang","Devbhoomi Dwarka","Gandhinagar","Gir Somnath","Jamnagar","Junagadh","Kutch","Kheda","Mahisagar","Mehsana","Morbi","Narmada","Navsari","Panchmahal","Patan","Porbandar","Rajkot","Sabarkantha","Surat","Surendranagar","Tapi","Vadodara","Valsad"}; 
     String hary[]={"select","Ambala","Bhiwani","Charkhi Dadri","Faridabad","Fatehabad","Gurugram","Hisar","Jhajjar","Jind","Kaithal","Karnal","Kurukshetra","Mahendragarh","Nuh","Palwal","Panchkula","Panipat","Rewari","Rohtak","Sirsa","Sonipat","Yamunanagar"};
     String hima[]={"select","Bilaspur","Chamba","Hamirpur","Kangra","Kinnaur","Kullu","Lahaul and Spiti","Mandi","Shimla","Sirmaur","Solan","Una"};    
     String jk[]={"select","Doda","Jammu","Kathua","Kishtwar","Poonch","Rajouri","Ramban","Reasi","Samba","Udhampur","   Kashmir  ","Anantnag","Bandipora","Baramulla","Budgam","Ganderbal","Kulgam","Kupwara","Pulwama","Shopian","Srinagar","Kargil","Leh"};
     String jhar[]={"select","Garhwa","Palamu","Latehar","Chatra","Hazaribagh","Koderma","Giridih","Ramgarh","Bokaro","Dhanbad district","Lohardaga","Gumla","Simdega","Ranchi","Khunti","West Singhbhum","Saraikela Kharsawan","East Singhbhum","Jamtara","Deoghar","Dumka","Pakur","Godda","Sahebganj"};
     String karna[]={"select","Bagalkot","Bengaluru Urban","Bengaluru Rura","Belagavi","Bellary","Bidar","Vijayapur","Chamarajanagar","Chikballapur","Chikkamagaluru","Chitradurga","Dakshina Kannada","Davanagere","Dharwad","Gadag","Kalaburagi","Hassan","Haveri","Kodagu","Kolar","Koppal","Mandya","Mysuru","Raichur","Ramanagara","Shivamogga","Tumakuru","Udupi","Uttara Kannada","Yadgir"};
     String ker[]={"select","Alappuzha","Ernakulam","Idukki","Kannur","Kasaragod","Kollam","Kottayam","Kozhikode","Malappuram","Palakkad","Pathanamthitta","Thiruvananthapuram","Thrissur","Wayanad"};
     String mp[]={"select","Bhopal akki","Raisen district","Rajgarh district","Sehore district","Vidisha district","Morena district","Sheopur district","Bhind district","Bhind district","Ashoknagar district","Shivpuri district","Datia district","Guna district","Alirajpur district ","Barwani district","Indore district","Dhar bc","Jhabua district","Khandwa district","Khargone district ","Balaghat district","Chhindwara district","Jabalpur district","Katni district","Mandla district","Narsinghpur district","Seoni district","Betul district","Harda district","Hoshangabad district","Rewa district","Satna district","Sidhi district","Singrauli district","Chhatarpur district","Damoh district","Panna district","Sagar district","Tikamgarh district","Anuppur district","Shahdol district","Umaria district","Dindori district","Agar Malwa district","Dewas district","Mandsaur district","Neemuch district","Ratlam district","Shajapur district","ole chandan district","Ujjain district"};
     String maha[]={"select","Ahmednagar","Akola","Amravati","Aurangabad","Beed","Bhandara","Buldhana","Chandrapur","Dhule	","Gadchiroli","Gondia","Hingoli","Jalgaon","Jalna","Kolhapur","Latur","Mumbai City","Mumbai Suburban","Nagpur","Nanded","Nandurbar","Nashik","Osmanabad","Parbhani	","Pune","Raigad","Ratnagiri","Sangli","Satara","Sindhudurg","Solapur","Thane","Wardha","Washim","Yavatmal","Palghar"};
     String mani[]={"select","Bishnupur","Thoubal","Imphal East","Imphal West","Senapati","Ukhrul","Chandel","Churachandpur","Tamenglong","Jiribam","Kangpokpi (Sadar Hills)","Kakching","Tengnoupal","Kamjong","Noney","Pherzawl"};
     String megh[]={"select","East Khasi Hills","West Garo Hills","Jaintia Hills	","West Khasi Hills","East Garo Hills","Ri Bhoi","South Garo Hills"};
     String mizo[]={"select","Aizawl","Champhai","Kolasib","Lawngtlai","Lunglei","Mamit","Saiha","Serchhip"};
     String naga[]={"select","Ananthapur district","Kadapa district","Kurnool district","Rajampet district","Mokokchung district","Mon District","Peren district","Phek district","Tuensang district","Wokha district","Zunheboto district","Markapur"}; 
     String odi[]={"select","Angul","Boudh ","Balangir","Bargarh ","Balasore","Bhadrak","Cuttack","Debagarh","Dhenkanal","Ganjam","Gajapati","Jharsuguda","Jajpur","Jagatsinghapur","Khordha","Kendujhar","Kalahandi","Kandhamal","Koraput","Kendrapara","Malkangiri","Mayurbhanj","Nabarangpur","Nuapada","Nayagarh","Puri","Rayagada","Sambalpur","Subarnapur ","Sundergarh"};
     String pun[]={"select","Amritsar","Barnala","Bathinda","Faridkot","Fatehgarh Sahib","Firozpur","Fazilka","Gurdaspur","Hoshiarpur","Jalandhar","Kapurthala","Ludhiana","Mansa","Moga","Sri Muktsar Sahib","Pathankot","Patiala","Rupnagar","Sahibzada Ajit Singh Nagar","Sangrur","Shahid Bhagat Singh Nagar","Tarn Taran"};
     String raj[]={"select","Ajmer","Alwar","Banswara","Baran","Barmer","Bharatpur","Bhilwara","Bikaner","Bundi","Chittorgarh","Churu","Dausa","Dholpur","Dungarpur","Hanumangarh","Jaipur","Jaisalmer","Jalor","Jhalawar","Jhunjhunu","Jodhpur","Karauli","Kota","Nagaur","Pali","Pratapgarh","Rajsamand","Sawai Madhopur","Sikar","Sirohi","Sri Ganganagar","Tonk","Udaipur"};
     String sik[]={"select","East Sikkim","North Sikkim","South Sikkim","West Sikkim"};
     String  tamil[]={"select","Ariyalur","Chennai","Coimbatore","Cuddalore","Dharmapuri","Dindigul","Erode","Kanchipuram","Kanniyakumari","Karur","Krishnagiri","Madurai","Nagapattinam","Namakkal","The Nilgiris","Perambalur","Pudukkottai","Ramanathapuram","Salem","Sivaganga","Thanjavur","Theni","Thoothukudi","Tiruchirappalli","Tirunelveli","Tiruppur","Tiruvallur","Tiruvannamalai","Tiruvarur","Vellore","Viluppuram","Virudhunagar"};
     String telan[]={"select","Adilabad","Bhadradri Kothagudem","Hyderabad","Jagtial","Jangaon","Jayashankar Bhupalapally","Jogulamba Gadwal","Kamareddy","Karimnagar","Khammam","Kumarambheem Asifabad","Mahabubabad","Mahabubnagar","Mancherial","Medak","Medchal–Malkajgiri","Nagarkurnool","Nalgonda","Nirmal","Nizamabad","Peddapalli","Rajanna Sircilla","Ranga Reddy","Sangareddy","Siddipet","Suryapet","Vikarabad","Wanaparthy","Warangal Rural","Warangal Urban","Yadadri Bhuvanagiri"};
     String trip[]={"select","Dhalai","South Tripura","Gomati","North Tripura","Sipahijala","Khowai","West Tripura","Unakoti"};
     String up[]={"select","Agra","Aligarh","Allahabad","Ambedkar Nagar","Amethi","Amroha","Auraiya","Azamgarh","Baghpat","Bahraich","Ballia","Balrampur","Banda","Barabanki","Bareilly","Basti","Bijnor","Budaun","Bulandshahr","Chandauli","Chitrakoot","Deoria","Etah","Etawah","Faizabad","Farrukhabad","Fatehpur","Firozabad","Gautam Buddha Nagar","Ghaziabad","Ghazipur","Gonda","Gorakhpur","Hamirpur","Hardoi","Hathras (Mahamaya Nagar)","Jalaun","Jaunpur","	Jhansi","Jyotiba Phule Nagar","	Kannauj","Kanpur Dehat (Ramabai Nagar)","Kanpur Nagar","Kanshiram Nagar","Kaushambi","Kheri","Kushinagar","Lalitpur","Lucknow","Maharajganj","Mahoba","Mainpuri","Mathura","Mau","Meerut","Mirzapur","Moradabad","Muzaffarnagar","Panchsheel Nagar district (Hapur)","Pilibhit","Pratapgarh","Raebareli","Rampur","Saharanpur","Sant Kabir Nagar","Shahjahanpur","Shamli","Shravasti","Siddharthnagar","Sitapur","Sonbhadra","Sultanpur","Unnao","Varanasi"};   
     String uk[]={"select","Almora","Bageshwar","Chamoli","Champawat","Dehradun","Haridwar","Nainital","Pauri Garhwal","Pithoragarh","Rudraprayag","Tehri Garhwal","Udham Singh Nagar","Uttarkashi"};      
     String wb[]={"select","Alipurduar","Bankura","Paschim Bardhaman","Purba Bardhaman","Birbhum","Cooch Behar","Darjeeling","Uttar Dinajpur","Dakshin Dinajpur","Hooghly","Howrah","Jalpaiguri","Jhargram","Kolkata","Kalimpong","Malda","Paschim Medinipur","Purba Medinipur","Murshidabad","Nadia","North 24 Parganas","South 24 Parganas","Purulia"};

      cb3=new JComboBox();
      cb3.setBounds(1000,480,300,30);
//      cb3.setEditable(true);
      cb3.setCursor(new Cursor(Cursor.HAND_CURSOR));              
      cb3.setEnabled(false);
//      cb3.setFont(f);
  jp.add(cb3);     

     cb2.addItemListener(new ItemListener()
        {
         public void itemStateChanged(ItemEvent ie)
           {
            if(ie.getSource()==cb2)
             {
               if(cb2.getSelectedItem().equals("select"))
               {
               cb3.setEnabled(false);
               }
              else if(cb2.getSelectedItem().equals("Andhra Pradesh"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<andhra.length;i++)
                cb3.addItem(andhra[i]);
               }
              else if(cb2.getSelectedItem().equals("Arunachal Pradesh"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<aruna.length;i++)
                cb3.addItem(aruna[i]);
               }
              else if(cb2.getSelectedItem().equals("Assam"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<assam.length;i++)
                cb3.addItem(assam[i]);
               }
              else if(cb2.getSelectedItem().equals("Bihar"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<bihar.length;i++)
                cb3.addItem(bihar[i]);
               }
              else if(cb2.getSelectedItem().equals("Chhattisgarh"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<chha.length;i++)
                cb3.addItem(chha[i]);
               }
              else if(cb2.getSelectedItem().equals("Delhi"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<del.length;i++)
                cb3.addItem(del[i]);
               }
              else if(cb2.getSelectedItem().equals("Goa"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<goa.length;i++)
                cb3.addItem(goa[i]);
               }
              else if(cb2.getSelectedItem().equals("Gujarat"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<guj.length;i++)
                cb3.addItem(guj[i]);
               }
              else if(cb2.getSelectedItem().equals("Haryana"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<hary.length;i++)
                cb3.addItem(hary[i]);
               }
              else if(cb2.getSelectedItem().equals("Himachal Pradesh"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<hima.length;i++)
                cb3.addItem(hima[i]);
               }
              else if(cb2.getSelectedItem().equals("Jammu and Kashmir"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<jk.length;i++)                
               cb3.addItem(jk[i]);              
               }
              else if(cb2.getSelectedItem().equals("Jharkhand"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<jhar.length;i++)                
               cb3.addItem(jhar[i]);              
               }
            else if(cb2.getSelectedItem().equals("Karnataka"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<karna.length;i++)                
               cb3.addItem(karna[i]);              
               }
            else if(cb2.getSelectedItem().equals("Kerala"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<ker.length;i++)                
               cb3.addItem(ker[i]);              
               }
            else if(cb2.getSelectedItem().equals("Madhya Pradesh"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<mp.length;i++)                
               cb3.addItem(mp[i]);              
               }
            else if(cb2.getSelectedItem().equals("Maharashtra"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<maha.length;i++)                
               cb3.addItem(maha[i]);              
               }
            else if(cb2.getSelectedItem().equals("Manipur"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<mani.length;i++)                
               cb3.addItem(mani[i]);              
               }
            else if(cb2.getSelectedItem().equals("Meghalaya"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<megh.length;i++)                
               cb3.addItem(megh[i]);              
               }
            else if(cb2.getSelectedItem().equals("Mizoram"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<mizo.length;i++)                
               cb3.addItem(mizo[i]);              
               }
            else if(cb2.getSelectedItem().equals("Nagaland"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<naga.length;i++)                
               cb3.addItem(naga[i]);              
               }
            else if(cb2.getSelectedItem().equals("Odisha"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<odi.length;i++)                
               cb3.addItem(odi[i]);              
               }
            else if(cb2.getSelectedItem().equals("Punjab"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<pun.length;i++)                
               cb3.addItem(pun[i]);              
               }
           else if(cb2.getSelectedItem().equals("Rajasthan"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<raj.length;i++)                
               cb3.addItem(raj[i]);              
               }
              else if(cb2.getSelectedItem().equals("Sikkim"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<sik.length;i++)                
               cb3.addItem(sik[i]);              
               }
            else if(cb2.getSelectedItem().equals("Tamil Nadu"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<tamil.length;i++)                
               cb3.addItem(tamil[i]);              
               }
             else if(cb2.getSelectedItem().equals("Telangana"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<telan.length;i++)                
               cb3.addItem(telan[i]);              
               }
            else if(cb2.getSelectedItem().equals("Tripura"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<trip.length;i++)                
               cb3.addItem(trip[i]);              
               }
              else if(cb2.getSelectedItem().equals("Uttar Pradesh"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<up.length;i++)
                cb3.addItem(up[i]);
               }
            else if(cb2.getSelectedItem().equals("Uttarakhand"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();
               for(int i=0;i<uk.length;i++)
                cb3.addItem(uk[i]);
               }
           else if(cb2.getSelectedItem().equals("West Bengal"))
                {
               cb3.setEnabled(true);               
               cb3.removeAllItems();              
               for(int i=0;i<wb.length;i++)                
               cb3.addItem(wb[i]);              
               }          
             }
           }
        });
       
jf15.addFocusListener(new FocusAdapter(){
  public void focusLost(FocusEvent e){                       

                if (jf15.getText().equals(""))  
                                 {
		JOptionPane.showMessageDialog(jf, "Please Enter Amount ");
                                       jf15.setText("0");
                              }  
         
                      else{
            a7=Integer.valueOf(jf15.getText());
            a8=Integer.valueOf(jf16.getText());
            A=a8-a7;    
}
}
});

     jb.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                      {      
             try
                        {
       
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                            PreparedStatement pt=con.prepareStatement("insert into registration values( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");                           
                            File f=new File(f1.toString());
        		 FileInputStream fin=new FileInputStream(f);

  			Date d=(Date)datePicker.getModel().getValue();
               			 DateFormat df =new  SimpleDateFormat("dd//MM//yyyy");
                			String reportDate=df.format(d);	             
                    
                System.out.println(jf1.getText());
                 pt.setString(1,jf1.getText());       
                 pt.setString(2,jf2.getText());
                 pt.setString(3,jf3.getText());
                 pt.setString(4,jf5.getText());
                 pt.setString(5,jf6.getText());
                 pt.setString(6,gender);
                 pt.setString(7,jf7.getText());  
                 pt.setString(8,jf8.getText());     
                 pt.setString(9,reportDate);
                pt.setString(10,jf10.getText());
                pt.setString(11,jf123.getText());   
                pt.setString(12,jf13.getText());
                pt.setString(13,jf14.getText());
                pt.setString(14,jf15.getText());   
                pt.setString(15,A+"");
               pt.setString(16,cb3.getSelectedItem().toString());       
             pt.setBinaryStream(17,(InputStream)fin,(int)f.length());                                                        
               pt.executeUpdate();
              JOptionPane.showMessageDialog(jf," Update Sucessfully ");   
                                          new createpwd();
                   }catch(Exception e){System.out.println(e);}                       
                 }      	
         });


     jb2.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     

                          try
                      {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","viren");     
                           PreparedStatement pt=con.prepareStatement("delete from facility where userID=?");                   
	{
                 pt.setString(1,room.str);
                 pt.executeUpdate();
                   new room(); 
	jf.dispose();
	}
                   }catch(Exception e){System.out.println(e);}                       
                 }      	
         });

              
     jb .addActionListener(new AbstractAction(){

                   public void actionPerformed(ActionEvent ae){
               
                            if (ae.getSource() == jb) {

                                if (jf2.getText().equals(""))  
                                 {
		JOptionPane.showMessageDialog(jf, "Please Provide Student Name_Field");
                              }  
                              else if(jf3.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Provide Father Name_Field");

                         else  if(jf5.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Provide Qualifications");
                         
                         else  if(jf6.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Provide Address");

	       else if(gender.equals(""))
                                 JOptionPane.showMessageDialog(jf, "Please select Gender");

                               else  if(jf7.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Provide Email");

                                else if(jf8.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Provide Contact Number");
                                
                              else  if(jf10.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please provide Age_Field");
 
 
                                   else if(jf123.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Provide Age_Field");

                                else if(jf15.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please provide Amount Field");

                    }
             }
   });
            

              male.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) {
                                      gender = "Male";
                    }
               });                                                                                                                                                  //gender

              female.addActionListener(new ActionListener() {
                          public void actionPerformed(ActionEvent e) {
                                      gender = "Female";
                  }
            });

              other.addActionListener(new ActionListener() {
                          public void actionPerformed(ActionEvent e) {
                                      gender = "other";
                  }
            });




      jf2.addKeyListener(new KeyAdapter() {
                                public void keyTyped(KeyEvent e)
                        {                                                                                                                                                                                                   // studentname cons
                               char c = e.getKeyChar();
                              if (!((c >= 'a') && (c <= 'z')||(c >= 'A') && (c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)|| (c==KeyEvent.VK_SPACE)))
  {
                                           e.consume();
       }
                                 if(jf2.getText().length()>20) 
                                         e.consume();
                            }
                  }); 
 

      jf3.addKeyListener(new KeyAdapter() {
                                public void keyTyped(KeyEvent e)
                        {                                                                                                                                                                                                   // fathername cons
                               char c = e.getKeyChar();
     if (!((c >= 'a') && (c <= 'z')||(c >= 'A') && (c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)||(c==KeyEvent.VK_SPACE)))
  {
                                           e.consume();
       }
                                 if(jf3.getText().length()>20) 
                                         e.consume();
                                 }
                  }); 

  jf5.addKeyListener(new KeyAdapter() {
                                public void keyTyped(KeyEvent e)
                        {                                                                                                                                                                                                   // fathername cons
                               char c = e.getKeyChar();
     if (!((c >= 'a') && (c <= 'z')||(c >= 'A') && (c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)||(c==KeyEvent.VK_SPACE)))
  {
                                           e.consume();
       }
                                 if(jf5.getText().length()>20) 
                                         e.consume();
                                 }
                  }); 

       jf6.addKeyListener(new KeyAdapter() {
                                    public void keyTyped(KeyEvent e) {                           //addrs cons
 
                                          if(jf6.getText().length()>50)
                                                     e.consume();
                                            }
                                   });
                    


      jf8.addKeyListener(new KeyAdapter() {
                               public void keyTyped(KeyEvent e)
                        {                                                                                                       // mob no cons
               
                                char c = e.getKeyChar();
                              if (!((c >= '0') && (c <= '9')||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                                           e.consume();
                        }
                                 if(jf8.getText().length()>9) 
                                         e.consume();
                                 }
                  });

      jf15.addKeyListener(new KeyAdapter() {
                               public void keyTyped(KeyEvent e)
                        {                                                                                                       // amount no cons
               
                                char c = e.getKeyChar();
                              if (!((c >= '0') && (c <= '9')||(c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                                           e.consume();
                        }
                                 if(jf15.getText().length()>4) 
                                         e.consume();
                                 }
                  });

      jf10.addKeyListener(new KeyAdapter() {
                               public void keyTyped(KeyEvent e)
                         {                                                                                                       // age cons
                              char c = e.getKeyChar();
                              if (!((c >= '0') && (c <= '9') ||
                             (c == KeyEvent.VK_BACK_SPACE) ||
                             (c == KeyEvent.VK_DELETE))) {
                                           e.consume();
                        }
                                 if(jf10.getText().length()>1) 

                                         e.consume();
                                 }

                  });

      jf11.addKeyListener(new KeyAdapter() {
                                public void keyTyped(KeyEvent e)
                        {                                                                                                                                                                                                   // citycons
                               char c = e.getKeyChar();
        if (!((c >= 'a') && (c <= 'z')||(c >= 'A') && (c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)||(c==KeyEvent.VK_SPACE)))
  {
                                           e.consume();
       }
                                 if(jf11.getText().length()>20) 
                                         e.consume();
                                 }
                  }); 

   jb1.addActionListener(new ActionListener()
      { 
       public void actionPerformed(ActionEvent ae)
        {
          JFileChooser jc= new JFileChooser();
              int x= jc.showOpenDialog(jf);            
                    f1 = jc.getSelectedFile();        
                    ic = new ImageIcon(f1.getPath());
           Image img = ic.getImage();
          img1= img.getScaledInstance(140,140,Image.SCALE_SMOOTH);
          ic1 = new ImageIcon(img1);          
          jl15=new JLabel(ic1);
         jp.add(jl15);
      jl15.setBounds(500,100,100,100);        
          jl15.setBackground(Color.cyan);  
         }       
      });   

/*                                                                                                                     //image
        jb1.addActionListener(new ActionListener()
        {
              public void actionPerformed(ActionEvent ae)
              {
                         

                    JFileChooser jfc=new JFileChooser();
                    int x=jfc.showOpenDialog(jf);   
                  System.out.println(x);
                if(x==0)
                {
                    
                       File f=jfc.getSelectedFile();     
                     System.out.println(f.getPath());
                       ic=new ImageIcon(f.getPath());   
                }
                
         Image img=ic.getImage();
              System.out.println(img);         
Image img1=img.getScaledInstance(140,140,Image.SCALE_SMOOTH);      
  ic1=new ImageIcon(img1);         
         jl15.setIcon(ic1);                                          
              }
         });
*/

        ImageIcon ic = new ImageIcon("bc.jpg");

        Image im = ic.getImage().getScaledInstance(1375,770 , Image.SCALE_SMOOTH);

        ic = new ImageIcon(im);


        JLabel l = new JLabel(ic);

        l.setBounds(0,0,1375,770);

        jf.add(l);


        ImageIcon ic1 = new ImageIcon("reg1.png");

        Image im1 = ic1.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l1 = new JLabel(ic1);

        l1.setBounds(400,100,500,400);

       l.add(l1);


        

   
      jf.setVisible(true);  
      }

      public static void main(String [] argggs)
      {
        new regform11();
      }
}

        class DateLabelFormatter extends AbstractFormatter {

    private String datePattern = "yyyy-MM-dd";
    public  SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
    public  Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
    }
}




 
import javax.swing.*;
import java .awt.*;
import java.awt.event.*;
import java.sql.*;

public class PersonalDetails  extends JFrame implements ActionListener
{
        JPanel headpanel,panel1,buttonpanel,buttonpanel1,personal;
        JFrame frame,frame1;
        JButton homebtn,applybtn, loginbtn,calbtn,feebtn,save$close,next;
        JLabel uni, muet,l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,l11,msg,dob,personalInfo;  
        JTextField tf1, tf2,tf3, tf4, tf5,tf6,tf7,tf8;  
        JRadioButton btn1,btn2; 
        JComboBox box,date,month,year,tbox,area;
        String[]title={" ","Mr.","Mrs.","Engr.","Dr."};
        String dates[] = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
            String months[] = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
            String years[] = { "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021" };
        String[]province={" ","Sindh","Punjab"," Khyber Pakhtunkhwa","Balochistan"};
     
    
        PersonalDetails(){
        
            headpanel = new JPanel();
            headpanel.setPreferredSize(new Dimension(250,150));
            headpanel.setBackground(new Color(14, 98, 81));
            headpanel.setLayout(null);

            muet= new JLabel("MEHRAN UNIVERSITY OF ENGINEERING");
            muet.setFont(new Font("ALGERIAN", Font.BOLD, 50)); 
            muet.setForeground(new Color(253, 254, 254));
            muet.setBounds(40,10, 1050, 80); 
            headpanel.add(muet);
            uni= new JLabel("AND TECHNOLOGY JAMSHORO");
            uni.setFont(new Font("ALGERIAN", Font.BOLD, 50)); 
            uni.setForeground(new Color(253, 254, 254));
            uni.setBounds(150,70, 800, 80); 
            headpanel.add(uni);

            buttonpanel1 = new JPanel();
            buttonpanel1.setBackground(new Color(118, 215, 196));
            buttonpanel1.setLayout(null);
            buttonpanel1.setBounds(0,0,1080,90);

            buttonpanel = new JPanel();
            buttonpanel.setBackground(new Color(231, 76, 60));
            buttonpanel.setLayout(null);
            buttonpanel.setBounds(10,10,1060,70);
            buttonpanel1.add(buttonpanel);

            homebtn = new JButton("HOME");
            homebtn.setFont(new Font("Arial black.",Font.BOLD,30)); 
            homebtn.setBounds(10, 10, 140, 50);
            buttonpanel.add(homebtn);
            homebtn.addActionListener(this);

            applybtn = new JButton("APPLY NOW");
            applybtn.setFont(new Font("Arial black.",Font.BOLD,30));
            applybtn.setBounds(160, 10, 220, 50);
            buttonpanel.add(applybtn);
            applybtn.addActionListener(this);

            loginbtn = new JButton("TEST");
            loginbtn.setFont(new Font("Arial black.",Font.BOLD,30)); 
            loginbtn.setBounds(390, 10, 140, 50);
            buttonpanel.add(loginbtn);
            loginbtn.addActionListener(this);

            calbtn = new JButton("CALCULATER");
            calbtn.setFont(new Font("Arial black.",Font.BOLD,30)); 
            calbtn.setBounds(540, 10, 240, 50);
            buttonpanel.add(calbtn);
            calbtn.addActionListener(this);

            feebtn = new JButton("FEES STRUCTURE");
            feebtn.setFont(new Font("Arial black.",Font.BOLD,25)); 
            feebtn.setBounds(790, 10, 260, 50);
            buttonpanel.add(feebtn);
            feebtn.addActionListener(this);
        
            panel1 = new JPanel();
            panel1.setPreferredSize(new Dimension(50,250));
            panel1.setBackground(new Color(244, 246, 247));
            panel1.setLayout(null);
            panel1.add(buttonpanel1);
            personal = new JPanel();
            personal.setBackground(new Color(217, 21, 236));
            personal.setLayout(null);
            personal.setBounds(0,100,1080,90);
            panel1.add(personal);
            personalInfo= new JLabel("PERSONAL INFORMATION");
            personalInfo.setFont(new Font("ALGERIAN", Font.BOLD, 50)); 
            personalInfo.setForeground(new Color(253, 254, 254));
            personalInfo.setBounds(200,10, 800, 80); 
            personal.add(personalInfo);

            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1095,800);
            frame.setLayout(new BorderLayout(5,10));
            frame.setBackground(new Color(100,123,44));
            frame.add(headpanel,BorderLayout.NORTH);
            frame.add(panel1,BorderLayout.CENTER);
            frame.setVisible(true);
            frame.setResizable(false);
            l1 = new JLabel("Personal Details");
            l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 50)); 
            l1.setForeground(new Color(220,20,60));
        l1.setBounds(350, 130, 400, 50);
        panel1.add(l1);      

        l2 = new JLabel("Title");
        l2.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l2.setBounds(90, 200, 200, 35); 
        panel1.add(l2); 
        tbox=new JComboBox(title);
        tbox.setSelectedIndex(0);
        tbox.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tbox.setBackground(new Color(211,211,211));
        tbox.setBounds(150, 200, 80, 35);
        panel1.add(tbox);

        l3 = new JLabel("First Name");
        l3.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l3.setBounds(280, 200, 200, 35); 
        panel1.add(l3); 
        tf1 = new JTextField(); 
        tf1.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf1.setBackground(new Color(211,211,211));
        tf1.setBounds(400, 200, 200, 35);
        panel1.add(tf1);

        l4 = new JLabel("Last Name");
        l4.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l4.setBounds(650, 200, 200, 35); 
        panel1.add(l4); 
        tf2 = new JTextField(); 
        tf2.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf2.setBackground(new Color(211,211,211));
        tf2.setBounds(800, 200, 200, 35);
        panel1.add(tf2);

        l5=new JLabel("Gender");
        l5.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l5.setBounds(90, 250, 200, 35); 
        panel1.add(l5);
        btn1=new JRadioButton("Male");
        btn1.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        btn1.setBounds(175,250,90,35);
        btn1.setBackground(new Color(240,255,255));
        panel1.add(btn1);
        btn2=new JRadioButton("Female"); 
        btn2.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        btn2.setBackground(new Color(240,255,255));
        btn2.setBounds(250,250,97,35);
        panel1.add(btn2);

        dob = new JLabel("Date of birth");
        dob.setFont(new Font("Cambria Math.",Font.BOLD,20));
        dob.setBounds(370, 250, 200, 35);
        panel1.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        date.setSize(50, 30);
        date.setLocation(500, 250);
        panel1.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        month.setSize(70, 30);
        month.setLocation(560, 250);
        panel1.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        year.setSize(70, 30);
        year.setLocation(640, 250);
        panel1.add(year);

        l6 = new JLabel("Province");
        l6.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l6.setBounds(730,250,100,35); 
        panel1.add(l6); 

        area = new JComboBox(province);
        area.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        area.setSize(175, 30);
        area.setLocation(820, 250);
        panel1.add(area);

        l7= new JLabel("Your CNIC Number ");
        l7.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l7.setBounds(90, 300, 200, 35);
        panel1.add(l7); 
        tf5 = new JTextField();
        tf5.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf5.setBackground(new Color(211,211,211));
        tf5.setBounds(290, 300, 160, 35);
        panel1.add(tf5);

        l10= new JLabel("Mobile Number ");
        l10.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l10.setBounds(470, 300, 200, 35);
        panel1.add(l10); 
        tf7 = new JTextField();
        tf7.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf7.setBackground(new Color(211,211,211));
        tf7.setBounds(630, 300, 160, 35);
        panel1.add(tf7);

        l8 = new JLabel("Mailing Address");
        l8.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l8.setBounds(90, 350, 200, 35);
        panel1.add(l8);

        tf6 = new JTextField();  
        tf6.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf6.setBackground(new Color(211,211,211));
        tf6.setBounds(270, 350, 300, 35); 
        panel1.add(tf6);

        l9 = new JLabel("Postal Code");
        l9.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l9.setBounds(800, 300, 200, 35);
        panel1.add(l9);

        tf8 = new JTextField();  
        tf8.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf8.setBackground(new Color(211,211,211));
        tf8.setBounds(920, 300, 80, 35); 
        panel1.add(tf8);

        l11 = new JLabel("Email");
        l11.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l11.setBounds(600, 350, 100, 35);
        panel1.add(l11);

        tf3 = new JTextField();  
        tf3.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf3.setBackground(new Color(211,211,211));
        tf3.setBounds(700, 350, 300, 35); 
        panel1.add(tf3);

            save$close = new JButton("Save & Close");
            save$close.setFont(new Font("Cambria Math.",Font.BOLD,20));
            save$close.setBounds(725, 550, 175, 35);
            panel1.add(save$close);
            save$close.addActionListener(this);
            next = new JButton("  Next");
            next.setFont(new Font("Cambria Math.",Font.BOLD,20));
            next.setBounds(925, 550, 125, 35);
            next.addActionListener(this);
            panel1.add(next);
            tf8.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf8.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf8.setEditable(true);

                }
                else{
                    tf8.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);

                    
                }
            }

        });    

        tf5.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf5.getText();
                int j = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf5.setEditable(true);

                }
                else{
                    tf5.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);

                    
                }
            }

        }); 
        tf7.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf7.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf7.setEditable(true);

                }
                else{
                    tf7.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });       
        }
         @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==save$close)
       {
        
       new Simplewebpage();
        
       }
       if(e.getSource()==next)
       {
       new EducationalDetails();
        
       }

         if(e.getSource()==homebtn)
       {
        new Simplewebpage();
        
         }  

         if(e.getSource()==applybtn)
       {
         new Registration();
        }  

         if(e.getSource()==loginbtn)
       {
       new Instruction();
        
       }  

       if(e.getSource()==calbtn)
       {
        new Calculate();
        }
        if(e.getSource()==feebtn)
       {
         new FeesStructure();
        }
       
    }
}
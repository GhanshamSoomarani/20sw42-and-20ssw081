import javax.swing.*;
import java .awt.*;
import java.awt.event.*;
import java.sql.*;
public class Registration extends JFrame implements ActionListener  {
    JPanel headpanel,panel1,buttonpanel,buttonpanel1;
    JFrame frame;
    JButton homebtn,applybtn, loginbtn,calbtn,feebtn;
    JLabel uni, muet;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,msg,dob;  
    JTextField tf1, tf2,tf3, tf4, tf5,tf6;  
    JButton btn1, btn2,next;
    JRadioButton btn3,btn4; 
    JComboBox box,date,month,year;
    JCheckBox box1; 
    JPasswordField p1; 
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
    String[]city={" ","Karachi","Lahore","Islamabad","Queeta","hydrabad","Mirpurekhas"};
    Registration(){  
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

            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1095,800);
            frame.setLayout(new BorderLayout(5,10));
            frame.setBackground(new Color(100,123,44));
            frame.add(headpanel,BorderLayout.NORTH);
            frame.add(panel1,BorderLayout.CENTER);
            frame.setVisible(true);
            frame.setResizable(false);

        msg = new JLabel("");
        msg.setForeground(Color.white);
        msg.setBackground(Color.black);
        msg.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
        msg.setOpaque(false);
        msg.setBounds(300, 520, 450, 30);
        panel1.add(msg);

        l1 = new JLabel("Registration Form ");
        l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 50)); 
        l1.setForeground(new Color(220,20,60));
        l1.setBounds(350, 130, 400, 50);
        panel1.add(l1);      

        l2 = new JLabel("User Name");
        l2.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l2.setBounds(90, 230, 200, 35); 
        panel1.add(l2); 
        tf1 = new JTextField(); 
        tf1.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf1.setBackground(new Color(211,211,211));
        tf1.setBounds(300, 230, 200, 35);
        panel1.add(tf1); 

        l3 = new JLabel("Passowrd");
        l3.setFont(new Font("Cambria Math.",Font.BOLD,20)); 
        l3.setBounds(90, 280, 200, 35);    
        panel1.add(l3);
        p1 = new JPasswordField();
        p1.setBackground(new Color(211,211,211));
        p1.setBounds(300, 280, 200, 35);
        panel1.add(p1);

        l4 = new JLabel("Email-ID");
        l4.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l4.setBounds(90, 330, 200, 35);
        panel1.add(l4);

        tf2 = new JTextField();  
        tf2.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf2.setBackground(new Color(211,211,211));
        tf2.setBounds(300, 330, 200, 35); 
        panel1.add(tf2); 

        l5=new JLabel("Gender");
        l5.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l5.setBounds(90, 380, 200, 35); 
        panel1.add(l5);
        btn3=new JRadioButton("Male");
        btn3.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        btn3.setBounds(300,380,90,35);
        btn3.setBackground(new Color(240,255,255));
        panel1.add(btn3);
        btn4=new JRadioButton("Female"); 
        btn4.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        btn4.setBackground(new Color(240,255,255));
        btn4.setBounds(400,380,97,35);
        panel1.add(btn4);

        l6=new JLabel("City");
        l6.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l6.setBounds(590, 230, 200, 35);
        panel1.add(l6);

        box=new JComboBox(city);
        box.setSelectedIndex(0);
        box.setBounds(780, 230, 200, 35);
        box.setBackground(new Color(211,211,211));
        panel1.add(box);  

        l7 = new JLabel("Country");
        l7.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l7.setBounds(590, 280, 200, 35);
        panel1.add(l7);
        tf3 = new JTextField(); 
        tf3.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf3.setBackground(new Color(211,211,211));
        tf3.setBounds(780, 280, 200, 35);
        panel1.add(tf3); 

        l8 = new JLabel("Phone Number");
        l8.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l8.setBounds(590, 330, 200, 35);
        panel1.add(l8); 
        tf4 = new JTextField();
        tf4.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf4.setBackground(new Color(211,211,211));
        tf4.setBounds(780, 330, 200, 35);
        panel1.add(tf4);

        l9 = new JLabel("Your CNIC Number ");
        l9.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l9.setBounds(590, 380, 200, 35);
        panel1.add(l9); 
        tf5 = new JTextField();
        tf5.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf5.setBackground(new Color(211,211,211));
        tf5.setBounds(780, 380, 200, 35);
        panel1.add(tf5);

        l10 = new JLabel("Father's Name");
        l10.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l10.setBounds(90, 430, 200, 35);
        panel1.add(l10);

        tf6 = new JTextField();  
        tf6.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf6.setBackground(new Color(211,211,211));
        tf6.setBounds(300, 430, 200, 35); 
        panel1.add(tf6);

        dob = new JLabel("Your Date of birth");
        dob.setFont(new Font("Cambria Math.",Font.BOLD,20));
        dob.setBounds(590, 430, 200, 35);
        panel1.add(dob);

        btn1 = new JButton("Registor");
        btn1.setFont(new Font("Cambria Math.",Font.BOLD,20));
        btn1.setBounds(460, 550, 125, 35);
        panel1.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("Clear");
        btn2.setFont(new Font("Alternate Gothic.",Font.BOLD,20)); 
        btn2.setBounds(350, 550, 100, 35);
        panel1.add(btn2);
        btn2.addActionListener(this);

        date = new JComboBox(dates);
        date.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        date.setSize(50, 30);
        date.setLocation(770, 430);
        panel1.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        month.setSize(70, 30);
        month.setLocation(830, 430);
        panel1.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        year.setSize(70, 30);
        year.setLocation(905, 430);
        panel1.add(year);

        box1=new JCheckBox("    Accept terms and condictions");
        box1.setFont(new Font("Cambria Math.",Font.BOLD,20));
        box1.setBackground(new Color(240,255,255));
        box1.setBounds(360, 480, 400, 35);
        panel1.add(box1);               
        tf4.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf4.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf4.setEditable(true);

                }
                else{
                    tf4.setEditable(false);
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
        
        setVisible(false);
    }              
    @Override
    public void actionPerformed(ActionEvent e) {
//registration button
        if(e.getSource()==btn1)
       {
          if (box1.isSelected()  )
        {         
            if(tf2.getText().contains("@")){
            String user_name = tf1.getText();
            String pass = String.valueOf(p1.getText());          
            String email = tf2.getText();            
            String gender = " ";
            if(btn4.isSelected())
            {
               gender="female";
            }
            else 
                gender="male";
          
            String cty = (String)box.getSelectedItem();   
            String country = tf3.getText();
            String pnumber =tf4.getText();
            String cnicnumber =tf5.getText();
            String fathername =tf6.getText();
           new Successful();
            }
            
            else
            {
                JOptionPane.showMessageDialog(null,"There should be '@'sign in the email ", "", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        else
        {   
            msg.setOpaque(true);
            msg.setText("Accept terms and conditons to Registor");
        }
    }
// claer button
    if(e.getSource()==btn2)
       
    {
        tf1.setText("");
        p1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        msg.setText("");
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
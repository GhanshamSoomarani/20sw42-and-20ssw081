import javax.swing.*;
import java .awt.*;
import java.awt.event.*;
public class Calculate extends JFrame implements ActionListener 
{   
    JPanel headpanel,panel1,buttonpanel,buttonpanel1;
    JFrame frame,frame1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, msg, uni, muet;  
    JTextField tf1, tf2,tf3, tf4, tf5, tf6;  
    JButton btn1, btn2,homebtn,applybtn, loginbtn,calbtn,feebtn;
    JRadioButton btn3,btn4; 
    JComboBox box;
    JCheckBox box1;   
    Calculate()  
    {       headpanel = new JPanel();
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

            loginbtn = new JButton("TSET");
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
        msg.setBounds(250, 450, 450, 30);
        panel1.add(msg);

        l1 = new JLabel("Percentage Calculator ");
        l1.setFont(new Font("kristen ICT", Font.BOLD, 50)); 
        l1.setForeground(new Color(220,20,60));
        l1.setBounds(300, 100, 800, 60); 
        panel1.add(l1);      

        l2 = new JLabel("Your Test Score");
        l2.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l2.setBounds(70, 205, 250, 30); 
        panel1.add(l2); 
        tf1 = new JTextField(); 
        tf1.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf1.setBackground(new Color(211,211,211));
        tf1.setBounds(350, 205, 150, 30);
        panel1.add(tf1); 

        l3 = new JLabel("Total Marks in 10th class");
        l3.setFont(new Font("Cambria Math.",Font.BOLD,20)); 
        l3.setBounds(70, 270, 250, 30);    
        panel1.add(l3);
        tf2 = new JTextField();
        tf2.setBackground(new Color(211,211,211));
        tf2.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf2.setBounds(350, 270, 150, 30);
        panel1.add(tf2);

        l4 = new JLabel("Obtained Marks in 10th class");
        l4.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l4.setBounds(70, 335, 300, 30);
        panel1.add(l4); 
        tf3 = new JTextField();  
        tf3.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf3.setBackground(new Color(211,211,211));
        tf3.setBounds(350, 335, 150, 30 ); 
        panel1.add(tf3); 

        l5 = new JLabel("Obtained Marks in 12th class");
        l5.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l5.setBounds(550, 205, 300, 30);
        panel1.add(l5); 
        tf4 = new JTextField();
        tf4.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf4.setBackground(new Color(211,211,211));
        tf4.setBounds(850, 205, 150, 30);
        panel1.add(tf4);

        l6 = new JLabel("Total Marks in 12th class");
        l6.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l6.setBounds(550, 270, 270, 30);
        panel1.add(l6);
        tf5 = new JTextField(); 
        tf5.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf5.setBackground(new Color(211,211,211));
        tf5.setBounds(850, 270, 150, 30);
        panel1.add(tf5); 
        l7=new JLabel("Group");
        l7.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l7.setBounds(70, 400, 200, 30); 
        panel1.add(l7);
        btn3=new JRadioButton("Medical");
        btn3.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        btn3.setBounds(230,400,105,30);
        btn3.setBackground(new Color(240,255,255));
        panel1.add(btn3);
        btn4=new JRadioButton("Engineering"); 
        btn4.setFont(new Font("Alternate Gothic.",Font.BOLD,20));
        btn4.setBackground(new Color(240,255,255));
        btn4.setBounds(350,400,150,30);
        panel1.add(btn4);

        l8 = new JLabel("your Final CPN ");
        l8.setFont(new Font("Cambria Math.",Font.BOLD,20));
        l8.setBounds(550, 335, 200, 30);
        panel1.add(l8); 
        tf6 = new JTextField();
        tf6.setFont(new Font("Cambria Math.",Font.BOLD,20));
        tf6.setBackground(new Color(211,211,211));
        tf6.setBounds(850, 335, 150, 30);
        panel1.add(tf6);

        btn1 = new JButton("Calculate");
        btn1.setFont(new Font("Cambria Math.",Font.BOLD,20));
        btn1.setBounds(470, 500, 125, 30);
        panel1.add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("Clear");
        btn2.setFont(new Font("Alternate Gothic.",Font.BOLD,20)); 
        btn2.setBounds(340, 500, 100, 30);
        panel1.add(btn2);
        btn2.addActionListener(this);

        box1=new JCheckBox("You are not a robot");
        box1.setFont(new Font("Cambria Math.",Font.BOLD,20));
        box1.setBackground(new Color(240,255,255));
        box1.setBounds(550,400,340,30);
        panel1.add(box1);  
       tf1.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf1.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf1.setEditable(true);

                }
                else{
                    tf1.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });    
       tf2.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf2.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf2.setEditable(true);

                }
                else{
                    tf2.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });  
        tf3.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf3.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf3.setEditable(true);

                }
                else{
                    tf3.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }); 
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
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf5.setEditable(true);
                }
                else{
                    tf5.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);                    
                }
            }

        });    
        tf6.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf6.getText();
                int l = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf6.setEditable(true);

                }
                else{
                    tf6.setEditable(false);
                    JOptionPane.showMessageDialog(null,"Only enter numeric values ", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });    
       
}
          @Override
    public void actionPerformed(ActionEvent e) {

         if(e.getSource()==applybtn)
       {
         new Registration();
        }  
        if(e.getSource()==homebtn)
       {
        new Simplewebpage();
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

       if(e.getSource()==btn1)
       {

         if (box1.isSelected()  )
        { 
            String test_score = tf1.getText();
            String total_marks10= tf2.getText();
            String obtain_marks10 = tf3.getText(); 
            String total_marks112= tf4.getText();
            String obtain_marks12 = tf5.getText();           
           String group = " ";
            if(btn4.isSelected())
            {
               group="Medical";
            }
            else 
                group="Engineering";
            String cpn =tf6.getText();
            }
            
        }
        else
        {   
            msg.setOpaque(true);
            msg.setText("        Mark that you are not Robot");
        }
      

         if(e.getSource()==btn2)
       {

        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        }  

}
}
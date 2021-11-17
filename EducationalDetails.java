import javax.swing.*;
import java .awt.*;
import java.awt.event.*;

public class EducationalDetails  extends JFrame implements ActionListener
{
        JPanel headpanel,panel1,buttonpanel,buttonpanel1,accadimicInformation,accadmic1,detail,detail2,detail3;
        JFrame frame;
        JTextField tf1, tf2,tf3, tf4, tf5,tf6,tf7,tf8;
        JButton homebtn,applybtn, loginbtn,calbtn,feebtn,save$close,sub;
        JLabel uni, muet,welcom,accad,detail1,hsc,metric,olevel;
        EducationalDetails(){
        
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

            accadimicInformation = new JPanel();
            accadimicInformation.setBackground(new Color(217, 21, 236));
            accadimicInformation.setLayout(null);
            accadimicInformation.setBounds(0,100,1080,90);
            panel1.add(accadimicInformation);
            accad= new JLabel("ACCADIMIC INFORMATION");
            accad.setFont(new Font("ALGERIAN", Font.BOLD, 50)); 
            accad.setForeground(new Color(253, 254, 254));
            accad.setBounds(200,10, 800, 80); 
            accadimicInformation.add(accad);

            detail = new JPanel();
            detail.setBackground(new Color(214, 123, 37));
            detail.setLayout(null);
            detail.setBounds(0,200,1080,90);
            panel1.add(detail);
            detail1= new JLabel("    Level       Instute      Passing Year     Total Marks      Obtained Marks    ");
            detail1.setFont(new Font("ALGERIAN", Font.BOLD, 30)); 
            detail1.setForeground(new Color(252, 243, 207));
            detail1.setBounds(10,10, 1095, 80); 
            detail.add(detail1); 

            detail2 = new JPanel();
            detail2.setBackground(new Color(255, 255, 255));
            detail2.setLayout(null);
            detail2.setBounds(0,300,1080,200);
            panel1.add(detail2);

            hsc= new JLabel("HSC2");
            hsc.setFont(new Font("ALGERIAN", Font.BOLD, 15)); 
            hsc.setBounds(40,0, 200, 80); 
            detail2.add(hsc);   

            metric= new JLabel("METRIC");
            metric.setFont(new Font("ALGERIAN", Font.BOLD, 15)); 
            metric.setBounds(40,20, 200, 80); 
            detail2.add(metric); 

            olevel= new JLabel("O-Level");
            olevel.setFont(new Font("ALGERIAN", Font.BOLD, 15)); 
            olevel.setBounds(40,40, 200, 80); 
            detail2.add(olevel);  

            tf1 = new JTextField(); 
            tf1.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf1.setBackground(new Color(211,211,211));
            tf1.setBounds(150, 40, 150, 35);
            detail2.add(tf1);

            tf2 = new JTextField(); 
            tf2.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf2.setBackground(new Color(211,211,211));
            tf2.setBounds(340, 40, 170, 35);
            detail2.add(tf2);      

            tf3 = new JTextField(); 
            tf3.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf3.setBackground(new Color(211,211,211));
            tf3.setBounds(600, 40, 150, 35);
            detail2.add(tf3);

            tf4 = new JTextField(); 
            tf4.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf4.setBackground(new Color(211,211,211));
            tf4.setBounds(800, 40, 170, 35);
            detail2.add(tf4);   

            hsc= new JLabel("HSC2");
            hsc.setFont(new Font("ALGERIAN", Font.BOLD, 15)); 
            hsc.setBounds(40,90, 200, 80); 
            detail2.add(hsc);   

            metric= new JLabel("Intermediate");
            metric.setFont(new Font("ALGERIAN", Font.BOLD, 15)); 
            metric.setBounds(40,110, 200, 80); 
            detail2.add(metric); 

            olevel= new JLabel("A-Level");
            olevel.setFont(new Font("ALGERIAN", Font.BOLD, 15)); 
            olevel.setBounds(40,130, 200, 80); 
            detail2.add(olevel);  
  

            tf5 = new JTextField(); 
            tf5.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf5.setBackground(new Color(211,211,211));
            tf5.setBounds(150, 130, 150, 35);
            detail2.add(tf5);

            tf6 = new JTextField(); 
            tf6.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf6.setBackground(new Color(211,211,211));
            tf6.setBounds(340, 130, 170, 35);
            detail2.add(tf6);      

            tf7 = new JTextField(); 
            tf7.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf7.setBackground(new Color(211,211,211));
            tf7.setBounds(600, 130, 150, 35);
            detail2.add(tf7);

            tf8 = new JTextField(); 
            tf8.setFont(new Font("Cambria Math.",Font.BOLD,20));
            tf8.setBackground(new Color(211,211,211));
            tf8.setBounds(800, 130, 170, 35);
            detail2.add(tf8);

            save$close = new JButton("Save & Close");
            save$close.setFont(new Font("Cambria Math.",Font.BOLD,20));
            save$close.setBounds(725, 550, 175, 35);
            panel1.add(save$close);
            save$close.addActionListener(this);
            sub = new JButton("  Submit");
            sub.setFont(new Font("Cambria Math.",Font.BOLD,20));
            sub.setBounds(925, 550, 125, 35);
            sub.addActionListener(this);
            panel1.add(sub);

            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1095,800);
            frame.setLayout(new BorderLayout(5,10));
            frame.setBackground(new Color(100,123,44));
            frame.add(headpanel,BorderLayout.NORTH);
            frame.add(panel1,BorderLayout.CENTER);
            frame.setVisible(true);
            frame.setResizable(false);
             tf3.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyPressed(KeyEvent ke){
                String value = tf3.getText();
                int j = value.length();
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
                int j = value.length();
                if (ke.getKeyChar()>='0' && ke.getKeyChar()<='9'|| ke.getKeyChar()<= KeyEvent.VK_BACK_SPACE  ){
                    tf4.setEditable(true);

                }
                else{
                    tf4.setEditable(false);
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

        }
         @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==save$close)
       {
        
       new Simplewebpage();
        
       }
       if(e.getSource()==sub)
       {
       JOptionPane.showMessageDialog(null,"You have Successfully Submitted", "", JOptionPane.INFORMATION_MESSAGE);

        new Registration();
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
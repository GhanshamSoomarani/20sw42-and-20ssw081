import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  
import javax.swing.SwingConstants;
public class Test extends JFrame implements ActionListener//extends Thread
{
       JPanel headpanel,panel1,buttonpanel,buttonpanel1;
       JFrame frame,frame1;
       JButton homebtn,applybtn, loginbtn,calbtn,feebtn;
       JLabel uni, muet;
         JLabel l1,l2,l3,l4,l5;
         JButton close, next;
         String append="";
 Test()  {  
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

   
        next= new JButton("Next");
        next.setFont(new Font("Cambria Math.",Font.BOLD,20));
        next.setBounds(590, 500, 100, 30);
        panel1.add(next);
        next.addActionListener(this);

        close = new JButton("Close");
        close.setFont(new Font("Alternate Gothic.",Font.BOLD,20)); 
        close.setBounds(480, 500, 100, 30);
        panel1.add(close);
        close.addActionListener(this);

    }

   @Override
    public void actionPerformed(ActionEvent e) {

         if(e.getSource()==next)
       {
        new Instruction();
        //new Calculate();
        }  

         if(e.getSource()==close)
       {
          System.exit(0);

     //    new setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
import javax.swing.*;
import java .awt.*;
import java.awt.event.*;
public class FeesStructure  extends JFrame implements ActionListener
{
        JPanel headpanel,panel1,buttonpanel,buttonpanel1,accadimicInformation,accadmic1,detail,detail2,detail3;
        JFrame frame;
        JTextField tf1, tf2,tf3, tf4, tf5,tf6,tf7,tf8;
        JButton homebtn,applybtn, loginbtn,calbtn,feebtn,save$close,sub,hostelafee,hostelsfee,semfee;
        JLabel uni, muet,welcom,accad,detail1,hsc,metric,olevel;
        JTextArea fees;
        FeesStructure(){
        
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
            accadimicInformation.setBounds(0,100,1080,60);
            panel1.add(accadimicInformation);
            accad= new JLabel("FEES STRUCTURE");
            accad.setFont(new Font("ALGERIAN", Font.BOLD, 30)); 
            accad.setForeground(new Color(253, 254, 254));
            accad.setBounds(400,10, 800, 50); 
            accadimicInformation.add(accad);

            semfee = new JButton("Semester Fee");
            semfee.setFont(new Font("Arial black.",Font.BOLD,25)); 
            semfee.setBounds(100,160, 300, 50);
            panel1.add(semfee);
            semfee.addActionListener(this);

            hostelsfee = new JButton("Hostel Semester Fee");
            hostelsfee.setFont(new Font("Arial black.",Font.BOLD,25)); 
            hostelsfee.setBounds(400,160, 300, 50);
            panel1.add(hostelsfee);
            hostelsfee.addActionListener(this);

            hostelafee = new JButton("Hostel Allocation Fees");
            hostelafee.setFont(new Font("Arial black.",Font.BOLD,25)); 
            hostelafee.setBounds(700,160, 300, 50);
            panel1.add(hostelafee);
            hostelafee.addActionListener(this);
            fees = new JTextArea();
            fees.setBounds(97,300,900,270);
            fees.setBackground(new Color(244, 246, 247));
            fees.setFont(new Font("ALGERIAN", Font.BOLD, 30));
            fees.setEditable(false);
            panel1.add(fees);
            fees.setText("Admission                                       fee(Per Year)      14000.00"+"\n"+
                     "University caution money deposit (Refundable)         5000.00"+"\n"+
                     "Subject society/PERN fee                  (Per Year)          1200.00"+"\n"+
                     "Enrolment fee                                        (Once)            1000.00"+"\n"+
                     "HSC Marks Certificate verification fee  (Once)           2000.00"+"\n"+
                     "Smart Identity Card Fee                         (Once)           1000.00"+"\n"+
                     "Total:                                                                           24200.00");

            detail = new JPanel();
            detail.setBackground(new Color(214, 123, 37));
            detail.setLayout(null);
            detail.setBounds(0,220,1080,900);
            panel1.add(detail);
            detail1= new JLabel("Admission Fees Regular Scheme");
            detail1.setFont(new Font("ALGERIAN", Font.BOLD, 25)); 
            detail1.setForeground(new Color(252, 243, 207));
            detail1.setBounds(300,10, 1095, 80); 
            detail.add(detail1); 
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1095,800);
            frame.setLayout(new BorderLayout(5,10));
            frame.setBackground(new Color(100,123,44));
            frame.add(headpanel,BorderLayout.NORTH);
            frame.add(panel1,BorderLayout.CENTER);
            frame.setVisible(true);
            frame.setResizable(false);
            
        }
         @Override
    public void actionPerformed(ActionEvent e) {

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
        
        }
        if(e.getSource()==semfee)
       {
        new SemesterFees();
          
          }
          if(e.getSource()==hostelafee)
       {
        new HostelAlloctionFee();
          
          }  
          if(e.getSource()==hostelsfee)
       {
        new HostelSemesterFees();
          
          }  

    }
}
import javax.swing.*;
import java .awt.*;
import java.awt.event.*;

public class Simplewebpage  extends JFrame implements ActionListener
{
        JPanel headpanel,panel1,buttonpanel,buttonpanel1;
        JFrame frame,frame1;
        JButton homebtn,applybtn, loginbtn,calbtn,feebtn;
        JLabel uni, muet,welcom;
        JTextArea home;
        Simplewebpage(){
        
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
            welcom= new JLabel("WELCOME TO MUET");
            welcom.setFont(new Font("ALGERIAN", Font.BOLD, 90)); 
            welcom.setForeground(new Color(210, 180, 222));
            welcom.setBounds(90,300, 1050, 100); 
            panel1.add(welcom);

            home = new JTextArea();
            home.setBounds(90,100,900,500);
            home.setBackground(new Color(244, 246, 247));
            home.setFont(new Font("ALGERIAN", Font.BOLD, 30));
            home.setEditable(false);
            panel1.add(home);

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
        home.setText(" MEHRAN UNIVERSITY OF ENGINEERING AND TECHNOLOGY"+"\n"+
                     "    JAMSHORO, SINDH,PAKISTAN (Often referred as Mehran"+"\n"+
                     " University or MUET) is a public research university located in"+"\n"+
                     "     Jamshoro, Sindh, Pakistan focused on STEM education."+"\n"+
                     "    Established in July 1976, as a campus of the University of "+"\n"+
                     "  Sindh, and a year later was chartered as an independent uni."+"\n"+
                     " According to latest QS World University Rankings 2020 MUET "+"\n"+
                     "    ranks among top 351-400 universities of the Aisa. MUET Is "+"\n"+
                     "ranked among the top 10 institutions of higher learning in Pakistan"+"\n"+
                     "  the Higher Education Commission of Pakistan.According to"+"\n"+
                     "latest by rankings of HEC, MUET ranks 1st in Sindh and 8th in "+"\n"+
                     "  Pakistan, in engineering category also ranks as 2nd best "+"\n"+
                     "                   public sector university of Pakistan.");
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
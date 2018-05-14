package yahtzeeGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;


public class MultiPlayer extends JFrame implements VariablesYahtzee, MouseListener, ActionListener {
    
    ImageIcon image  = new ImageIcon();
    ImageIcon image2 = new ImageIcon();
    ImageIcon image3 = new ImageIcon();
    ImageIcon image4 = new ImageIcon();
    ImageIcon image5 = new ImageIcon();
    
    ScoreCalculation sc = new ScoreCalculation();
    
    //Dice Images
    
    String dice[] = {
    		"/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/1.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/2.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/3.png",
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/4.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/5.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/6.png"
            		};
    
   
    // Player 1 Labels
    
    JLabel lblups1 = new JLabel("Upper Score");
    JLabel lbllwr1 = new JLabel("Lower Score");
    JLabel lblace1 = new JLabel("Aces");
    JLabel lbltwo1 = new JLabel("Two");
    JLabel lblthree1 = new JLabel("Three");
    JLabel lblfour1 = new JLabel("Four");
    JLabel lblfive1 = new JLabel("Five");
    JLabel lblsix1 = new JLabel("Six");
    JLabel lbl3ok1 = new JLabel("3 of Kind");
    JLabel lbl4ok1 = new JLabel("4 of Kind");
    JLabel lblss1 = new JLabel("Small Straight");
    JLabel lblls1 = new JLabel("Large Straight");
    JLabel lblfh1 = new JLabel("Full House");
    JLabel lblytz1 = new JLabel("Yahtzee");
    JLabel lblchnc1 = new JLabel("Chance");
    JLabel lblttl1 = new JLabel("Total");


   
    // Player 2 Labels
 
    JLabel lblups2 = new JLabel("Upper Score");
    JLabel lbllwr2 = new JLabel("Lower Score");
    JLabel lblace2 = new JLabel("Aces");
    JLabel lbltwo2 = new JLabel("Two");
    JLabel lblthree2 = new JLabel("Three");
    JLabel lblfour2 = new JLabel("Four");
    JLabel lblfive2 = new JLabel("Five");
    JLabel lblsix2 = new JLabel("Six");
    JLabel lbl3ok2 = new JLabel("3 of Kind");
    JLabel lbl4ok2 = new JLabel("4 of Kind");
    JLabel lblss2 = new JLabel("Small Straight");
    JLabel lblls2 = new JLabel("Large Straight");
    JLabel lblfh2 = new JLabel("Full House");
    JLabel lblytz2 = new JLabel("Yahtzee");
    JLabel lblchnc2 = new JLabel("Chance");
    JLabel lblttl2 = new JLabel("Total");
    
    // Adding Panels for both Players
    
    JPanel plyr1 = new JPanel();
    JPanel plyr2 = new JPanel();  
            
    
   // Adding Panel for Dice  
    
    JPanel dPanel = new JPanel();
  
    // Setting Random Numbers for Dice
    
    Random rd1 = new Random();
    Random rd2 = new Random();
    Random rd3 = new Random();
    Random rd4 = new Random();
    Random rd5 = new Random();
   
   
    MultiPlayerPanel mpP = new MultiPlayerPanel();
    
    public MultiPlayer() {
        setSize(815, 800);
        setLayout(null);
        setTitle("Yahtzee !!");
        designpallet();
        action();
        mpP.action2();
        
        mpP.logic();
        mpP.lblplyr1.setEnabled(true);
        mpP.lblplyr2.setEnabled(false);
        
        mpP.done.setEnabled(false);
        


        mpP.timerRolling = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageRandom();
               mpP.countR++;
                for (int i = 10; i == mpP.countR; i++) {
                  mpP.timerRolling.stop();
                    
                }
            }
        });
        mpP.up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
               try{ if(mpP.firstdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[0]]);
                 num1[0] = num1[0]+1; 
                mpP.firstdice.setIcon(iia);
                }
        
               else if(mpP.seconddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[1]]);
                 num1[1] = num1[1]+1; 
                mpP.seconddice.setIcon(iia);
                }
                
               else if(mpP.thirddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[2]]);
                 num1[2] = num1[2]+1; 
                mpP.thirddice.setIcon(iia);
                }
               else if(mpP.fourthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[3]]);
                 num1[3] = num1[3]+1; 
                mpP.fourthdice.setIcon(iia);
                }
               else if(mpP.fifthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[4]]);
                 num1[4] = num1[4]+1; 
                mpP.fifthdice.setIcon(iia);
                }
               mpP.up.setEnabled(false);
               mpP.down.setEnabled(true);
               mpP.reroll.setEnabled(true);
               mpP.twox.setEnabled(true);
               }catch(Exception IO){
                   JOptionPane.showMessageDialog(null, "Limit Reached");
               }
            }
            
        });
        
        
         mpP.down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
               try{ if(mpP.firstdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[0]-2]);
                 num1[0] = num1[0]-1; 
               mpP. firstdice.setIcon(iia);
                }
        
               else if(mpP.seconddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[1]-2]);
                 num1[1] = num1[1]-1; 
                mpP.seconddice.setIcon(iia);
                }
                
               else if(mpP.thirddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[2]-2]);
                 num1[2] = num1[2]-1; 
                mpP.thirddice.setIcon(iia);
                }
               else if(mpP.fourthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[3]-2]);
                 num1[3] = num1[3]-1; 
                mpP.fourthdice.setIcon(iia);
                }
               else if(mpP.fifthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[4]-2]);
                 num1[4] = num1[4]-1; 
               mpP. fifthdice.setIcon(iia);
                }
              
               mpP.down.setEnabled(false);
               mpP.reroll.setEnabled(true);
               mpP.twox.setEnabled(true);
               
               }catch(Exception IO){
                   JOptionPane.showMessageDialog(null, "Limit Reached");
               }
            }
            
        });
        
       mpP. reroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             mpP.roll.setEnabled(true);
             mpP.reroll.setEnabled(false);
             mpP.count=mpP.count-1;
            }
        });
        
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void imageRandom() {
        
        int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0;
        if (mpP.firstdice.isEnabled() == true) {
//            num1[0] = 2;
            num1[0] = num2[rd1.nextInt(num2.length)];
        }
        if (mpP.seconddice.isEnabled() == true) {
//            num1[1] = 2;
            num1[1] = num2[rd1.nextInt(num2.length)];
        }
        if (mpP.thirddice.isEnabled() == true) {
//            nusm1[2] = 1;
            num1[2] = num2[rd1.nextInt(num2.length)];
        }
        if (mpP.fourthdice.isEnabled() == true) {
//            num1[3] = 3;
            num1[3] = num2[rd1.nextInt(num2.length)];
        }
        if (mpP.fifthdice.isEnabled() == true) {
//            num1[4] = 4;
            num1[4] = num2[rd1.nextInt(num2.length)];
        }
        
        r2 = rd2.nextInt(dice.length);
        r3 = rd3.nextInt(dice.length);
        r4 = rd4.nextInt(dice.length);
        r5 = rd5.nextInt(dice.length);
        
        Image iia = new ImageIcon(dice[num1[0] - 1]).getImage().getScaledInstance(70 ,70, Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(iia);
        
        Image  iiia = new ImageIcon(dice[num1[1] - 1]).getImage().getScaledInstance(70 ,70, Image.SCALE_SMOOTH);
        ImageIcon iii = new ImageIcon(iiia);
        
        Image iva = new ImageIcon(dice[num1[2] - 1]).getImage().getScaledInstance(70 ,70, Image.SCALE_SMOOTH);
        ImageIcon iv = new ImageIcon(iva);
        
        Image  va = new ImageIcon(dice[num1[3] - 1]).getImage().getScaledInstance(70 ,70, Image.SCALE_SMOOTH);
        ImageIcon  v = new ImageIcon(va);
        
        Image  via = new ImageIcon(dice[num1[4] - 1]).getImage().getScaledInstance(70 ,70, Image.SCALE_SMOOTH);
        
        ImageIcon  vi = new ImageIcon(via);
        mpP.firstdice.setIcon(ii);
        mpP.seconddice.setIcon(iii);
        mpP.thirddice.setIcon(iv);
        mpP.fourthdice.setIcon(v);
        mpP.fifthdice.setIcon(vi);
        
        String s = Integer.toString(num1[0]);
        String s1 = Integer.toString(num1[1]);
        String s2 = Integer.toString(num1[2]);
        String s3 = Integer.toString(num1[3]);
        String s4 = Integer.toString(num1[4]);
    }
    
    public void designpallet() {
        add(dPanel);
        dPanel.add(mpP.firstdice);
        dPanel.add(mpP.seconddice);
        dPanel.add(mpP.thirddice);
        dPanel.add(mpP.fourthdice);
        dPanel.add(mpP.fifthdice);
       
        
        //Setting Dice Panel and Dice Images 
        
        dPanel.setBounds(0, 20, 800, 110);
        mpP.firstdice.setBounds(163, 11, 95, 80);
        mpP.seconddice.setBounds(270, 11, 95, 80);
        mpP.thirddice.setBounds(385, 11, 95, 80);
        mpP.fourthdice.setBounds(484, 11, 95, 80);
        mpP.fifthdice.setBounds(595, 11, 95, 80);
        
        
         
        // Setting up Player 1 
        
        add(plyr1);
        plyr1.setLayout(null);
        plyr1.setBounds(20, 70, 385, 540);
        plyr1.setOpaque(true);

        // Setting texts False for edit
        
        plyr1.setBackground(Color.decode("#3e7d81"));
        mpP.txtace1.setEditable(false);
        mpP.txttwo1.setEditable(false);
        mpP.txtthree1.setEditable(false);
        mpP.txtfour1.setEditable(false);
        mpP.txtfive1.setEditable(false);
        mpP.txtsix1.setEditable(false);
        mpP.txt3ok1.setEditable(false);
        mpP.txt4ok1.setEditable(false);
        mpP.txtfh1.setEditable(false);
        mpP.txtss1.setEditable(false);
        mpP.txtls1.setEditable(false);
        mpP.txtytz1.setEditable(false);
        mpP.txtchnc1.setEditable(false);
        mpP.txtttl1.setEditable(false);

        
        // Adding Labels for Player 1 
        
        plyr1.add(mpP.lblplyr1);
        plyr1.add(lblups1);
        plyr1.add(lbllwr1);
        plyr1.add(lblace1);
        plyr1.add(lbltwo1);
        plyr1.add(lblthree1);
        plyr1.add(lblfour1);
        plyr1.add(lblfive1);
        plyr1.add(lblsix1);
        plyr1.add(lbl3ok1);
        plyr1.add(lbl4ok1);
        plyr1.add(lblfh1);
        plyr1.add(lblss1);
        plyr1.add(lblls1);
        plyr1.add(lblytz1);
        plyr1.add(lblchnc1);
        plyr1.add(lblttl1);
        
        //Player text field for Player 1
        
        plyr1.add(mpP.txtace1);
        plyr1.add(mpP.txttwo1);
        plyr1.add(mpP.txtthree1);
        plyr1.add(mpP.txtfour1);
        plyr1.add(mpP.txtfive1);
        plyr1.add(mpP.txtsix1);
        plyr1.add(mpP.txt3ok1);
        plyr1.add(mpP.txt4ok1);
        plyr1.add(mpP.txtfh1);
        plyr1.add(mpP.txtss1);
        plyr1.add(mpP.txtls1);
        plyr1.add(mpP.txtytz1);
        plyr1.add(mpP.txtchnc1);
        plyr1.add(mpP.txtttl1);
        
        
        //  Font
        
        Font titlefont = new Font("Hobo std",Font.BOLD, 18);
        
        // Setting Player 1 bounds
        
        mpP.lblplyr1.setBounds(130, 70, 100, 20);
        mpP.lblplyr1.setFont(titlefont);
        
        lblups1.setBounds(30, 90, 100, 100);
        
        lbllwr1.setBounds(180, 90, 100, 100);
        
        lblace1.setBounds(30, 180, 50, 30);
        mpP.txtace1.setBounds(90, 180, 50, 40);
        
        lbltwo1.setBounds(30, 230, 50, 30);
        mpP.txttwo1.setBounds(90, 230, 50, 40);
        
        lblthree1.setBounds(30, 280, 50, 30);
        mpP.txtthree1.setBounds(90, 280, 50, 40);
        
        lblfour1.setBounds(30, 340, 40, 14);
        mpP. txtfour1.setBounds(90, 330, 50, 40);
        
        lblfive1.setBounds(30, 380, 50, 30);
        mpP. txtfive1.setBounds(90, 380, 50, 40);
        
        lblsix1.setBounds(30, 430, 50, 30);
        mpP. txtsix1.setBounds(90, 430, 50, 40);
        
        lblttl1.setBounds(30, 480, 80, 40);
        mpP.txtttl1.setBounds(90, 480, 50, 40); 
        
        lbl3ok1.setBounds(180, 180, 70, 30);
        mpP. txt3ok1.setBounds(290, 180, 50, 40);
        
        lbl4ok1.setBounds(180, 230, 70, 30);
        mpP. txt4ok1.setBounds(290, 230, 50, 40);
        
        lblss1.setBounds(180, 270, 200, 50);
        mpP. txtss1.setBounds(290, 280, 50, 40);
        
        lblls1.setBounds(180, 320, 400, 50);
        mpP. txtls1.setBounds(290, 330, 50, 40);
        
        lblfh1.setBounds(180, 380, 80, 30);
        mpP. txtfh1.setBounds(290, 380, 50, 40);
        
        lblytz1.setBounds(180, 430, 80, 40);
        mpP. txtytz1.setBounds(290, 430, 50, 40);
        
        lblchnc1.setBounds(180, 480, 80, 40);
        mpP. txtchnc1.setBounds(290, 480, 50, 40);
        
     
       // Setting Buttons for Both players
        
        add(mpP.up);
        mpP.up.setBounds(220, 695, 80,50 );
        
        add(mpP.down);
        mpP.down.setBounds(320, 695, 80, 50);
        
        add(mpP.twox);
        mpP.twox.setBounds(420, 695, 80, 50);
        
        add(mpP.reroll);
        mpP.reroll.setBounds(520, 695, 80, 50);
   
        add(mpP.roll);
        mpP.roll.setBounds(300, 630, 100, 50);
        
        add(mpP.done);
        mpP.done.setBounds(420, 630, 100, 50);
        
        
        // Setting for Player 2
        
        add(plyr2);
        plyr2.setLayout(null);
        plyr2.setBounds(410, 70, 385, 540);
        plyr2.setOpaque(true);
        
        /////player two set false //////
        
        plyr2.setBackground(Color.decode("#81423e"));
        mpP.txtace2.setEditable(false);
        mpP.txttwo2.setEditable(false);
        mpP.txtthree2.setEditable(false);
        mpP.txtfour2.setEditable(false);
        mpP.txtfive2.setEditable(false);
        mpP.txtsix2.setEditable(false);
        mpP.txt3ok2.setEditable(false);
        mpP.txt4ok2.setEditable(false);
        mpP.txtfh2.setEditable(false);
        mpP.txtss2.setEditable(false);
        mpP.txtls2.setEditable(false);
        mpP.txtytz2.setEditable(false);
        mpP.txtchnc2.setEditable(false);
        mpP.txtttl2.setEditable(false);

        //Adding Labels for Player 2
        
        plyr2.add(mpP.lblplyr2);
        plyr2.add(lblups2);
        plyr2.add(lbllwr2);
        plyr2.add(lblace2);
        plyr2.add(lbltwo2);
        plyr2.add(lblthree2);
        plyr2.add(lblfour2);
        plyr2.add(lblfive2);
        plyr2.add(lblsix2);
        plyr2.add(lbl3ok2);
        plyr2.add(lbl4ok2);
        plyr2.add(lblfh2);
        plyr2.add(lblss2);
        plyr2.add(lblls2);
        plyr2.add(lblytz2);
        plyr2.add(lblchnc2);
        plyr2.add(lblttl2);
        
        //Adding Text Field for Player 2
        plyr2.add(mpP.txtace2);
        plyr2.add(mpP.txttwo2);
        plyr2.add(mpP.txtthree2);
        plyr2.add(mpP.txtfour2);
        plyr2.add(mpP.txtfive2);
        plyr2.add(mpP.txtsix2);
        plyr2.add(mpP.txt3ok2);
        plyr2.add(mpP.txt4ok2);
        plyr2.add(mpP.txtfh2);
        plyr2.add(mpP.txtss2);
        plyr2.add(mpP.txtls2);
        plyr2.add(mpP.txtytz2);
        plyr2.add(mpP.txtchnc2);
        plyr2.add(mpP.txtttl2);
        
      
        //player two 
        mpP.lblplyr2.setBounds(150, 70, 100, 20);
        mpP.lblplyr2.setFont(titlefont);
        
        lblups2.setBounds(40, 90, 100, 100);
        
        lbllwr2.setBounds(200, 90, 100, 100);
        
        lblace2.setBounds(40, 180, 50, 30);
        mpP. txtace2.setBounds(100, 180, 50, 40);
       
        lbltwo2.setBounds(40, 230, 50, 30);
        mpP. txttwo2.setBounds(100, 230, 50, 40);
       
        lblthree2.setBounds(40, 280, 50, 30);
        mpP. txtthree2.setBounds(100, 280, 50, 40);
       
        lblfour2.setBounds(40, 330, 50, 30);
        mpP. txtfour2.setBounds(100, 330, 50, 40);
       
        lblfive2.setBounds(40, 380, 50, 30);
        mpP. txtfive2.setBounds(100, 380, 50, 40);
       
        lblsix2.setBounds(40, 430, 50, 30);
        mpP. txtsix2.setBounds(100, 430, 50, 40);
       
        lblttl2.setBounds(40, 480, 50, 30);
        mpP. txtttl2.setBounds(100, 480, 50, 40);
        
        lbl3ok2.setBounds(200, 180, 70, 30);
        mpP. txt3ok2.setBounds(300, 180, 50, 39);
       
        lbl4ok2.setBounds(200, 230, 70, 30);
        mpP. txt4ok2.setBounds(300, 230, 50, 40);
       
        lblss2.setBounds(200, 280, 95, 30);
        mpP. txtss2.setBounds(300, 280, 50, 40);
       
        lblls2.setBounds(200, 330, 95, 30);
        mpP. txtls2.setBounds(300, 330, 50, 40);
       
        lblfh2.setBounds(200, 380, 95, 30);
        mpP. txtfh2.setBounds(300, 380, 50, 40);
       
        lblytz2.setBounds(200, 430, 95, 30);
        mpP. txtytz2.setBounds(300, 430, 50, 40);
       
        lblchnc2.setBounds(200, 480, 85, 40);
        mpP. txtchnc2.setBounds(300, 480, 50, 40);
       
       
        
        
        mpP.twox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplypower();
                mpP.twox.setEnabled(false);
            }
        });
    }
    
    public void action() {
        mpP.firstdice.addMouseListener(this);
        mpP.seconddice.addMouseListener(this);
        mpP.thirddice.addMouseListener(this);
        mpP.fourthdice.addMouseListener(this);
        mpP.fifthdice.addMouseListener(this);
        
        ////player one action listener 
        
        
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
            if (e.getSource() == mpP.firstdice) {
                
                if (mpP.firstdice.isEnabled() == true) {
                    mpP.firstdice.setEnabled(false);
                } else {
                    mpP.firstdice.setEnabled(true);
                }
                
            }
            
            if (e.getSource() == mpP.seconddice) {
                if (mpP.seconddice.isEnabled() == true) {
                    mpP.seconddice.setEnabled(false);
                } else {
                    mpP.seconddice.setEnabled(true);
                }
            }
            if (e.getSource() == mpP.thirddice) {
                if (mpP.thirddice.isEnabled() == true) {
                    mpP.thirddice.setEnabled(false);
                } else {
                    mpP.thirddice.setEnabled(true);
                }
            }
            if (e.getSource() == mpP.fourthdice) {
                if (mpP.fourthdice.isEnabled() == true) {
                    mpP.fourthdice.setEnabled(false);
                } else {
                    mpP.fourthdice.setEnabled(true);
                }
            }
            if (e.getSource() == mpP.fifthdice) {
                if (mpP.fifthdice.isEnabled() == true) {
                    mpP.fifthdice.setEnabled(false);
                } else {
                    mpP.fifthdice.setEnabled(true);
                }
            }
        
          
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
            
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void multiplypower(){
        if(plyr1.isEnabled()==true){
        if(mpP.ace!=0){
        mpP.ace = mpP.ace *2;
        mpP.txtace1.setText(""+mpP.ace);
        }
        if(mpP.twos!=0){
        mpP.twos = mpP.twos *2;
        mpP.txttwo1.setText(""+mpP.twos);
        }
        if(mpP.threes!=0){
        mpP.threes = mpP.threes *2;
        mpP.txtthree1.setText(""+mpP.threes);
        }
        if(mpP.fours!=0){
        mpP.fours = mpP.fours *2;
        mpP.txtfour1.setText(""+mpP.fours);
        }
        if(mpP.fives!=0){
        mpP.fives = mpP.fives *2;
        mpP.txtfive1.setText(""+mpP.fives);
        }
        if(mpP.sixes!=0){
        mpP.sixes = mpP.sixes *2;
        mpP.txtsix1.setText(""+mpP.sixes);
        }
        }
         if(plyr2.isEnabled()==true){
        if(mpP.ace2!=0){
        mpP.ace2 = mpP.ace2 *2;
        mpP.txtace2.setText(""+mpP.ace2);
        }
        if(mpP.twos2!=0){
        mpP.twos2 = mpP.twos2 *2;
        mpP.txttwo2.setText(""+mpP.twos2);
        }
        if(mpP.threes2!=0){
        mpP.threes2 = mpP.threes2 *2;
        mpP.txtthree2.setText(""+mpP.threes2);
        }
        if(mpP.fours2!=0){
        mpP.fours2 = mpP.fours2 *2;
        mpP.txtfour2.setText(""+mpP.fours2);
        }
        if(mpP.fives2!=0){
        mpP.fives2 = mpP.fives2 *2;
        mpP.txtfive2.setText(""+mpP.fives2);
        }
        if(mpP.sixes2!=0){
        mpP.sixes2 = mpP.sixes2 *2;
        mpP.txtsix2.setText(""+mpP.sixes2);
        }
        }
        }
}
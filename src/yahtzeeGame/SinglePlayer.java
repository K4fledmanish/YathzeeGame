package yahtzeeGame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;


public class SinglePlayer extends JFrame implements VariablesYahtzee ,MouseListener,ActionListener{
	
	ImageIcon image = new ImageIcon();
    ImageIcon image2 = new ImageIcon();
    ImageIcon image3 = new ImageIcon();
    ImageIcon image4 = new ImageIcon();
    ImageIcon image5 = new ImageIcon();
    
    ScoreCalculation sc = new ScoreCalculation();
    String dice[] = {
    		"/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/1.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/2.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/3.png",
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/4.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/5.png", 
            "/Users/K4fleDManish/Workspace/Java/Eclipse/Yahtzee (DDOOCP Final)/src/imagesGame/6.png"
        			};
  
    //Labels for Player 1 
    
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

 // Setting Panel for Player 1 as plyr1
    
 JPanel plyr1 = new JPanel();

 
  //Setting DicePanel   
 
 	JPanel dPanel = new JPanel();
    Random rd1 = new Random();
    Random rd2 = new Random();
    Random rd3 = new Random();
    Random rd4 = new Random();
    Random rd5 = new Random();
 
    // SinglePlayerPanel 
    
 SinglePlayerPanel spP = new SinglePlayerPanel();
    
    public SinglePlayer() {
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(510, 650);
        setLayout(null);
        designpallet();
        action();
        spP.action2();
        
       spP.logic();
       spP.lblplyr1.setEnabled(true);
        
       spP.done.setEnabled(false);
        


       spP.timerRolling = new Timer(80, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageRandom();
               spP. countR++;
                for (int i = 10; i == spP.countR; i++) {
                  spP.  timerRolling.stop();
                }
            }
        });
        spP.up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
               try{ if(spP.firstdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[0]]);
                 num1[0] = num1[0]+1; 
                spP.firstdice.setIcon(iia);
                }
        
               else if(spP.seconddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[1]]);
                 num1[1] = num1[1]+1; 
                spP.seconddice.setIcon(iia);
                }
                
               else if(spP.thirddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[2]]);
                 num1[2] = num1[2]+1; 
                spP.thirddice.setIcon(iia);
                }
               else if(spP.fourthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[3]]);
                 num1[3] = num1[3]+1; 
                spP.fourthdice.setIcon(iia);
                }
               else if(spP.fifthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[4]]);
                 num1[4] = num1[4]+1; 
                spP.fifthdice.setIcon(iia);
                }
               }catch(Exception IO){
                   JOptionPane.showMessageDialog(null, "Limit Reached");
               }
              
               spP.up.setEnabled(false);
            }
            
        });
        
         spP.down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
               try{ if(spP.firstdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[0]-2]);
                 num1[0] = num1[0]-1; 
               spP. firstdice.setIcon(iia);
                }
        
               else if(spP.seconddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[1]-2]);
                 num1[1] = num1[1]-1; 
                spP.seconddice.setIcon(iia);
                }
                
               else if(spP.thirddice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[2]-2]);
                 num1[2] = num1[2]-1; 
                spP.thirddice.setIcon(iia);
                }
               else if(spP.fourthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[3]-2]);
                 num1[3] = num1[3]-1; 
                spP.fourthdice.setIcon(iia);
                }
               else if(spP.fifthdice.isEnabled()==false){
                ImageIcon iia = new ImageIcon(dice[num1[4]-2]);
                 num1[4] = num1[4]-1; 
               spP. fifthdice.setIcon(iia);
                }
               }catch(Exception IO){
                   JOptionPane.showMessageDialog(null, "Limit Reached");
               }
               spP.down.setEnabled(false);
            }
            
        });
        
       spP.reroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
             spP.count = spP.count - 1;	
             spP.roll.setEnabled(true);
             spP.reroll.setEnabled(false);
             
             
             

            }
        });
        
        
 
    }
    
    public void imageRandom() {
        
        int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0;
        if (spP.firstdice.isEnabled() == true) {
//            num1[0] = 2;
            num1[0] = num2[rd1.nextInt(num2.length)];
        }
        if (spP.seconddice.isEnabled() == true) {
//            num1[1] = 2;
            num1[1] = num2[rd1.nextInt(num2.length)];
        }
        if (spP.thirddice.isEnabled() == true) {
//            nusm1[2] = 1;
            num1[2] = num2[rd1.nextInt(num2.length)];
        }
        if (spP.fourthdice.isEnabled() == true) {
//            num1[3] = 3;
            num1[3] = num2[rd1.nextInt(num2.length)];
        }
        if (spP.fifthdice.isEnabled() == true) {
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
        spP.firstdice.setIcon(ii);
        spP.seconddice.setIcon(iii);
        spP.thirddice.setIcon(iv);
        spP.fourthdice.setIcon(v);
        spP.fifthdice.setIcon(vi);
        
        String s = Integer.toString(num1[0]);
        String s1 = Integer.toString(num1[1]);
        String s2 = Integer.toString(num1[2]);
        String s3 = Integer.toString(num1[3]);
        String s4 = Integer.toString(num1[4]);
    }
    
    public void designpallet() {
        add(dPanel);
        dPanel.add(spP.firstdice);
        dPanel.add(spP.seconddice);
        dPanel.add(spP.thirddice);
        dPanel.add(spP.fourthdice);
        dPanel.add(spP.fifthdice);
        
        add(plyr1);
        plyr1.setLayout(null);
        plyr1.setBounds(20, 10, 385, 600);
        plyr1.setOpaque(true);
        plyr1.setBackground(Color.decode("#3e7d81"));
        
        
        // Setting texts False for edit
        
        spP.txtace1.setEditable(false);
        spP.txttwo1.setEditable(false);
        spP.txtthree1.setEditable(false);
        spP.txtfour1.setEditable(false);
        spP.txtfive1.setEditable(false);
        spP.txtsix1.setEditable(false);
        spP.txt3ok1.setEditable(false);
        spP.txt4ok1.setEditable(false);
        spP.txtfh1.setEditable(false);
        spP.txtss1.setEditable(false);
        spP.txtls1.setEditable(false);
        spP.txtytz1.setEditable(false);
        spP.txtchnc1.setEditable(false);
        spP.txtttl1.setEditable(false);

        // Adding Player 1 Labels 
        
        plyr1.add(spP.lblplyr1);
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
        
        
        // Adding Player 1 Text Fields
        
        plyr1.add(spP.txtace1);
        plyr1.add(spP.txttwo1);
        plyr1.add(spP.txtthree1);
        plyr1.add(spP.txtfour1);
        plyr1.add(spP.txtfive1);
        plyr1.add(spP.txtsix1);
        plyr1.add(spP.txt3ok1);
        plyr1.add(spP.txt4ok1);
        plyr1.add(spP.txtfh1);
        plyr1.add(spP.txtss1);
        plyr1.add(spP.txtls1);
        plyr1.add(spP.txtytz1);
        plyr1.add(spP.txtchnc1);
        plyr1.add(spP.txtttl1);
        
        
        //Setting Buttons
        
        add(spP.up);
        spP.up.setBounds(415, 190, 80,50 );
        
        add(spP.down);
        spP.down.setBounds(415, 245, 80, 50);
 
        add(spP.twox);
        spP.twox.setBounds(415, 300, 80, 50);
        
        add(spP.reroll);
        spP.reroll.setBounds(415,355,80,50);
        
        add(spP.roll);
        spP.roll.setBounds(415, 410, 80, 50);
        
        add(spP.done);
        spP.done.setBounds(415, 510, 80, 50);
        
        // Setting Dice
        
        spP.firstdice.setBounds(163, 11, 170, 170);
        spP.seconddice.setBounds(270, 11, 170, 170);
        spP.thirddice.setBounds(385, 11, 170, 170);
        spP.fourthdice.setBounds(484, 11, 170, 170);
        spP.fifthdice.setBounds(595, 11, 170, 170);
        dPanel.setBounds(10, 20, 400, 100);
       
        // Creating Font
        
        Font titlefont = new Font("Hobo std",Font.BOLD, 18);
    
        

        //dPanel.setBackground(Color.red);
     
        //player one
        spP.lblplyr1.setBounds(130, 100, 100, 100);
       
        spP.lblplyr1.setFont(titlefont);
        
        
        // Setting Bounds for Label and TextField !!
        
        lblups1.setBounds(30, 150, 100, 100);
        lbllwr1.setBounds(180, 150, 100, 100);
        
        lblace1.setBounds(30, 240, 50, 30);
        spP.txtace1.setBounds(90, 240, 50, 40);
        
        lbltwo1.setBounds(30, 290, 50, 30);
        spP.txttwo1.setBounds(90, 290, 50, 40);
       
        lblthree1.setBounds(30, 340, 50, 30);
        spP.txtthree1.setBounds(90, 340, 50, 40);
       
        lblfour1.setBounds(30, 400, 40, 14);
        spP.txtfour1.setBounds(90, 390, 50, 40);
       
        lblfive1.setBounds(30, 440, 50, 30);
        spP.txtfive1.setBounds(90, 440, 50, 40);
       
        lblsix1.setBounds(30, 490, 50, 30);
        spP.txtsix1.setBounds(90, 490, 50, 40);
       
        lbl3ok1.setBounds(180, 240, 70, 30);
        spP.txt3ok1.setBounds(290, 240, 50, 40);
       
        lbl4ok1.setBounds(180, 290, 70, 30);
        spP.txt4ok1.setBounds(290, 290, 50, 40);
       
        lblss1.setBounds(180, 330, 200, 50);
        spP.txtss1.setBounds(290, 340, 50, 40);
       
        lblls1.setBounds(180, 380, 400, 50);
        spP.txtls1.setBounds(290, 390, 50, 40);
       
        lblfh1.setBounds(180, 440, 80, 30);
        spP.txtfh1.setBounds(290, 440, 50, 40);
       
        lblytz1.setBounds(180, 485, 80, 40);
        spP.txtytz1.setBounds(290, 490, 50, 40);
       
        lblchnc1.setBounds(180, 540, 80, 40);
        spP.txtchnc1.setBounds(290, 540, 50, 40);
       
        lblttl1.setBounds(30, 540, 80, 40);
        spP.txtttl1.setBounds(90, 540, 50, 40);

           
        spP.twox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplypower();
                spP.twox.setEnabled(false);
            }
        });
    }
    
    public void action() {
        spP.firstdice.addMouseListener(this);
        spP.seconddice.addMouseListener(this);
        spP.thirddice.addMouseListener(this);
        spP.fourthdice.addMouseListener(this);
        spP.fifthdice.addMouseListener(this);
        
        
        ////player one action listener 
        
        
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
            if (e.getSource() == spP.firstdice) {
                
                if (spP.firstdice.isEnabled() == true) {
                    spP.firstdice.setEnabled(false);
                } else {
                    spP.firstdice.setEnabled(true);
                }
                
            }
            
            if (e.getSource() == spP.seconddice) {
                if (spP.seconddice.isEnabled() == true) {
                    spP.seconddice.setEnabled(false);
                } else {
                    spP.seconddice.setEnabled(true);
                }
            }
            if (e.getSource() == spP.thirddice) {
                if (spP.thirddice.isEnabled() == true) {
                    spP.thirddice.setEnabled(false);
                } else {
                    spP.thirddice.setEnabled(true);
                }
            }
            if (e.getSource() == spP.fourthdice) {
                if (spP.fourthdice.isEnabled() == true) {
                    spP.fourthdice.setEnabled(false);
                } else {
                    spP.fourthdice.setEnabled(true);
                }
            }
            if (e.getSource() == spP.fifthdice) {
                if (spP.fifthdice.isEnabled() == true) {
                    spP.fifthdice.setEnabled(false);
                } else {
                    spP.fifthdice.setEnabled(true);
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
        if(spP.ace!=0){
        spP.ace = spP.ace *2;
        spP.txtace1.setText(""+spP.ace);
        }
        if(spP.twos!=0){
        spP.twos = spP.twos *2;
        spP.txttwo1.setText(""+spP.twos);
        }
        if(spP.threes!=0){
        spP.threes = spP.threes *2;
        spP.txtthree1.setText(""+spP.threes);
        }
        if(spP.fours!=0){
        spP.fours = spP.fours *2;
        spP.txtfour1.setText(""+spP.fours);
        }
        if(spP.fives!=0){
        spP.fives = spP.fives *2;
        spP.txtfive1.setText(""+spP.fives);
        }
        if(spP.sixes!=0){
        spP.sixes = spP.sixes *2;
        spP.txtsix1.setText(""+spP.sixes);
        }
        }
        }
        }
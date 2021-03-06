package yahtzeeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class SinglePlayerPanel implements VariablesYahtzee,MouseListener{
    
    ScoreCalculation sc = new ScoreCalculation();
    int ace = 0;
    int twos = 0;
    int threes = 0;
    int fours = 0;
    int fives = 0;
    int sixes = 0;
    int tok = 0;
    int fok = 0;
    int fh = 0;
    int ss = 0;
    int ls = 0;
    int yh = 0;
    int ch = 0;
            
    
    int ace2 = 0;
    int twos2 = 0;
    int threes2= 0;
    int fours2 = 0;
    int fives2 = 0;
    int sixes2 = 0;
    int tok2 = 0;
    int fok2 = 0;
    int fh2= 0;
    int ss2 = 0;
    int ls2 = 0;
    int yh2 = 0;
    int ch2 = 0;      
    
    JLabel firstdice = new JLabel();
    JLabel seconddice = new JLabel();
    JLabel thirddice = new JLabel();
    JLabel fourthdice = new JLabel();
    JLabel fifthdice = new JLabel();
    
    
    JButton up = new JButton("UP");
    JButton down = new JButton("Down");
    JButton twox = new JButton("2X");
    JButton reroll = new JButton("Re-Roll");
    JButton roll = new JButton("Roll");
    
    int donecount =0;
    
     //player one text field
    JTextField txtace1 = new JTextField();
    JTextField txttwo1 = new JTextField();
    JTextField txtthree1 = new JTextField();
    JTextField txtfour1 = new JTextField();
    JTextField txtfive1 = new JTextField();
    JTextField txtsix1 = new JTextField();
    JTextField txt3ok1 = new JTextField();
    JTextField txt4ok1 = new JTextField();
    JTextField txtss1 = new JTextField();
    JTextField txtls1 = new JTextField();
    JTextField txtfh1 = new JTextField();
    JTextField txtytz1 = new JTextField();
    JTextField txtchnc1 = new JTextField();
    JTextField txtttl1 = new JTextField();
    
     int countR;
       Timer timerRolling;
       
        int count = 0;
        JLabel lblplyr1 = new JLabel("Player one");
          JLabel lblplyr2 = new JLabel("Player two");
    
       JButton done = new JButton("Submit");
    public void logic(){
        roll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                timerRolling.start();
                count++;
                if(count==3){
                    done.setEnabled(true);
                    roll.setEnabled(false);
                }
                if (countR < 20) {
                    countR = 0;
                    
                }
                
            }
            
        });
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           donecount++;
           count=0;
           roll.setEnabled(true);
           done.setEnabled(false);
           action2();
         
           up.setEnabled(true);
           down.setEnabled(true);
           reroll.setEnabled(true);
           twox.setEnabled(true);
           
               if(donecount%2==0){
               
        lblplyr2.setEnabled(false);
        
           }   
               
               
               if(lblplyr1.isEnabled()==true){
                   int total1 = ace+twos+threes+fours+fives+sixes+tok+fok+fh+ss+ls+yh+ch;
                   txtttl1.setText(""+(total1));
               }
            }
        });
        
    }
    public void action2(){
        txtace1.addMouseListener(this);
        txttwo1.addMouseListener(this);
        txtthree1.addMouseListener(this);
        txtfour1.addMouseListener(this);
        txtfive1.addMouseListener(this);
        txtsix1.addMouseListener(this);
        txt3ok1.addMouseListener(this);
        txt4ok1.addMouseListener(this);
        txtss1.addMouseListener(this);
        txtls1.addMouseListener(this);
        txtfh1.addMouseListener(this);
        txtytz1.addMouseListener(this);
        txtchnc1.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
         if (e.getSource() == txtace1) {
                if (lblplyr1.isEnabled() == true) {
        
                txtace1.setText("" + sc.ace());
                ace = Integer.parseInt(txtace1.getText()); 
               
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
            }
            if (e.getSource() == txttwo1) {
                if (lblplyr1.isEnabled() == true) {
           
                txttwo1.setText("" + sc.two());
                twos = Integer.parseInt(txttwo1.getText());
                
                txtace1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txtthree1) {
                if (lblplyr1.isEnabled() == true) {
         
                txtthree1.setText("" + sc.three());
                threes = Integer.parseInt(txtthree1.getText());
                
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
               
                
            }
            if (e.getSource() == txtfour1) {
                if (lblplyr1.isEnabled() == true) {
          
                txtfour1.setText("" + sc.four());
                fours = Integer.parseInt(txtfour1.getText());
                
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txtfive1) {
                if (lblplyr1.isEnabled() == true) {
      
                txtfive1.setText("" + sc.five());
                    fives = Integer.parseInt(txtfive1.getText());
                    
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txtsix1) {
                if (lblplyr1.isEnabled() == true) {
      
                txtsix1.setText("" + sc.six());
                  sixes = Integer.parseInt(txtsix1.getText()); 
                  
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txt3ok1) {
                if (lblplyr1.isEnabled() == true) {
        
                txt3ok1.setText("" + sc.threeok());
                 tok = Integer.parseInt(txt3ok1.getText()); 
                 
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txt4ok1) {
                if (lblplyr1.isEnabled() == true) {
      
                txt4ok1.setText("" + sc.fourok());
                   fok = Integer.parseInt(txt4ok1.getText());
                   
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txtss1) {
                if (lblplyr1.isEnabled() == true) {
        
                txtss1.setText("" + sc.ss());
                ss = Integer.parseInt(txtss1.getText()); 
                
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txtls1) {
                if (lblplyr1.isEnabled() == true) {
        
                txtls1.setText("" + sc.largestr());
                 ls = Integer.parseInt(txtls1.getText()); 
                 
                 txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
                
            }
            if (e.getSource() == txtfh1) {
                if (lblplyr1.isEnabled() == true) {
    
                txtfh1.setText("" + sc.fullhuse());
                      fh = Integer.parseInt(txtfh1.getText());
                      
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
               
                System.out.println(sc.fullhuse());
            }
            
           
            if (e.getSource() == txtytz1) {
                if (lblplyr1.isEnabled() == true) {
           
                txtytz1.setText("" + sc.yatz());
                yh = Integer.parseInt(txtytz1.getText());
                
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtchnc1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }      
            }
            if (e.getSource() == txtchnc1) {
                if (lblplyr1.isEnabled() == true) {
        
                txtchnc1.setText("" + sc.chnc());
               ch = Integer.parseInt(txtchnc1.getText()); 
               
                txtace1.removeMouseListener(this);
                txttwo1.removeMouseListener(this);
                txtthree1.removeMouseListener(this);
                txtfour1.removeMouseListener(this);
                txtfive1.removeMouseListener(this);
                txtsix1.removeMouseListener(this);
                txt3ok1.removeMouseListener(this);
                txt4ok1.removeMouseListener(this);
                txtss1.removeMouseListener(this);
                txtls1.removeMouseListener(this);
                txtfh1.removeMouseListener(this);
                txtytz1.removeMouseListener(this);
                }else{
                JOptionPane.showMessageDialog(null, "Cannot score! player two is active");
                }
               
            }
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
}
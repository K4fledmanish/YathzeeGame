package yahtzeeGame;

import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.*;

public class PlayerSelectionDashboard extends JFrame {
  public PlayerSelectionDashboard(){
	  
	  //Calling functions inside constructor
	  
  gameFrame();
  }
  
 // Setting Frame of Game (Option Frame) !
  
  private void gameFrame() {
	  
	 // Setting size and title
	  
	  setTitle("Yahtzee !!");
      setSize(300, 222);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(null);
      setResizable(false);
      
      // Setting Fonts For title and welcome label.
      
      Font welcomelabel = new Font("Hobo std",Font.ITALIC, 18);
      Font titlefont = new Font("Hobo std",Font.BOLD, 16);
      
      //Adding buttons and Labels
      
      JButton splayButton = new JButton("Single Player");
      add(splayButton);
      splayButton.setBounds(0, 0, 300, 100);
      splayButton.setBackground(Color.decode("#3e7d81"));
      splayButton.setOpaque(true); 
      splayButton.setBorderPainted(true);
      
      JButton mplayButton = new JButton("Multi-Player");
      add(mplayButton);
      mplayButton.setBounds(0, 100, 300, 100);
      mplayButton.setBackground(Color.decode("#81423e"));
      
      mplayButton.setOpaque(true); 
      mplayButton.setBorderPainted(true);      
      
      splayButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
       
        	  SinglePlayer sPlayer=new SinglePlayer();
              sPlayer.setVisible(true);
              sPlayer.setLocationRelativeTo(null);
              dispose();
          }
      });
      
      mplayButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        	  MultiPlayer mPlayer = new MultiPlayer();
        	  mPlayer.setVisible(true);
        	  mPlayer.setLocationRelativeTo(null);
              dispose();  
          }
      });
      
  }		
}
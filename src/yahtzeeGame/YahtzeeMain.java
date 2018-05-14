package yahtzeeGame;

import java.awt.Color;

import yahtzeeGame.PlayerSelectionDashboard;

public class YahtzeeMain {
	public static void main(String[] args) {
		PlayerSelectionDashboard dashboard = new PlayerSelectionDashboard();
		dashboard.setLocationRelativeTo(null);
		dashboard.setVisible(true);
		dashboard.getContentPane().setBackground(Color.LIGHT_GRAY);
	}
}
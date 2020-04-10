package com.jse.game;

import javax.swing.*;

public class GameSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("게임하기");
		
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

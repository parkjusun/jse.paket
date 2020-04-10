package com.jse.member;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class LoginView extends JFrame implements ActionListener{
	public void open() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JLabel ID = new JLabel("아이디");
		
		
		JLabel Passward = new JLabel("비밀번호");
		
		
		Button button = new Button("저장");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		
	}

}

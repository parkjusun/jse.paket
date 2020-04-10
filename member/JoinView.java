package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.corba.se.impl.naming.pcosnaming.NameServer;

import jdk.nashorn.internal.ir.Labels;

public class JoinView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton saveButton, cancelButton;
	JLabel[] nameLabel, useridLabel,passwordLabel,addressLabel,contentLabel;
	JTextField nameField, useridField, passwordField, addressField, contentField;
	JLabel[] labels;
	JTextField[] textFields;
	JPanel panel;
	
	MemberServiceImp serviceImp;
	Member member;
	
	public JoinView() {
		serviceImp = new MemberServiceImp();
		
	}

	public void open() {

		String[] labelName = {"이름","아이디","패스워드","주소", "추가사항"};
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		panel = new JPanel();
		labels = new JLabel[5];
		textFields = new JTextField[5];
		this.add(panel);
		for (int i = 0; i < labelName.length; i++) {
			labels[i] = new JLabel(labelName[i]);
			panel.add(labels[i]);
			textFields[i] = new JTextField();
			panel.add(textFields[i]);
			
			
		}

	
		nameField = new JTextField();
		useridField = new JTextField();
		passwordField = new JTextField();
		addressField = new JTextField();
		contentField = new JTextField();
		
		panel.add(new JTextField());
		
		saveButton = new JButton("저장");
		cancelButton = new JButton("취소");
		saveButton.addActionListener(this);
		cancelButton.addActionListener(this);
		panel.add(saveButton);
		panel.add(cancelButton);
		labels[0].setBounds(40, 10, 40, 40);
		labels[1].setBounds(40, 50, 40, 40);
		labels[2].setBounds(40, 90, 60, 40);
		labels[3].setBounds(40, 130, 40, 40);
		labels[4].setBounds(40, 170, 60, 40);
		textFields[0].setBounds(120, 10, 200, 30);
		textFields[1].setBounds(120, 50, 200, 30);
		textFields[2].setBounds(120, 90, 200, 30);
		textFields[3].setBounds(120, 130, 280, 30);
		textFields[4].setBounds(120, 180, 280, 120);
		saveButton.setBounds(125, 330, 80, 30);
		cancelButton.setBounds(240, 330, 80, 30);

		this.setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	

		if (e.getSource() == saveButton) {
//			textFields[0].setText("홍길동,유관순,이순신,신사임당,이도");
//			textFields[1].setText("hong,you,Lee,sin,leedong");
//			textFields[2].setText("1,1,1,1,1");
//			textFields[3].setText("900101-1,960101-1,890101-1,880101-1,891001-1");
			
			member.setName("홍길동,유관순,이순신,신사임당,이도");
			member.setUserid("hong,you,Lee,sin,leedong");
			member.setPassword("1,1,1,1,1");
			member.setAddress("900101-1,960101-1,890101-1,880101-1,891001-1");
			
		
		System.out.println(serviceImp.result());
		
		//name[0] 이름  name[1] 아이디  name[2] 비밀번호 name[3] 주민번호
		
		
		

		} else if (e.getSource() == cancelButton) {
			JOptionPane.showMessageDialog(this, "취소를 눌렀습니다.");
		}

	}

}

package com.jse.member;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.*;

import com.jse.utill.Constants;
import com.sun.javafx.geom.AreaOp.AddOp;

public class MemberSwing {
	public static void main(String[] args) {
//		LoginView loginView = new LoginView();
//		loginView.open();
		
		
		JoinView joinView = new JoinView();
		joinView.open();
	}
}

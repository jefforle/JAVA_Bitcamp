package interface_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;

public class LoginResult extends JFrame{
	String str = null;
	
	public LoginResult(String str) {
		this.str = str;
		setBackground(Color.white);
		setBounds(900, 500, 200, 200);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) { 								
		g.drawString(str, 50, 50);
	}
	

}

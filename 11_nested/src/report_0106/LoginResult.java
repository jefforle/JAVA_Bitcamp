package report_0106;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginResult extends JFrame implements WindowListener{
	private String id = null;
	private String pwd = null;
	
	public LoginResult(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
		setBackground(Color.white);
		setBounds(900, 500, 200, 200);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
	}
	
	@Override
	public void paint(Graphics g) { 
		if(id.equals("aa") && pwd.equals("aa"))
			//g.drawString("로그인 성공", 60, 60); //Frame으로 띄워줌
			JOptionPane.showMessageDialog(this, "로그인 성공"); //다이얼로그(Swing만), Frame보다 편함
		else
			//g.drawString("로그인 실패", 60, 60);
			JOptionPane.showMessageDialog(this, "로그인 성공");
	}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		//System.exit(0); --프로그램 전체 종료
		setVisible(false);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
	

}

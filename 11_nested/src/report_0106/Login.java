package report_0106;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/* [숙제1]
 * 1. 취소버튼 누르면 JTextFidle(idT, pwdT)의 내용이 초기화
 * 2. 로그인 버튼 누르면 LoginResult창을 띄워라(로그인성공/로그인실패) 보여주고 Login으로 되돌아옴
 *    - LoginResult.java가 생성
 *    - LoginResult에서 비교(id:"angel", pwd:"1004"이면 성공, 아니면 실패)
 *    - LoginResul에서 X(종료) 누르면 LoginResult창이 닫히고 다시 Login창이 열린다
 */

public class Login extends JFrame implements ActionListener, WindowListener{
	private JLabel idL, pwdL;
	private JTextField idT; //한줄씩만 들어가는 텍스트박스: textfield
	private JTextField pwdT;
	private JButton loginB, cancelB;
	
	public Login() {
		this.setLayout(null); //BorderLayout(동서남북)을 깨버림
		idL = new JLabel("아이디");
		pwdL = new JLabel("비밀번호");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB = new JButton("로그인");
		cancelB = new JButton("취소");
		
//		idL.setLocation(50, 80); //위치 좌표
//		idL.setSize(50, 30); //크기
		idL.setBounds(50, 80, 70, 20); //=> 위치와 크기를 한번에 설정
		idT.setBounds(130, 80, 100, 30);
		
		pwdL.setBounds(50, 120, 70, 20); //=> 위치와 크기를 한번에 설정
		pwdT.setBounds(130, 120, 100, 30);			
		
		loginB.setBounds(50, 200, 100, 30); //=> 위치와 크기를 한번에 설정
		cancelB.setBounds(160, 200, 100, 30);
		
		
		//Frame은 최종컨테이너, Frame위에 Frame은 못올라감. but, Container위에 작은 컨테이너는 올라갈 수 있다.
		Container c = this.getContentPane();
		c.add(idL); //this.add(idL);
		c.add(idT);
		c.add(pwdL);
		c.add(pwdT);
		c.add(loginB);
		c.add(cancelB);
		
		setBounds(700, 200, 300, 300);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
		cancelB.addActionListener(this);
		loginB.addActionListener(this);		
			
	}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}


	@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource() == loginB) {
		if(e.getActionCommand() == "로그인") {
			String id = idT.getText();
			String pwd = pwdT.getText();
			
			new LoginResult(id, pwd);
		
		}
		else if(e.getSource() == "cancelB") {
			idT.setText("");
			pwdT.setText("");
		}
		
	}
	public static void main(String[] args) {
		new Login();
	}
}

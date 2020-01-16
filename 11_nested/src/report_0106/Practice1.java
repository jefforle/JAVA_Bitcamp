package report_0106;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* [이벤트처리]
 * 1) 0만 있는 상태에서 0을 누르면 0만 보인다
 *    .을 누르고 0을 누르면 0이 추가된다
 *    앞에 유효숫자가 있으면 0은 추가된다
 * 2) .이 있으면 더이상 .추가 불가
 * 3) ←에서 더이상 지울 것이 없으면 0이 표시되도록
 * 4) 사칙연산자를 누르면 계산식이 위쪽 라벨(label)로 올라가도록 중간결과 표시되는건 아직..
 *    indexOf, append
 */
public class Practice1 extends JFrame implements ActionListener {
	private JFrame frame;
	private JLabel label, label2;
	private JButton[] button;
	private String[] btn = { "←", "C", 
			"7", "8", "9", "-", 
			"4", "5", "6", "*", 
			"1", "2", "3", "/", 
			".", "0", "=", "+" };
	private StringBuffer inputBuf; // setText(inputBuf)넣어서 하면 됨
	private JPanel p1, p2, p3, p4;

	public Practice1() {
		// 생성
		setLayout(null);
		label = new JLabel("", JLabel.RIGHT);
		label2 = new JLabel("0", JLabel.RIGHT);
		button = new JButton[18];

		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1, 3, 3));
		p1.add(label);

		p2 = new JPanel();
		p2.setLayout(new GridLayout(1, 1, 3, 3));
		p2.add(label2);

		p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 2, 3, 3));
		p4 = new JPanel();
		p4.setLayout(new GridLayout(4, 4, 3, 3));

		for (int i=0; i<button.length; i++) {
			button[i] = new JButton(btn[i]);
			if (i > 1)
				p4.add(button[i]);
			else
				p3.add(button[i]);
		}
		inputBuf = new StringBuffer(); //StringBuffer 생성

		// 화면따리
		p1.setBackground(Color.WHITE);
		p1.setBounds(15, 20, 200, 35);
		p2.setBackground(Color.WHITE);
		p2.setBounds(15, 60, 300, 35);
		this.add(p1);
		this.add(p2);
		p3.setBounds(10, 100, 300, 40);
		this.add(p3);
		p4.setBounds(15, 145, 300, 200);
		this.add(p4);
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(700, 300, 340, 400);
		this.setResizable(false); // 창크기 고정
		this.setVisible(true);
		
		inputBuf = new StringBuffer();

		// 이벤트
		for (int i = 0; i < button.length; i++) {
			button[i].addActionListener(this);
		}

		addWindowListener(new WindowAdapter() {// 종료
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				
			if (e.getActionCommand() == "←") {
				inputBuf.deleteCharAt(inputBuf.length()-1);
				label2.setText(inputBuf.toString());
	
			} else if (e.getActionCommand() == "C") {
				label.setText("");
				label2.setText("");
			} 
			else if (e.getActionCommand() == "1") {
				inputBuf.append(e.getActionCommand());
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "2") {
				inputBuf.append(e.getActionCommand());
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "3") {
				inputBuf.append(String.valueOf(3));
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "4") {
				inputBuf.append(String.valueOf(4));
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "5") {
				inputBuf.append(String.valueOf(5));
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "6") {
				inputBuf.append(String.valueOf(6));
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "7") {
				inputBuf.append(String.valueOf(7));
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "8") {
				inputBuf.append(String.valueOf(8));
				label2.setText(inputBuf.toString());
			} 
			else if (e.getActionCommand() == "9") {
				inputBuf.append(String.valueOf(9));
				label2.setText(inputBuf.toString());
			}
			else if (e.getActionCommand() == "9") {
				inputBuf.append(String.valueOf(9));
				label2.setText(inputBuf.toString());
			}
			else if (e.getActionCommand() == "0") {
				inputBuf.append(String.valueOf(9));
				label2.setText(inputBuf.toString());
			}
			else if (e.getActionCommand() == "+") {
				inputBuf.append(String.valueOf(9));
				label2.setText(inputBuf.toString());
			}
			else if (e.getActionCommand() == "-") {
				inputBuf.append(String.valueOf(9));
				label2.setText(inputBuf.toString());
			}		

	}


	public static void main(String[] args) {
		new Practice1();
	}

}
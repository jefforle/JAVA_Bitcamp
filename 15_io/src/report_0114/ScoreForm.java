package report_0114;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* JFrame 창 만들기 */
public class ScoreForm extends JFrame implements ActionListener{
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakT, nameT, korT, engT, mathT;
	private JTextArea output;
	private JButton inputB, printB, searchB, rankB, saveB, readB;

//	private ScoreImpl si; --틀린건 아님
	private Score si; //but, 접근객체를 부모로 많이 잡음
	
	public ScoreForm() {
		si = new ScoreImpl(); /* ★ */
		setLayout(null);
		hakL = new JLabel("학번");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");
		
		hakT = new JTextField(20);
		nameT = new JTextField(20);
		korT = new JTextField(20);
		engT = new JTextField(20);
		mathT = new JTextField(20);
		
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		
		inputB = new JButton("입력");
		printB = new JButton("출력");
		searchB = new JButton("학번검색");
		rankB = new JButton("순위");
		saveB = new JButton("파일저장");
		readB = new JButton("파일읽기");
		
		JPanel westP = new JPanel();
		westP.setBounds(20, 30, 280, 500);
		westP.add(hakL); westP.add(hakT);
		westP.add(nameL); westP.add(nameT);
		westP.add(korL); westP.add(korT);
		westP.add(engL); westP.add(engT);
		westP.add(mathL); westP.add(mathT);
	
		output.setBounds(300, 30, 260, 150);
		output.setBackground(new Color(255,255,255));
		this.add(output);
		
		JPanel btnP = new JPanel();
		btnP.setBounds(10, 200, 600, 300);
		btnP.add(inputB);
		btnP.add(printB);
		btnP.add(searchB);
		btnP.add(rankB);
		btnP.add(saveB);
		btnP.add(readB);
		
		Container c = this.getContentPane();
		c.add(westP);
		c.add(output);
		c.add(btnP);

		setBounds(700, 300, 600, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inputB.addActionListener(this);
		printB.addActionListener(this);
		searchB.addActionListener(this);
		rankB.addActionListener(this);
		saveB.addActionListener(this);
		readB.addActionListener(this);		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == inputB) {
			ScoreDTO dto = new ScoreDTO(hakT.getText(), nameT.getText(), 
					Integer.parseInt(korT.getText()), Integer.parseInt(engT.getText()), Integer.parseInt(mathT.getText()));
			dto.calc(); 
			si.input(dto);
			JOptionPane.showMessageDialog(this, "등록완료");
			//입력 이후 초기화
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");
			
		}else if(e.getSource() == printB) {
			si.print(output);
	
		}else if(e.getSource() == searchB) {
			si.search(output);	
			
		}else if(e.getSource() == rankB) {
			si.tot_desc();
			si.print(output);
			
		}else if(e.getSource() == saveB) {
			si.save();
			
		}else if(e.getSource() == readB) {
			si.load();
			si.print(output);
		}
		
	}

	
}

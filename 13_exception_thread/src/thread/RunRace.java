package thread;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JButton;
/*[숙제2]
   순위찍기--> 스레드 종료 시킨 후 순위찍어야 함
  //아래 소스말고 생성자로 값을 넘겨보자!!
*/

public class RunRace extends Frame implements ActionListener {
	private int count;
	private String[] name;
	private JButton btn;	
	private Racer[] racer;
	private static int rank;
	private int i=0;
	
	public RunRace(int count, String[] name) {
		this.count = count;
		this.name = name;	
		btn = new JButton("출발");
		//btn.setBounds(450, 450, 30, 30);
				
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
		
		Panel p2 = new Panel(new GridLayout(count,1));
		
		racer = new Racer[count];//배열생성
		for(int i=0; i<count; i++) {
			racer[i] = new Racer(); //Canvas 생성!! 스레드 생성한것이 X, Racer가 Canvas을 상속받아서
			p2.add(racer[i]);
		}

		add("South",p);
		add("Center", p2);
		
		setBounds(700, 200, 500, 500);
		setVisible(true);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		btn.setEnabled(false); //btn눌러서 actionPerFomed에 들어오면 더이상 버튼 못누르게
		
		//스레드 생성
		Thread[] t = new Thread[count]; //배열생성, 스레드 생성한게 X!!!!
		for(int i=0; i<count; i++) {
			t[i] = new Thread(racer[i], name[i]); //스레드 생성
			t[i].setPriority((int)(Math.random()*10+1));
			t[i].start(); //run()으로 넘어감		
		}
		
	}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("경주마 수:");
		int count = scan.nextInt();
		
		String[] name = new String[count];
		for(int i=0; i<count; i++){
			System.out.print("경주마 이름:");
			name[i] = scan.next();
		}
		
		new RunRace(count, name);
	}

	
}

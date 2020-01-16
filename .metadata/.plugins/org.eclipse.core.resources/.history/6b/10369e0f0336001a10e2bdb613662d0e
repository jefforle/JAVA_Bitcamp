package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*[그림판 만들기] 
 * JRadioButton의 default는 사각형 
 * Canvas의 기본색은 연보라색
 * x1T, y1T, x2T, y2T, z1T, z2T 좌표를 입력하고 그리기 버튼을 누르면 원하는 도형으로 Canvas에 그려짐
 * 색깔은 JComboBox에서 선택
 * 둥근사각형의 구부러지는 각은 50,50으로
 * 도형 누적 - ArrayList로 저장해놓고 list를 뿌려줘야 함
 * 도형 1개에 대한 정보 : 좌표6개, 채우기, 도형 모양, 색 => ShapeDTO
 */

//JFrame은 BorderLayout(동서남북)
public class MsPaint extends JFrame {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L; // z1L, z2L는 하지마
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen; // 사각형이 default
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	private ArrayList<ShapeDTO> dto;

	public ArrayList<ShapeDTO> getDto(){
		return dto;
	}
	
	public MsPaint(String title) {
		//setLayout(null);
		x1L = new JLabel("x1"); 
		y1L = new JLabel("y1");
		x2L = new JLabel("x2");
		y2L = new JLabel("y2");
		z1L = new JLabel("z1"); 
		z2L = new JLabel("z2");

		x1T = new JTextField("0", 4); 
		y1T = new JTextField("0", 4);
		x2T = new JTextField("0", 4); 
		y2T = new JTextField("0", 4);
		z1T = new JTextField("50", 4); 
		z2T = new JTextField("50", 4);

		fill = new JCheckBox("채우기");

		line = new JRadioButton("선");
		circle = new JRadioButton("원");
		rect = new JRadioButton("사각형", true);
		roundRect = new JRadioButton("둥근사각형");
		pen = new JRadioButton("펜");
		
		ButtonGroup group = new ButtonGroup();
		group.add(line);
		group.add(circle);
		group.add(rect);
		group.add(roundRect);
		group.add(pen);

		String rainbow[] = { "빨강색", "주황색", "노랑색", "초록색", "파랑색", "남색", "보라색" };
		combo = new JComboBox<String>(rainbow);
		draw = new JButton("그리기");
		
		can = new DrCanvas(this);  //1) DrCanvas()생성할때 생성자로 this(나, MsPaint객체)를 넘겨주겠다
//		dto = new ShapeDTO(this);
//		dto.drawarray();
		//shape = new ShapeDTO(this);

		JPanel northP = new JPanel(); //FlowLayout 
		northP.add(x1L); northP.add(x1T);
		northP.add(y1L); northP.add(y1T);
		northP.add(x2L); northP.add(x2T);
		northP.add(y2L); northP.add(y2T);
		northP.add(z1L); northP.add(z1T);
		northP.add(z2L); northP.add(z2T);
		northP.add(fill);

		JPanel southP = new JPanel();
		southP.add(line);
		southP.add(circle);
		southP.add(rect);
		southP.add(roundRect);
		southP.add(pen);
		southP.add(combo);
		southP.add(draw);

		Container c = this.getContentPane();
		c.add("North", northP);
		c.add("South", southP);
		c.add("Center", can);

		setTitle(title);
		setBounds(700, 400, 700, 500);
		setVisible(true);  // -->제일처음 paint() 호출, if>getX1T()에 값이 없는데 parseInt해서 에러
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트, 익명이너클래스 사용하자(버튼누를때 한번만 사용하니)
		draw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//this.repaint(); -ERROR. this는 MsPaint가 아니라 익명이너클래스를 가르킴
				can.repaint();
			}
		});
		
		//익명이너클래스, can에서 이벤트가 발생 주의
		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//x1T, y1T 찍히게
				x1T.setText(e.getX()+"");
				y1T.setText(e.getY()+"");
			}
		});
		
		can.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				//x2T, y2T 찍히게
				x2T.setText(e.getX()+"");
				y2T.setText(e.getY()+"");
				can.repaint();
			}
		});
//도형 누적		
//		ArrayList<ShapeDTO> dto = new ArrayList<ShapeDTO>();
//		list.add(dto);
		
		
	}
	
	
	/* Getter/Setter */
	public JTextField getX1T() {
		return x1T;
	}
	public void setX1T(JTextField x1t) {
		x1T = x1t;
	}
	
	public JTextField getX2T() {
		return x2T;
	}
	public void setX2T(JTextField x2t) {
		x2T = x2t;
	}
	
	public JTextField getY1T() {
		return y1T;
	}
	public void setY1T(JTextField y1t) {
		y1T = y1t;
	}

	public JTextField getY2T() {
		return y2T;
	}
	public void setY2T(JTextField y2t) {
		y2T = y2t;
	}

	public JTextField getZ1T() {
		return z1T;
	}
	public void setZ1T(JTextField z1t) {
		z1T = z1t;
	}

	public JTextField getZ2T() {
		return z2T;
	}
	public void setZ2T(JTextField z2t) {
		z2T = z2t;
	}
	
	public JComboBox<String> getCombo() {
		return combo;
	}
	public JCheckBox getFill() {
		return fill;
	}
	public JRadioButton getLine() {
		return line;
	}
	public JRadioButton getCircle() {
		return circle;
	}
	public JRadioButton getRect() {
		return rect;
	}
	public JRadioButton getRoundRect() {
		return roundRect;
	}
	public static void main(String[] args) {
		new MsPaint("그림판");
	}

}

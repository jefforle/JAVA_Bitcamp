package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JButtonEx extends JFrame{
	private Icon icon1 = new ImageIcon("image/jj1.JPG");
	private Icon icon2 = new ImageIcon("image/jj2.JPG");
	private Icon icon3 = new ImageIcon("image/jj3.JPG");
	private Icon icon4 = new ImageIcon("image/jj4.JPG");
	private JRadioButton[] jb = new JRadioButton[4];
	private ButtonGroup bg = new ButtonGroup();
	
	public JButtonEx() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2,2));
		for(int i=0; i<4; i++) {
			jb[i] = new JRadioButton(i+"번 버튼", icon1);
			con.add(jb[i]);
			jb[i].setToolTipText(i+"번쨰 버튼, 눌러!");
			jb[i].setMnemonic(i+49);
			jb[i].setRolloverIcon(icon2);
			jb[i].setPressedIcon(icon3);
			jb[i].setSelectedIcon(icon4);
			bg.add(jb[i]);
		}
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonEx();
	}

}

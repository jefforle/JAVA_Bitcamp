/* 1/14 (화) 4-1 */
package report_0114;

import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import io.MenuPane;

public class TryNotepad extends JFrame implements ActionListener{
	private JTextArea area;
	private MenuPane menu;
	File file;
	
	public TryNotepad() {

		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		area.setFont(new Font("고딕체", Font.BOLD, 15));
		
		menu = new MenuPane();  
		this.setJMenuBar(menu);
		
		//컨테이너는 좀더 안전성을 위함
		Container c = this.getContentPane();
		c.add(scroll);
		

		setTitle("간단메모장");
		setBounds(700,200,600,500);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE)
		
//상단x 누르면 종료		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(TryNotepad.this, "저장할래?", "메모장", JOptionPane.YES_NO_CANCEL_OPTION);
/*				
				AA aa = new AA();
				aa / this
				
				AA 
*/				
				
				if(result == JOptionPane.YES_OPTION) { //Yes면 파일저장
					if(area.getText().length() != 0) {
						saveDialog();
						fileWrite();
					}
					System.exit(0);
					
				}else if(result == JOptionPane.NO_OPTION) { //No면 종료
					System.exit(0);
				}else if(result == JOptionPane.CANCEL_OPTION) {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
				}
			}
		});
		
	}
	
//이벤트 처리 메소드	
	public void event() {
		//menu.newM.이렇게는 newM이 private이라 바로접근 불가 때문에 getter필요
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		
		//단축키 Alt+X, C, V
		menu.getCutM().setAccelerator(KeyStroke.getKeyStroke('X',Event.ALT_MASK));  
		menu.getCopyM().setAccelerator(KeyStroke.getKeyStroke('C',Event.ALT_MASK));  
		menu.getPasteM().setAccelerator(KeyStroke.getKeyStroke('V',Event.ALT_MASK));  

	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //호출부에도 ex을 해야되는데 Override된 메소드에는 throws 불가!
		if(e.getSource() == menu.getNewM()) {
			area.setText("");
			
		}else if(e.getSource() == menu.getOpenM()){
			openDialog();
			fileRead();
			
		}else if(e.getSource() == menu.getSaveM()){
			saveDialog();
			fileWrite();
			
		}else if(e.getSource() == menu.getExitM()) {
			//System.exit(0);
			int result = JOptionPane.showConfirmDialog(this, "저장할래?", "메모장", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(result == JOptionPane.YES_OPTION) { //Yes면 파일저장
				if(area.getText().length() != 0) {
					saveDialog();
					fileWrite();
				}
				System.exit(0);
				
			}else if(result == JOptionPane.NO_OPTION) { //No면 종료
				System.exit(0);
			}
		}else if(e.getSource() == menu.getCutM()) {
			area.cut();
			
		}else if(e.getSource() == menu.getCopyM()) {
			area.copy();
			
		}else if(e.getSource() == menu.getPasteM()) {
			area.paste();
			
		}
		
		
	}
//파일열기	
	public void openDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this); //다이얼로그를 this위에 띄워라
		
		if(result == JFileChooser.APPROVE_OPTION) { //대문자는 static final이라는 의미!
			//File file = chooser.getSelectedFile(); --ERROR. file이 if문 안에서만 살아있음
			file = chooser.getSelectedFile(); //선택한 경로와 파일명 
		}
		JOptionPane.showMessageDialog(this, file);
	}
	public void fileRead() {
		if(file == null) return; //읽어올 file이 없을 경우(=취소하고 아무파일도 선택 안하면)
		area.setText("");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));			
			String line;
			 //엔터를 만난 바로 전까지가 한줄, read()는 한글자씩 int형으로 읽어와서 -1이고, readLine()은 String으로 한줄씩 읽어드림
			while((line = br.readLine()) != null) {
				//area.setText(line);
				area.append(line+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//파일저장	
	public void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		JOptionPane.showMessageDialog(this, file);
	}
	
	public void fileWrite() {
		if(file == null) return; 
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String data = area.getText();
			
			bw.write(data);
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TryNotepad().event();
	}
}

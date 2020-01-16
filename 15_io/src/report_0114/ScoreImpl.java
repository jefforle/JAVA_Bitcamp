package report_0114;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/* Score 구현 */
public class ScoreImpl implements Score {
	//static ScoreForm sf;
	ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>(); 
	File file;
	
	@Override
	public void input(ScoreDTO dto) { 
		//총점평균 계산
		list.add(dto);
		System.out.println("list크기=" + list.size()); //확인차
	}


	@Override
	public void print(JTextArea output) {
		output.append("학번   이름   국어   영어   수학");
		output.append("\n");
		for(ScoreDTO dto : list) {
			output.append(dto.toString()+"\n");
//			output.append(dto.getHak());
//			output.append(dto.getName());
//			output.append(dto.getKor()+"");
//			output.append(dto.getEng()+"");
//			output.append(dto.getMath()+"");
//			output.append("\n");
		}
		
	}

	@Override
	public void search(JTextArea output) {
		String hak = JOptionPane.showInputDialog(null, "검색할 학번 입력");
		if(hak == null || hak.contentEquals("")) return; //입력한 학번이 없으면 나가라
		output.append("학번   이름   국어   영어   수학");
		int sw=0;
		for(ScoreDTO dto : list) {
			if(hak.equals(dto.getHak())){
				output.append(dto.toString()+"\n");
				sw=1;
//				output.append(dto.getHak());
//				output.append(dto.getName());
//				output.append(dto.getKor()+"");
//				output.append(dto.getEng()+"");
//				output.append(dto.getMath()+"");
			}
		}
		if(sw==0)
			JOptionPane.showMessageDialog(null, "찾고자하는 학생이 없습니다.");
	}

	@Override
	public void tot_desc() { //순위
		Collections.sort(list);
		
		//Comparator 사용하면 여기에 바로 써도 됨

	}

	@Override
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null); //Jframe이없음
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			
		}	
		
		if(file == null) return; 
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)); //객체로 넘겨줘야 함
			//BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			for(ScoreDTO dto : list) {
				oos.writeObject(dto);
			}
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(null); //Jframe이 없으므로 null
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			
		}	
		if(file == null) return;
		
		list.clear();; //초기화
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			
			while(true) {
				try {
					ScoreDTO dto = (ScoreDTO) ois.readObject();
					list.add(dto);
					
				}catch(EOFException e) {
					break;
				}
			}		
			ois.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		 new ScoreForm();

	}

}

package report_0106;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/* result - 처음에 들어온 값 또는 중간 결과
 * 
 * result / op
 *  
 * 1. op에 연산자가 0이면 (처음들어온값) result에 값을 넣는다
 * 2. 연산자를 op에 넣는다
 * 
 * 3. op에 0이 아니면 덧셈연산을 하여 결과를 result에 넣는다 
 * 4. 연산자를 op에 넣는다
 * 
 * 3번과 4번을 반복
 */
public class Calculator2 extends JFrame implements ActionListener{
	private JLabel dispL, inputL;   
	private JButton[] button;   
	private StringBuffer dispBuf, inputBuf;
	private double result=0;
	private int op;
	private boolean opCheck = false;
	private DecimalFormat df = new DecimalFormat("#.#######");
   
	public Calculator2() {
		setLayout(null);
		
      
		dispL = new JLabel("", JLabel.RIGHT);
		dispL.setBackground(Color.WHITE);
		dispL.setOpaque(true);
		dispL.setBounds(9,10,375,50);
		
		inputL = new JLabel("0", JLabel.RIGHT);
	    inputL.setBackground(Color.WHITE);
	    inputL.setOpaque(true);
	    inputL.setBounds(9,70,375,50);
	    dispL.setFont(new Font("Arial", Font.BOLD, 17));
	      
	    String[] title = {"←","C",
	    		          "7","8","9","/",
	    		          "4","5","6","*",
	    		          "1","2","3","-",
	    		          ".","0","=","+"};
	    button = new JButton[18];
	    for(int i=0; i<button.length; i++) {
	    	button[i] = new JButton(title[i]);
	    }
	      
	    dispBuf = new StringBuffer();
	    inputBuf = new StringBuffer("0");
	      
	    button[0].setBounds(9,130,185,50);
	    button[1].setBounds(199,130,185,50);
	      
	    button[2].setBounds(9,190,90,50);
	    button[3].setBounds(104,190,90,50);
	    button[4].setBounds(199,190,90,50);
	    button[5].setBounds(294,190,90,50);
	      
	    button[6].setBounds(9,250,90,50);
	    button[7].setBounds(104,250,90,50);
	    button[8].setBounds(199,250,90,50);
	    button[9].setBounds(294,250,90,50);
	      
	    button[10].setBounds(9,310,90,50);
	    button[11].setBounds(104,310,90,50);
	    button[12].setBounds(199,310,90,50);
	    button[13].setBounds(294,310,90,50);
	      
	    button[14].setBounds(9,370,90,50);
	    button[15].setBounds(104,370,90,50);
	    button[16].setBounds(199,370,90,50);
	    button[17].setBounds(294,370,90,50);
	      
	    Container c = this.getContentPane(); //모든 컨테이너가 들어갈 수 있는 구역을 따로 잡음, 좀더 안정적으로 구역 나눔
	    c.add(dispL);
		c.add(inputL);
	    for(int i=0; i<button.length; i++) {
	    	add(button[i]);
	    }
      
	    setTitle("계산기");
	    setBounds(800,300,400,460);
	    setResizable(false);
	    setVisible(true);
	      
	    // 이벤트
	    for (int i = 0; i < button.length; i++) {
	    	button[i].addActionListener(this);
	    }
    }

	@Override
    public void actionPerformed(ActionEvent e) {
		String  pushB = e.getActionCommand();
	    //숫자
		if(pushB=="1" || pushB=="2" || pushB=="3" || pushB=="4" || pushB=="5" || pushB=="6" || 
			   pushB=="7" || pushB=="8" || pushB=="9" || pushB=="0" ) {
			if(inputBuf.toString().equals("0")) //toString : 객체를 String(문자열)으로 변환
				inputBuf.delete(0, 1); //하나만 지워라
			inputBuf.append(pushB);
			inputL.setText(inputBuf+""); //toString과 같은 말  
			
			opCheck = false; //연산자 들어올 수 있게
		}
	   
		else if(pushB=="←") { //0만 남아 있을 경우
			inputBuf.delete(inputBuf.length()-1, inputBuf.length());
			if(inputBuf.length() == 0) {
				inputBuf.append("0");
			}
			inputL.setText(inputBuf+""); //String타입으로 형변환
		}
		else if(pushB=="C") {
			dispBuf.delete(0, dispBuf.length());
			inputBuf.delete(0, inputBuf.length());
			inputBuf.append("0");
		  
			dispL.setText("");
			inputL.setText("0");
			
			result = 0; //가지고 있는 값 초기화
			op = 0; //가지고 있는 값 초기화
			opCheck = false;
		}
		else if(pushB==".") {
			if(inputBuf.indexOf(".")==1) 
				inputBuf.append(".");
			inputL.setText(inputBuf+"");
		}
		//연산
/*		else if(pushB=="+") {		
			if(op == 0)	{ //연산자가 처음 들어오면 계산을 못함 result에 값을 넣음
				result = Double.parseDouble(inputBuf.toString());
				op = Integer.parseInt("+");
				inputBuf.append(pushB);
				//dispL.setText(inputBuf+"");
				dispL.setText(result+op+"");
			} else { //연산자op가 +면 연산진행
				dispBuf.append(inputBuf);
				dispBuf.append(op+"");
				result = Double.parseDouble(dispBuf.toString()) + Double.parseDouble(inputBuf.toString());
			}	
		}
*/
		else if(pushB=="+") {
			if(!opCheck) {//opCheck가 true이면 수행, 
				calc();
				dispBuf.append(inputBuf+" + ");
				op = '+';
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result)+"");
				inputBuf.delete(0, inputBuf.length());
				
				opCheck=true; //연산자가 더이상 못들어오게
			}
		} 
		else if(pushB=="-") {
			if(!opCheck) {//opCheck가 true이면 수행 
				calc();
				dispBuf.append(inputBuf+" - ");
				op = '-';
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result)+"");
				inputBuf.delete(0, inputBuf.length());
				
				opCheck=true; //연산자가 더이상 못들어오게
			}
		} 
		else if(pushB=="*") {
			if(!opCheck) {//opCheck가 true이면 수행 
				calc();
				dispBuf.append(inputBuf+" * ");
				op = '*';
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result)+"");
				inputBuf.delete(0, inputBuf.length());
				
				opCheck=true; //연산자가 더이상 못들어오게
			}
		} 
		else if(pushB=="/") {
			if(!opCheck) {//opCheck가 true이면 수행 
				calc();
				dispBuf.append(inputBuf+" / ");
				op = '/';
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result)+"");
				inputBuf.delete(0, inputBuf.length());
				
				opCheck=true; //연산자가 더이상 못들어오게
			}
		} 
		else if(pushB=="=") {
			if(!opCheck) {
				calc();
				
				dispBuf.append(inputBuf+"=");
				
				dispL.setText(dispBuf+"");
				inputL.setText(result+"");
				
				dispBuf.delete(0, dispBuf.length());
				inputBuf.delete(0, inputBuf.length());
				
				op=0;
				opCheck = true;
			}
		}
	}
	
	//계산 함수
	public void calc() {
		if(op==0) result = Double.parseDouble(inputBuf+""); //연산자가 처음 들어오면 계산을 못함 result에 값을 넣음
		else if(op=='+') result += Double.parseDouble(inputBuf+""); //연산자가 처음이 아니면 연산 수행
		else if(op=='-') result -= Double.parseDouble(inputBuf+"");
		else if(op=='x') result *= Double.parseDouble(inputBuf+"");
     	else if(op=='/') result /= Double.parseDouble(inputBuf+""); 		
	}
	public static void main(String[] args) {
		new Calculator2();
	}

}












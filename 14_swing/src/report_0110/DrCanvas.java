package report_0110;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrCanvas extends Canvas { 
	private MsPaint msPaint; //3) 생성자로 받아온 객체 저장시켜라
				/* MsPaint객체 정보를 받아오는 방법!!!!!!!!!!!!! */
		public DrCanvas(MsPaint msPaint) { //2) 생성자로 객체받아옴!!
			this.msPaint = msPaint;
			this.setBackground(new Color(255,200,255));
		}
	
	@Override
	public void paint(Graphics g) {
		//좌표
		int x1 = Integer.parseInt(msPaint.getX1T().getText().trim()); //trim(): 양끝의 공백을 제거
		int y1 = Integer.parseInt(msPaint.getY1T().getText().trim());
		int x2 = Integer.parseInt(msPaint.getX2T().getText().trim());
		int y2 = Integer.parseInt(msPaint.getY2T().getText().trim());
		int z1 = Integer.parseInt(msPaint.getZ1T().getText().trim());
		int z2 = Integer.parseInt(msPaint.getZ2T().getText().trim());
		
		switch(msPaint.getCombo().getSelectedIndex()) {
		case 0: g.setColor(new Color(255,0,0)); break;
		case 1: g.setColor(new Color(200,90,0)); break;
		case 2: g.setColor(new Color(255,255,0)); break;
		case 3: g.setColor(new Color(255,0,0)); break;
		case 4: g.setColor(new Color(255,0,0)); break;
		case 5: g.setColor(new Color(255,0,0)); break;
		}
		
		//채워진 도형
		if(msPaint.getFill().isSelected() == true) { //채워진 도형
			if(msPaint.getLine().isSelected())
				g.drawLine(x1, y1, x2, y2);
			else if(msPaint.getCircle().isSelected())
				g.fillOval(x1, y1, x2-x1, y2-y1);
			else if(msPaint.getRect().isSelected())
				g.fillRect(x1, y1, x2-x1, y2-y1);
			else if(msPaint.getRoundRect().isSelected())
				g.fillRoundRect(x1, y1, x2-x1, y2-y1, z1, z2);
			
		}else {  //안채워진 도형
			if(msPaint.getFill().isSelected())
				g.drawLine(x1, y1, x2, y2);
			else if(msPaint.getCircle().isSelected())
				g.drawOval(x1, y1, x2-x1, y2-y1);
			else if(msPaint.getRect().isSelected())
				g.drawRect(x1, y1, x2-x1, y2-y1);
			else if(msPaint.getRoundRect().isSelected())
				g.drawRoundRect(x1, y1, x2-x1, y2-y1, z1, z2);
			
		}
		
	}

}
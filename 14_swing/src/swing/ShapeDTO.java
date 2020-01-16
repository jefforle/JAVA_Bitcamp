/* [그림판 2] 
 * 도형 누적시키기
 * 도형 1개에 대한 정보 : 좌표6개, 채우기, 도형 모양, 색 => ShapeDTO
   ArrayList로 저장해놓고 list를 뿌려줘야 함
 * 1. 도형을 그린다
 * 2. ShapeDTO에 저장
 * 3. ArrayList에 보관
 * ---------------------------
 * 1. ArrayList에 보관 ShapeDTO를 꺼내서 그린다
 * 2. 새로운 도형을 그린다
 * 
 */
package swing;

import java.util.ArrayList;

public class ShapeDTO {
	private MsPaint msPaint;

	private int x1, x2, y1, y2, z1, z2;
	private boolean fillyn;
	private int shape;
	private int color;
//	private ArrayList<ShapeDTO> list;
	
	
	public ShapeDTO(MsPaint msPaint) {
		this.x1 = Integer.parseInt(msPaint.getX1T().getText().trim()); //trim(): 양끝의 공백을 제거
		this.y1 = Integer.parseInt(msPaint.getY1T().getText().trim());
		this.x2 = Integer.parseInt(msPaint.getX2T().getText().trim());
		this.y2 = Integer.parseInt(msPaint.getY2T().getText().trim());
		this.z1 = Integer.parseInt(msPaint.getZ1T().getText().trim());
		this.z2 = Integer.parseInt(msPaint.getZ2T().getText().trim());
		
		fillyn = msPaint.getFill().isSelected();
		
		if(msPaint.getLine().isSelected()) //String으로 받아오는 방법 없나?
			shape = 0;
		else if(msPaint.getCircle().isSelected())
			shape = 1;
		else if(msPaint.getRect().isSelected())
			shape = 2;
		else if(msPaint.getRoundRect().isSelected())
			shape = 3;
		
		switch(msPaint.getCombo().getSelectedIndex()) {
		case 0: color=0; break;
		case 1: color=1; break;
		case 2: color=2; break;
		case 3: color=3; break;
		case 4: color=4; break;
		case 5: color=5; break;
		}

	}
	
	
	public int getX1() {
		return x1;
	}


	public int getX2() {
		return x2;
	}


	public int getY1() {
		return y1;
	}


	public int getY2() {
		return y2;
	}


	public int getZ1() {
		return z1;
	}


	public int getZ2() {
		return z2;
	}


	public boolean isFillyn() {
		return fillyn;
	}


	public int getShape() {
		return shape;
	}


	public int getColor() {
		return color;
	}


//	public ArrayList<ShapeDTO> drawarray(){
//		ArrayList<ShapeDTO> list = new ArrayList<ShapeDTO>();
//		list.add(dto);
//			return list;
//		
//	}
	
//	public void getX1() {
//		return x1;
//	}
//	public void getY1() {
//		return y1;
//	}
//	public void getY1() {
//		return y1;
//	}
//	public void getY1() {
//		return y1;
//	}
//	public void getY1() {
//		return y1;
//	}
//	public void getY1() {
//		return y1;
//	}
//	

	
	
}
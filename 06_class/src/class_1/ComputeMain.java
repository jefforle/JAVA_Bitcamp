package class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Compute[] aa = new Compute[3];	
		
		for(int i=0; i<aa.length; i++) {
			aa[i] = new Compute();
			
			System.out.print("x입력:");
			aa[i].setX(Integer.parseInt(br.readLine()));
			System.out.print("y입력:");
			aa[i].setY(Integer.parseInt(br.readLine()));
		}
		
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		for(Compute data : aa) {
			data.calc();
			System.out.println(data.getX() +"\t"+ data.getY()+"\t"+data.getSum()+"\t"+data.getSub()+"\t"
	            	+data.getMul() +"\t"+ String.format("%.2f", data.getDiv())+"\t");
		}

	}

}

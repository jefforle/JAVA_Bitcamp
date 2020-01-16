package array;

public class MultiArray3 {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,0}, {4,5,6,0}, {7,8,9,0}, {0,0,0,0}};
		
		//입력
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar[i].length-1; j++) {
				ar[i][3] += ar[i][j];
				ar[3][i] += ar[j][i]; //== ar[3][j] += ar[i][j]
				ar[3][3] += ar[i][j];
			}
		}
				
		
		//출력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
	}

}

/* i  3        i  j
ar[0][3] += ar[0][0] 1
         += ar[0][0] 2
         += ar[0][0] 3

ar[1][3] += ar[1][0] 4
         += ar[1][0] 5
         += ar[1][0] 6
         
ar[2][3] += ar[2][0] 7
         += ar[2][0] 8
         += ar[2][0] 9
         
-------------------------------

   i           i  j
ar[3][0] += ar[0][0] 1
         += ar[0][0] 2
         += ar[0][0] 3

ar[3][1] += ar[1][0] 4
         += ar[1][0] 5
         += ar[1][0] 6
         
ar[2][3] += ar[2][0] 7
         += ar[2][0] 8
         += ar[2][0] 9

         
*/

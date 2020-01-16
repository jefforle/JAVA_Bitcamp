package exam;

class HelloTest{
	public static void main(String[] args){
		System.out.println("Hello");
		System.out.print("Hi \n");
		System.out.println("apple"+"orange");
		System.out.println(25 + 36);
		System.out.println("25" + "36");
		System.out.println("25 + 36 = " +25+36);
		System.out.println("25 + 36 = " +(25 + 36));
		System.out.println("25 / 36 = " +(25 / 36));
		System.out.println("25 / 36 = " +(25.0 / 36)); 
		System.out.println("25 / 36 = " +(int)(25.0/36*10+0.5) / 10.0  );   //
		System.out.println("25 / 36 = " + String.format("%.1f", (25.0 / 36)) ); 

	}

}

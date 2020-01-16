package class_1;
/*
[문제1] setter / getter 작성
클래스명 : BookShop
필드 : bookName, author, price

[실행결과]
책이름 : 자바완성
저  자 : 김완성
가  격 : 25000원

책이름 : JSP잡기
저  자 : 송JP
가  격 : 35000원
 */
//class BookShop{
//	
//}
public class Pratice1 {

	
	public static void main(String[] args) {
		BookShop bk = new BookShop();	
		bk.setBookName("홍길동");
		bk.setAuthor("김완성");
		bk.setPrice("25000원");
		
		BookShop bk2 = new BookShop();	
		bk2.setBookName("JSP잡기");
		bk2.setAuthor("송JP");
		bk2.setPrice("35000원");		
		
		System.out.print("책이름:"+bk.getBookName()+"\n저자:"+bk.getAuthor()+"\n가격:"+bk.getPrice());
		System.out.println();
		System.out.println();
		System.out.print("책이름:"+bk2.getBookName()+"\n저자:"+bk2.getAuthor()+"\n가격:"+bk2.getPrice());
		

	}

}
//==> 

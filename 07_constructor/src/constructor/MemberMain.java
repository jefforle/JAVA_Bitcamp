package constructor;

import java.util.Scanner;

/* 
클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

[실행결과]
menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면 
----------------------
이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

1 row created
xx자리 남았습니다

[2번 경우]
list()
이름	나이	핸드폰	주소

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234
홍길동	25	xxx	xxx

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 : 

1 row(s) updated
--------------------
핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 : 
1 row deleted

핸드폰 번호 입력 : 
찾는 회원이 없습니다
 */
public class MemberMain {
	//객체배열 5명 여기다 잡으면 편해질거얌...Scanner 사용
	Scanner sc = new Scanner(System.in);
	MemberDTO[] ps = new MemberDTO[5];
	static int count=0;
	
	public void menu() {
		System.out.println("*************");
		System.out.println(" 1. 가입 ");
		System.out.println(" 2. 출력 ");
		System.out.println(" 3. 수정 ");
		System.out.println(" 4. 탈퇴 ");
		System.out.println(" 5. 끝내기 ");
		System.out.println("*************");
		
		System.out.print("번호:");
		int num = sc.nextInt();
		if(num == 1) insert();
		if(num == 2) list();
		if(num == 3) update();
		if(num == 4) delete();
		if(num == 5) return;
	}
	
	public void insert() {
		for(int i=0; i<ps.length; i++){
			if(count<=i) {
				ps[i] = new MemberDTO();
				System.out.println("----------------------");
				System.out.print("이름 입력 :");
				ps[i].setName(sc.next());
				System.out.print("나이 입력 :");
				ps[i].setAge(sc.nextInt());
				System.out.print("핸드폰 입력 :");
				ps[i].setPhoneNumber(sc.next());
				System.out.print("주소 입력 :");
				ps[i].setAddress(sc.next());
				count++;
				
				System.out.println((i+1)+" row created");
				System.out.println((ps.length-count)+"자리 남았습니다.");
			}
			else  if(count==5) {
				System.out.println("5명의 정원이 꽉 찼습니다");
				break;
			}
		}
		System.out.println();
		menu();
		
	}
			

	public void list() {
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(int i=0; i<ps.length; i++) {
			System.out.println(ps[i].getName()+"\t"
					+ps[i].getAge()+"\t"
					+ps[i].getPhoneNumber()+"\t"
					+ps[i].getAddress());
		}
		System.out.println();
		menu();
	}
	
		
	public void update() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone = sc.next();
		
		int row = 0;
		
		for(int i=0; i<ps.length; i++) {
			if(ps[i].getPhoneNumber().equals(phone)) {
				System.out.println("이름\t나이\t핸드폰\t주소");
				System.out.println(ps[i].getName()+"\t"
						+ps[i].getAge()+"\t"
						+ps[i].getPhoneNumber()+"\t"
						+ps[i].getAddress());
				System.out.print("수정할 이름 입력 : ");
				ps[i].setName(sc.next());
				System.out.print("수정할 핸드폰 입력 : ");
				ps[i].setPhoneNumber(sc.next());
				System.out.print("수정할 주소 입력 : ");
				ps[i].setAddress(sc.next());
				row++;
				
				System.out.println();
				System.out.println(row+" row(s) updated");
				
			}else {			
				System.out.println("찾는 회원이 없습니다");
				break;			
			}
		}
		System.out.println("A");
		System.out.println();
		menu();
		
	}

	public void delete() {
		System.out.print("핸드폰 번호 입력 :");
		String phone = sc.next();
		
		int row = 0;
		for(int i=0; i<count; i++) {
			if(ps[i].getPhoneNumber().equals(phone)) {
				ps[i] = new MemberDTO();
				row++;
				
				System.out.println(row+" row deleted");
			}else {
				System.out.println("찾는 회원이 없습니다");
				break;
			}
				
		}
		count--;
		System.out.println();
		menu();
		
	}
	

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.menu();

	}
	

}

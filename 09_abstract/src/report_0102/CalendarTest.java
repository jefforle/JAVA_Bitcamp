/*
[문제1]
년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

기본생성자 - 년도, 월 입력
calculator()
display()
 */

package report_0102;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	
	private int year; //년
	private int month; //월
	private int day=1; //일
	private int lastday; //마지막날짜
	private int dayofweek; //요일
	
	
	public CalendarTest(){
		Scanner sc = new Scanner(System.in);
		System.out.print("년도입력:");
		year = sc.nextInt();
		
		System.out.print("월입력:");
		month = sc.nextInt();
	}
	
	public void calculator() {
		//기준이 없으면 시스템 날짜가 나옴 -> 내가 원하는 날짜로 기준을 바꿔줘야함
		Calendar calendar = Calendar.getInstance(); 
		
		calendar.set(year, month-1, 1); //내가 원하는 날짜 설정
		
		year = calendar.get(calendar.YEAR);
		month = calendar.get(calendar.MONTH)+1;
		
		lastday = calendar.getActualMaximum(calendar.DATE);
//		lastday = calendar.getActualMaximum(calendar.DAY_OF_MONTH); --윗줄과 같은의미
		dayofweek = calendar.get(calendar.DAY_OF_WEEK);
	}
	
	
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//쌤소스
		for(int i=1; i<dayofweek; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastday; i++) {
			System.out.print(i+"\t");
			if(dayofweek%7 == 0)
				System.out.println();
			dayofweek++;
		}	
			
		//내소스
//		for(int i=1; day<=lastday; i++) {
//			if(i < dayofweek)
//				System.out.print("\t");
//			else {
//				System.out.print(day+"\t");
//				day++;
//			}
//			if(i%7 == 0) {
//				System.out.println();
//			}
//		}
	}
	
	public static void main(String[] args) {
		CalendarTest calendarTest = new CalendarTest();
		calendarTest.calculator();
		calendarTest.display();
	}

}

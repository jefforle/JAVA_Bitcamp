/* 1/16 (목) 1 */
package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.UnknownException;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress naver = new InetAddress(); //추상클래스여서 new를 못하는게 아니고 생성자 접근을 막아버린것
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("NAVER IP=" + naver.getHostAddress());
		System.out.println();
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("LOCALHOST IP=" + local.getHostAddress());
		
		InetAddress[] ar = InetAddress.getAllByName("www.daum.net");
		//for(int i=0;i<ar.length; i++) {
		for(InetAddress data : ar)
			System.out.println("DAUM IP=" + data.getHostAddress());
		
	}

}

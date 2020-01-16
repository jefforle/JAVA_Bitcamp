/* 1/16 (목) 2 */
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/index.html");
		System.out.println("프로토콜=" + url.getProtocol());
		System.out.println("호스트=" + url.getHost());
		System.out.println("포트=" + url.getPort());
		System.out.println("기본포트=" + url.getDefaultPort());
		System.out.println("파일=" + url.getFile());
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line;
		while((line=br.readLine()) != null) { //한줄씩 읽어내려감, null이 될떄까지
			System.out.println(line);
		}
		br.close();
	}

}
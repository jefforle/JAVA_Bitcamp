/* [1/16 숙제1]
 * https://www.liebli.com
			
   18k 개수 = 150(18k, 18K 모두)
 */
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.liebli.com");
		
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		while((line=br.readLine()) != null) {
			System.out.println(line);
		}

	}

}



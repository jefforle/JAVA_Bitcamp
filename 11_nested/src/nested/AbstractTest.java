/* 1/6(월) 2 */
package nested;

public abstract class AbstractTest {
	String name;
	
	//외부에서 name에 접근 불가능한데 딱한번만 접근가능한게 생성자, 계속접근하려면 setter
	public abstract void setName(String name); //abstract 키워드는  인터페이스에서만 뺄 수 있음
	
	public String getName() {
		return name;
	}
	
}

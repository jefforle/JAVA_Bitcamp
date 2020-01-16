package exception;

//개발자가 만든 Exception클래스
public class MakeException extends Exception { //이제부터 Exception역할을 하겠다
	private String errorMsg;
	
	public MakeException() {}
	
	public MakeException(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String toString() {
		//return errorMsg; //error메세지만 깔끔하게 찍힘
		return getClass()+":"+errorMsg;
		
	}

}

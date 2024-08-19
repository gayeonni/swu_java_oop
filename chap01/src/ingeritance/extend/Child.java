package ingeritance.extend;

public class Child extends Parent {

	public void childProcess() {
		System.out.println("Child Process()");
		
		this.parentPublicInt = 0;
		this.parentProtectedInt = 0;
		// private 변수는 상속되지 않는다.
		
	}
	
}

package abstractlayer.interface_;

// 다중 implements 가능
public class ImplementsClass implements SomeInterface, AnotherInterface{

	@Override
	public void anotherMethod() {
		// 리스코프 치환 원칙: 자식의 실행 커버리지는 부모의 실행 커버리지보다 넓어져서는 안 된다.
		// 오버라이드한 메서드가 public에서 private처럼 범위가 좁아지면 안된다.
		System.out.println("ImplementsClass의 anotherMethod()");
		
	}

	@Override
	public void someMethod() {
		System.out.println("ImplementsClass의 someMethod()");
		
	}

}

package abstractlayer.interface_;

public class InterfaceExampleMain {

	public static void main(String[] args) {
		SomeInterface someInterface = new ImplementsClass();
		AnotherInterface anotherInterface = new ImplementsClass();
		
		someInterface.someMethod();
		anotherInterface.anotherMethod();
		
		ImplementsClass implementClass = new ImplementsClass();
		
		// someInterface, anotherInterface로는 양쪽 모두를 호출할 수 없다.
//		someInterface.anotherMethod();
//		anotherInterface.someMethod();
		
		// ImplementsClass 구현체 타입으로는 양쪽 모두 호출 가능
		implementClass.anotherMethod();
		implementClass.someMethod();
	}
}

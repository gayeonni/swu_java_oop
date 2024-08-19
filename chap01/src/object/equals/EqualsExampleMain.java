package object.equals;

public class EqualsExampleMain {

	public static void main(String[] args) {
		
		SomeObject someObject1 = new SomeObject(1, "asdf");
		SomeObject someObject2 = new SomeObject(1, "asdf");
		
		SomeObject anotherObject = new SomeObject(99, "qwer");
		
		// 동일성 비교(레퍼런스 주소 비교)
		System.out.println(someObject1 == someObject2);
		
		// 동등성 비교(equals를 오버라이딩한 기준에 따라 비교)
		System.out.println(someObject1.equals(someObject2));
		
		// 동등성 비교
		System.out.println(someObject1.equals(anotherObject));
	}
}

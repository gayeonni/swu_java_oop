package ingeritance.overloading;

public class AddCalculator {

	// 메서드 오버로딩 요건
	// 1. 메서드 이름을 중복해서 여러 개 선언한다.
	// 2. 선언된 같은 이름의 메서드간 요구 파라미터 개수나 타입은 달라야 한다.
	// 3. 리턴 타입의 동일여부는 오버라이딩에 영향을 주지 않는다.
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	/* return 타입만 다르게 오버로딩하는건 불가능하다.
	public long add(int num1, int num2) {
		return num1 + num2;
	} */
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public long add(long num1, long num2) {
		return num1 + num2;
	}
}

package enum_.adv;

import java.util.function.BiFunction;

public enum CalculateType {

	// basic과는 다르게 연산 종류와 연산 메커니즘을 함께 정의한다.
	// 관련된 자료들이 잘 모여있다. (응집도가 높은 코드)
	ADD((num1, num2) -> num1 + num2), // 화살표 왼쪽: 받는 파라미터들, 오른쪽: 리턴자료
	MINUS((num1, num2) -> num1 - num2),
	MULTIPLY((num1, num2) -> num1 * num2),
	DIVIDE((num1, num2) -> num1 / num2);
	
	// 위에 붙인 익명함수들은 BiFunction이라는 타입으로 멤버변수를 정의해야 사용 가능하다.
	// 따라서 생성자에서 BiFunction을 주입받도록 처리한다.
	CalculateType(BiFunction<Integer, Integer, Integer> expression) {
		this.expression = expression;
	}
	
	private BiFunction<Integer, Integer, Integer> expression;
	
	public int calculate(int num1, int num2) {
		return this.expression.apply(num1, num2);
	}
}

package optional.with_optional;

import javax.management.RuntimeErrorException;

public class WithOptionalExampleMain {

	public static void main(String[] args) {
		
		MapRepository mapRepository = new MapRepository();
		
		String string = mapRepository.getOptionalValue("NOT_EXIST_KEY")
				.orElseThrow(() -> {throw new RuntimeException("없는 키 값입니다.");});
	
		// 해당 키로 조회한 결과가 null 인데 옵셔녈 반환을 받은 경우 예외 발생
		// 내부에 람다식으로 () -> { throw new 발생시킬예외("메세지"); }
		// 위와 같이 작성하면 해당 예외가 정상값이 아닌 null이 들어왔을 때 발생한다.
		
		System.out.println(string.toUpperCase());
	}
}

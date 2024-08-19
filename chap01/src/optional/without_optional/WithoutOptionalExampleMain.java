package optional.without_optional;

public class WithoutOptionalExampleMain {

	public static void main(String[] args) {
		MapRepository mapRepository = new MapRepository();
										// 존재하지 않는 키로 조회(결과가 null)
		String string = mapRepository.getValue("NOT_EXIST_KEY");
		
		System.out.println("string= " + string);
		
		// 대문자로 바꿔서 출력해야 하지만, NullPointerException 발생
		System.out.println(string.toUpperCase()); 
		
		if(string != null) { // 조건문으로 널 검사 후에
			System.out.println(string.toUpperCase());
		}
	}
}

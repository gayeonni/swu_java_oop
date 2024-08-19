package oopstart.without_interface;

public class FakeMessageSender {

	// 메세지 실제 발송 X, 보내는 척만 하는 메서드
	public void send() {
		System.out.println("FakeMessageSender: 고객에게 메세지가 가지 않습니다.");
	}
}

package oopstart.with_interface;

public class FakeMessageSender implements MessageSender{

	@Override
	public void send() {
		System.out.println("FakeMessageSender: 고객에게 메세지를 전달하지 않았습니다.");
		
	}

}

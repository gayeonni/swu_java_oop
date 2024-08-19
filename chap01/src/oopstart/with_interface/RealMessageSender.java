package oopstart.with_interface;

public class RealMessageSender implements MessageSender{

	@Override
	public void send() {
		System.out.println("RealMessageSender: 고객에게 메세지를 전달했습니다.");
		
	}
	

}

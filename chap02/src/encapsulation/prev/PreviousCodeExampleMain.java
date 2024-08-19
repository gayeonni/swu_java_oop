package encapsulation.prev;

public class PreviousCodeExampleMain {
	public static void main(String[] args) {
		
		 CalculateCommand calculateCommand = new CalculateCommand(
	                null,
	                100,
	                0
	        );

	        Client client = new Client();
	        int result = client.someMethod(calculateCommand);

	        System.out.println(result);
	}
}

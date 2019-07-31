import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);	
		
		PlaneShape shape = new Rectangle(myScanner);
		shape = new Circle(myScanner);

		myScanner.close();		
		System.out.println("Exiting");
		
		
		
	}
	
	
}

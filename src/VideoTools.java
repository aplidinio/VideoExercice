import java.util.Scanner;

public class VideoTools {

	public static String introMenu() {
				
		Scanner entry =new Scanner(System.in);
		
		System.out.println("Video-Club");
		System.out.println("**********");
				
		do {
			
			System.out.println("Please enter option: \n1. New User \n2. User login");
			select = entry.nextLine();
			
			if (!select.equals("1") && !select.equals("2"))
				System.out.println("Illegal option.");
		} while (!select.equals("1") && !select.equals("2"));
		
		return select;
		
	}
	
	private static String select;
	
	
}

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
	
	public static User newUser() {
		
		Scanner entry =new Scanner(System.in);
						
		System.out.println ("Please enter your first name: ");
		firstName = entry.nextLine();
			
		System.out.println ("Please enter your last name: ");
		lastName = entry.nextLine();
			
		System.out.println ("Please enter an User Name: ");
		userName = entry.nextLine();
			
		System.out.println ("Please enter your birth date: \nYear: ");
		year = Integer.parseInt(entry.nextLine());
			
		System.out.println ("Month: ");
		month = Integer.parseInt(entry.nextLine());;
			
		System.out.println ("Day: ");
		day = Integer.parseInt(entry.nextLine());;
			
		System.out.println ("Please enter password: ");
		psswd = entry.nextLine();
					
		User newUser = new User (firstName, lastName, userName, psswd, year, month, day);
		
		return newUser;
	}
	
	public static String mainMenu() {
		
		Scanner entry =new Scanner(System.in);
		
		do {
			
			System.out.println("\nPlease try option:");
			System.out.println("******************");
			System.out.println("1. Create new video \n2. List your videos \n3. Delete a video \n4. Log out");
			select = entry.nextLine();
		
			if (!select.equals("1") && !select.equals("2") && !select.equals("3") && !select.equals("4"))
				System.out.println("Illegal option.");
		
		} while (!select.equals("1") && !select.equals("2") && !select.equals("3") && !select.equals("4"));
	 
		
		return select;
	}
	
	private static String select;
	private static String firstName;
	private static String lastName;
	private static String userName;
	private static String psswd;
	private static int year;
	private static int month;
	private static int day;
}

import java.util.List;
import java.util.Scanner;

public class VideoTools {

	public static byte introMenu() {
				
		Scanner entry =new Scanner(System.in);
		
		System.out.println("Video-Club");
		System.out.println("**********");
				
		do {
			
			System.out.println("Please enter option: \n1. New User \n2. User login");
			select0 = entry.nextLine();
			
			if (!select0.equals("1") && !select0.equals("2"))
				System.out.println("Illegal option.");
		} while (!select0.equals("1") && !select0.equals("2"));
		
		select = (byte)Integer.parseInt(select0);
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
	
	public static String getUser(List<User> users) {//revisa esto y compara con el createUSer, quiz�s carga la lista en el main
		
		Scanner entry = new Scanner(System.in);
		User myUser = null;
		do {
			
			System.out.println ("Please enter your User name: ");
			userName = entry.nextLine();
		
			System.out.println ("Please enter password: ");
			psswd = entry.nextLine();
		
			for (User e:users) {
			
				if ((e.userName).equals(userName)) {				
					if ((e.psswd).equals(psswd)) {	
						System.out.println("\nWelcome, " + e.userName);//¿Por qué e.userName da señal de advertencia?
						return e.userName;
					} else {					
						System.out.println("Invalid password");
						break;
					}
				}
			}
			System.out.println("User not found");
				
		} while (myUser == null);
				
		return null;
	}
	
	public static byte mainMenu() {
		
		Scanner entry =new Scanner(System.in);
		
		do {
			
			System.out.println("\nPlease try option:");
			System.out.println("******************");
			System.out.println("1. Create new video \n2. List your videos \n3. Delete a video \n4. Log out");
			select0 = entry.nextLine();
		
			if (!select0.equals("1") && !select0.equals("2") && !select0.equals("3") && !select0.equals("4"))
				System.out.println("Illegal option.");
		
		} while (!select0.equals("1") && !select0.equals("2") && !select0.equals("3") && !select0.equals("4"));
	 	
		select = (byte)Integer.parseInt(select0);
		return select;
	}
	
	public static boolean turnAgain() {
		
		Scanner entry =new Scanner(System.in);
		
		System.out.println("\nDo you want to run another option (y/N)?");
		select0 = entry.nextLine();
			
		if (select0.equals("y") || select0.equals("Y"))
			return true;
		else return false;
			
	}
	
	private static byte select;
	private static String select0;
	private static String firstName;
	private static String lastName;
	private static String userName;
	private static String psswd;
	private static int year;
	private static int month;
	private static int day;
}

import java.util.ArrayList;
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
	
	public static User newUser () throws NullPointerException {
		
		Scanner entry =new Scanner(System.in);
		boolean isANumber;
		
		do {
			System.out.println ("Please enter your first name: ");
			firstName = entry.nextLine();
			if (firstName.isEmpty()) throw new NullPointerException();
		} while (firstName.isEmpty());
			
		do {
			System.out.println ("Please enter your last name: ");
			lastName = entry.nextLine();
			if (lastName.isEmpty()) throw new NullPointerException();
		} while (lastName.isEmpty());
		
		do {
			System.out.println ("Please enter an User Name: ");
			userName = entry.nextLine();
			if (userName.isEmpty()) throw new NullPointerException();
		} while (userName.isEmpty());
			
		do {
		
			try {
				isANumber = true;
				System.out.println ("Please enter your birth date: \nYear: ");
				year = Integer.parseInt(entry.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid year");
				isANumber = false;
			}
		} while (isANumber==false);
		
		do {
			
			try {
				isANumber = true;
				System.out.println ("Month: ");
				month = Integer.parseInt(entry.nextLine());;
			} catch (Exception e) {
				System.out.println("Invalid month");
				isANumber = false;
			}
		} while (isANumber==false);
		
		do {
			
			try {
				isANumber = true;
				System.out.println ("Day: ");
				day = Integer.parseInt(entry.nextLine());;
			} catch (Exception e) {
				System.out.println("Invalid day");
				isANumber = false;
			}
		} while (isANumber==false);
		
		do {
			System.out.println ("Please enter password: ");
			psswd = entry.nextLine();
			if (psswd.isEmpty()) throw new NullPointerException();
		} while (firstName.isEmpty());
	
		ArrayList<Video> videoList = new ArrayList<Video>();
		User newUser = new User (firstName, lastName, userName, psswd, year, month, day, videoList);
		
		return newUser;
	}
	
	public static User getUser(List<User> users) throws Exception{
		
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
						System.out.println("\nWelcome, " + e.userName);
						return e;
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
			System.out.println("1. Create new video \n2. List your videos \n3. Delete a video");
			select0 = entry.nextLine();
		
			if (!select0.equals("1") && !select0.equals("2") && !select0.equals("3"))
				System.out.println("Illegal option.");
		
		} while (!select0.equals("1") && !select0.equals("2") && !select0.equals("3"));
	 	
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

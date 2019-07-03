import java.util.*;

public class User {
	
	public User(String firstName, String lastName, String userName, String psswd, int year, int month, int day) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.psswd = psswd;
		this.year = year;
		this.month = month;
		this.day = day;
		//List <User> users = new ArrayList <User>();
					
	}
	
	public User createUser () {
				
		Scanner entry = new Scanner(System.in);
		
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
				
		User myUser = new User (firstName, lastName, userName, psswd, year, month, day);
		return myUser;
	}
	
	public User getUser(String userName, List<User> users) {//revisa esto y compara con el createUSer, quizás carga la lista en el main
		
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
						System.out.println("Bienvenido, " + e.userName);
						return e;
					} else {					
						System.out.println("Invalid password");
						break;
					}
				}
			}
			System.out.println("User not found");
			myUser = null;
	
		} while (myUser == null);
				
		return myUser;
	}
		
	private String firstName;
	private String lastName;
	private String userName;
	private String psswd;
	private int year;
	private int month;
	private int day;
	//private List <User> users;
	
}

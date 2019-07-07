import java.util.*;

public class User {
	
	public User(String firstName, String lastName, String userName, String psswd, int year, int month, int day) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.psswd = psswd;
		//this.setUserName(userName);
		//this.setPsswd(psswd);
		this.year = year;
		this.month = month;
		this.day = day;
		//List <User> users = new ArrayList <User>();
					
	}
	
	/*public User createUser () {
				
		Scanner entry = new Scanner(System.in);
		
		System.out.println ("Please enter your first name: ");
		firstName = entry.nextLine();
		
		System.out.println ("Please enter your last name: ");
		lastName = entry.nextLine();
		
		System.out.println ("Please enter an User Name: ");
		setUserName(entry.nextLine());
		
		System.out.println ("Please enter your birth date: \nYear: ");
		year = Integer.parseInt(entry.nextLine());
		
		System.out.println ("Month: ");
		month = Integer.parseInt(entry.nextLine());;
		
		System.out.println ("Day: ");
		day = Integer.parseInt(entry.nextLine());;
		
		System.out.println ("Please enter password: ");
		setPsswd(entry.nextLine());
				
		User myUser = new User (firstName, lastName, getUserName(), getPsswd(), year, month, day);
		return myUser;
	}
	
	/*public static String getUser(List<User> users) {//revisa esto y compara con el createUSer, quiz�s carga la lista en el main
		
		Scanner entry = new Scanner(System.in);
		User myUser = null;
		do {
			
			System.out.println ("Please enter your User name: ");
			setUserName(entry.nextLine());
		
			System.out.println ("Please enter password: ");
			setPsswd(entry.nextLine());
		
			for (User e:users) {
			
				if ((User.getUserName()).equals(getUserName())) {				
					if ((User.getPsswd()).equals(getPsswd())) {	
						System.out.println("\nWelcome, " + User.getUserName());//¿Por qué e.userName da señal de advertencia?
						return User.getUserName();
					} else {					
						System.out.println("Invalid password");
						break;
					}
				}
			}
			System.out.println("User not found");
				
		} while (myUser == null);
				
		return null;
	}*/

	public static Video createVideo(String userName) {// cambiar a user
		
		String title;
		String urlAddress;
		String tag;
		
		Scanner entry = new Scanner(System.in);
		List <String> newTags = new ArrayList <String>();
		
		System.out.println("Introducing new video");
		System.out.println("*********************");
		
		System.out.println("\nPlease introduce title: ");
		title = entry.nextLine();
		
		System.out.println("Please introduce video url: ");
		urlAddress = entry.nextLine();
		
		do {
			System.out.println("Please introduce video tag (type '0' to finish): ");
			tag = entry.nextLine();
			if (!tag.equals("0")) newTags.add(tag);
			
		} while (!tag.equals("0"));
	
		Video newVideo = new Video(userName, urlAddress, title, newTags);
		return newVideo;
	}
	
	
	
	public static void deleteVideo(List<Video> videos) {
		
		for (Video e:videos) {
			if((e.getTitle()).equals(title)) {
				videos.remove(e);
				System.out.println("The video " + e.getTitle() + " has been removed");
				return;
			}
		System.out.println("Video not found");	
		}
	}
			
	private String firstName;
	private String lastName;
	protected String userName;
	protected String psswd;
	private int year;
	private int month;
	private int day;
	protected static String title;
	//private List <User> users;
	
}

import java.util.*;

public class User {
	
	public User(String firstName, String lastName, String userName, String psswd, int year, int month, int day, List videoList) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.psswd = psswd;
		this.year = year;
		this.month = month;
		this.day = day;
		this.videoList = videoList;
		
		/*Video video1 = new Video ("Lamb", "pepevideos.com?=13", "Braindead", Arrays.asList("gore", "thriller"));
		Video video2 = new Video ("RufusTFirefly", "pepevideos.com?=43", "A night in the Opera", Arrays.asList("comedy"));
		Video video3 = new Video ("RufusTFirefly", "pepevideos.com?=432", "Go West", Arrays.asList("comedy", "western"));
		Video video4 = new Video ("ImTheBest", "pepevideos.com?=88", "Dr. Cooper's Life", Arrays.asList("science"));
		Video video5 = new Video ("Hagane", "pepevideos.com?=188", "FullMetal Alchemist", Arrays.asList("anime", "shounen"));
		
		User user1 = new User ("Groucho", "Marx", "RufusTFirefly", "ducksoup", 2019,2,15, Arrays.asList(video2, video3)); //No puedo hacer esto en la clase Video
		User user2 = new User ("Sheldon", "Cooper", "ImTheBest", "BigBang", 2014,8,5, Arrays.asList(video4));
		User user3 = new User ("Hannibal", "Lecter", "Lamb", "Clarisse", 2019,2,15, Arrays.asList(video1));
		User user4 = new User ("Edward", "Elric", "Hagane", "Imnotsmall", 2019,2,15, Arrays.asList(video5));*/

		/*users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);*/
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

	
	
	
	

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPsswd() {
		return psswd;
	}

	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}
	
	public void addVideo(String title, String urlAddress, List<String> newTags)  {
						

		/*do {
			System.out.println("Please introduce video tag (type '0' to finish): ");
			tag = entry.nextLine();
			if (!tag.equals("0")) newTags.add(tag);
			
		} while (!tag.equals("0"));*/
	
		Video newVideo = new Video(urlAddress, title, newTags);
		this.getVideoList().add(newVideo);
	}
	

	public void listVideo() {
		
		System.out.println(this.userName + ", you have the following videos:");
		System.out.println("********************************************");
		if(this.getVideoList().size()!=0) 
		{
			for (Video e : this.getVideoList()) {
				System.out.println("name: "+e.getTitle()+" Tags: "+e.getMyTags().toString());
			}
		}
		else 
		{
			System.out.println("You still haven't got videos");
		}
		

	}
	
	public void deleteVideo(User currentUser) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Introduce video title to detele:");
		title = entry.nextLine();
	
		for (Video e:currentUser.videoList) {
			if((e.getTitle()).equals(title)) {
				//e.remove(title);
				System.out.println("The video " + e.getTitle() + " has been removed");
				return;
			}
		System.out.println("Video not found");	
		}
	}
			
	
	
	
	@Override //To edit para hacer el get
	public String toString() {
		return "User [firstName=" + this.getFirstName() + ", lastName=" + lastName + ", userName=" + userName + ", psswd=" + psswd
				+ ", year=" + year + ", month=" + month + ", day=" + day + ", title=" + title + ", videoList="
				+ videoList + "]";
	}




	private String firstName;
	private String lastName;
	protected String userName;
	protected String psswd;
	private int year;
	private int month;
	private int day;
	protected String title;
	private List <Video> videoList;
	
}

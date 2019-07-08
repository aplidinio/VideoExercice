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
	}
		
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
	
	public void addVideo(String title, String urlAddress, List<String> tags)  {
						

		/*do {
			System.out.println("Please introduce video tag (type '0' to finish): ");
			tag = entry.nextLine();
			if (!tag.equals("0")) newTags.add(tag);
			
		} while (!tag.equals("0"));*/
	
		Video newVideo = new Video(urlAddress, title, tags);
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

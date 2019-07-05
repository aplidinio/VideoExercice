import java.util.*;

public class Video {
	
	public Video (String userName, String urlAddress, String title, List <String> myTags) {
		
		this.userName = userName;
		this.urlAddress = urlAddress;
		this.title = title;
		this.myTags = myTags;			
	}
	
	public Video getVideo(String userName, List <Video> videos) {
		
		int n=0;
		System.out.println(userName + ", you have the following videos:");
		System.out.println("********************************************");
		
		for (Video e:videos) {
			if ((e.userName).equals(userName)) {
				System.out.println("\nVideo: " + e.title);
				System.out.println("    Tags: " + e.myTags);
				n++;
			}
		}
		if (n==0) System.out.println("You still haven't got videos");
		return null;
	}
	
	/*public Video createVideo(String userName) {// cambiar a user
		
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
		
		System.out.println(userName + " " + urlAddress + " " + title + " " + newTags);
		
		Video newVideo = new Video(userName, urlAddress, title, newTags);
		return newVideo;
	}*/
	
	public void deleteVideo(String userName, String title, List<Video> videos) {
		
		for (Video e:videos) {
			if((e.title).equals(title)) {
				videos.remove(e);
				System.out.println("The video " + e.title + " has been removed");
				return;
			}
		System.out.println("Video not found");	
		}
	}

	private String userName;
	private String urlAddress;
	private String title;
	private String tag;
	private List <String> myTags;
	
}

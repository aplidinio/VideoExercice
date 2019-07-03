import java.util.*;

public class Video {
	
	public Video (String userName, String title, String urlAddress, List <String> myTags) {
		
		this.userName = userName;
		this.urlAddress = urlAddress;
		this.title = title;
		this.myTags = new ArrayList <String>();
					
	}
	
	public Video getVideo(String userName, List <Video> videos) {
		
		for (Video e:videos) {
			if ((e.userName).equals(userName)) {
				System.out.println("User: " + e.userName + "\nVideo: " + e.title);
				return e;
			}
		}
		System.out.println("Video not found");
		return null;
	}
	
	public Video createVideo(String userName) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Introducing new video");
		System.out.println("*********************");
		
		System.out.println("\nPlease introduce title: ");
		title = entry.nextLine();
		
		System.out.println("Please introduce video url: ");
		urlAddress = entry.nextLine();
		
		do {
			System.out.println("Please introduce video tag (type '0' to finish): ");
			tag = entry.nextLine();
			myTags.add(tag);
			
		} while (tag!="0");
		
		Video newVideo = new Video(userName, title, urlAddress, myTags);
		return newVideo;
	}
	
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
	private List <Video> videos;
	
}

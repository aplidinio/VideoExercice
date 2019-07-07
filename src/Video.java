import java.util.*;

public class Video {
	
	public Video (String userName, String urlAddress, String title, List <String> myTags) {
		
		this.userName = userName;
		this.urlAddress = urlAddress;
		this.title = title;
		this.myTags = myTags;			
	}
	
	public static Video listVideo(String userName, List <Video> videos) {
		
		int n=0;
		System.out.println(userName + ", you have the following videos:");
		System.out.println("********************************************");
		
		for (Video e:videos) {
			if ((e.userName).equals(userName)) {
				System.out.println("\nVideo: " + e.getTitle());
				System.out.println("    Tags: " + e.myTags);
				n++;
			}
		}
		if (n==0) System.out.println("You still haven't got videos");
		return null;
	}
		
	/*public void deleteVideo(String title, List<Video> videos) {
		
		for (Video e:videos) {
			if((e.getTitle()).equals(title)) {
				videos.remove(e);
				System.out.println("The video " + e.getTitle() + " has been removed");
				return;
			}
		System.out.println("Video not found");	
		}
	}*/

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String userName;
	private String urlAddress;
	private String title;
	private String tag;
	private List <String> myTags;
	
}

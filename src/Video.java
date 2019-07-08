import java.util.*;

public class Video {
	
	public Video (String urlAddress, String title, List <String> myTags) {
		
		this.urlAddress = urlAddress;
		this.title = title;
		this.myTags = myTags;	
		
	}
	

	



	public String getUrlAddress() {
		return urlAddress;
	}
	public void setUrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getMyTags() {
		return myTags;
	}
	public void setMyTags(List<String> myTags) {
		this.myTags = myTags;
	}






	private String urlAddress;
	private String title;
	private List <String> myTags;
	
}

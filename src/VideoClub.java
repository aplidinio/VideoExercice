import java.util.*;

public class VideoClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte select;
		String currentUser = null;
				
		List <User> users = new ArrayList <User>();
		List <Video> videos = new ArrayList <Video>();
	//	List <String> myTags = new ArrayList <String>();
		
		User user1 = new User ("Groucho", "Marx", "RufusTFirefly", "ducksoup", 2019,2,15);
		User user2 = new User ("Sheldon", "Cooper", "ImTheBest", "BigBang", 2014,8,5);
		User user3 = new User ("Hannibal", "Lecter", "Lamb", "Clarisse", 2019,2,15);
		User user4 = new User ("Edward", "Elric", "Hagane", "Imnotsmall", 2019,2,15);

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		Video video1 = new Video ("Lamb", "pepevideos.com?=13", "Braindead", Arrays.asList("gore", "thriller"));
		Video video2 = new Video ("RufusTFirefly", "pepevideos.com?=43", "A night in the Opera", Arrays.asList("comedy"));
		Video video3 = new Video ("RufusTFirefly", "pepevideos.com?=432", "Go West", Arrays.asList("comedy", "western"));
		Video video4 = new Video ("ImTheBest", "pepevideos.com?=88", "Dr. Cooper's Life", Arrays.asList("science"));
		Video video5 = new Video ("Hagane", "pepevideos.com?=188", "FullMetal Alchemist", Arrays.asList("anime", "shounen"));

		videos.add(video1);
		videos.add(video2);
		videos.add(video3);
		videos.add(video4);
		videos.add(video5);
			
		select=VideoTools.introMenu();			
	
		if (select == 1) {
			VideoTools.newUser();
			VideoTools.mainMenu();
		} else {
			currentUser = VideoTools.getUser(users);
		}
		
		do {
			//VideoTools.mainMenu();		
			switch (VideoTools.mainMenu()) {
		
			case 1:
			
				//User.createVideo(currentUser);
				videos.add(User.createVideo(currentUser));
			
				break;
			
			case 2:
			
				Video.listVideo(currentUser, videos);
						
				break;
			
			case 3:
			
				User.deleteVideo(videos);
				break;
			
			default:
				
				System.out.println("Good bye, " + currentUser);
				
			}
					
		} while (VideoTools.turnAgain());
		
		System.out.println("Good bye, " + currentUser);
		
	} 

}

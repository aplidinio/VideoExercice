import java.util.*;

public class VideoClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte select;
		User currentUser = null;
				
		List <User> users = new ArrayList <User>();
	
		Video video1 = new Video ("pepevideos.com?=13", "Braindead", Arrays.asList("gore", "thriller"));
		Video video2 = new Video ("pepevideos.com?=43", "A night in the Opera", Arrays.asList("comedy"));
		Video video3 = new Video ("pepevideos.com?=432", "Go West", Arrays.asList("comedy", "western"));
		Video video4 = new Video ("pepevideos.com?=88", "Dr. Cooper's Life", Arrays.asList("science"));
		Video video5 = new Video ("pepevideos.com?=188", "FullMetal Alchemist", Arrays.asList("anime", "shounen"));
		
		User user1 = new User ("Groucho", "Marx", "RufusTFirefly", "ducksoup", 2019,2,15, Arrays.asList(video2, video3)); //No puedo hacer esto en la clase Video
		User user2 = new User ("Sheldon", "Cooper", "ImTheBest", "BigBang", 2014,8,5, Arrays.asList(video4));
		User user3 = new User ("Hannibal", "Lecter", "Lamb", "Clarisse", 2019,2,15, Arrays.asList(video1));
		User user4 = new User ("Edward", "Elric", "Hagane", "Imnotsmall", 2019,2,15, Arrays.asList(video5));
	
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		

		
		select=VideoTools.introMenu();			
	
		if (select == 1) {
			currentUser = VideoTools.newUser();
			users.add(currentUser);
			//VideoTools.mainMenu();
		} else {
			currentUser = VideoTools.getUser(users); //si null arrojar try catch
		}
		
		do {
			switch (VideoTools.mainMenu()) {
		
			case 1:
			
				///pasar al metodo los datos para crear el video.
				currentUser.addVideo();
			
				break;
			
			case 2:
			
				currentUser.listVideo();
						
				break;
			
			case 3:
			
				currentUser.deleteVideo(currentUser);
				break;
		
			}
					
		} while (VideoTools.turnAgain());
		
		System.out.println("Good bye, " + currentUser.userName);
		
	} 

}

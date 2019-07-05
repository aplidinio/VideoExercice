import java.util.*;

public class VideoClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName=null;
		String lastName=null;
		String userName0=null;
		String userName=null;
		String psswd=null;
		String urlAddress=null;
		String title=null;
		//List <String> myTags=null;
		int year = 0;
		int month = 0;
		int day = 0;
		String select;
		byte select2;
		
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
			

		//User myUser = new User (firstName, lastName, userName, psswd, year, month, day);
		//Video myVideo = new Video (userName, urlAddress, title, myTags);
		VideoTools.introMenu();			
		//Scanner entry =new Scanner(System.in);
		
		/*System.out.println("Video-Club");
		System.out.println("**********");
				
		do {
			
			System.out.println("Please enter option: \n1. New User \n2. User login");
			select = entry.nextLine();
			
			if (!select.equals("1") && !select.equals("2"))
				System.out.println("Illegal option.");
		} while (!select.equals("1") && !select.equals("2"));*/
		/*Scanner entry =new Scanner(System.in);
		if (select.equals("1")) {
						
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
					
			User newUser = new User (firstName, lastName, userName, psswd, year, month, day);
			users.add(newUser);
						
		} else {
			
			User registeredUser = new User (firstName, lastName, userName0, psswd,  year, month, day);
			//userName = registeredUser.getUser(userName0, users);
			
		}
		
		do {
		
			do {
			
				System.out.println("\nPlease try option:");
				System.out.println("******************");
				System.out.println("1. Create new video \n2. List your videos \n3. Delete a video \n4. Log out");
				select = entry.nextLine();
			
				if (!select.equals("1") && !select.equals("2") && !select.equals("3") && !select.equals("4"))
					System.out.println("Illegal option.");
			
			} while (!select.equals("1") && !select.equals("2") && !select.equals("3") && !select.equals("4"));
		 
			select2 = (byte)Integer.parseInt(select);*/
		
			/*switch (select2) {
		 
				case 1:
		 		
					Video createdVideo = createVideo(userName);
					//makeVideo.getVideo(userName, videos);
					videos.add(createdVideo);
			 		
					break;
			
				case 2:
		 		
					Video giveVideo = new Video(userName0, urlAddress, title, myTags);
					giveVideo.getVideo(userName, videos);
		 		
					break;
		 		
				case 3:
		 		
					System.out.println("Introduce video title to remove:");
					String removeVideo = entry.nextLine();
		 		
					Video killVideo = new Video(userName, urlAddress, title, myTags);
					killVideo.deleteVideo(userName, removeVideo, videos);
		 		
					break;
		 		
				default:
	 			
			}*/
			/*System.out.print("\nDo you want to run another option (y/N)?");
			select = entry.nextLine();
			select = select.toUpperCase();
		 
			} while (select.equals("Y"));
		
		System.out.println("\nGood bye, " + userName);*/
		} 

}

import java.util.*;

public class VideoClub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte select;
		User currentUser = null;
		String title = null;;
		String urlAddress = null;;
		String tag;
		boolean voidField;
		ArrayList <String> tags = new ArrayList <String>();
		ArrayList <User> users = new ArrayList <User>();

		//Set videos and users
		ArrayList <String> tag1 = new ArrayList <String>();
		tag1.add("gore");
		tag1.add("dark comedy");
		
		ArrayList <String> tag2 = new ArrayList <String>();
		tag2.add("comedy");
				
		ArrayList <String> tag3 = new ArrayList <String>();
		tag3.add("comedy");
		tag3.add("western");
		
		ArrayList <String> tag4 = new ArrayList <String>();
		tag4.add("science");
		
		ArrayList <String> tag5 = new ArrayList <String>();
		tag5.add("anime");
		tag5.add("shounen");
	
		Video video1 = new Video ("pepevideos.com?=13", "Braindead", tag1);
		Video video2 = new Video ("pepevideos.com?=43", "A night in the Opera", tag2);
		Video video3 = new Video ("pepevideos.com?=432", "Go West", tag3);
		Video video4 = new Video ("pepevideos.com?=88", "Dr. Cooper's Life", tag4);
		Video video5 = new Video ("pepevideos.com?=188", "FullMetal Alchemist", tag5);
		
		
		ArrayList <Video> user1Video = new ArrayList <Video>();
		user1Video.add(video2);
		user1Video.add(video3);

		ArrayList <Video> user2Video = new ArrayList <Video>();
		user2Video.add(video4);
		
		ArrayList <Video> user3Video = new ArrayList <Video>();
		user3Video.add(video1);
		
		ArrayList <Video> user4Video = new ArrayList <Video>();
		user4Video.add(video5);
		
		User user1 = new User ("Groucho", "Marx", "RufusTFirefly", "ducksoup", 2019,2,15, user1Video); //No puedo hacer esto en la clase Video
		User user2 = new User ("Sheldon", "Cooper", "ImTheBest", "BigBang", 2014,8,5, user2Video);
		User user3 = new User ("Hannibal", "Lecter", "Lamb", "Clarisse", 2019,2,15, user3Video);
		User user4 = new User ("Edward", "Elric", "Hagane", "Imnotsmall", 2019,2,15, user4Video);
	
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		//main
		
		select=VideoTools.introMenu();			
	
		if (select == 1) {

			do {
				try {
					voidField = true;
					currentUser = VideoTools.newUser();
				} catch (Exception e) {
					System.out.println("Invalid void field. Try again.");
					voidField = false;
				}
			} while (voidField == false);
			users.add(currentUser);
			
		} else {
			
			do {
				try {
					voidField = true;
					currentUser = VideoTools.getUser(users); 
				} catch (Exception e) {
					System.out.println("Illegal field value. Try again.");
					voidField = false;
				}
			} while (voidField == false);
		}
		Scanner entry = new Scanner(System.in);
	
		do {
			switch (VideoTools.mainMenu()) {
		
			case 1:
				
				do {
					try {
						voidField=false;
						System.out.println("Enter video name: ");
						title = entry.nextLine();
						if (title.isEmpty()) throw new NullPointerException ("Invalid void field");

					} catch (NullPointerException e) {
						voidField=true;
					}

				} while (voidField==true);
				
				do {
					try {
						voidField=false;
						System.out.println("Enter video url: ");
						urlAddress = entry.nextLine();
						if (urlAddress.isEmpty()) throw new NullPointerException ("Invalid void field");

					} catch (NullPointerException e) {
						voidField=true;
					}

				} while (voidField==true);
				
				do {
					System.out.println("Please introduce video tag (type '0' to finish): ");
					
					tag = entry.nextLine();
					if (!tag.equals("0")) tags.add(tag);
					if (tag.isEmpty()) throw new NullPointerException ("Invalid void field");
									
				} while (!tag.equals("0"));
				
				currentUser.addVideo(title, urlAddress, tags);
				break;
			
			case 2:
			
				currentUser.listVideo();
						
				break;
			
			case 3:
				
				do {
					try {
						voidField=false;
						System.out.println("Introduce video title to delete:");
						title = entry.nextLine();
						if (title.isEmpty()) throw new NullPointerException ("Invalid void field");

					} catch (NullPointerException e) {
						voidField=true;
					}

				} while (voidField==true);
		
				currentUser.deleteVideo(title);
				break;
		
			}
					
		} while (VideoTools.turnAgain());
		
		entry.close();
		System.out.println("Good bye, " + currentUser.userName);
		
	} 

}

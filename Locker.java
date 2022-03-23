package companyLockers;

public class Locker {

	/*Enter your desired Directory path */
	public static final String path = "C:\\Users\\sreel\\OneDrive\\Desktop\\LockedMe"; 

	public static void main(String[] args) {
		LockerMenus menu = new LockerMenus();
		menu.introScreen();
		menu.mainMenu();
	}

}
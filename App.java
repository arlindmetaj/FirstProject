import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    private static ArrayList<Citizen> citizens = new ArrayList<Citizen>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int choice;
		
		while (true) {
			printMenu();
			
			System.out.println("\n Zgjidhni veprimin: ");
			choice = input.nextInt();
			
			switch (choice) {
			case 0:
				registerCitizen();
			case 1:
			    editCitizen();
		    case 2:
		        removeCitizen();
	        case 3:
	            searchCitizenByName();
            case 4:
	            searchCitizenBySurname();
            case 5:
	            searchCitizenByPhoneNumber();
            case 6:
	            printCitizens();
            case 7:
	            orderCitizensByName();
            case 8:
	            orderCitizensBySurname();
            case 9:
	            break;
            default:
                System.out.println("Ju zgjodhet nje veprim te gabuar.\n");
			}
		}
	}
	
	public static void printMenu() {
	    System.out.println("\n 0. Rregjistro nje qytetar."
    		+ "\n 1. Modifiko te dhenat e nje qytetari."
    		+ "\n 2. Fshi te dhenat e nje qytetari."
    		+ "\n 3. Kerko sipas emrit."
    		+ "\n 4. Kerko sipas mbiemrit."
    		+ "\n 5. Kerko sipas numrit te telefonit."
    		+ "\n 6. Afisho te dhenat e ruajtura me pare."
    		+ "\n 7. Rradhit qytetaret sipas emrit."
    		+ "\n 8. Radhit qyetaret sipas mbiemrit."
    		+ "\n 9. Dil nga programi.");
	}
	
	public static void registerCitizen() {
		Scanner input = new Scanner (System.in);
	    System.out.println("Ju lutem vendosni ID: ");
		int id = input.nextInt();
		
		System.out.println("Ju lutem vendosni EMRIN: ");
		String name = input.nextLine();
		
		System.out.println("Ju lutem vendosni MBIEMRIN: ");
		String surname = input.nextLine();
		
		System.out.println("Ju lutem vendosni ADRESEN: ");
		String address = input.nextLine();
		
		System.out.println("Ju lutem vendosni NUMRIN E CELULARIT: ");
		int phoneNumber = input.nextInt();
		
		System.out.println("Ju lutem vendosni EMAIL: ");
		String email = input.nextLine();
		
		Citizen citizen = new Citizen(id, name, surname, address, phoneNumber, email);
		
		citizens.add(citizen);
		storeCitizensToDisk();
	}
	
	public static void editCitizen() {
	    // TODO: find citizen by id and edit its data
	    storeCitizensToDisk();
	}
	
	public static void removeCitizen() {
	    // TODO: remove citizen by id
	    storeCitizensToDisk();
	}
	
	public static void searchCitizenByName() {
	    // TODO: search citizen by name
	}
	
	public static void searchCitizenBySurname() {
	    // TODO: search citizen by surname
	}
	
	public static void searchCitizenByPhoneNumber() {
	    // TODO: search citizen by phone number
	}
	
	public static void printCitizens() {
	    // TODO: print citizens
	}
	
	public static void orderCitizensByName() {
	    // TODO: order citizen by name
	    storeCitizensToDisk();
	}
	
	public static void orderCitizensBySurname() {
	    // TODO: order citizen by surname
	    storeCitizensToDisk();
	}
	
	public static void storeCitizensToDisk() {
	    // TODO: save this.citizens to file
	}
}

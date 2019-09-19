import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Vad heter du?");
		String namn = input.nextLine();
		
		System.out.println("Hur gammal är du?");
		String age = input.nextLine();
		
		System.out.println("Vad är din address?");
		String address = input.nextLine();
		
	    System.out.println("Vad är ditt postnummer?");
		String postnr = input.nextLine();
		

		System.out.println("Vad är ditt telefonnummer?");
		String nr = input.nextLine();
		
		System.out.println("information");
		System.out.println("Namn:" + namn );
		System.out.println("Ålder:" + age);
		System.out.println("Address:" + address); 
		System.out.println("Postnummer:" + postnr);
		System.out.println("Nummer:" + nr);
		
		
		
		
		
				
			
	
		
		
	
		
	}
	
}

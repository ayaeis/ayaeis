import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Vad heter du?");
		String namn = input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		String age = input.nextLine();
		
		System.out.println("Vad �r din address?");
		String address = input.nextLine();
		
	    System.out.println("Vad �r ditt postnummer?");
		String postnr = input.nextLine();
		

		System.out.println("Vad �r ditt telefonnummer?");
		String nr = input.nextLine();
		
		System.out.println("information");
		System.out.println("Namn:" + namn );
		System.out.println("�lder:" + age);
		System.out.println("Address:" + address); 
		System.out.println("Postnummer:" + postnr);
		System.out.println("Nummer:" + nr);
		
		
		
		
		
				
			
	
		
		
	
		
	}
	
}

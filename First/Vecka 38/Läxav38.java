import org.omg.CORBA.PRIVATE_MEMBER;

public class Läxav38 {
	
	Scanner input = new Scanner(System.in);
	int highest = 0;
	int lowest = 0;
	double average = 0
		   
			System.out.print("Skriv in tio heltal: ");

	for(int i = 0; i < 10; i++) {

		int tempNumber = input.nextInt();

		if(i == 0) {
			highest = tempNumber;
			lowest = tempNumber;
		}

		else if(tempNumber > highest) {
			highest = tempNumber;
		}

		else if(tempNumber < lowest) {
			lowest = tempNumber;
		}

		average = average + tempNumber;

	}

		   
	
	}

}

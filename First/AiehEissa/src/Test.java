import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String 
		char newchar = input.next().charAt(0);
		boolean isDigit = Character.isDigit(newchar);
		if(isDigit) {
			System.out.println(newchar);
		}
		else {
			System.out.println("n");
		}
	}
}


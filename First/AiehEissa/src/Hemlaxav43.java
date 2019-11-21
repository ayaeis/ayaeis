
public class Hemlaxav43 {

	public static void main(String[] args) {

		System.out.println(volume(2.16));
		System.out.println(reverse("homework"));
		System.out.println(count("homework", 'o'));
		
	}
	public static double volume(double radius) {
		double volume =  4/3 * radius * radius *radius * 3.14;
		return volume;
	}
	public static String reverse(String stringToReverse) {
		String reversedString = "";
		for (int i = stringToReverse.length() - 1; i >= 0; i--) {
			reversedString += stringToReverse.charAt(i); 
		}
		return reversedString;
	}
	public static int count(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				++count;
			}
		}
		return count;
	}
	
}

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args); 
		Scanner input = new Scanner(System.in);

		String[][] Provinces_and_capital = Data();

		int count = 0;					
		for (int i = 0; i < Provinces_and_capital.length; i++) {
			System.out.print("What is the capital of "
				+ Provinces_and_capital[i][0] + "? ");
			String capital = input.nextLine();

			if (Provinces_and_capital[i][1] == capital) {
				System.out.println("Your answer is correct");
				count++;
			}
			else {
			}
		}

		System.out.println("\nYou got " + count+" question(s) right");
	}
	
	public static boolean isEqual(String c, String a) {
		if (c.length() != a.length())
			return false;

		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) != a.charAt(i))
				return false;
		}

		return true;
	}

	public static String[][] Data() {
		String[][] data = {
			{"Alberta", "edmonton"}, {"British Columbia", "vancouver"}, {"Manitoba", "winnipeg"},
			{"New Brunswick", "fredericton"}, {"Newfoundland and Labrador", "st John's"},
			{"Quebec", "montreal"}, {"Saskatchewan", "regina"}
			};
		return data;
	}
	}
}

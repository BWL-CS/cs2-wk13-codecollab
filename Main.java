import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Loop #1 (could we re-write this as a for-loop?)
		System.out.println("〰️〰️〰️LOOP #1〰️〰️〰️");

		boolean hasHomework = true;
		int hwAssignments = 8;

		while (hasHomework) {
			System.out.println("Working working working... 📝");
			hwAssignments--;
			if (hwAssignments == 0) {
				System.out.println("You're done with all your HW and it's only 3am!");
				hasHomework = false;
			}
		}

		// Loop #2 (nested loops)
		System.out.println("〰️〰️〰️LOOP #2〰️〰️〰️");

		for (int row = 3; row <= 9; row++) {
			for (int col = 6; col > 0; col--) {
				System.out.print("🔳");
			}
			System.out.println();
		}

		// Loop #3 (user-controlled loop)
		System.out.println("〰️〰️〰️LOOP #3〰️〰️〰️");

		Scanner input = new Scanner(System.in);
		System.out.println("Say something!");
      
		String response = input.nextLine();
		System.out.println(response + " beep boop 🤖");

		while (!response.equals("Bye")) {
			System.out.println("Say something else!");
			response = input.nextLine();
			System.out.println(response + " beep boop 🤖");
		}

		System.out.println("Goodbye!");
		input.close();
	}
}

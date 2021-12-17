import java.util.InputMismatchException;
import java.util.Scanner;

public class getAccount {
	Scanner menuInput = new Scanner(System.in);

	public void getAccountType(Account acc) {
		OptionMenu optionMenu = new OptionMenu();
		getChecking get_check = new getChecking();
		getSave get_save = new getSave();

		boolean end = false;
		while (!end) {
			try {
				System.out.println("Select any account:");
				System.out.println(" Type 1 - Checkings Account");
				System.out.println(" Type 2 - Savings Account");

				int selection = menuInput.nextInt();

				switch (selection) {
				case 1:
					get_check.getChecking(acc);
					break;
				case 2:
					get_save.getSaving(acc);
					break;
				case 3:
					end = true;
					break;
				default:
					System.out.println("\nInvalid Choice.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nInvalid Choice.");
				menuInput.next();
			}
		}
	}

}

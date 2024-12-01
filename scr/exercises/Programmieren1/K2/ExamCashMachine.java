package exercises.Programmieren1.K2;

import java.util.Scanner;

public class ExamCashMachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Kontonummer: ");
			String kontonummer = scanner.next();

			System.out.print("PIN: ");
			short pin = scanner.nextShort();

			boolean login = checkLoginData(kontonummer, pin);

			if (login) {
				short auswahl;
				do {
					System.out
							.print("Auswahl treffen: \n1-Kontostand anzeigen,\n2-Geld abheben,\n3-Beenden\nEingabe: ");
					auswahl = scanner.nextShort();
					switch (auswahl) {
						case 1:
							showBankBalance();
							break;

						case 2:
							System.out.print("Betrag: ");
							short betrag = scanner.nextShort();
							boolean habensaldo = checkBankBalance(betrag);

							if (habensaldo) {
								payMoney(betrag);
								break;
							} else {
								System.out.println("Kontostand zu niedrig");
								break;
							}

						default:
							break;
					}
				} while (auswahl != 3);

			} else {
				System.out.println("Logindaten ungültig");
			}
		} while (true);

	}

	public static boolean checkLoginData(String kontonummer, short pin) {
		// Dummy implementation for login check
		if (kontonummer.equals("12345") && pin == 1234) {
			return true;
		} else {
			return false;
		}
	}

	public static void showBankBalance() {
		// Dummy implementation for showing bank balance
		System.out.println("Ihr Kontostand beträgt 1000 Euro");
	}

	public static boolean checkBankBalance(short betrag) {
		// Dummy implementation for balance check
		int currentBalance = 1000; // Example balance
		if (currentBalance >= betrag) {
			return true;
		} else {
			return false;
		}
	}

	public static void payMoney(short betrag) {
		// Dummy implementation for paying money
		System.out.println(betrag + " Euro wurden abgehoben");
	}
}
package jana60.persona;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
	    String nome = scan.nextLine();
	    System.out.print("Cognome: ");
	    String cognome = scan.nextLine();
	    System.out.print("Indirizzo: ");
	    String indirizzo = scan.nextLine();

scan.close();
	}
}

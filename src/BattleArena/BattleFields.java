package BattleArena;

import java.util.Scanner;

public class BattleFields {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int AuswahlDesCharakters = 0;
		String name = "";
		
		Character c1 = null;
		Character c2 = null;
		
		for(int i = 1; i < 3; i++) {
			// Loop for choosing characters for both players
			System.out.println("Willkommen in der Kampfarena der 3. HTL!");
			System.out.println("Player " + i +": Bitte wähle einen Charakter!");    System.out.println();
			System.out.println("1 -- Dragon");
			System.out.println("2 -- Dwarf");    									System.out.println();
			boolean wool = true;
			
			// Loop for ensuring valid character selection
			// choosing 1 == dragon || choosing 2 == dwarf
			do {								
				AuswahlDesCharakters = scanner.nextInt();
				if(AuswahlDesCharakters == 1 || AuswahlDesCharakters == 2  ){
					wool = false;
				}
			} 
				while(wool);
			System.out.println("Player " + i +": Bitte gib deinen Namen ein!");
			
		// Loop for ensuring non-empty name input
			do {
				 name = scanner.next();
				} while(name.equals(""));
			
		// Checking if c1 has been initialized, if so, modify character selection for player 2
				if(c1 != null) {
					AuswahlDesCharakters += 10;
				}
		// Creating instances of Character subclasses based on selection
				switch (AuswahlDesCharakters) {			
				case 1: 
					c1 = new Dragon(name);
					break;
					
				case 2:
					 c1 = new Dwarf(name);
					break;
					
				case 11: 
					c2 = new Dragon(name);
					break;
					
				case 12:
					c2 = new Dwarf(name);
					break;
				}
		}
		// Creating BattleArena instance with selected characters and initiating fight
		BattleArena area = new BattleArena(c1, c2);
		area.fight(scanner);
		scanner.close();
	}
}
	

	


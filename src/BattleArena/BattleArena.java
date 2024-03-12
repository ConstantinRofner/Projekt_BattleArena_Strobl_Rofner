package BattleArena;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BattleArena {
	
	private Character c1;
	private Character c2;
	private Character Winner;
	private boolean SelectedCharacter;
	
	// Konstruktor
	public BattleArena(Character c1, Character c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		Winner = null;
		SelectedCharacter = randomCharacter();
	}
	
	//Getter + Setter
	public Character getC1() {
		return c1;
	}
	public void setC1(Character c1) {
		this.c1 = c1;
	}
	public Character getC2() {
		return c2;
	}
	public void setC2(Character c2) {
		this.c2 = c2;
	}
	public Character getWinner() {
		return Winner;
	}
	public void setWinner(Character winner) {
		Winner = winner;
	}
	public boolean isSelectedCharacter() {
		return SelectedCharacter;
	}
	public void setSelectedCharacter(boolean selectedCharacter) {
		SelectedCharacter = selectedCharacter;
	}

	/**
	 * Method to find the character who starts 
	 * @return
	 */
	private boolean randomCharacter() {
		int random = ThreadLocalRandom.current().nextInt(1, 3); // Der Letzte Wert (3) ist exklusive!! d.h. entweder 1 oder 2.
		if (random == 1) {
			return true;
		}else {
		return false;
	}
}
	
	
	/**
	 * Method to find the winner of the fight
	 * @return
	 */
	public Character endOfFightAndGetWinner() {
		if(c1.getHealthPoints() <= 0) {
			return c1;
		}else if(c2.getHealthPoints() <= 0){
			return c2;
		} else 
			return Winner;
	}
	
	/**
	 * method where attacker and victim can fight each other
	 * they are atticking each other til one of the 2 characters win
	 * @param scanner
	 */
	public void fight(Scanner scanner) {
			
			Character attacker;
			Character victim;
			do {
				if (this.SelectedCharacter == true) {
					attacker = c1;
					victim = c2;
				} else {
					attacker = c2;
					victim = c1;
				}
				informationOfFighter();
				activityProgress(attacker, victim, scanner);

				this.setWinner(endOfFightAndGetWinner());
				this.SelectedCharacter = !this.SelectedCharacter;
			} while (this.getWinner() == null);

			System.out.println(" !! DAS SPIEL IST BEENDET !! ");
			System.out.println(" !! DER GEWINNER DER 3. HTL MEISTERSCHAFT IN BATTLEARENA ROYALE IST: " + this.Winner.getClassName() + " " + this.Winner.getName());
	}

	
	/**
	 * method to activate one of three cases in a switch method.
	 * In each round the characters can attack, deactivate their ability or activate their ability.
	 * @param attacker - character initiating the attack
	 * @param victim - character being attacked
	 * @param scanner - object for taking user input
	 */
	public void activityProgress(Character attacker, Character victim, Scanner scanner) {
		System.out.println("Spieler " + attacker.getName() + " wähle deine Aktivität.");
		System.out.println("Aktivität 1 - attackieren");
		System.out.println("Aktivität 2 - Spezialfähigkeit deaktivieren");
		System.out.println("Aktivität 3 - Spezialfähigkeit aktivieren");
		
		int action = scanner.nextInt();
		switch(action) {
			case 1:
				attacker.attack(victim);
				break;
				
			case 2:
					attacker.deactivateSpecialAbility();
				break;
				
			case 3:
					attacker.activateSpecialAbility();
				
				break;
				
			default:	
				System.err.println("Gültige Werte eingeben!");
		}
	}


	/**
	 * information of the fighter are printed 
	 */
	public void informationOfFighter() {
		System.out.println(c1);
		System.out.println(c2);
	}
}


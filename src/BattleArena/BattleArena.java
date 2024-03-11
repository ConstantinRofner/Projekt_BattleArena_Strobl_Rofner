package BattleArena;

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
	 * Method to find the winner of the fight
	 * @return
	 */
	public Character endOfFightAndGetWinner() {
		if(c1.getHealthPoints() == 0) {
			return c1;
		}else if(c2.getHealthPoints() == 0){
			return c2;
		} else {
		return Winner;
		}
	}
}

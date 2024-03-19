package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Character{

	public Dwarf(String name) {
		super(name);
		this.setAttackValue(ThreadLocalRandom.current().nextInt(15, 26));
		this.setHealthPoints(100);
		this.setSpecialAbilityActive(false);
	}
	
	@Override
	public String getClassName() {
		return "Dwarf";
	}
	
	
	/**
	 * Method substracts the attack strength from the enemys hearts
	 */
	public void attack(Character enemy) {
		enemy.setHealthPoints(this.getHealthPoints() - this.getAttackValue());
		this.setAttackValue(ThreadLocalRandom.current().nextInt(15, 26));
		if (this.getSpecialAbilityActive()) {
			this.getSpecialability();
		}
	}	
		
	/**
	 * Method gives a random number if the number is between the border
	 * @return true if it is between, false if it is not between
	 */
	public boolean isSpecialAbilitySuccesfull() {
		int rand = ThreadLocalRandom.current().nextInt(0, 11);
		if(this.getHealthPoints() <= 50 && this.getHealthPoints() > 20) {
			if(rand > 0 && rand < 3) {
				return true;
			}
		}
		else if(this.getHealthPoints() <= 20 && this.getHealthPoints() > 10) {
			if(rand > 0 && rand < 5) {
				return true;
			}
		}
		else if(this.getHealthPoints() <= 10) {
			if(rand > 0 && rand < 7) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * method to activate the specialability if healthpoints lower than 50
	 * @return
	 */
	public boolean activateSpecialAbility() {
		if(this.getHealthPoints() < 50) {
			this.setSpecialAbilityActive(true);
			return true;
		}else {
			System.err.println("A dwarf only could use his specialability, if he has lower healthpoints than 50!!");
			return false;
		}
	}
	
	/**
	 * Method deactivates special Ability
	 */
	public boolean deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		this.setAttackValue(ThreadLocalRandom.current().nextInt(15, 26));
		return true;
	}
	
	/**
	 * toString -- for the console of the game
	 */
	@Override
	public String toString() {
		return "Name des Zwergs: " + this.getName() + "\n " + "Schaden der Attacke: " + this.getAttackValue() + "\n " 
			+ "Anzahl der Leben: "+ this.getHealthPoints() + "\n " 
			+ "Aktivitätsstatus der Spezialfähigkeit: " + getSpecialAbilityActive() + "\n " 
			+ "Name der Klasse: " + getClass() + "\n ";
	}
}
	
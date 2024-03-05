package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Character{

	public Dwarf(String name) {
		super(name);
		this.setAttackValue(ThreadLocalRandom.current().nextInt(15, 26));
		this.setHealthPoints(100);
		this.setSpecialAbilityActive(false);
	}

	/**
	 * Method substract the points of the damage of your hearts
	 */
	public void getDamage(int points) {
		this.setHealthPoints(this.getHealthPoints() - points);
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
	
	@Override
	public String toString() {
		return "Gnome [getName()=" + getName() + ", getAttackStrength()=" + getAttackValue() + ", getHearts()="
				+ getHealthPoints() + ", isSpecialAbilityActive()=" + getSpecialAbilityActive() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
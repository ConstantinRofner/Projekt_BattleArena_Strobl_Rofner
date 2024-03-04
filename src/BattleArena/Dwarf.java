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
	public String toString() {
		return "Gnome [getName()=" + getName() + ", getAttackStrength()=" + getAttackValue() + ", getHearts()="
				+ getHealthPoints() + ", isSpecialAbilityActive()=" + getSpecialAbilityActive() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
	 * Method deactivates special Ability
	 */
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		this.setAttackValue(ThreadLocalRandom.current().nextInt(15, 26));
	}
}
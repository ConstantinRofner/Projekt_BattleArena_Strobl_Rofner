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
		
	}
}
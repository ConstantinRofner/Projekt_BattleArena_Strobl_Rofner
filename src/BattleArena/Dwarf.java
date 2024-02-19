package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Character{
	
	public Dwarf(String name) {
		super(name);
	}
	
	private boolean specialAbilityActive() {
		if(this.getHealthPoints() > 50) {
			this.setSpecialAbilityActive(true);
		}
		return true;
	}
	
	private int attackValue = ThreadLocalRandom.current().nextInt(15, 25+1);
	
	public  int positiveAttackWithAbility(int attackValue) {
		if(this.specialAbilityActive() == true &&  )
	}
}
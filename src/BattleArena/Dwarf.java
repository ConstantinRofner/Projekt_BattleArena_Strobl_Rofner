package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Character{


	public Dwarf(String name) {
		this.setName(name);
		this.setAttackValue(ThreadLocalRandom.current().nextInt(15, 26));
		this.setHealthPoints(100);
		this.setSpecialAbilityActive(false);
	}
}
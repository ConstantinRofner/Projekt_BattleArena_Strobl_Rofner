package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character {

	    public Dragon(String name) {
	        super(name);
	    }

	    /**
	     * method to calculate the attack number for the dragon..
	     * he also can attack.
	     */
	    @Override
	    public void attack(Character enemy) {
	        int angriffswert = ThreadLocalRandom.current().nextInt(20, 24+1);

	        if (getSpecialAbilityActive()) {
	            angriffswert -= (int) (Math.random() * 11);
	        }

	        enemy.getDamage(angriffswert);
	    }

	    @Override
	    public void getDamage(int healthPoints) {
	    	
	    }

	    	/**
	     	* method to activate the SpecialAbility and give 10 bonus health to the dragon
	     	*/
		public boolean activateSpecialAbility() {
				this.setSpecialAbilityActive(true);
				this.setBonusHealth(getBonusHealth()+10);
				return true;
}

			/**
			 * method to deactivate SpecialAbilitry and remove 10 bonus health from the dragon
			 */
		public boolean deactivateSpecialAbility() {
			this.setSpecialAbilityActive(false);
			if(!((this.getBonusHealth() - 10) >= 0)) {
			this.setBonusHealth(getBonusHealth()-10);
		}else {
			this.setBonusHealth(0);
			}
			return true;
		}

			@Override
			public String getClassName() {
				return null;
			}



}

 

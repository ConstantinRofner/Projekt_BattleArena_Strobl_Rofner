package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character {
	
	    private int bonushealth;

	    public Dragon(String name) {
	        super(name);
	        this.bonushealth = 10;
	    }

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
	    
	    public int getBonushealth() {
	    	return bonushealth;
	    }

	    public void setBonushealth(int bonushealth) {
	    	this.bonushealth = bonushealth;
	    }

	    	/**
	     	* Method set ability to true and give 10 bonus health points
	     	*/
		public boolean activateAbility() {
				this.setSpecialAbilityActive(true);
				this.setBonushealth(getBonushealth()+10);
				return true;
}

			/**
			 * Method set ability to false and removed 10 bonus health points
			 */
		public boolean deactivateAbility() {
			this.setSpecialAbilityActive(false);
			if(!((this.getBonushealth() - 10) >= 0)) {
			this.setBonushealth(getBonushealth()-10);
		}else {
			this.setBonushealth(0);
			}
			return true;
		}



}

 

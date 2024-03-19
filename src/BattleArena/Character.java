package BattleArena;

public abstract class Character {

    private String name;
    private int healthPoints;
    private boolean specialAbilityActive;
    private int attackValue;
    private int bonusHealth;
	private String specialAbility;

    public Character(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.specialAbilityActive = false;
    }
    
    public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}

	public String getSpecialability() {
		return specialAbility;
	}

	public void setSpecialability(String specialability) {
		this.specialAbility = specialability;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public boolean getSpecialAbilityActive() {
        return specialAbilityActive;
    }

    public void setSpecialAbilityActive(boolean aktiv) {
        this.specialAbilityActive = aktiv;
    }
    
    public int getBonusHealth() {
		return bonusHealth;
	}

	public void setBonusHealth(int bonusHealth) {
		this.bonusHealth = bonusHealth;
	}

	public String getSpecialAbility() {
		return specialAbility;
	}

	public void setSpecialAbility(String specialAbility) {
		this.specialAbility = specialAbility;
	}


	/**
	 * Method substract the points of the damage of your hearts
	 */
		public void getDamage(int points) {
			if(this.bonusHealth > 0) {
				if(!((this.bonusHealth - points) <= 0)) {
					this.bonusHealth -= points;
					points = 0;
			}else {
					points -= this.bonusHealth;
					this.bonusHealth = 0;
			}
		}
			if(!((this.healthPoints - points) < 0)) {
				this.healthPoints -= points;
			}else{
				this.healthPoints = 0;
			}
	}
	
    
    /**
     * method to attack a other character
     * @param enemy
     */
    public abstract void attack(Character enemy);
    
    public abstract boolean activateSpecialAbility();
    public abstract boolean deactivateSpecialAbility();
    public abstract String getClassName();
    
    
    
}

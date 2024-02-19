package BattleArena;
public abstract class Character {

    private String name;
    private int healthPoints;
    private boolean specialAbilityActive;
    private int attackValue;
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

    /**
     * method to calculate the damage
     * @param points
     */
    public void getDamage(int points) {
    	this.healthPoints -= points;
    }

    /**
     * method to attack a other character
     * @param enemy
     */
    public void attack(Character enemy) {
        // Implementierung des Angriffs
    }

}

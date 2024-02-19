package BattleArena;
public abstract class Character {

    private String name;
    private int healthPoints = 100;
    private boolean specialAbilityActive = false;
    private int attackValue;
    private String specialability;

    public Character(String name) {
        this.name = name;
    }
    
    public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}

	public String getSpecialability() {
		return specialability;
	}

	public void setSpecialability(String specialability) {
		this.specialability = specialability;
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
    	healthPoints -= points;
    }

    /**
     * method to attack a other character
     * @param enemy
     */
    public void attack(Character enemy) {
        // Implementierung des Angriffs
    }

}

public abstract class Character {

    private String name;
    private int healthPoints = 100;
    private boolean specialAbilityActive = false;

    public Character(String name) {
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

    public void getDamage(int points) {
    	healthPoints -= points;
    }

    public void attack(Character enemy) {
        // Implementierung des Angriffs
    }

}

package BattleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Character {
	
	    private int feuerschaden;

	    public Dragon(String name) {
	        super(name);
	        this.feuerschaden = 10;
	    }

	    @Override
	    public void attack(Character enemy) {
	        int angriffswert = ThreadLocalRandom.current().nextInt(20, 24+1);

	        if (getSpecialAbilityActive()) {
	            angriffswert -= (int) (Math.random() * 11);
	            int healthPoints = 10;
	        }

	        enemy.getDamage(angriffswert + feuerschaden);
	    }

	    @Override
	    public void getDamage(int healthPoints) {
	    	if()
	    }
	   
	    public void fliegen() {
	        setSpecialAbilityActive(true);
	    }

	    public void landen() {
	        setSpecialAbilityActive(false);
	    }

	    public int getFeuerschaden() {
	        return feuerschaden;
	    }

	    public void setFeuerschaden(int feuerschaden) {
	        this.feuerschaden = feuerschaden;
	    }


	}

 

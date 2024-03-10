package BattleArena;

public class BattleArena {
	
	private Character c1;
	private Character c2;
	private Character Winner;
	private boolean SelectedCharacter;
	
	public BattleArena(Character c1, Character c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		Winner = null;
		SelectedCharacter = randomCharacter();
	}
}
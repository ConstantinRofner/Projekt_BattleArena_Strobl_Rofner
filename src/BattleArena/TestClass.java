package BattleArena;

import java.awt.geom.Area;

public class TestClass {

	public static void main(String[] args) {
		
		Dragon d1 = new Dragon("Honig Zahn");
		Dwarf z1 = new Dwarf("Erwin");
		
		Arena Arena = new Arena(d1, z1);
	}
}
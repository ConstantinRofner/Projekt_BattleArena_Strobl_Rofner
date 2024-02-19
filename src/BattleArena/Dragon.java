package BattleArena;
public class Dragon extends Character {

    private int flugkraft;

    public Dragon(String name, int flugkraft, int feuerkraft) {
        super(name, 20 + (int) (Math.random() * 10));
        this.flugkraft = flugkraft;
    }

 

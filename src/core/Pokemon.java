package core;

/**
 * Hardcoded pokemon.
 */
public enum Pokemon
{
    VIKRANT (0, 100, 100, 100, 100, 100, 100, Type.WATER, null),
    BULBASAUR (1, 45, 49, 49, 65, 65, 45, Type.GRASS, Type.POISON),
    IVYSAUR (2, 60, 62, 63, 80, 80, 60, Type.GRASS, Type.POISON),
    VENUSAUR (3, 80, 82, 83, 100, 100, 80, Type.GRASS, Type.POISON),
    CHARMANDER (4, 39, 52, 43, 60, 50, 65, Type.FIRE, null),
    CHARMELEON (5, 58, 64, 58, 80, 65, 80, Type.FIRE, null),
    CHARLIZARD (6, 78, 84, 78, 109, 85, 100, Type.FIRE, Type.FLYING),
    SQUIRTLE (7, 44, 48, 65, 50, 64, 43, Type.WATER, null),
    WARTORTLE (8, 59, 63, 80, 65, 80, 58, Type.WATER, null),
    BLASTOISE (9, 79, 83, 100, 85, 105, 78, Type.WATER, null),
    ;
    
    /**
     * Nickname of pokemon. If null, prints actual name.
     */
    public String nickname = null;
    /**
     * Index in pokedex.
     */
    private int index = 0;
    /**
     * Stats of Pokemon.
     */
    private int HP, attack, defence, sattack, sdefence, speed;
    /**
     * Gender of pokemon.
     */
    private String gender = null;
    /**
     * Typing of pokemon. Allows 2 types ONLY.
     */
    private Type type [] = new Type [2];
    
    /**
     * Sets values automagically.
     */
    Pokemon (int index, int HP, int attack, int defence, int sattack, int sdefence, int speed, Type type0, Type type1) {
        
        this.index = index;
        this.HP = HP;
        this.attack = attack;
        this.defence = defence;
        this.sattack = attack;
        this.sdefence = sdefence;
        this.speed = speed;
        type [0] = type0;
        type [1] = type1;
        
    }
    
    /**
     * Returns HP of pokemon.
     */
    public int getHP () {
        return HP;
    }
    /**
     * Returns Attack of pokemon.
     */
    public int getAttack () {
        return attack;
    }
    /**
     * Returns Defence of pokemon.
     */
    public int getDefence () {
        return defence;
    }
    /**
     * Returns Special attack of pokemon.
     */
    public int getSattack () {
        return sattack;
    }
    /**
     * Returns Special defence of pokemon.
     */
    public int getSdefence () {
        return sdefence;
    }
    /**
     * Returns speed of pokemon.
     */
    public int getSpeed () {
        return speed;
    }

}

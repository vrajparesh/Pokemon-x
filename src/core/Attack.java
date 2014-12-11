package core;

public enum Attack {
    
    FLAMETHROWER (90, Type.FIRE),
    FIREFANG (65, Type.FIRE),
    FIREBLAST (110, Type.FIRE),
    SLASH (70, Type.NORMAL),
    WATERPULSE (60, Type.WATER),
    HYDROPUMP (110, Type.WATER),
    WITHDRAW (0, Type.WATER),
    SURF (90, Type.WATER),
    SEEDBOMB (80, Type.GRASS),
    DOUBLE_EDGE (120, Type.NORMAL),
    SYNTHESIS (0, Type.GRASS),
    MAGIC_LEAF (70, Type.GRASS),
    THUNDER (110, Type.ELECTRIC),
    THUNDERBOLT (90, Type.ELECTRIC),
    SLAM (80, Type.NORMAL),
    THUNDERWAVE (25, Type.ELECTRIC);
    
    private int base;
    private Type type;
    private String name;
    
    public double modifier (Type defender_typeP, Type defender_typeS) {
        
        double modifier = 1.0D;
        
        modifier *= defender_typeP.modifier ("" + type);
        modifier *= defender_typeS.modifier ("" + type);
        
        return modifier;
        
    }
    
    public int getStatChange () {
        return 0;
    }
    
    public Status getStatusChange () {
        return Status.UNKNOWN;
    }
    
    Attack (int base, Type type) {
        this.base = base;
        this.type = type;
    }
    
    public int getDamage (int attacker_level, int attacker_attack, int defender_defence, Type defender_typeP, Type defender_typeS) {
        
        double temp = ( (((2 * attacker_level) + 10)/250) * attacker_attack / defender_defence * base + 2 );
        
        temp *= modifier (defender_typeP, defender_typeS);
        
        return (int) temp;
        
    }
    
}
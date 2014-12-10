package core;

public enum Attack {
    
    FLAMETHROWER (90) {
        int x = 0;
    },
    FIREFANG (65),
    FIREBLAST (110),
    SLASH (70),
    WATERPULSE (60),
    HYDROPUMP (110),
    WITHDRAW (0),
    SURF (90),
    SEEDBOMB (80),
    DOUBLE_EDGE (120),
    SYNTHESIS (0),
    MAGIC_LEAF (70),
    THUNDER (110),
    THUNDERBOLT (90),
    SLAM (80),
    THUNDERWAVE (25);
    
    private int dmg;
    private Type type;
    
    Attack (int dmg, Type type) {
        this.dmg = dmg;
        this.type = type;
    }
    
    Attack (int dmg) {
        this.dmg = dmg;
    }
    
}
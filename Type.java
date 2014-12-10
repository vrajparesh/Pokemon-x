public enum Type {
    
    NORMAL (1),
    FIGHTING (2),
    FLYING (3),
    POISON (4),
    GROUND (5),
    ROCK (6),
    BUG (7),
    GHOST (8),
    STEEL (9),
    FIRE (10),
    WATER (11),
    GRASS (12),
    ELECTRIC (13),
    PHYSIC (14),
    ICE (15),
    DRAGON (16),
    DARK (17),
    FAIRY (18);
    
    private int index = 0;
    
    Type (int index) {
        
        this.index = index;
        
    }
    
}
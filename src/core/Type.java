package core;

import java.util.Arrays;

/**
 * Enum of hardcoded types.
 */

public enum Type {
    
    /*
     * WEAK means weak ATTACK against what type.
     * 
     * SOURCE: http://24.media.tumblr.com/6d5c20c9c5af43c8f34d6b19a4803be2/tumblr_msynp26edN1r8sc3ro1_500.jpg
     */
    
    /**
     * All the damn types with indexes, strengths, weakness, and no effects.
     */
    UNKNOWN (0, null, null, null),
    NORMAL (1, new String [] {"ROCK", "STEEL"}, new String [] {}, new String [] {"GHOST"}),
    FIGHTING (2, new String [] {"POISON", "FLYING", "PHYSIC", "BUG", "FAIRY"}, new String [] {"NORMAL", "ICE", "ROCK", "DARK", "STEEL"}, new String [] {"GHOST"}),
    FLYING (3, new String [] {"ROCK", "ELECTRIC", "STEEL"}, new String [] {"GRASS", "FIGHTING", "BUG"}, new String [] {}),
    POISON (4, new String [] {"POSION", "GROUND", "ROCK", "GHOST"}, new String [] {"GRASS", "FAIRY"}, new String [] {"STEEL"}),
    GROUND (5, new String [] {"GRASS", "BUG"}, new String [] {"FIRE", "ELECTRIC", "POSION", "ROCK", "STEEL"}, new String [] {"FLYING"}),
    ROCK (6, new String [] {"FIGHTING", "GROUND", "STEEL"}, new String [] {"FIRE", "ICE", "FLYING", "BUG"}, new String [] {}),
    BUG (7, new String [] {"FIRE", "FIGHTING", "POISON", "FLYING", "GHOST", "STEEL", "FAIRY"}, new String [] {"GRASS", "PHYSIC", "DARK"}, new String [] {}),
    GHOST (8, new String [] {"DARK"}, new String [] {"PHYSIC", "GHOST"}, new String [] {"NORMAL"}),
    STEEL (9, new String [] {"FIRE", "WATER", "ELECTRIC", "STEEL"}, new String [] {"ICE", "ROCK", "FAIRY"}, new String [] {}),
    FIRE (10, new String [] {"FIRE", "WATER", "ROCK", "DRAGON"}, new String [] {"GRASS", "ICE", "GUB", "STEEL"}, new String [] {}),
    WATER (11, new String [] {"WATER", "GRASS", "DRAGON"}, new String [] {"FIRE", "GROUND", "ROCK"}, new String [] {}),
    GRASS (12, new String [] {"FIRE", "GRASS", "POISON", "FLYING", "BUG", "DRAGON", "STEEL"}, new String [] {"WATER", "GROUND", "ROCK"}, new String [] {}),
    ELECTRIC (13, new String [] {"ELECTRIC", "GRASS", "DRAGON"}, new String [] {"WATER", "FLYING"}, new String [] {"GROUND"}),
    PHYSIC (14, new String [] {"PHYSIC", "STEEL"}, new String [] {"FIGHTING", "POISON"}, new String [] {"DARK"}),
    ICE (15, new String [] {"FIRE", "WATER", "ICE", "STEEL"}, new String [] {"GRASS", "GROUND", "FLYING", "DRAGON"}, new String [] {}),
    DRAGON (16, new String [] {"STEEL"}, new String [] {"DRAGON"}, new String [] {"FAIRY"}),
    DARK (17, new String [] {"FIGHTING", "DARK", "FAIRY"}, new String [] {"PHYSIC", "GHOST"}, new String [] {}),
    FAIRY (18, new String [] {"FIRE", "POISON", "STEEL"}, new String [] {"FIGHTING", "DRAGON", "DARK"}, new String [] {});
    
    /**
     * Names of all types.
     */
    String [] names = {"UNKNOWN", "NORMAL", "FIGHTING", "FLYING", "POISON", "GROUND", "ROCK", "BUG", "GHOST", "STEEL", "FIRE", "WATER", "GRASS", "ELECTRIC", "PHYSIC", "ICE", "DRAGON", "DARK", "FAIRY"};
    
    /**
     * Index of type.
     */
    private int index = 0;
    /**
     * Weak against.
     */
    private String [] weak = null;
    /**
     * Strong against.
     */
    private String [] strong = null;
    /**
     * It does not affect Pikachu!
     */
    private String [] noeffect = null;
    
    Type (int index, String [] weak, String [] strong, String [] noeffect) {
        
        this.index = index;
        this.weak = weak;
        this.strong = strong;
        this.noeffect = noeffect;
        
    }
    
    /**
     * Returns index of Pokemon, if you want it.
     */
    public int getIndex () {
        return index;
    }
    
    public double multiplier (String attack) {
        
        double multiplier = 1.0D;
        
        /*
         * Checks for weakness.
         */
        for (int i = 0; i < weak.length; i++) {
            
            if (Arrays.asList (weak).contains (attack)) {
                multiplier /= 2;
                break;
            }
            
        }
        
        /*
         * Checks for strength.
         */
        for (int j = 0; j < strong.length; j++) {
            
            if (Arrays.asList (strong).contains (attack)) {
                multiplier *= 2;
                break;
            }
            
        }
        
        /*
         * Checks for immunity.
         */
        for (int k = 0; k < weak.length; k++) {
            
            if (Arrays.asList (noeffect).contains (attack)) {
                multiplier = 0;
                break;
            }
            
        }
        
        return multiplier;
        
    }
    
}
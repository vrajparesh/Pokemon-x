import core.*;

/**
 * Set of tests.
 */
public class test {

    /**
     * Tests Pokemon enum.
     */
    public static void test1 () {

        for (Pokemon p : Pokemon.values ()) {
            System.out.println ("\nPokemon → " + p);
            System.out.println ("\tHP → " + p.getHP ());
            System.out.println ("\tAttack → " + p.getAttack ());
            System.out.println ("\tDefence → " + p.getDefence ());
            System.out.println ("\tSpecial Attack → " + p.getSattack ());
            System.out.println ("\tSpecial Defence → " + p.getSdefence ());
            System.out.println ("\tSpeed → " + p.getSpeed ());
        }

    }
    
    /**
     * Tests Type enum's multiplier.
     */
    public static void test2 () {
    
        Type t = Type.FLYING;
        
        System.out.println ("Weakness >> " + t.modifier ("" + Type.ELECTRIC));
    
    }
    
    /**
     * Tests Attack enum's getDamage.
     */
    public static void test3 () throws Exception {
        
        Pokemon [] p = {Pokemon.BLASTOISE, Pokemon.VENUSAUR};
        Attack a = Attack.SURF;
        
        log (p[0] + " used " + a + "!");
        
        Thread.sleep (3000);
        
        if (a.modifier (p[1].getTypeP (), p[1].getTypeS ()) < 1.0D) {
            log ("It's not very effective...");
        } else if (a.modifier (p[1].getTypeP (), p[1].getTypeS ()) > 1.0D) {
            log ("It's super effective!");
        } if (a.modifier (p[1].getTypeP (), p[1].getTypeS ()) ==  0.0D) {
            log ("It doesn't affect " + p[1] + "!");
        }
        
        Thread.sleep (3000);
        
        log (p [1] + " took " + a.getDamage (50, p[0].getSattack (), p[1].getSdefence (), p[1].getTypeP (), p[1].getTypeS ()) + " damage!");
        
    }
    
    public static void log (String text) {
        System.out.println (">> " + text);
    }

}
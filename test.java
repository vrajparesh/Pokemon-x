public class test {

    public static void main () {

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

}
import java.io.*;
import java.util.*;
 
class Selection
{
    static Scanner choose= new Scanner(System.in);
    static int a,b,c,d,e,f,g,h,i,j,k,l;
    
    public static void main()
    {
      Display();
      choose();
      Selection.main();
    }
    
    public static void Display()
    {
        System.out.println("W-E-L-C-O-M-E T-O T-H-E B-A-T-T-L-E A-R-E-N-A !");
        System.out.println("Choose your Pokemon");
        System.out.println("1.Charmander");//Fire
        System.out.println("2.Squirtle");//Water
        System.out.println("3.Bulbasaur");//Grass
        System.out.println("4.Pikachu");//Electric
        System.out.println("5.Eevee");//Normal
        System.out.println("6.Machop");//Fighting
        System.out.println("7.Caterpie");//Bug
        System.out.println("8.Dratini");//Dragon
        System.out.println("9.Abra");//Psychic
        System.out.println("10.Geodude");//Rock
        System.out.println("11.Ekans");//Poison
        System.out.println("12.Pidgey");//Flying
        System.out.println("13.Cubchoo");//Ice
        System.out.println("14.Beldum");//Steel
        System.out.println("15.Duskull");//Dark
        System.out.println("16.Gastly");//Ghost
        System.out.println("17.Diglett");//Ground
    }

    public static void choose()
    {
        a=choose.nextInt();
    }
    
}

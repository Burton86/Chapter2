import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args){
        int cats = 5;
        int catsEntered;
        int pot;

        System.out.println("Number of cats =" + cats);

        pot = cats;

        System.out.println("Number of cats in the pot = " + pot);
        System.out.println("How many more cats do you want to add to the pot? >>>");
        Scanner inputDevice = new Scanner(System.in);
        catsEntered = inputDevice.nextInt();

        pot = cats + catsEntered;
        System.out.println("There are now " + pot + " cats in the pot.");

        pot = pot/2;
        System.out.println("Due to over population and diseases you killed half of the cats\n" +
                "There are now only " + pot + " cats left in the pot! ");
    }
}

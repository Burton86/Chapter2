import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        String color;
        String WordEst;
        String bodyPart;
        String animal;

        int a = 0;
        int b = 0;
        int c = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color >>>");
        color = input.nextLine();

        System.out.print("Enter a word ending in EST >>>");
        WordEst = input.nextLine();

        System.out.print("Enter a body part >>>");
        bodyPart = input.nextLine();

        System.out.print("Enter a animal >>>");
        animal = input.nextLine();

       // c = a%b;

        System.out.println("The " + color + " Dragon is the " + WordEst + " Dragon of all. +" +
                " it also likes to eat " + animal + " and their" + bodyPart);

    }
}

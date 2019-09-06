import javax.swing.*;
import java.awt.*;

public class PosterFactory {

    public static void main(String[] args) {

        int postersBought;
        int boxesFilled;
        int postersLeftOver;
        final int BOX_LIMIT = 11;
        String postersBoughtString;

        postersBoughtString = JOptionPane.showInputDialog(null, "How many posters ordered today?",
                "Order Dialog" ,JOptionPane.INFORMATION_MESSAGE);
        postersBought = Integer.parseInt(postersBoughtString);

        boxesFilled = postersBought/BOX_LIMIT;
        postersLeftOver = postersBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "The number of boxes filled were " +
                boxesFilled + " with " + postersLeftOver + " posters left over");


    }
}

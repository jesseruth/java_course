package uw.cp510.assignments.assignment5;

import javax.swing.*;
import java.awt.*;

/**
 * This class contains one method, askInt.
 * @author Jesse Ruth
 */
public class Utils {
    private Utils() {}

    /**
     * This method uses JOptionPane.showInputDialog to ask the operator to enter an
     * integer between min and max and displays in the dialog must be "Enter an integer
     * between min and max".
     * If the operator cancels the operation this will throw an OpCanceledException.
     * It converts operator's input to an int, verifies that it is between min and max and
     * If the operator's input is invalid uses a JOptionPane.showMessageDialog to display
     * an error message with the operator's input in quotes.
     *
     * @param min Minimum value
     * @param max Maximum value
     * @return An integer value between the min and max.
     * @throws OpCanceledException
     */
    public static int askInt(int min, int max) throws OpCanceledException {
        configureUIForHighDPI();
        String message = new StringBuilder()
                .append("Enter and integer between ")
                .append(min)
                .append(" and ")
                .append(max).toString();
        Integer i = null;
        String input = null;

        while (i == null) {
            try {
                input = JOptionPane.showInputDialog(message);
                if (input == null) {
                    throw new OpCanceledException();
                }
                i = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + input);
            }

            if (i == null || i < min || i > max) {
                i = null;
                String errorMessage = "\"" + input + "\" is not valid";
                JOptionPane.showMessageDialog(null, errorMessage);
            }
        }
        return i;
    }

    private static void configureUIForHighDPI() {
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 48));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 48));
        UIManager.put("OptionPane.minimumSize", new Dimension(800, 600));
        UIManager.put("TextField.font", new Font("Arial", Font.BOLD, 48));
    }
}

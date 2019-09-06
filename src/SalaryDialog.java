import javax.swing.*;

public class SalaryDialog {

    public static void main(String[] args){

        String wageString;
        String dependentString;
        int dependents;
        double wage;
        double weeklyPay;
        final double HOURS_IN_WEEK = 37.5;
        boolean isYes;
        int selection;

        wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage",
                "Salary Dialog 1" , JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependentString = JOptionPane.showInputDialog(null, "How many dependants?",
                "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentString);

        JOptionPane.showMessageDialog(null, "Weekly Salary is $ " +
                  weeklyPay + "\n Deductions will be made for " + dependents + " dependents");

        selection= JOptionPane.showConfirmDialog(null, "Is your sa;ary correct?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "You responded " + isYes);
    }
}

import java.util.Scanner;
import javax.swing.*;

public class ValidationTester {
    public static void main(String[] args) {

        String yes= "Succeeded", no = "Failed", statusList="";


        if(positiveIntegerTest()) {
            statusList += "\nPositive int test : " + yes;
        }
        else
            statusList += "\nPositive int test : " + no;

        if(negativeIntegerTest()) {
            statusList += "\nNegative int test : " + yes;
        }
        else
            statusList += "\nNegative int test : " + no;

        if(positiveOrNegativeIntTest())
            statusList += "\nPositive or Negative int Test : " + yes;
        else
            statusList += "\nPositive or negative int test : " + no;

        if(positiveFloatTest())
            statusList += "\nPositive float test : " + yes;

        else
            statusList += "\nPositive float test : " + no;

        if(negativeFloatTest())
            statusList += "\nNegative float test : " + yes;
        else
            statusList += "\nNegative float test : " + no;

        if(isPositiveOrNegativeFloatTest())
            statusList += "\nPositive or Negative float Test : " + yes;
        else
            statusList += "\nPositive or Negative Float test : " + no;


        JOptionPane.showMessageDialog(null, statusList);

        System.exit(0);
    }

     public static boolean positiveIntegerTest() {
        String user = JOptionPane.showInputDialog("Please enter a positive int");

        if(validationClass.isPositiveInteger(user))
            return true;
        else
            return false;
    }

    public static boolean negativeIntegerTest() {
        String user = JOptionPane.showInputDialog("Please enter a negative int");

        if(validationClass.isNegativeInteger(user))
            return true;
        else
            return false;
    }

    public static boolean positiveOrNegativeIntTest() {
        String user = JOptionPane.showInputDialog("Please enter a positive or negative integer");

        if(validationClass.isPositiveOrNegativeInteger(user))
            return true;
        else
            return false;
    }
    public static boolean positiveFloatTest() {
        String user = JOptionPane.showInputDialog("Please enter a positive float");

        if(validationClass.isPositiveFloat(user))
            return true;
        else
            return false;
    }
    public static  boolean negativeFloatTest() {
        String user = JOptionPane.showInputDialog("Please enter a negative float");

        if(validationClass.isNegativeFloat(user))
            return true;
        else
            return false;
    }
    public static boolean isPositiveOrNegativeFloatTest() {
        String user = JOptionPane.showInputDialog("Please enter a positive or negative float");

        if(validationClass.isPositiveOrNegativeFloat(user))
            return true;
        else
            return false;
    }
}

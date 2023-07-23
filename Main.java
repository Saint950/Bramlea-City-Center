import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String userName = "";

        int result = JOptionPane.showConfirmDialog(null,"Welcome To Inch Guessing Game. Do you wish to continue?",
                "INCH",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (result == 1) {
            JOptionPane.showConfirmDialog(null,"Are You Sure?",
                    "QUIT INCH GUESSING GAME",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (userName.isBlank()){
                userName = JOptionPane.showInputDialog(null, "Enter Your User Name: ");
            }

            JOptionPane.showMessageDialog(null, "Hello "+userName+", Welcome to the INCH Family");
        }

    }
}

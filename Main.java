
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File mySound = new File("I Had a Feeling.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(mySound);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);


        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");
            response = scanner.next();

            response = response.toUpperCase();

            switch (response) {
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default: System.out.println("Not a valid response");
            }

        }





        /*File file = new File("secret");

        if (file.exists()){
            System.out.println("Exists Bro");
        } else {
            System.out.println("doesn't exist");
        }


        String accessCode = "password";

        JOptionPane.showMessageDialog(null, "Welcome to Bramlea City Center");
        String chosenStore = JOptionPane.showInputDialog("Choose the Store you would like to Access \n  1  Winners \n  2  Old Navy");

        if (chosenStore.equalsIgnoreCase("Old Navy")){
            JOptionPane.showMessageDialog(null, "Information on this store is not avaliable");
            System.exit(0);
        }

        String decide = JOptionPane.showInputDialog("What would you like to do\n  1  Add Product\n  2  Browse Products");

        if (decide.equalsIgnoreCase("Add product")) {
            String password = JOptionPane.showInputDialog("Enter Access Code");
            if (!password.equalsIgnoreCase(accessCode)) {
                JOptionPane.showMessageDialog(null, "Incorrect password");
                System.exit(0);
            } else {

                for (int i = 0; i < 20; i++) {

                    String product = JOptionPane.showInputDialog("Enter product type: ");
                    String name = JOptionPane.showInputDialog("Enter " + product + " name: ");
                    String designer = JOptionPane.showInputDialog("Enter " + product + " Designer");
                    String size = JOptionPane.showInputDialog("Enter " + product + " Size");
                    int price = Integer.parseInt(JOptionPane.showInputDialog("Enter " + product + " Price"));
                    String branch = JOptionPane.showInputDialog("Enter " + product + " Location");

                    WinnersShirt object = new WinnersShirt(name, designer, size, price, branch); // Creating a new object

                    WinnersShirt.addToWinnerShirt(object);

                    int addMore = JOptionPane.showConfirmDialog(null,
                            "Would you like to add more products",
                            "Add More",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (addMore == 1){
                        break;
                    }

                }
            }
        }

        JOptionPane.showMessageDialog(null, WinnersShirt.winnersShirts);
        JOptionPane.showMessageDialog(null, WinnersShirt.winnersShirts.get(0).getName());

        System.out.println(WinnersShirt.winnersShirts.get(1).getDesigner());*/


        /*int view = JOptionPane.showConfirmDialog(null,
                "Would you like to View/Browse the products",
                "View winners product",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (view == 0) {

                JOptionPane.showMessageDialog(null, "Product 1" + "\n" + "NAME: " + winnersShirts[0].name + "\n"
                        + "DESIGNER BRAND:  " + winnersShirts[0].designer + "\n"
                        + "SIZE:  " + winnersShirts[0].size + "\n"
                        + "PRICE:  " + winnersShirts[0].price + "\n"
                        + "Can be found at:  " + winnersShirts[0].branch + " Branch"
                );

        } else {
            JOptionPane.showMessageDialog(null, "Thanks for visiting Bramlea City Centre");
            System.exit(0);
        }*/

    }
}

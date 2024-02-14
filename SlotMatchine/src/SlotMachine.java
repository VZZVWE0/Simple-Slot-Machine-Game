//
//TEAM LIST: ANNA FELIPE
//
import java.util.Scanner;
import java.util.Random;
public class SlotMachine {
    int credits = 100;

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        char selection;

        SlotMachine method = new SlotMachine();

        System.out.print("|"); method.credits(); System.out.println("|");
        System.out.println("----------------------------------------");

        do {
            System.out.println("Enter S to spin(-20 credits) or Q to Quit: ");
            selection = input.next().charAt(0);
            if (selection == 'Q') {
                System.out.println("Thanks for playing.");
                break;
            }

            int slot1 = rand.nextInt(3) + 1;
            int slot2 = rand.nextInt(3) + 1;
            int slot3 = rand.nextInt(3) + 1;

            switch (slot1) {
                case 1: System.out.print("🍒");
                break;
                case 2: System.out.print("🎲");
                 break;
               case 3: System.out.print("💎");
                break;
            }
            switch (slot2) {
                case 1: System.out.print("🍒");
                    break;
                case 2: System.out.print("🎲");
                    break;
                case 3: System.out.print("💎");
                    break;
            }
            switch (slot3) {
                case 1: System.out.print("🍒");
                    break;
                case 2: System.out.print("🎲");
                    break;
                case 3: System.out.print("💎");
                    break;
            }
            System.out.println();

            //System.out.println("(" + slot1 + "(" + slot2 + "(" + slot3 + "/");

            if (slot1 == slot2 && slot1 == slot3 && slot2 == slot3) {
                System.out.println("You won 100 credits.      |Total: " + method.bigWin() + "🪙|");
                System.out.println("----------------------------------------");
            }
            else if (slot1 == slot2 && slot1 != slot3 && slot2 != slot3) {
                System.out.println("You won 50 credits.       |Total: " + method.smallWin() + "🪙|");
                System.out.println("----------------------------------------");
            } else {
                System.out.println("                           |Total: " + method.lose() + "🪙|");
                System.out.println("----------------------------------------");
            }

        } while (selection == 'S');

    }
    public void credits() {

        System.out.print("Credits: " + credits + "🪙");

    }
    public int smallWin() {

        credits += 30;
        return credits;
    }
    public int bigWin() {

        credits += 80;
        return credits;
    }
    public int lose() {

        credits -= 20;
        if (credits < 20) {
            System.out.println("Not enough credits.");
            System.exit(0);
        }
        return credits;

    }

}

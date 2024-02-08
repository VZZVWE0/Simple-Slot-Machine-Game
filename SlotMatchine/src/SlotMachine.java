import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

    public static void main (String[] args) {
        Random rand = new Random();
        int tokens = 100;
        System.out.println("Credits: " + tokens + "🎟" );
        Scanner input = new Scanner(System.in);
        String slot1[] = {"🍒", "🎲", "💰", "💎"};
        int slot2[] = {1};
        int slot3[] = {1};
        //🍒", "🎲", "💰", "💎"};



        int num = rand.nextInt(slot1.length) + 1;

        System.out.println(num);

        System.out.print(slot1[new Random().nextInt(slot1.length)]);
        System.out.print(slot2[new Random().nextInt(slot2.length)]);
        System.out.println(slot3[new Random().nextInt(slot3.length)]);

        if (slot1 == slot2) {
            tokens += 50;
            System.out.println(tokens);
        }
        if (slot1 == slot2 && slot1 == slot3) {
            tokens += 100;
            System.out.println(tokens);
        }
        else {

            tokens -= 20;
            System.out.println(tokens);
        }


    }


}

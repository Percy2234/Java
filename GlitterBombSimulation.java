import java.util.Random;

public class GlitterBombSimulation {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Opening gift box...");
        Thread.sleep(1500);

        System.out.println("3...");
        Thread.sleep(800);

        System.out.println("2...");
        Thread.sleep(800);

        System.out.println("1...");
        Thread.sleep(800);

        System.out.println("\n💥 GLITTER EXPLOSION! 💥\n");

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int spaces = rand.nextInt(40);

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            System.out.println("✨✨✨✨✨");
            Thread.sleep(100);
        }

        System.out.println("\nThe room is now full of glitter ");
    }
}
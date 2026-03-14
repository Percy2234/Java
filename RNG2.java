public class RNG2 {
    public static void main(String[] args) {
        int seed = 34;
        int a = 12;
        int c = 27;
        int m = 100;

        int[] numbers = new int[20];

        int x = seed;
        int i = 0;

        while (i < numbers.length) {
            // for (int i = 0; i < numbers.length; i++)
            // x = (a * x + c) % m;
            // numbers[i] = x;
            x = (a * x + c) % m;
            numbers[i] = x;
            i++;
        }

        for (int n : numbers) {
            System.out.println(n);
        }
        // for (int n : numbers) {
        // System.out.println(n);}
    }
}

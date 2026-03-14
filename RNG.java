public class RNG {
    public static void main(String[] args) {
        int seed = 34;
        int a = 12;
        int c = 27;
        int m = 100;

        int x = seed;
        int i = 0;

        while (i < 20) {
            x = (a * x + c) % m;
            System.out.println(x);
            i++;
        }
    }
}
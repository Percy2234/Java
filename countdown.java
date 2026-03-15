public class countdown {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        int n = In.nextInt();
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is ODD");
            }

        }
    }
}
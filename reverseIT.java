public class reverseIT {
    public static void main(String[] args) {
        int Evensum = 0;
        int Oddsum = 0;

        for (int i = 20; i > 0; i--) {
            // int i = 20;
            // while(i>0)

            if (i % 2 == 0) {
                Evensum += i;
            } else {
                Oddsum += i;
            }
            // i--;
        }
        System.out.println(Evensum);
        System.out.println(Oddsum);

    }
}
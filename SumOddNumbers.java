public class SumOddNumbers {
    public static void main(String[] args) {
        System.out.println("Choose one number");
        int number = In.nextInt();
        if (number > 0) {
            int[] range = new int[number];
            for (int i = 0; i < number; i++) {
                range[i] = i + 1;
            }

            int sum = 0;
            // for (int i = 0; i < range.length; i++)
            for (int n : range) {
                if (n % 2 != 0) {
                    sum += n;
                }
            }
            System.out.println("Sum all the odd numbers are " + sum);
        } else {
            System.out.println("Error, put the number over 0");
        }

    }
}

public class Bools {
    public static void main(String[] args) {

        boolean[] bools = { true, false, true, true, true,
                true, true, true, true, false, true, true,
                true, true, true, false, true, true, true,
                true, false, false, true, true, true, true,
                true, true, false, false, false, false, true,
                true, false, true, false, true, true, false,
                true, false, true, true, true, true, false,
                false, false, true, false, true, false, false,
                true, false, true, false, true, false, false,
                false, false, false, false, false, true, false,
                true, true, true, true, false, true, false, false,
                false, false, false, false, false, true, true,
                false, false, false, true, false, true, false,
                true, false, false, true, false, false, false,
                true, true, true, false, false, true, false,
                true, true, false, false, true, true, true, false,
                false, true, true, true, true, true, false, false,
                false, false, false, true, true, true, true, true,
                false, false, false, true, false, true, true, false,
                true, true, false, false, true, false, true, true,
                false, true, true, true, true, false, false, false,
                true, false, false, true, true, false, false, false,
                true, false, false, false, false, false, true, true,
                false, false, false, true, true, false, false, true,
                false, true, true, true, false, false, false, false,
                true, false, false, true, false, false, true, true,
                true, false, false, true, true, true, true, false };
        int trueCount = 0;
        int FalseCount = 0;
        for (int i = 0; i < bools.length; i++)
            if (bools[i] == true) {
                trueCount++;
            } else {
                FalseCount++;
            }
        System.out.println(trueCount);
        System.out.println(FalseCount);
        System.out.println("How many 'false' values do you want?");
        int wantFalse = In.nextInt();
        int count = 0;
        for (int i = 0; i < bools.length; i++) {
            if (bools[i] == false) {
                count++;
            }
            if (count == wantFalse) {
                System.out.println("The smallest sub-array with " + wantFalse
                        + " 'false' values is from index 0 to index " + i);
                break;
            }

        }
    }
}

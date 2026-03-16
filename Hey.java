public class Hey {
    public static void main(String[] args) {
        String hey = "";
        int i = 0;
        while (i < 5) {
            hey += "Hey! ";

            i++;
        }
        System.out.println(hey);

        while (i < 20) {
            hey += " Hey! ";
            i++;
        }

        System.out.println(hey);
    }

}

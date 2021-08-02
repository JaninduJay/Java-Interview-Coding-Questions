public class StartPrint {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

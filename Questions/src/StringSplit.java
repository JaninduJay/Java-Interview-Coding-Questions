public class StringSplit {
    public static void main(String args[]) {
        String name = "hellothismello";

        String[] array = name.split("this", 0);

        for (int i=0; i<array.length ; i++) {
            System.out.println(array[i]);
        }


    }
}

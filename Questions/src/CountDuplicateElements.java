public class CountDuplicateElements {
    public static void main(String[] args) {
        String [] array = new String[]  {"A", "B", "A", "D", "C", "E", "E"};

        for(int i = 0; i < array.length; i++) {
            int count = 0;

            System.out.print(array[i] + ": ");
            for(int j = 0 ; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++ ;
                }
            }
            System.out.print(count);
            System.out.println("");
        }
    }
}

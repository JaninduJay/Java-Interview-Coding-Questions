public class DuplicateElements {
    public static void main(String[] args) {

        String [] array = new String[]  {"A", "B", "A", "D", "C", "E", "E"};

        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
public class FindMax {

    public static void main(String args[]) {
        int[] array = new int[]{5,2,7,9,13,1,6,14};
        int max = Integer.MIN_VALUE;

        for(int i=0; i <= array.length - 1 ; i++) {
            if(array[i] >= max) {
                max = array[i];
            }
        }

        System.out.println("Max Value : " + max);
    }



}

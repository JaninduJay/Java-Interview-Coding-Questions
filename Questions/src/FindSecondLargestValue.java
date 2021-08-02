import java.lang.reflect.Array;

public class FindSecondLargestValue {
    public static void main(String args[]) {
        int[] array = new int[]{4,1,7,8,6,12,76,44,11};
        int temp;

        for(int i = 0 ; i < array.length ; i ++) {
            for(int j = i+1; j< array.length ; j++) {
                if(array[i] >= array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i=0; i< array.length ; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("2nd MAX value :" + array[array.length - 2]);
    }

}

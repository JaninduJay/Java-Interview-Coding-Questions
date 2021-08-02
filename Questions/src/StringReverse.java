public class StringReverse {
    public static void main(String args[]) {
        String str = "ABCD";
        char[] array = str.toCharArray();
        String strNew = "";

        for (int i=array.length -1; i>=0; i--){
            strNew += array[i];
        }
        System.out.println(strNew);
    }
}

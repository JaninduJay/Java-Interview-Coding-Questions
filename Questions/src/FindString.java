public class FindString{
    public static void main(String args[]){
        String searchStr = "Hello thi ss my nam this";
        char[] chrArray = searchStr.toCharArray();
        boolean flag = false;

        try {
            for(int i=0; i<searchStr.length() ; i++) {
                if(searchStr.charAt(i) == 't'){
                    if(chrArray[i+1] == ('h')){
                        if(chrArray[i+2] == ('i')){
                            if(chrArray[i+3] == ('s')){
                                flag = true;
                            }
                        }
                    }
                }
            }
            if (flag){
                System.out.println(" 'this' is in the String !");
            }else{
                System.out.println(" 'this' is not in the String !");
            }
        }catch(IndexOutOfBoundsException e) {
            System.out.println("'this' is not in the String !");
        }

    }
}
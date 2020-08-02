package goodreads;

public class ArrayList {



    public static int[] reverse(int[] myArray){

        int total = myArray.length -1 ;

        for (int i=0; i<=total/2; i++ ){

            int end =  myArray[total-i];
            myArray[total-i] = myArray[i];
            myArray[i] = end;
        }
        return myArray;

    }

    public  void traverse(int[] arr) {
        for ( int i =  0 ; i < arr . length; i ++ ) {
            // Iterative access to arr[i]
            System.out.println(arr[i]);
        }
    }

}

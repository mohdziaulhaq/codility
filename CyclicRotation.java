import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args){
        int A[] = new int[]{3,8,9,7,6};
        int K = 2;
        int result[] = solution(A, K);
        //[3,8,9,7,6]
        //[6,3,8,9,7]
        //[7,6,3,8,9]
        //[9,7,6,3,8]
        for(int x : result)
        System.out.print(x+" ");
    }
    public static int[] solution(int[] A, int K) {
       // create a new array with formula index + k % sizeofarray
       int newArray[] = new int[A.length];
       int sizeOfArray = A.length;
       int j ;
       for(int i = 0; i < A.length; i++){
            j = (i+K) % sizeOfArray;
            newArray[j] = A[i];
       }
       return newArray;
    }
}
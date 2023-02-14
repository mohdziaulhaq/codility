import java.util.*;

public class TapeEquilibrium {
    public static void main(String[] args){
        int[] A = new int[]{3,1,2,4,3};
        System.out.println(solution(A));
    }
    //O(n*n) first approach
    public static int solution(int[] A) {
        // Implement your solution here
        int result = Integer.MAX_VALUE;
         for(int p=1; p<A.length; p++){
            int leftSum =0;
            int rightSum = 0;
            int temp;
            for(int q=0; q <A.length; q++){
                if(q<p)
                    leftSum = leftSum + A[q];
                else if(q>=p)
                    rightSum = rightSum + A[q];
            }//inner loop
                temp = Math.abs(leftSum - rightSum);
                if(temp < result){
                    result = temp;
            }
        }//outer loop
        return result;
    }
}
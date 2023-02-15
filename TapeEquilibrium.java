import java.util.*;

public class TapeEquilibrium {
    public static void main(String[] args){
        int[] A = new int[]{3,1,2,4,3};
        System.out.println(solution1(A));
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

    // optimized approach O(n)
    public static int solution1(int[] A) {
        // Implement your solution here
        int leftSum = A[0];
        int rightSum = 0;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for(int x : A){
            rightSum = rightSum + x;
        }
        rightSum = rightSum - leftSum;
        temp = Math.abs(leftSum - rightSum);
        if(temp<min)
        min = temp;
        for(int i=1; i<A.length; i++){
            temp = Math.abs(leftSum - rightSum);
            if(temp<min)
            min = temp;
            rightSum = rightSum - A[i];
            leftSum = leftSum + A[i];
            
        }
        return min;
    }
}
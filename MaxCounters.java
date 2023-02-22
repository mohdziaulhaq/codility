import java.lang.Thread.State;
import java.util.concurrent.CountDownLatch;

public class MaxCounters {
    public static void main(String[] args) {
        // int A[] = new int[]{1,1,1};
        // int result[] = new MaxCounters().solution(1, A);
        int A[] = new int[]{3,4,4,6,1,4,4};
        int result[] = new MaxCounters().solution(5, A);
        System.out.println(java.util.Arrays.toString(result));
    }
    public int[] solution(int N, int[] A){
        int result[] = new int[N];
        int currentMax =0;
        int startLine = 0;
        int temp;
        for(int i=0; i<A.length; i++){

            //new logic
            int x = A[i]-1;
            if(A[i] > N) startLine = currentMax;
            else if(result[x] < startLine)  result[x] = startLine+1;
            else 
            if(A[i] <= N && result[x] > currentMax) currentMax = result[x];
        }
        for(int i=0; i<result.length; i++){
            if(result[i] < startLine)
            result[i] = startLine;
        }
        return result;
    }
}

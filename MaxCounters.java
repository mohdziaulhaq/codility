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
        int maxCounter =0;
        int temp;
        for(int i=0; i<A.length; i++){
            if(A[i]<= N){
                temp = result[A[i]-1] += 1;
                if(temp >maxCounter){
                    maxCounter = temp;
                }
            }else if(A[i] > N){
                for(int j=0; j< result.length; j++){
                    result[j] = maxCounter;
                }
            }
        }
        return result;
    }
}

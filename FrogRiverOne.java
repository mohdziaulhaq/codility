public class FrogRiverOne {
    public static void main(String[] args){
        // int A[] = new int[]{1,3,1,4,2,3,5,4};
        // int K = 5;
        //[1,3,1,4,2,3,5,4]
        // 0 1 2 3 4 5 6 7
        //uncomment for single position scenario
        int A[] = new int[1];
        int K = 1;
        int result = new FrogRiverOne().solution(K, A);
        System.out.print(result);
    }

    public int solution(int X, int A[]){

        int counter = X;
        int newArray[] = new int[A.length+1];
        for(int i=0; i<A.length; i++){
            if(counter != 0 && newArray[A[i]] != 1){
                counter--;
                newArray[A[i]] = 1;
            }
            if(counter == 0)
              return i;
        }
        return -1;
    }
}

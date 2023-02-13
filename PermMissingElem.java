class PermMissingElem {
    public static void main(String[] args){
        // int[] A = new int[]{2,3,7,8,4,9,1,5};
        int[] A = new int[10];
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        int B[] = new int[A.length+2];
        if(A.length <=1)
        return 1;
        int temp;
        for(int i=0; i<A.length; i++){
            temp = A[i];
            B[temp] = temp;
        }
        for(int j = 1; j< B.length+1; j++){
            if(j !=B[j]){
            return j;
            }
        }
        return 1;
    }
}
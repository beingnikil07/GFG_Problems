class Solution {
    public int getSecondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max) max=x;
        }
        
        int max2=0;
        for(int x:arr){
            if(x>max2 && x!=max){
                max2=x;
            }
        }
        if(max2==0) return -1;
        return max2;
    }
}
class Solution {
    public static int findMean(int[] arr) {
    
        int sum=0;
        for(int x:arr){
            sum+=x;
        }    
        int n=arr.length;
        return (int) Math.floor(sum/n);
    }
};
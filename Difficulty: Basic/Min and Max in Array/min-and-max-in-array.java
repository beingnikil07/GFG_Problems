class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int x:arr){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        
        return new ArrayList<> (Arrays.asList(min,max) ) ;
    }
}

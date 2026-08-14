class Solution {
    public boolean isPower(int x, int y) {
        if(x==1){
            return false;
        }
        
        while(y%x==0){
            y=y/x;   
        }
        
        return y==1;
    }
}
class Solution {
    public int distance(int x1, int y1, int x2, int y2) {
        int x=x2-x1;
        int y=y2-y1;
        
        int res=x*x+y*y;
        
        
        int d=(int) Math.round(Math.sqrt(res));
        return d;
    }
}
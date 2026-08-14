class Solution {
    int middle(int a, int b, int c) {
        if((a<c&&a>b) || (a>c && a<b)){
            return a;
        }
        else if((b>c && b<a) || (b<c && b>a)){
            return b;
        }else{
            return c;
        } 
        
    }
}
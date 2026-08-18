class Solution {
    static int nthEvenFibonacci(int n) {
        int arr[]=new int[n];
        
        int a=0;
        int b=1;
        int i=0;
        while(i<n){
            if( a!=0 && a%2==0){
                arr[i]=a;
                i++;
            }
            int c=a+b;
            a=b;
            b=c;
        }
        
        return arr[n-1];
    }
}
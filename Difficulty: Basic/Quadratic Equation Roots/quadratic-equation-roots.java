class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> res=new ArrayList<>();
        
        int d=b*b-4*a*c;
        
        if(d<0){
            res.add(-1);
            return res;
        }
        
        double root1= (-b+Math.sqrt(d))/(2.0*a);
        double root2= (-b-Math.sqrt(d))/(2.0*a);

        int r1=(int) Math.floor(root1);
        int r2=(int) Math.floor(root2);
        
        if(r1>=r2){
            res.add(r1);
            res.add(r2);
        }else{
            res.add(r2);
            res.add(r1);
        }
        
        return res;
    }
}
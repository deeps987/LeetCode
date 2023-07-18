class Solution {
    public boolean isPalindrome(int x) {
        int x1 = x; int s = 0;
        while(x1>0){
            int d= x1%10;
            s= s*10 +d;
            x1 = x1/10;
        }
        if(s==x){
            return true;
        }
        return false;
        
    }
}
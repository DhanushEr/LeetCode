class Solution {
    public int climbStairs(int n) {
        int pre=2;
        int pretopre=1;
        int cur=0;
        if(n==1)
        return 1;
        if(n==2)
        return 2;

        for(int i=3;i<=n;i++){
            cur=pre+pretopre;
            pretopre=pre;
            pre=cur;
        }
        return cur;
    }
}
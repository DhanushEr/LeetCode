class Solution {
    public boolean judgeSquareSum(int c) {
        long sq=(int)Math.sqrt(c);
        long l=0;
        long r=sq;

        while(l<=r){
            if((l*l)+(r*r)==c)
            return true;

            else if((l*l)+(r*r)<c){
                l++;
            }

            else
            r--;
        }
        return false;
    }
}
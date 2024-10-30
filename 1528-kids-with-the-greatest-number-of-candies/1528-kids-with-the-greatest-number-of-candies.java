class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>l1=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int x:candies){
            if(max<x){
                max=x;
            }
        }

        for(int x:candies){
            if(x+extraCandies>=max){
                l1.add(true);
            }
            else{
                l1.add(false);
            }
        }

        return l1;
    }
}
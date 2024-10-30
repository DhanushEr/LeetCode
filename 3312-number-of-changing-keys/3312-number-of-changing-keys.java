class Solution {
    public int countKeyChanges(String s) {
        String s1= s.toUpperCase();
        int change=0;
        char ch=s1.charAt(0);
        for(int i=1;i<s1.length();i++){
            if(ch!=s1.charAt(i)){
                change++;
                ch=s1.charAt(i);
            }
        }
        return change;
    }
}
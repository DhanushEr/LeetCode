class Solution {
    public int minLength(String s) {
        while(true){
        String s1=s.replace("AB","").replace("CD","");
        if(s1==s)
        break;

        s=s1;
        }

        return s.length();
    }
}
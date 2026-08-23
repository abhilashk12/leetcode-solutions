class Solution {
    public String largestEven(String s) {
        int c=s.length();

        while(c>0){
            if(s.charAt(c-1) == '1'){
                c--;
            }
            else{
                return s.substring(0,c);
            }
        }
        return s.substring(0,c);
    }
}
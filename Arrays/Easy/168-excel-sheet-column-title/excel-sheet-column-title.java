class Solution {
    public String convertToTitle(int c) {
        int remainder=0;
        StringBuilder s = new StringBuilder();
        while(c>0){
            c--;
            remainder = c%26;

            s.append((char)('A' + remainder));

            c = c/26;
        }
        return s.reverse().toString();
    }
}
class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        String vowels = "aeiou";

        while(left<right){
            if(vowels.indexOf(Character.toLowerCase(arr[left])) != -1 && vowels.indexOf(Character.toLowerCase(arr[right])) != -1){
                char temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(vowels.indexOf(Character.toLowerCase(arr[right])) == -1){
                right--;
            }
            else{
                left++;
            }
        }

        return new String(arr);
    }
}
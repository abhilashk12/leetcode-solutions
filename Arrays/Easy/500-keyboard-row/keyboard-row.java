class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            char firsChar = word.charAt(0);

            boolean isValid = true;
            if(firstRow.indexOf(firsChar) != -1){
                

                for(int k=0; k<word.length(); k++){
                    if(firstRow.indexOf(word.charAt(k)) == -1){
                        isValid = false;
                        break;
                    }
                }
                if(isValid){
                    result.add(words[i]);
                }
            }

            else if(secondRow.indexOf(firsChar) != -1){

                for(int k=0; k<word.length(); k++){
                    if(secondRow.indexOf(word.charAt(k)) == -1){
                        isValid = false;
                        break;
                    }
                }
                if(isValid){
                    result.add(words[i]);
                }
            }

            else if(thirdRow.indexOf(firsChar) != -1){

                for(int k=0; k<word.length(); k++){
                    if(thirdRow.indexOf(word.charAt(k)) == -1){
                        isValid = false;
                        break;
                    }
                }
                if(isValid){
                    result.add(words[i]);
                }
            }
            
        }
        return result.toArray(new String[0]);
    }
}
class Solution {
    public String convert(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<>();

        if (numRows == 1) {
            return s;
        }

        for(int i=0; i<numRows; i++){
            rows.add(new StringBuilder());
        }
        int currentRow = 0;
        boolean goingDown = false;

        // loop through every character of s
        for (char ch : s.toCharArray()) {

            // add character to current row
            rows.get(currentRow).append(ch);

            // change direction at top/bottom
             if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // move currentRow
            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
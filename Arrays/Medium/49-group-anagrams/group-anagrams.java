class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String, List<String>> map = new HashMap<>();

	        for(String st : strs){
				char[] c = st.toCharArray();
	            Arrays.sort(c);
	            String string =  new String(c);

	            
	            map.computeIfAbsent(string, k-> new ArrayList<>()).add(st);
	        }
	        return new ArrayList<>(map.values());
    }
}

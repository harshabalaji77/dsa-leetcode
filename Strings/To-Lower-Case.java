class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase(); // 

        String result = "";
        
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
            } else {
                result += c;
            }
        } 
        return result;
    }
}
class  LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String ans = "";

        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            boolean match = true;

            for(int j = 1; j < strs.length; j++){
                // Check out of bound or mismatch
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    match = false;
                    break;
                }
            }

            if(!match) break;
            else ans += ch;
        }

        return ans;
    }
}

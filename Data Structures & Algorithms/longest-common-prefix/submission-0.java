class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            boolean match = true;
            for(int j = 1; j<strs.length ; j++){
                //not match condition
                if(strs[j].length() <= i || ch != strs[j].charAt(i)){
                    match = false;
                    break;
                }
            }
            if(match){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}
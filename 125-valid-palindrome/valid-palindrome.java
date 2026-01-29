class Solution {
    public boolean isPalindrome(String s) {
       // String cleaned=s.replaceAll(" ","") + s.replaceAll(":","") + s.replaceAll(",","");
       //can't use this to clean this as this is only concatenating different strings not cleaning string properly
       String cleaned=s.replaceAll("[^a-zA-Z0-9]","");
        cleaned=cleaned.toLowerCase();
        int left=0;
        int right=cleaned.length()-1;
        while(left<=right)
        {
            if(cleaned.charAt(left)==cleaned.charAt(right))
            {
            left++;
            right--;
            }
            else
            return false;

        }        
        return true;
    }
}
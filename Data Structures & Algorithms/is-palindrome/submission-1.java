class Solution {
    public boolean isPalindrome(String s) {
        
    //     StringBuilder sb = new StringBuilder();

    //     for(char c:s.toCharArray())
    //     {
    //         if(Character.isLetterOrDigit(c))
    //         sb.append(c);
    //     }
    //     return (sb.toString()).equalsIgnoreCase(sb.reverse().toString());

        int i=0, j=s.length()-1;
        s=s.toLowerCase();
        while(i<j)
        {
            if(Character.isLetterOrDigit(s.charAt(i)) && 
            Character.isLetterOrDigit(s.charAt(j)))
            {
                if (s.charAt(i) != s.charAt(j))
                return false;
                else
                {
                    i++;
                    j--;
                }
            }
            else if(!Character.isLetterOrDigit(s.charAt(i)))
            i++;
            else
            j--;

        }

        return true;
    }
}

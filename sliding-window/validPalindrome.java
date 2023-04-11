public class validPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("raarr"));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        boolean ans = true;

        while(i < j) {
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            } else {
                ans = false;
                break;
            }
        }
        return ans;
    }
}
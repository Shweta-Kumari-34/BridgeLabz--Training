class ValidPalindrome {

    // Convert uppercase character to lowercase
    private char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch - 'A' + 'a');
        }
        return ch;
    }

    // Check if character is alphanumeric
    private boolean isAlphaNumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= '0' && ch <= '9');
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            while (i < j && !isAlphaNumeric(s.charAt(i))) {
                i++;
            }

            while (i < j && !isAlphaNumeric(s.charAt(j))) {
                j--;
            }

            if (toLower(s.charAt(i)) != toLower(s.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}

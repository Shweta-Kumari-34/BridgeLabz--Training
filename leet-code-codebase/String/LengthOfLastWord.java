class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int c = 0;
        int f = -1;   // important initialization

        // Find index of last non-space character
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                f = i;
                break;
            }
        }

        // If string has no word
        if (f == -1) return 0;

        // Count length of last word
        for (int i = f; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            c++;
        }

        return c;
    }
}

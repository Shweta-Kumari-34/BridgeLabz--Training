class PlusOne {
   
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;       // return because no more carry needed
            }
            digits[i] = 0;           // if 9, set to 0 and continue carry
        }
        
        // If all digits were 9, example: 999 -> 1000
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;            // rest are already 0 by default
        return newDigits;
    }

}
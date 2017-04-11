class charMaster {
    /**
     * Method char2str
     *
     * @param x - a char[] to be converted to a String
     * @return temp - String that has been converted from x[]
     */
    public static String char2str(char[] x) {
        String temp = new String(x);
        return temp;
    }

    /**
     * Method str2char
     *
     * @param x - a string to be converted to a char[]
     * @return tempArray - a char[] filled with String x
     */
    public static char[] str2char(String x) {
        int length = x.length();
        char[] tempArray = new char[length];
        for(int i = 0; i < length; i++){
            tempArray[i] = x.charAt(i);         
        }
        return tempArray;
    }

    /**
     * Method reverse
     *
     * @param x char array to be reversed
     * @return t x[] in reverse order
     */
    public static char[] reverse(char[] x) {
        //int len = x.length;
        char[] t = new char[x.length];
        for(int i = 0; i < x.length; i++){
           t[i] = x[(x.length-1)-i];
        }
        return t;
    }

    /**
     * Method count
     * 
     * @param c char being compared
     * @param x char array being checked against
     * @return the number of times character c appears in 
     * the array of characters x
     */
    public static int count(char c, char[] x) {
        int count = 0;
        for(int i = 0; i < x.length; i ++){
            if(x[i] == c){
                count++;
            }
        }
        return count;
    }

    /**
     * Method clone
     * returns a clone of x[]
     * @param x a char[]
     * @return x
     */
    public char[] clone(char[] x) {
        return x;
    }

    /**
     * Method equals
     *
     * @param x char[]
     * @param y char[]
     * @return TRUE if x[] == y[]
     */
    public boolean equals(char[] x, char[] y) {
        if(x.length != y.length){
            return false; 
        }else{
            for(int i = 0; i < x.length; i++){
                if(x[i] == y[i]){
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
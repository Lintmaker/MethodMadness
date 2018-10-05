public class LPanLib {
    /**
     * Tells of the string contains a palindrome ( a word that is spelled the same forwards and backwards like racecar.)
     * @param str
     * @return boolean value
     */
    public static boolean isPalindrome(String str) {
        String start = "";

        for (int x = str.length(); x > 0; x--) {
            start += str.substring(x - 1, x); // substring (exclusive, inclusive) += already is start= start + sub
        }
        if (start.equals(str)) {
            return true;
        }
        return false;
    }

    /**
     * Given a string of "MM/DD/YYYY", the method will return a string of "DD-MM-YYYY" (dashes are part of the string)
     * @param dash, the string with "MM/DD/YYYY" that has to be changed to "DD-MM-YYYY"
     * @return A string of "DD-MM-YYYY"
     */
    public static String dateStr(String dash) {
        String year = "";
        String month = "";
        String day = "";
        int x = dash.length();
        year += dash.substring(x - 4, x);

        for (int y = 0; y < dash.indexOf("/"); y++) {
            month += dash.substring(y, y + 1);
        }
        day = dash.substring(dash.indexOf("/") + 1, dash.indexOf("/") + 3);
        return day + "-" + month + "-" + year;
    }

    /**
     * tells if an integer is in the fibonnaci sequence, by going through every number in the sequence up to test.
     * @param test, integer run through the program to see it is the sequence.
     * @return boolean value
     */
    public static boolean isFibonnaci(int test) {
        int first = 1;
        int second = 1;
        while (first <= test || second <= test) {
            if (first == test)
                return true;
            first += second;
            if (second == test)
                return true;
            second += first;
        }
        return false;
    }

    /**
     * Prints values of the base multiplied by every number from zero to range.
     * @param base, the integer that is multiplied and priinted by every number from zero to range.
     * @param range, the integer that tells how many times the base is multiplied including zero
     */
    public static void multiplicationTable(int base, int range) {
        int start = 0;
        int progress = 0;
        while (progress < range + 1) {
            System.out.println(start);
            start += base;
            progress += 1;
        }

    }

    /**
     * replaces multiples of 3 with foo, 5 with base
     * @param range
     */
    public static void fooBarBaz(int range) {
        int start = 0;
        String foo = "foo";
        String bar = "bar";
        String baz = "baz";
        while (start <= range) {
            if ((start % 3 != 0) && (start % 5 != 0))
                System.out.println(start);
            if ((start % 3 == 0) && (start % 5 != 0))
                System.out.println(foo);
            if ((start % 5 == 0) && (start % 3 != 0))
                System.out.println(bar);
            if ((start % 3 == 0) && (start % 5 == 0) && start != 0)
                System.out.println(baz);

            start += 1;

        }

    }
}

public class LPanLib {
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

    public static boolean isFibonnaci(int test)
    {
        int first = 1;
        int second = 1;
     while (first <= test || second <=test)
     {
         if(first == test)
             return true;
         first += second;
         if (second == test)
             return true;
         second += first;
     }
     return false;
    }
}

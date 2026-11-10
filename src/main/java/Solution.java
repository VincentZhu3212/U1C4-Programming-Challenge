public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() >= 2) {
         String y = x.substring(x.length()-2, x.length());
         if (y.equals("ly")) {
            return true;
         } else {
            return false;
         }
        } else {
            return false;
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.length() == 0) {
            return s2;
        } else if(s2.length() == 0) {
            return s1;
        }
        String a = s1.substring(s1.length()-1, s1.length());
        String b = s2.substring(0, 1);
        if (a.equals(b)) {
            String c = s1.substring(0, s1.length()-1); 
            return c + s2;
        } else {
            return s1 + s2;
        }
    }

    public String withoutX(String s1) {
        String a = "";
        String b = "";
        if (s1.substring(0, 1).equals("x")) {
            a = s1.substring(1, s1.length());
        }
        if (s1.substring(s1.length()-1, s1.length()).equals("x")) {
            b = s1.substring(0, s1.length()-1);
        }
        if (a.substring(0, a.length()-1).equals(b.substring(1, b.length()))) {
            String c = a.substring(0, a.length()-1);
            return c;
        } else {
            if (b.equals("")) {
                return a;
            }
            if (a.equals("")) {
                return b;
            }
        return s1;
        }





        // String a = "";
        // String b = "";
        // String c = "";
        // if (s1.length() == 0) {
        //     return s1;
        // }

        // if (s1.substring(0, 1).equals("x")) {
        //     a = s1.substring(1, s1.length());
        // }

        // if (s1.substring(s1.length()-1, s1.length()).equals("x")) {
        //     b = s1.substring(0, s1.length());
        // }

        // if (a.substring(0, a.length()-1).equals(b.substring(1, b.length()))) {
        //     c = a.substring(0, a.length()-1);
        //     return c;
        // }  
        //     if (a.equals("") && b.equals("")) {
        //         return s1;
        //     }
        //     if (a.equals("")) {
        //         return b;
        //     }
        //     if (b.equals("")) {
        //         return a;
        //     }
        // return s1;
        }


    public String fizzString(String s1) {
        String a = "";
        String b = "";
        if (s1.substring(0,1).equals("f")) {
            a = "Fizz";
        }
        if (s1.substring(s1.length()-1, s1.length()).equals("b")) {
            b = "Buzz";
        }
        if (a.equals("") && b.equals("")) {
            return s1;
        } else {
            if (a.equals("")) {
                return b;
            } else {
                if (b.equals("")) {
                    return a;
                } else {
                    return a + b;
                }
            }
        }
    }

    public String fizzString2(int x) {
        if (x%5 == 0 && x%3 == 0) {
            return "FizzBuzz!" ;
        }
        if (x%5 == 0) {
            return "Buzz!";
        }
        if (x%3 == 0) {
            return "Fizz!";
        }
        return x + "!";
    }

}

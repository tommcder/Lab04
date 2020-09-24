package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        double d = 5;
        System.out.println("1: ");
        System.out.println("+---+\n| |\n+---+");

        BigDecimal bigA = new BigDecimal("4.35");
        BigDecimal bigB = new BigDecimal("100");
        System.out.println("2: "+bigA.multiply(bigB));
        System.out.println("3: "+ (b-c+d));
        System.out.println("4: "+ (b-c*d));
        //System.out.println(a+", "+b);
        System.out.println("5: "+ (a / b * c));
        System.out.println("6: "+ (a*b/c));
        System.out.println("7: "+ (b%d));
        System.out.println("8: "+ (-b%d));
        System.out.println("9: "+ (d%b));
        System.out.println("10: "+ (d%-b));
        System.out.println("11: "+ (b%-d));

        double e = 49;
        double f = 17;

        System.out.println("12: "+ (e/f%d));
        System.out.println("13: "+ (e/(f%d)));
        System.out.println("14: "+ (('a'+'b')%2));
        System.out.println("15: false || true = "+ (false || true));
        System.out.println("16: ! true && false = "+ (!true && false));
        System.out.println("17: !(true && false) = "+ (!(true&&false)));

        int n = 3;
        System.out.println("18: n>++n = "+ (n>++n));
        n = 3;
        System.out.println("19: ++n - n = "+ (++n - n));
        n = 3;
        System.out.println("20: n++ == n++ = "+ (n++ == n++));
        n = 3;
        System.out.println("21: ++n == n++ = "+ (++n == n++));
        n = 3;
        System.out.println("22: n++ = "+ (n++));
        n = 3;
        System.out.println("23: ++n = "+ (++n));
        n = 3;
        System.out.println("24: (n = n++ - ++n) < 0 = "+ ((n = n++ - ++n) < 0));

        System.out.println("25: n = "+n);

        System.out.println("26: "+("1"+(2+3)));
        System.out.println("27: "+("1"+2+3));
        System.out.println("28: "+(1+"2"+3));
        System.out.println("29: "+(1+2+"3"));
        System.out.println("30: "+("tomato".charAt(2) - "potato".charAt(5)));
        System.out.println("31: "+("eggplant".length()));
        System.out.println("32: "+("eggplant".substring("kale".length())));
        System.out.println("33: "+("kale".charAt(3)));
        System.out.println("34: "+("eggplant".substring("eggplant".length()-1)));
        System.out.println("35: "+("beans".substring(1,4)));

        System.out.println("36: "+("a = false"));
        System.out.println("37: "+("a = false"));
        System.out.println("38: "+("!a"));
        System.out.println("39: "+("a = true if n == 3"));
        System.out.println("40: "+("a = false if n != 3"));
        System.out.println("41: "+("if n > 3 && n < 5 a = true"));
        System.out.println("42: "+("a = true; if n > 0 && n < 1 a = false"));
        System.out.println("43: "+("true"));
        System.out.println("44: "+("false"));
        System.out.println("45: "+("Yes, one can use the index to which they were going in the for loop in the while. For example if the for loop was going to i <= 10, the while can be expressed as while i <= 10."));
        System.out.println("46: "+("The same idea from before is applied here. When given a numerical threshold, a while loop can replace any other loop."));
        System.out.println("47: "+("n == 1"));
        System.out.println("48: "+("n == 1"));
        System.out.println("49: "+("n == 2"));
        System.out.println("50: "+("n == 1"));
        System.out.println("51: "+("This happens because you need to compile the code before you run it."));
        System.out.println("52: ");
        double g = 1.7;
        double g2 = 2.5;
        double g3 = 1.2;
        System.out.println("GPA = 1.7:");
        isPassing(g);
        System.out.println("GPA = 2.5:");
        isPassing(g2);
        System.out.println("GPA = 1.2:");
        isPassing(g3);

    }

    static void isPassing(double y)
    {
        if(y<2)
        {
            if (y<1.5)
            {
                System.out.println("Student is failing.");
            }
            else
            {
                System.out.println("Student is on probation.");
            }
        }
        else
        {
            System.out.println("Student is passing.");
        }
    }


}

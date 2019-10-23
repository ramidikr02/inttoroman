package com.test.inttoroman.logic;

public class IntToRoman {

      public static String convert(int number){

        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D",
            "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L",
            "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX"};

        String thousands = m[number/1000];
        String hundereds = c[(number%1000)/100];
        String tens = x[(number%100)/10];
        String ones = i[number%10];

        String ans = thousands + hundereds + tens + ones;

        return ans;
      }
}

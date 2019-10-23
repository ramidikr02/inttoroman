package com.test.inttoroman;

import com.test.inttoroman.logic.IntToRoman;

public class Main {

  public static void main(String args[]){
    String roman = IntToRoman.convert(36);
    System.out.println(roman);
  }
}

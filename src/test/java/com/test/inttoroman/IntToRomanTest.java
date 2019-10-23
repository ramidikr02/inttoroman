package com.test.inttoroman;

import com.test.inttoroman.logic.IntToRoman;
import org.junit.Assert;
import org.junit.Test;

public class IntToRomanTest {

  @Test
  public void basicTest(){
    String roman = IntToRoman.convert(36);
    assert roman.equals("XXXVI");
  }

  @Test
  public void numberInHundreds(){
    String roman = IntToRoman.convert(230);
    assert roman.equals("CCXXX");
  }

  @Test
  public void numberInThousands(){
    String roman = IntToRoman.convert(3200);
    assert roman.equals("MMMCC");
  }

}

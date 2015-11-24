package org.common.util;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HexChangeTest {
  
  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

//  @Test
//  public void test() {
//    fail("Not yet implemented");
//  }
  
  @Test
  public void testInputGtMax() {
    expectedEx.expect(IllegalArgumentException.class);
    expectedEx.expectMessage(HexChange.EXCEPTION_OVERLOAD);
    HexChange.convertToOtherHex((long)HexChange.STRING_MAP.length());
  }

}

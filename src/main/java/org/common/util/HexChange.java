package org.common.util;

public class HexChange {

  // it must no repeat !
  //private static String STRING_MAP = "23456789qwertyuipkjhgfdsazxcvbnmMNBVCXZASDFGHJKLPIUYTREWQ";
  private static String STRING_MAP = "23456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  private static int HEX_LENGTH = STRING_MAP.length();
  private static char[] CHAR_MAPS = new char[STRING_MAP.length()];
  
  static {
    for (int i=0;i<STRING_MAP.length();i++){
      CHAR_MAPS[i] = STRING_MAP.charAt(i);
    }
  }
  
  public static String convertToOtherHex(long input){
    StringBuffer stringBuffer = new StringBuffer();
    long tmpMod = 0 ;
    long tmpMid = input ;
    while (tmpMid>0){
      tmpMod = tmpMid % HEX_LENGTH;
      stringBuffer.append(CHAR_MAPS[(int) tmpMod]);
      tmpMid = tmpMid / HEX_LENGTH;
    }
    stringBuffer.reverse();
    return stringBuffer.toString() ;
  }
  
  public static void main(String[] args){
    System.out.println(HexChange.convertToOtherHex(1437068648697011235L));
    System.out.println(HexChange.convertToOtherHex(1447980015824018780L));
  }
    
}

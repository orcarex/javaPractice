package com.test;

import java.util.EnumSet;
import java.util.HashMap;

public enum MonthCode
{
  Jan(1),Feb(2),Mar(3);

  MonthCode(int code) {
      this.code = code;
  }

  private int code;

  public int getCode() {
      return code;
  }
  
  private static HashMap<Integer, MonthCode> codeMap = new HashMap<Integer, MonthCode>();
  static {
      for (MonthCode month : EnumSet.allOf(MonthCode.class)) {
          codeMap.put(month.getCode(), month);
      }
  }

  public static MonthCode getMonthByCode(int code) {
      return codeMap.get(code);
  }
  

  
}

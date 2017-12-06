package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;

class zbqb
{
  private static final za a = new za(new String[] { "none", "showItemsWithDataAtTop", "showItemsWithNoData", "ascending", "descending", "hoveredSelectedItemWithData", "hoveredSelectedItemWithNoData", "hoveredUnselectedItemWithData", "hoveredUnselectedItemWithNoData", "selectedItemWithData", "selectedItemWithNoData", "unselectedItemWithData", "unselectedItemWithNoData", "SlicerStyleLight1", "SlicerStyleLight2", "SlicerStyleLight3", "SlicerStyleLight4", "SlicerStyleLight5", "SlicerStyleLight6", "SlicerStyleOther1", "SlicerStyleOther2", "SlicerStyleDark1", "SlicerStyleDark2", "SlicerStyleDark3", "SlicerStyleDark4", "SlicerStyleDark5", "SlicerStyleDark6" });
  
  static String a(Object paramObject)
  {
    if (null == paramObject) {
      return null;
    }
    if ((paramObject instanceof Byte)) {
      return zauj.a(((Byte)paramObject).byteValue());
    }
    if ((paramObject instanceof Double)) {
      return zauj.b(((Double)paramObject).doubleValue());
    }
    if ((paramObject instanceof Float)) {
      return zauj.a(((Float)paramObject).floatValue());
    }
    if ((paramObject instanceof Integer)) {
      return zauj.z(((Integer)paramObject).intValue());
    }
    if ((paramObject instanceof Short)) {
      return zauj.a(((Short)paramObject).shortValue());
    }
    if ((paramObject instanceof Long)) {
      return zauj.a(((Long)paramObject).longValue() & 0xFFFFFFFF);
    }
    return zs.a(paramObject);
  }
  
  static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "none";
    case 1: 
      return "showItemsWithDataAtTop";
    case 2: 
      return "showItemsWithNoData";
    }
    return "showItemsWithDataAtTop";
  }
  
  static String b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "ascending";
    case 1: 
      return "descending";
    }
    return "ascending";
  }
  
  static String c(int paramInt)
  {
    switch (paramInt)
    {
    case 5: 
      return "hoveredSelectedItemWithData";
    case 7: 
      return "hoveredSelectedItemWithNoData";
    case 4: 
      return "hoveredUnselectedItemWithData";
    case 6: 
      return "hoveredUnselectedItemWithNoData";
    case 1: 
      return "selectedItemWithData";
    case 3: 
      return "selectedItemWithNoData";
    case 0: 
      return "unselectedItemWithData";
    case 2: 
      return "unselectedItemWithNoData";
    }
    throw new CellsException(6, "Error SlicerStyleElementType value");
  }
  
  static int a(String paramString)
  {
    switch (a.a(paramString))
    {
    case 5: 
      return 5;
    case 6: 
      return 7;
    case 7: 
      return 4;
    case 8: 
      return 6;
    case 9: 
      return 1;
    case 10: 
      return 3;
    case 11: 
      return 0;
    case 12: 
      return 2;
    }
    throw new CellsException(6, "Error SlicerStyleElementType value");
  }
  
  static String d(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "SlicerStyleLight1";
    case 1: 
      return "SlicerStyleLight2";
    case 2: 
      return "SlicerStyleLight3";
    case 3: 
      return "SlicerStyleLight4";
    case 4: 
      return "SlicerStyleLight5";
    case 5: 
      return "SlicerStyleLight6";
    case 6: 
      return "SlicerStyleOther1";
    case 7: 
      return "SlicerStyleOther2";
    case 8: 
      return "SlicerStyleDark1";
    case 9: 
      return "SlicerStyleDark2";
    case 10: 
      return "SlicerStyleDark3";
    case 11: 
      return "SlicerStyleDark4";
    case 12: 
      return "SlicerStyleDark5";
    case 13: 
      return "SlicerStyleDark6";
    }
    return "InnerCustom";
  }
  
  static int b(String paramString)
  {
    switch (a.a(paramString))
    {
    case 13: 
      return 0;
    case 14: 
      return 1;
    case 15: 
      return 2;
    case 16: 
      return 3;
    case 17: 
      return 4;
    case 18: 
      return 5;
    case 19: 
      return 6;
    case 20: 
      return 7;
    case 21: 
      return 8;
    case 22: 
      return 9;
    case 23: 
      return 10;
    case 24: 
      return 11;
    case 25: 
      return 12;
    case 26: 
      return 13;
    }
    return 14;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
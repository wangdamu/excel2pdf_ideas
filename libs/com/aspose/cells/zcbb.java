package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;

class zcbb
  extends zche
{
  private static final za a = new za(new String[] { "gregorian", "gregorianUs", "japan", "taiwan", "korea", "hijri", "thai", "hebrew", "gregorianMeFrench", "gregorianArabic", "gregorianXlitEnglish", "gregorianXlitFrench" });
  
  zcbb(MultipleFilterCollection paramMultipleFilterCollection)
  {
    this.d = 165;
    this.c = new byte[8];
    if (paramMultipleFilterCollection.getMatchBlank()) {
      this.c[0] = 1;
    }
    if (paramMultipleFilterCollection.a != null) {
      System.arraycopy(zc.a(a(paramMultipleFilterCollection.a)), 0, this.c, 4, 4);
    }
  }
  
  static int a(String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
      return 1;
    case 1: 
      return 2;
    case 2: 
      return 3;
    case 3: 
      return 4;
    case 4: 
      return 5;
    case 5: 
      return 6;
    case 6: 
      return 7;
    case 7: 
      return 8;
    case 8: 
      return 9;
    case 9: 
      return 10;
    case 10: 
      return 11;
    case 11: 
      return 12;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
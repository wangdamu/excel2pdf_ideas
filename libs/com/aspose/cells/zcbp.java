package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbp
  extends zche
{
  zcbp(PivotField paramPivotField)
    throws Exception
  {
    this.d = 285;
    int i = 20;
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    String str = paramPivotField.getDisplayName();
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    this.c = new byte[i];
    short s1 = 0;
    int j = 0;
    short s2 = 0;
    short s3 = 0;
    switch (paramPivotField.m)
    {
    case 1: 
      if (paramPivotField.h()) {
        this.c[0] = 9;
      } else {
        this.c[0] = 1;
      }
      break;
    case 2: 
      if (paramPivotField.h()) {
        this.c[0] = 10;
      } else {
        this.c[0] = 2;
      }
      break;
    case 4: 
      if (paramPivotField.h()) {
        this.c[0] = 12;
      } else {
        this.c[0] = 4;
      }
      break;
    case 8: 
      this.c[0] = 8;
      break;
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      if (paramPivotField.h()) {
        this.c[0] = 8;
      }
      break;
    }
    s1 = (short)(paramPivotField.c.a & 0xFFFF);
    if (paramPivotField.getShowCompact()) {
      j = (byte)(j | 0x10);
    }
    if (paramPivotField.getDisplayName() != null) {
      j = (byte)(j | 0x20);
    }
    if (paramPivotField.p) {
      j = (byte)(j | 0x80);
    }
    if (paramPivotField.getDragToRow()) {
      s2 = (short)(s2 | 0x1);
    }
    if (paramPivotField.getDragToColumn()) {
      s2 = (short)(s2 | 0x2);
    }
    if (paramPivotField.getDragToPage()) {
      s2 = (short)(s2 | 0x4);
    }
    if (paramPivotField.getDragToHide()) {
      s2 = (short)(s2 | 0x8);
    }
    if (paramPivotField.getDragToData()) {
      s2 = (short)(s2 | 0x10);
    }
    if (paramPivotField.getShowAllItems()) {
      s2 = (short)(s2 | 0x20);
    }
    if (paramPivotField.getShowInOutlineForm()) {
      s2 = (short)(s2 | 0x40);
    }
    if (paramPivotField.getInsertBlankRow()) {
      s2 = (short)(s2 | 0x80);
    }
    if (paramPivotField.getShowSubtotalAtTop()) {
      s2 = (short)(s2 | 0x100);
    }
    if (paramPivotField.isInsertPageBreaksBetweenItems()) {
      s2 = (short)(s2 | 0x800);
    }
    if (paramPivotField.isAutoSort()) {
      s2 = (short)(s2 | 0x1000);
    }
    if (paramPivotField.isAutoSort()) {
      s2 = (short)(s2 | 0x2000);
    }
    if (paramPivotField.isAutoShow()) {
      s2 = (short)(s2 | 0x4000);
    }
    if (paramPivotField.isAscendShow()) {
      s2 = (short)(s2 | 0x8000);
    }
    if (!paramPivotField.isIncludeNewItemsInFilter()) {
      s3 = (short)(s3 | 0x4);
    }
    if (paramPivotField.isMultipleItemSelectionAllowed()) {
      s3 = (short)(s3 | 0x8);
    }
    System.arraycopy(zc.a(s1), 0, this.c, 1, 2);
    this.c[3] = j;
    System.arraycopy(zc.a(paramPivotField.d.d), 0, this.c, 4, 4);
    System.arraycopy(zc.a(s2), 0, this.c, 8, 2);
    System.arraycopy(zc.a(s3), 0, this.c, 10, 2);
    if (paramPivotField.isAutoShow())
    {
      System.arraycopy(zc.a(paramPivotField.getAutoShowCount()), 0, this.c, 12, 4);
      System.arraycopy(zc.a(-1), 0, this.c, 16, 4);
    }
    else
    {
      System.arraycopy(zc.a(10), 0, this.c, 12, 4);
      System.arraycopy(zc.a(-1), 0, this.c, 16, 4);
    }
    int k = 20;
    str = paramPivotField.getDisplayName();
    if (str != null) {
      k = zcgj.a(this.c, k, str);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
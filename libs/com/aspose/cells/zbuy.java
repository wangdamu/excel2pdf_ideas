package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbuy
  extends zcd
{
  zbuy()
  {
    c(178);
  }
  
  void a(PivotItem paramPivotItem)
  {
    a((short)(paramPivotItem.b & 0xFFFF), paramPivotItem.c, paramPivotItem.getIndex(), paramPivotItem.d);
  }
  
  void a(short paramShort, int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    a((short)(8 + zct.a(paramString)));
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramShort), 0, this.b, i, 2);
    System.arraycopy(zc.a(paramInt1), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a(paramInt2), 0, this.b, i + 4, 2);
    i += 6;
    if (paramString == null)
    {
      this.b[(i++)] = -1;
      this.b[(i++)] = -1;
    }
    else
    {
      int j = paramString.length();
      System.arraycopy(zc.a(j), 0, this.b, i, 2);
      i += 2;
      i += zct.b(this.b, i, paramString);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
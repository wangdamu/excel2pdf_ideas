package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbr
  extends zche
{
  zcbr(ListColumn paramListColumn)
    throws Exception
  {
    this.d = 347;
    int i = 48;
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    String str = paramListColumn.getName();
    if (str != null) {
      i += str.length() * 2;
    }
    str = paramListColumn.k();
    if (str != null) {
      i += str.length() * 2;
    }
    str = paramListColumn.l();
    if (str != null) {
      i += str.length() * 2;
    }
    this.c = new byte[i];
    System.arraycopy(zc.a(paramListColumn.n), 0, this.c, 0, 4);
    int j = zcij.E(paramListColumn.getTotalsCalculation());
    System.arraycopy(zc.a(j), 0, this.c, 4, 4);
    System.arraycopy(zc.a(paramListColumn.k), 0, this.c, 8, 4);
    System.arraycopy(zc.a(paramListColumn.j), 0, this.c, 12, 4);
    System.arraycopy(zc.a(paramListColumn.l), 0, this.c, 16, 4);
    if (paramListColumn.p() != -1) {
      System.arraycopy(zc.a(paramListColumn.p()), 0, this.c, 20, 4);
    }
    int k = 24;
    str = paramListColumn.k();
    if (str != null)
    {
      k = zcgj.a(this.c, k, str);
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, k, 4);
      k += 4;
    }
    str = paramListColumn.getName();
    if (str != null)
    {
      k = zcgj.a(this.c, k, str);
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, k, 4);
      k += 4;
    }
    str = paramListColumn.l();
    if (str != null)
    {
      k = zcgj.a(this.c, k, str);
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, k, 4);
      k += 4;
    }
    System.arraycopy(arrayOfByte, 0, this.c, k, 4);
    k += 4;
    System.arraycopy(arrayOfByte, 0, this.c, k, 4);
    k += 4;
    System.arraycopy(arrayOfByte, 0, this.c, k, 4);
    k += 4;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
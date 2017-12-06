package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbk
  extends zche
{
  zcbk(PivotField paramPivotField)
    throws Exception
  {
    this.d = 293;
    int i = 25;
    int j = 0;
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    zbtq localzbtq = paramPivotField.i;
    String str = localzbtq.g;
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    this.c = new byte[i];
    System.arraycopy(zc.a(paramPivotField.k.c()), 0, this.c, 0, 4);
    System.arraycopy(zc.a(zcij.R(localzbtq.a)), 0, this.c, 4, 4);
    System.arraycopy(zc.a(localzbtq.b), 0, this.c, 8, 4);
    System.arraycopy(zc.a(localzbtq.c), 0, this.c, 12, 4);
    if (paramPivotField.getBaseItemPosition() == 0) {
      System.arraycopy(zc.a(1048828), 0, this.c, 16, 4);
    } else if (paramPivotField.getBaseItemPosition() == 1) {
      System.arraycopy(zc.a(1048829), 0, this.c, 16, 4);
    } else {
      System.arraycopy(zc.a(localzbtq.d), 0, this.c, 16, 4);
    }
    System.arraycopy(zc.a(localzbtq.e), 0, this.c, 20, 2);
    int k = 25;
    str = localzbtq.g;
    if (str != null)
    {
      j = (byte)(j | 0x1);
      this.c[24] = j;
      k = zcgj.a(this.c, k, str);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbn
  extends zche
{
  zcbn(PivotField paramPivotField)
    throws Exception
  {
    this.d = 289;
    int i = 13;
    int j = 0;
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    zbuo localzbuo = paramPivotField.j;
    String str = localzbuo.f;
    if (str != null)
    {
      i += str.length() * 2 + 4;
      j = (byte)(j | 0x1);
    }
    str = localzbuo.e;
    if (str != null)
    {
      i += str.length() * 2 + 4;
      j = (byte)(j | 0x2);
    }
    this.c = new byte[i];
    System.arraycopy(zc.a(paramPivotField.t), 0, this.c, 0, 4);
    if (paramPivotField.j.b == 32765)
    {
      this.c[4] = -2;
      this.c[5] = 0;
      this.c[6] = 16;
      this.c[7] = 0;
    }
    else
    {
      System.arraycopy(zc.a(paramPivotField.j.b), 0, this.c, 4, 4);
    }
    System.arraycopy(zc.a(paramPivotField.j.d), 0, this.c, 8, 4);
    this.c[12] = j;
    int k = 13;
    str = localzbuo.f;
    if (str != null) {
      k = zcgj.a(this.c, k, str);
    }
    str = localzbuo.e;
    if (str != null) {
      k = zcgj.a(this.c, k, str);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
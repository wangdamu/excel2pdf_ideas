package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbo
  extends zche
{
  zcbo(PivotItem paramPivotItem)
    throws Exception
  {
    this.d = 282;
    int i = 7;
    int j = paramPivotItem.a.a.c.a;
    String str = paramPivotItem.d;
    if (str != null) {
      i += str.length() * 2 + 4;
    }
    this.c = new byte[i];
    short s = 0;
    if (paramPivotItem.isHidden()) {
      s = (short)(s | 0x1);
    }
    if (paramPivotItem.a()) {
      s = (short)(s | 0x2);
    }
    if (paramPivotItem.b()) {
      s = (short)(s | 0x4);
    }
    if (paramPivotItem.c()) {
      s = (short)(s | 0x8);
    }
    if (paramPivotItem.d != null) {
      s = (short)(s | 0x10);
    }
    if (paramPivotItem.g) {
      s = (short)(s | 0x20);
    }
    if (paramPivotItem.f) {
      s = (short)(s | 0x40);
    }
    if (paramPivotItem.getIndex() == -1) {
      System.arraycopy(zc.a(j), 0, this.c, 0, 1);
    }
    System.arraycopy(zc.a(s), 0, this.c, 1, 2);
    System.arraycopy(zc.a(paramPivotItem.getIndex()), 0, this.c, 3, 4);
    int k = 7;
    str = paramPivotItem.d;
    if (str != null) {
      k = zcgj.a(this.c, k, str);
    }
  }
  
  zcbo(boolean paramBoolean)
  {
    this.d = 282;
    this.c = new byte[7];
    this.c[0] = 1;
    System.arraycopy(zc.a(-1), 0, this.c, 3, 4);
  }
  
  zcbo(byte paramByte)
  {
    this.d = 282;
    this.c = new byte[7];
    this.c[0] = paramByte;
    System.arraycopy(zc.a(-1), 0, this.c, 3, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
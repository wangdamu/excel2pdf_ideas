package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcev
  extends zche
{
  zcev(ConditionalFormattingValue paramConditionalFormattingValue, boolean paramBoolean)
    throws Exception
  {
    this.d = (paramBoolean ? 1050 : 471);
    zcfz localzcfz = null;
    byte[] arrayOfByte = null;
    if (paramConditionalFormattingValue.e()) {
      arrayOfByte = paramConditionalFormattingValue.f();
    }
    int i = 24;
    int j = 0;
    if (paramBoolean)
    {
      localzcfz = new zcfz(paramConditionalFormattingValue);
      i += localzcfz.c();
      this.c = new byte[i];
      j = localzcfz.b(this.c, 0);
    }
    else
    {
      if (arrayOfByte != null) {
        i += arrayOfByte.length;
      }
      this.c = new byte[i];
    }
    System.arraycopy(zc.a(zcij.A(paramConditionalFormattingValue.getType())), 0, this.c, j + 0, 4);
    double d = paramConditionalFormattingValue.d();
    System.arraycopy(zc.a(d), 0, this.c, j + 4, 8);
    if (paramConditionalFormattingValue.isGTE())
    {
      this.c[(j + 12)] = 1;
      this.c[(j + 16)] = 1;
    }
    if (arrayOfByte != null)
    {
      System.arraycopy(zc.a(arrayOfByte.length), 0, this.c, j + 20, 4);
      if (!paramBoolean) {
        System.arraycopy(arrayOfByte, 0, this.c, 24, arrayOfByte.length);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
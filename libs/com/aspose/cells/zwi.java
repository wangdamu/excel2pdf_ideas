package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zwi
  extends zcd
{
  zwi()
  {
    c(35);
  }
  
  void a(zwh paramzwh)
  {
    byte[] arrayOfByte = null;
    if (paramzwh.i()) {
      arrayOfByte = new byte[] { (byte)paramzwh.b };
    } else {
      arrayOfByte = zct.c(paramzwh.e());
    }
    a((short)(8 + arrayOfByte.length));
    if (paramzwh.h() != null) {
      b(d() + (short)paramzwh.h().length);
    } else if (paramzwh.a().a() == 0) {
      b(d() + 2);
    }
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramzwh.g()), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramzwh.b()), 0, this.b, 2, 4);
    if (paramzwh.i())
    {
      this.b[6] = 1;
    }
    else
    {
      this.b[6] = ((byte)paramzwh.e().length());
      this.b[7] = ((byte)(arrayOfByte.length == paramzwh.e().length() ? 0 : 1));
    }
    System.arraycopy(arrayOfByte, 0, this.b, 8, arrayOfByte.length);
    if (paramzwh.h() != null) {
      System.arraycopy(paramzwh.h(), 0, this.b, 8 + arrayOfByte.length, paramzwh.h().length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
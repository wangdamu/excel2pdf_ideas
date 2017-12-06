package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbvr
  extends zcd
{
  zbvr(TableStyleCollection paramTableStyleCollection)
  {
    c(2190);
    b(20);
    if (paramTableStyleCollection.a() != null) {
      b(d() + (short)(paramTableStyleCollection.a().length() * 2));
    }
    if (paramTableStyleCollection.b() != null) {
      b(d() + (short)(paramTableStyleCollection.b().length() * 2));
    }
    this.b = new byte[d()];
    this.b[0] = -114;
    this.b[1] = 8;
    int i = paramTableStyleCollection.getCount() + 144;
    System.arraycopy(zc.a(i), 0, this.b, 12, 4);
    int j = 20;
    byte[] arrayOfByte;
    if (paramTableStyleCollection.a() != null)
    {
      this.b[16] = ((byte)paramTableStyleCollection.a().length());
      arrayOfByte = Encoding.getUnicode().a(paramTableStyleCollection.a());
      System.arraycopy(arrayOfByte, 0, this.b, j, arrayOfByte.length);
      j += arrayOfByte.length;
    }
    if (paramTableStyleCollection.b() != null)
    {
      this.b[18] = ((byte)paramTableStyleCollection.b().length());
      arrayOfByte = Encoding.getUnicode().a(paramTableStyleCollection.b());
      System.arraycopy(arrayOfByte, 0, this.b, j, arrayOfByte.length);
      j += arrayOfByte.length;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
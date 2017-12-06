package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcbu
  extends zche
{
  zcbu(TableStyleCollection paramTableStyleCollection)
    throws Exception
  {
    this.d = 508;
    int i = 4;
    if (paramTableStyleCollection.b() != null) {
      i += 4 + paramTableStyleCollection.b().length() * 2;
    } else {
      i += 4;
    }
    if (paramTableStyleCollection.a() != null) {
      i += 4 + paramTableStyleCollection.a().length() * 2;
    } else {
      i += 4;
    }
    this.c = new byte[i];
    byte[] arrayOfByte = { -1, -1, -1, -1 };
    System.arraycopy(zc.a(paramTableStyleCollection.getCount()), 0, this.c, 0, 4);
    int j = 4;
    if (paramTableStyleCollection.a() != null)
    {
      j = zcgj.a(this.c, j, paramTableStyleCollection.a());
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, j, 4);
      j += 4;
    }
    if (paramTableStyleCollection.b() != null)
    {
      j = zcgj.a(this.c, j, paramTableStyleCollection.b());
    }
    else
    {
      System.arraycopy(arrayOfByte, 0, this.c, j, 4);
      j += 4;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
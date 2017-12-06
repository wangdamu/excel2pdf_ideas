package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zzr
  extends zcd
{
  zzr()
  {
    c(49);
  }
  
  zbzi a(Font paramFont)
    throws Exception
  {
    zbzi localzbzi = null;
    byte[] arrayOfByte = Encoding.getUnicode().a(paramFont.getName());
    int i = paramFont.getName().length();
    a((short)(16 + 2 * i));
    this.b = new byte[d()];
    this.b[14] = ((byte)i);
    this.b[15] = 1;
    System.arraycopy(arrayOfByte, 0, this.b, 16, 2 * i);
    if ((paramFont.f(40)) && (paramFont.n() == 2))
    {
      if (localzbzi == null) {
        localzbzi = new zbzi();
      }
      localzbzi.a(14, Byte.valueOf((byte)2));
    }
    System.arraycopy(zc.a((short)paramFont.j()), 0, this.b, 0, 2);
    int j = 0;
    if (paramFont.isBold()) {
      j |= 0x1;
    }
    if (paramFont.isItalic()) {
      j |= 0x2;
    }
    if (paramFont.isStrikeout()) {
      j |= 0x8;
    }
    System.arraycopy(zc.a(j), 0, this.b, 2, 2);
    int k = 1;
    boolean[] arrayOfBoolean = { k };
    int m = paramFont.a(false, arrayOfBoolean);
    k = arrayOfBoolean[0];
    if (m == -1)
    {
      this.b[4] = -1;
      this.b[5] = Byte.MAX_VALUE;
    }
    else
    {
      System.arraycopy(zc.a(m), 0, this.b, 4, 2);
    }
    if (k == 0)
    {
      if (localzbzi == null) {
        localzbzi = new zbzi();
      }
      localzbzi.a(13, paramFont.b());
    }
    System.arraycopy(zc.a((short)paramFont.g()), 0, this.b, 6, 2);
    System.arraycopy(zc.a((short)paramFont.e()), 0, this.b, 8, 2);
    switch (paramFont.getUnderline())
    {
    case 3: 
      this.b[10] = 33;
      break;
    case 2: 
      this.b[10] = 2;
      break;
    case 4: 
      this.b[10] = 34;
      break;
    case 1: 
      this.b[10] = 1;
      break;
    }
    this.b[11] = paramFont.e;
    this.b[12] = ((byte)paramFont.getCharset());
    this.b[13] = 0;
    return localzbzi;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
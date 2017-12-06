package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zfd
  extends zcd
{
  zfd()
  {
    c(433);
  }
  
  void a(zzt paramzzt)
  {
    FormatCondition localFormatCondition = paramzzt.a;
    int i = paramzzt.d == null ? 12 : paramzzt.d.d() + 6;
    int j = 0;
    int k = 0;
    int m = localFormatCondition.c;
    int n = localFormatCondition.b;
    byte[] arrayOfByte1 = null;
    if (paramzzt.f != null)
    {
      m = 1;
      arrayOfByte1 = paramzzt.f;
    }
    else
    {
      localFormatCondition.f();
      arrayOfByte1 = localFormatCondition.a();
    }
    if (m == 1) {
      n = 6;
    }
    i += arrayOfByte1.length - 2;
    j = arrayOfByte1.length - 2;
    if ((m == 0) && (localFormatCondition.c() != null) && ((n == 0) || (n == 7)))
    {
      i += localFormatCondition.c().length - 2;
      k = localFormatCondition.c().length - 2;
    }
    a((short)i);
    this.b = new byte[d()];
    int i1 = 0;
    switch (m)
    {
    case 0: 
      this.b[i1] = 1;
      break;
    case 1: 
      this.b[i1] = 2;
      break;
    }
    this.b[(i1 + 1)] = a(n);
    i1 += 2;
    System.arraycopy(zc.a((short)j), 0, this.b, i1, 2);
    System.arraycopy(zc.a((short)k), 0, this.b, i1 + 2, 2);
    i1 += 4;
    if (paramzzt.d != null)
    {
      System.arraycopy(paramzzt.d.e(), 0, this.b, i1, paramzzt.d.d());
      i1 += paramzzt.d.d();
    }
    else
    {
      i1 += 6;
    }
    System.arraycopy(arrayOfByte1, 2, this.b, i1, arrayOfByte1.length - 2);
    i1 += arrayOfByte1.length - 2;
    if ((n == 0) || (n == 7))
    {
      byte[] arrayOfByte2 = localFormatCondition.c();
      System.arraycopy(arrayOfByte2, 2, this.b, i1, arrayOfByte2.length - 2);
      i1 += arrayOfByte2.length - 2;
    }
  }
  
  static byte a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 1;
    case 7: 
      return 2;
    case 1: 
      return 3;
    case 8: 
      return 4;
    case 2: 
      return 5;
    case 4: 
      return 6;
    case 3: 
      return 7;
    case 5: 
      return 8;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
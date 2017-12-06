package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zaod
  extends zcd
{
  private Style a = null;
  private Style c = null;
  private Style d = null;
  private ListObject e = null;
  
  zaod()
  {
    c(2167);
  }
  
  private int a()
  {
    int i = 54;
    zsz localzsz;
    if (this.a != null)
    {
      localzsz = new zsz(this.a);
      i += zxb.a(localzsz, this.e.a(this.a));
    }
    if (this.c != null)
    {
      localzsz = new zsz(this.c);
      i += zxb.a(localzsz, this.e.a(this.c));
    }
    if (this.d != null)
    {
      localzsz = new zsz(this.d);
      i += zxb.a(localzsz, this.e.a(this.d));
    }
    return i;
  }
  
  void a(ListObject paramListObject)
  {
    this.e = paramListObject;
    a((short)a());
    this.b = new byte[d()];
    this.b[0] = 119;
    this.b[1] = 8;
    System.arraycopy(zc.a(paramListObject.a()), 0, this.b, 14, 4);
    System.arraycopy(zc.a(4294967295L), 0, this.b, 22, 4);
    System.arraycopy(zc.a(4294967295L), 0, this.b, 30, 4);
    System.arraycopy(zc.a(4294967295L), 0, this.b, 38, 4);
    zsz localzsz1 = null;
    zsz localzsz2 = null;
    zsz localzsz3 = null;
    if (this.a != null)
    {
      localzsz1 = new zsz(paramListObject.r());
      this.b[18] = ((byte)zxb.a(localzsz1, paramListObject.a(paramListObject.r())));
    }
    if (this.c != null)
    {
      localzsz3 = new zsz(paramListObject.s());
      this.b[26] = ((byte)zxb.a(localzsz3, paramListObject.a(paramListObject.s())));
    }
    if (this.d != null)
    {
      localzsz2 = new zsz(paramListObject.v());
      this.b[34] = ((byte)zxb.a(localzsz2, paramListObject.a(paramListObject.v())));
    }
    int i = 54;
    if (this.a != null) {
      i = zxb.a(localzsz1, paramListObject.a(paramListObject.r()), this.b, i);
    }
    if (this.c != null) {
      i = zxb.a(localzsz3, paramListObject.a(paramListObject.s()), this.b, i);
    }
    if (this.d != null) {
      i = zxb.a(localzsz2, paramListObject.a(paramListObject.v()), this.b, i);
    }
  }
  
  void b(ListObject paramListObject)
  {
    String str1 = paramListObject.o();
    String str2 = paramListObject.getComment();
    b(24);
    byte[] arrayOfByte1 = null;
    if ((str1 != null) && (!"".equals(str1)))
    {
      arrayOfByte1 = zct.c(str1);
      b(d() + (short)arrayOfByte1.length);
    }
    byte[] arrayOfByte2 = null;
    if ((str2 != null) && (!"".equals(str2)))
    {
      arrayOfByte2 = zct.c(str2);
      b(d() + (short)arrayOfByte2.length);
    }
    this.b = new byte[d()];
    this.b[0] = 119;
    this.b[1] = 8;
    int i = 12;
    this.b[12] = 2;
    System.arraycopy(zc.a(paramListObject.a()), 0, this.b, i + 2, 4);
    i += 6;
    if ((str1 != null) && (!"".equals(str1)))
    {
      System.arraycopy(zc.a(str1.length()), 0, this.b, i, 2);
      if (str1.length() == arrayOfByte1.length) {
        this.b[(i + 2)] = 0;
      } else {
        this.b[(i + 2)] = 1;
      }
      System.arraycopy(arrayOfByte1, 0, this.b, i + 3, arrayOfByte1.length);
      i += 3 + arrayOfByte1.length;
    }
    else
    {
      i += 3;
    }
    if ((str2 != null) && (!"".equals(str2)))
    {
      System.arraycopy(zc.a(str2.length()), 0, this.b, i, 2);
      if (str2.length() == arrayOfByte2.length) {
        this.b[(i + 2)] = 0;
      } else {
        this.b[(i + 2)] = 1;
      }
      System.arraycopy(arrayOfByte2, 0, this.b, i + 3, arrayOfByte2.length);
      i += 3 + arrayOfByte2.length;
    }
    else
    {
      i += 3;
    }
  }
  
  void c(ListObject paramListObject)
  {
    String str = paramListObject.getTableStyleName();
    if ((str == null) || (str.length() == 0)) {
      str = "TableStyleMedium9";
    }
    byte[] arrayOfByte = zct.c(str);
    a((short)(5 + arrayOfByte.length + 18));
    this.b = new byte[d()];
    this.b[0] = 119;
    this.b[1] = 8;
    int i = 12;
    this.b[12] = 1;
    System.arraycopy(zc.a(paramListObject.a()), 0, this.b, i + 2, 4);
    i += 6;
    this.b[i] = paramListObject.p();
    i += 2;
    System.arraycopy(zc.a(str.length()), 0, this.b, i, 2);
    i += 2;
    if (str.length() == arrayOfByte.length) {
      this.b[(i++)] = 0;
    } else {
      this.b[(i++)] = 1;
    }
    System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
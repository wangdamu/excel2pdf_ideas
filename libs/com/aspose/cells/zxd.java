package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zxd
  extends zcd
{
  public zxd()
  {
    c(47);
  }
  
  void a(ztl paramztl)
  {
    b(54);
    this.b = new byte[54];
    this.b[0] = 1;
    this.b[2] = 1;
    this.b[4] = 1;
    System.arraycopy(paramztl.b(), 0, this.b, 6, 16);
    System.arraycopy(paramztl.d, 0, this.b, 22, 16);
    System.arraycopy(paramztl.e, 0, this.b, 38, 16);
  }
  
  void a(String paramString)
  {
    b(6);
    this.b = new byte[d()];
    System.arraycopy(zc.a(zca.b(paramString)), 0, this.b, 2, 2);
    System.arraycopy(zc.a(zca.a(paramString)), 0, this.b, 4, 2);
  }
  
  void a(zcc paramzcc)
    throws Exception
  {
    a((short)(18 + paramzcc.d.length * 2 + paramzcc.f.length));
    int i = 36 + paramzcc.c.length() * 2 + 2;
    b(d() + (short)i);
    this.b = new byte[d()];
    this.b[0] = 1;
    this.b[2] = 2;
    this.b[4] = 2;
    this.b[6] = 4;
    int j = 10;
    System.arraycopy(zc.a(i - 4), 0, this.b, j, 4);
    j += 4;
    this.b[j] = 4;
    j += 8;
    System.arraycopy(zc.a(26625), 0, this.b, j, 4);
    j += 4;
    System.arraycopy(zc.a(32772), 0, this.b, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzcc.b), 0, this.b, j, 4);
    j += 4;
    System.arraycopy(zc.a(paramzcc.a), 0, this.b, j, 4);
    j += 12;
    byte[] arrayOfByte = Encoding.getUnicode().a(paramzcc.c);
    System.arraycopy(arrayOfByte, 0, this.b, j, arrayOfByte.length);
    j += arrayOfByte.length + 2;
    System.arraycopy(zc.a(paramzcc.d.length), 0, this.b, j, 4);
    j += 4;
    System.arraycopy(paramzcc.d, 0, this.b, j, paramzcc.d.length);
    j += paramzcc.d.length;
    System.arraycopy(paramzcc.e, 0, this.b, j, paramzcc.d.length);
    j += paramzcc.d.length;
    System.arraycopy(zc.a(paramzcc.f.length), 0, this.b, j, 4);
    j += 4;
    System.arraycopy(paramzcc.f, 0, this.b, j, paramzcc.f.length);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
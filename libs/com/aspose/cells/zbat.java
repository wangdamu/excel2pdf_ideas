package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbat
  extends zcd
{
  public static void a()
  {
    zbbd.a = License.a == null;
  }
  
  zbat()
  {
    c(2050);
  }
  
  void a(zbut paramzbut)
  {
    String str = paramzbut.a;
    a((short)(20 + zct.a(str)));
    this.b = new byte[d()];
    this.b[0] = 2;
    this.b[1] = 8;
    System.arraycopy(paramzbut.b, 0, this.b, 2, paramzbut.b.length);
    System.arraycopy(zc.a((short)str.length()), 0, this.b, 16, 2);
    int i = 18;
    if (str.length() > 0) {
      i += zct.b(this.b, i, str);
    }
    System.arraycopy(zc.a(paramzbut.c), 0, this.b, i, 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
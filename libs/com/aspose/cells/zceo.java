package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zceo
  extends zche
{
  zceo()
  {
    this.d = 156;
  }
  
  void a(zpu paramzpu, int paramInt)
    throws Exception
  {
    int i = 8;
    String str = paramzpu.h;
    i += 4 + str.length() * 2;
    i += 4 + paramzpu.a.getName().length() * 2;
    this.c = new byte[i];
    if (!paramzpu.a.isVisible())
    {
      this.c[0] = 1;
      if (paramzpu.a.o()) {
        this.c[0] = 2;
      }
    }
    System.arraycopy(zc.a(paramInt), 0, this.c, 4, 4);
    int j = 8;
    j = zcgj.a(this.c, j, str);
    j = zcgj.a(this.c, j, paramzpu.a.getName());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zceo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbuw
  extends zcd
{
  zbuw()
  {
    c(256);
    b(20);
    this.b = new byte[d()];
  }
  
  void a(zbuv paramzbuv)
  {
    int i = 0;
    System.arraycopy(zc.a(paramzbuv.a), 0, this.b, i, 2);
    PivotField localPivotField = paramzbuv.f;
    this.b[(i + 2)] = paramzbuv.b;
    this.b[(i + 3)] = paramzbuv.c;
    i += 4;
    System.arraycopy(zc.a(paramzbuv.c()), 0, this.b, i, 2);
    System.arraycopy(zc.a(paramzbuv.b()), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a(paramzbuv.d), 0, this.b, i + 4, 2);
    i += 6;
    this.b[(i++)] = -1;
    this.b[(i++)] = -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbuw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
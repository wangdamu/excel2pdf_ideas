package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbux
  extends zcd
{
  zbux()
  {
    c(177);
  }
  
  void a(zbuu paramzbuu)
  {
    PivotField localPivotField = paramzbuu.c;
    a((short)(10 + zct.a(paramzbuu.b)));
    this.b = new byte[d()];
    int i = localPivotField.e == null ? 0 : localPivotField.e.getCount();
    int j = 0;
    int k = paramzbuu.a();
    int m = localPivotField.m;
    if (localPivotField.h()) {
      m |= 0x8;
    }
    System.arraycopy(zc.a(m), 0, this.b, j, 2);
    System.arraycopy(zc.a(k), 0, this.b, j + 2, 2);
    System.arraycopy(zc.a(paramzbuu.a), 0, this.b, j + 4, 2);
    System.arraycopy(zc.a(i == 0 ? 0 : i + k), 0, this.b, j + 6, 2);
    j += 8;
    if (paramzbuu.b == null)
    {
      this.b[(j++)] = -1;
      this.b[(j++)] = -1;
    }
    else
    {
      System.arraycopy(zc.a((short)paramzbuu.b.length()), 0, this.b, j, 2);
      j += 2;
      j += zct.b(this.b, j, paramzbuu.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
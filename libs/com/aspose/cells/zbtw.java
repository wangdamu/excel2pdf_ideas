package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbtw
  extends zcd
{
  zbtw(zbtv paramzbtv)
  {
    c(199);
    boolean bool = zct.b(paramzbtv.a);
    a((short)(17 + (bool ? paramzbtv.a.length() : paramzbtv.a.length() * 2)));
    this.b = new byte[d()];
    int i = paramzbtv.b;
    if ((paramzbtv.u()) && (!paramzbtv.i())) {
      i |= 0x80;
    }
    if ((paramzbtv.j()) && (paramzbtv.o()) && (a(paramzbtv.c))) {
      i &= 0xFBFF;
    }
    int j = 0;
    System.arraycopy(zc.a(i), 0, this.b, j, 2);
    System.arraycopy(zc.a(paramzbtv.h), 0, this.b, 2, 2);
    if (paramzbtv.m()) {
      System.arraycopy(zc.a((short)paramzbtv.w()), 0, this.b, j + 4, 2);
    } else if (paramzbtv.n()) {
      System.arraycopy(zc.a((short)paramzbtv.i), 0, this.b, j + 4, 2);
    } else {
      System.arraycopy(zc.a((short)0), 0, this.b, j + 4, 2);
    }
    j += 6;
    if (paramzbtv.m()) {
      System.arraycopy(zc.a(paramzbtv.a().d()), 0, this.b, j, 2);
    } else if ((paramzbtv.n()) && (paramzbtv.j.d != null)) {
      System.arraycopy(zc.a(paramzbtv.j.d.size()), 0, this.b, j, 2);
    } else if (paramzbtv.c == null) {
      System.arraycopy(zc.a(30), 0, this.b, j, 2);
    } else if (paramzbtv.c != null) {
      System.arraycopy(zc.a(paramzbtv.c.size()), 0, this.b, j, 2);
    }
    if ((paramzbtv.n()) && (paramzbtv.j.d != null)) {
      System.arraycopy(zc.a((short)paramzbtv.j.d.size()), 0, this.b, j + 2, 2);
    } else {
      System.arraycopy(zc.a((short)0), 0, this.b, j + 2, 2);
    }
    System.arraycopy(zc.a((short)0), 0, this.b, j + 4, 2);
    if ((paramzbtv.m()) || (paramzbtv.c == null)) {
      System.arraycopy(zc.a((short)0), 0, this.b, j + 6, 2);
    } else if (paramzbtv.n())
    {
      if (paramzbtv.m == 0) {
        System.arraycopy(zc.a(paramzbtv.c.size()), 0, this.b, j + 6, 2);
      } else {
        System.arraycopy(zc.a(paramzbtv.m), 0, this.b, j + 6, 2);
      }
    }
    else {
      System.arraycopy(zc.a(paramzbtv.c.size()), 0, this.b, j + 6, 2);
    }
    j += 8;
    System.arraycopy(zc.a(paramzbtv.a.length()), 0, this.b, j, 2);
    j += 2;
    j += zct.b(this.b, j, paramzbtv.a);
  }
  
  private boolean a(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      return false;
    }
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      if (!(paramArrayList.get(j) instanceof DateTime)) {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
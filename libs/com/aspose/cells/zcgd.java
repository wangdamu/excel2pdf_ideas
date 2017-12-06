package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcgd
  extends zche
{
  protected Workbook a;
  
  zcgd(Workbook paramWorkbook)
  {
    this.d = 45;
    this.a = paramWorkbook;
  }
  
  void a(zpv paramzpv)
  {
    int i = 68;
    if (paramzpv.c != null) {
      i += paramzpv.c.h.length * 16;
    }
    this.c = new byte[i];
    if (paramzpv.c != null)
    {
      this.c[0] = 40;
      this.c[5] = 64;
      this.c[13] = 64;
      zoy localzoy = paramzpv.c;
      int j = 20;
      this.c[j] = ((byte)("path".equals(localzoy.e) ? 1 : 0));
      j += 4;
      System.arraycopy(zc.a(localzoy.f), 0, this.c, j, 8);
      j += 8;
      System.arraycopy(zc.a(localzoy.a), 0, this.c, j, 8);
      j += 8;
      System.arraycopy(zc.a(localzoy.b), 0, this.c, j, 8);
      j += 8;
      System.arraycopy(zc.a(localzoy.c), 0, this.c, j, 8);
      j += 8;
      System.arraycopy(zc.a(localzoy.d), 0, this.c, j, 8);
      j += 8;
      int k = localzoy.h.length;
      System.arraycopy(zc.a(k), 0, this.c, j, 4);
      j += 4;
      for (int m = 0; m < k; m++)
      {
        zche.a(this.c, j, localzoy.h[m], 64, this.a);
        j += 8;
        System.arraycopy(zc.a(localzoy.g[m]), 0, this.c, j, 8);
        j += 8;
      }
    }
    else
    {
      System.arraycopy(zc.a(zcij.o(zauj.i(paramzpv.b.a))), 0, this.c, 0, 4);
      if (!"none".equals(paramzpv.b.a))
      {
        zche.a(this.c, 4, paramzpv.b.b, 64, this.a);
        if (zauj.i(paramzpv.b.a) != 1) {
          zche.a(this.c, 12, paramzpv.b.c, 64, this.a);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
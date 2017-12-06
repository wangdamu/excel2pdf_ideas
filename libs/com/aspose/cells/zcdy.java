package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdy
  extends zche
{
  zcdy(zbci paramzbci)
  {
    zbce localzbce = paramzbci.b;
    this.d = 411;
    int i = 64 + localzbce.f.length() * 2 + localzbce.i.length() * 2 + localzbce.g.length * 2;
    if (localzbce.h != null) {
      i += localzbce.h.length * 2;
    }
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(paramzbci);
    int j = localzbcn.a(this.c);
    System.arraycopy(localzbce.b, 0, this.c, j, 16);
    j += 16;
    a(localzbce.a, j);
    j += 8;
    System.arraycopy(zc.a(localzbce.e), 0, this.c, j, 2);
    j += 2;
    System.arraycopy(zc.a(localzbce.d), 0, this.c, j, 4);
    j += 4;
    System.arraycopy(zc.a(localzbce.c), 0, this.c, j, 4);
    j += 4;
    j = a(localzbce.f, j);
    j = a(localzbce.i, j);
    int k = localzbce.g.length;
    System.arraycopy(zc.a(k), 0, this.c, j, 4);
    j += 4;
    for (int m = 0; m < k; m++)
    {
      System.arraycopy(zc.a(localzbce.g[m]), 0, this.c, j, 2);
      j += 2;
    }
    if (localzbce.h == null)
    {
      j += 4;
    }
    else
    {
      k = localzbce.h.length;
      System.arraycopy(zc.a(k), 0, this.c, j, 4);
      j += 4;
      for (m = 0; m < k; m++)
      {
        System.arraycopy(zc.a(localzbce.h[m]), 0, this.c, j, 4);
        j += 4;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
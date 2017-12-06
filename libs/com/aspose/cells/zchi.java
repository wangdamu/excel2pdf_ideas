package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zchi
{
  private zbcj a;
  private int b;
  private byte[] c;
  private int d;
  private zcbw e;
  
  zchi(zbcj paramzbcj)
  {
    this.a = paramzbcj;
  }
  
  void a(zcbw paramzcbw)
    throws Exception
  {
    this.e = paramzcbw;
    int i = 0;
    for (;;)
    {
      this.b = paramzcbw.a();
      switch (this.b)
      {
      case 399: 
        this.c = paramzcbw.d();
        i = zc.b(this.c, 0);
        if (i == 0) {
          return;
        }
        this.a.n = new zbcu();
        break;
      case 400: 
        a();
        break;
      case 403: 
        return;
      case 401: 
        this.d = paramzcbw.b();
        paramzcbw.a(this.d);
      }
    }
  }
  
  private void a()
    throws Exception
  {
    this.c = this.e.d();
    zbct localzbct = new zbct();
    this.a.n.a(localzbct);
    int i = 0;
    localzbct.c = zc.a(this.c, i);
    i += 4;
    localzbct.b = new byte[16];
    System.arraycopy(this.c, i, localzbct.b, 0, 16);
    i += 16;
    localzbct.a = zchf.a(this.c, i);
    i += 8;
    localzbct.d = zcgj.d(this.c, i);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
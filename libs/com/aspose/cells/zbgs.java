package com.aspose.cells;

import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;

class zbgs
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(10800, 0), new zn(21600, 10800), new zn(21600, 21600) };
  static int[] j = { 8193, 32768 };
  static zn[] k = new zn[0];
  
  zbgs(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    int m = (int)this.e.h();
    int n = (int)this.e.i();
    int i1 = (int)this.e.f();
    int i2 = (int)this.e.g();
    zq localzq = new zq(m, n, i1, i2);
    zbo localzbo = new zbo(i, j, null, null, null, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    zbn localzbn = new zbn(37, m, n, i1, i2, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.b(this.e.F());
    localzbn.a(this.e.E());
    localzbn.a(this.a, this.e, localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
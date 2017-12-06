package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbjm
  extends zco
{
  static zn[] i = { new zn(21600, 0), new zn(10800, 0), new zn(0, -2147483645), new zn(0, -2147483647), new zn(0, -2147483646), new zn(0, -2147483644), new zn(10800, 21600), new zn(21600, 21600), new zn(21600, 0), new zn(21600, 0), new zn(10800, 0), new zn(0, -2147483645), new zn(0, -2147483647), new zn(0, -2147483646), new zn(0, -2147483644), new zn(10800, 21600), new zn(21600, 21600) };
  static int[] j = { 8193, 1, 8193, 1, 24576, 32788, 8193, 1, 8193, 32768 };
  static zn[] k = { new zn(21600, 0), new zn(0, 10800), new zn(21600, 21600) };
  static zbgf[] l = { new zbgf(8193, 327, 1, 2), new zbgf(8192, 327, 0, 0), new zbgf(32768, 21600, 0, 327), new zbgf(8192, 1024, 0, 0), new zbgf(32768, 21600, 0, 1024) };
  private int[] n = { 1800 };
  static zbbi[] m = { new zbbi(new zn(6350, -2147483645), new zn(21600, -2147483644)) };
  
  zbjm(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    int i1 = (int)this.e.h();
    int i2 = (int)this.e.i();
    int i3 = (int)this.e.f();
    int i4 = (int)this.e.g();
    zq localzq = new zq(i1, i2, i3, i4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    int i5 = 0;
    if (this.e.l.a.size() > 0)
    {
      i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
      this.n = new int[] { i5 };
    }
    else
    {
      this.n = new int[] { 1800 };
    }
    zbo localzbo = new zbo(i, j, l, this.n, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    zbn localzbn = new zbn(85, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbkw
  extends zco
{
  static zn[] i = { new zn(21600, 0), new zn(-2147483645, -2147483644), new zn(Integer.MIN_VALUE, 5080), new zn(Integer.MIN_VALUE, 10800), new zn(Integer.MIN_VALUE, 16520), new zn(-2147483645, -2147483643), new zn(21600, 21600), new zn(9740, 21600), new zn(0, 16730), new zn(0, 10800), new zn(0, 4870), new zn(9740, 0), new zn(21600, 0) };
  static int[] j = { 8196, 24576, 32768 };
  static zn[] k = { new zn(21600, 0), new zn(0, 10800), new zn(21600, 21600), new zn(Integer.MIN_VALUE, 10800) };
  static zbgf[] l = { new zbgf(8192, 327, 0, 0), new zbgf(32768, 21600, 0, 327), new zbgf(8193, 1025, 1, 2), new zbgf(24576, 1026, 327, 0), new zbgf(8193, 327, 1794, 10000), new zbgf(32768, 21600, 0, 1028), new zbgf(8193, 327, 4000, 18900), new zbgf(32897, 0, 10800, 1030), new zbgf(32898, 0, 10800, 1030), new zbgf(24576, 1031, 1031, 0), new zbgf(32768, 21600, 0, 1032) };
  private int[] o = { 10800 };
  static zbbi[] m = { new zbbi(new zn(-2147483639, -2147483640), new zn(Integer.MIN_VALUE, -2147483638)) };
  static int[] n = { 2, 3, 4, 1 };
  
  zbkw(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
      this.o = new int[] { i5 };
    }
    else
    {
      this.o = new int[] { 10800 };
    }
    zbo localzbo = new zbo(i, j, l, this.o, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k, n);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    zbn localzbn = new zbn(184, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbkw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
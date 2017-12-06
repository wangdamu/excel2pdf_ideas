package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbhs
  extends zco
{
  static zn[] i = { new zn(Integer.MIN_VALUE, 0), new zn(0, -2147483647), new zn(0, -2147483646), new zn(Integer.MIN_VALUE, 21600), new zn(-2147483645, 21600), new zn(21600, -2147483646), new zn(21600, -2147483647), new zn(-2147483645, 0), new zn(Integer.MIN_VALUE, 0), new zn(Integer.MIN_VALUE, 0), new zn(0, -2147483647), new zn(0, -2147483646), new zn(Integer.MIN_VALUE, 21600), new zn(-2147483645, 21600), new zn(21600, -2147483646), new zn(21600, -2147483647), new zn(-2147483645, 0) };
  static int[] j = { 42753, 1, 43009, 1, 42753, 1, 43009, 1, 24576, 33044, 42753, 1, 43009, 32768, 42753, 1, 43009, 32768 };
  static zn[] k = { new zn(10800, 0), new zn(0, 10800), new zn(10800, 21600), new zn(21600, 10800) };
  static zbgf[] l = { new zbgf(24576, 320, 327, 0), new zbgf(24576, 321, 327, 0), new zbgf(40960, 323, 0, 327), new zbgf(40960, 322, 0, 327), new zbgf(8322, 327, 0, 450), new zbgf(8192, 1028, 0, 10800), new zbgf(32768, 0, 0, 327), new zbgf(40960, 1030, 0, 1029), new zbgf(40960, 320, 0, 1031), new zbgf(40960, 321, 0, 1031), new zbgf(24576, 322, 1031, 0), new zbgf(24576, 323, 1031, 0), new zbgf(40960, 320, 0, 1029), new zbgf(40960, 321, 0, 1029), new zbgf(24576, 322, 1029, 0), new zbgf(24576, 323, 1029, 0) };
  private int[] n = { 3600 };
  static zbbi[] m = { new zbbi(new zn(-2147483640, -2147483639), new zn(-2147483638, -2147483637)) };
  
  zbhs(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    zbn localzbn = new zbn(185, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
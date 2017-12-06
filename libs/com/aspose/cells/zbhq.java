package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbhq
  extends zco
{
  static zn[] i = { new zn(-2147483644, 0), new zn(Integer.MIN_VALUE, -2147483647), new zn(Integer.MIN_VALUE, -2147483642), new zn(0, 10800), new zn(Integer.MIN_VALUE, -2147483641), new zn(Integer.MIN_VALUE, -2147483646), new zn(-2147483644, 21600), new zn(-2147483640, 21600), new zn(-2147483645, -2147483646), new zn(-2147483645, -2147483641), new zn(21600, 10800), new zn(-2147483645, -2147483642), new zn(-2147483645, -2147483647), new zn(-2147483640, 0), new zn(-2147483644, 0), new zn(-2147483644, 0), new zn(Integer.MIN_VALUE, -2147483647), new zn(Integer.MIN_VALUE, -2147483642), new zn(0, 10800), new zn(Integer.MIN_VALUE, -2147483641), new zn(Integer.MIN_VALUE, -2147483646), new zn(-2147483644, 21600), new zn(-2147483640, 21600), new zn(-2147483645, -2147483646), new zn(-2147483645, -2147483641), new zn(21600, 10800), new zn(-2147483645, -2147483642), new zn(-2147483645, -2147483647), new zn(-2147483640, 0) };
  static int[] j = { 42753, 1, 43009, 42753, 1, 43009, 1, 42753, 1, 43009, 42753, 1, 43009, 1, 24576, 32784, 42753, 1, 43009, 42753, 1, 43009, 32768, 42753, 1, 43009, 42753, 1, 43009, 32768 };
  static zn[] k = { new zn(10800, 0), new zn(0, 10800), new zn(10800, 21600), new zn(21600, 10800) };
  static zbgf[] l = { new zbgf(24576, 320, 327, 0), new zbgf(24576, 321, 327, 0), new zbgf(40960, 323, 0, 327), new zbgf(40960, 322, 0, 327), new zbgf(8193, 1024, 2, 1), new zbgf(8193, 327, 2, 1), new zbgf(32768, 10800, 0, 327), new zbgf(32768, 21600, 0, 1030), new zbgf(40960, 322, 0, 1029), new zbgf(8193, 327, 1, 3), new zbgf(24576, 1033, 327, 0), new zbgf(24576, 320, 1034, 0), new zbgf(24576, 321, 1033, 0), new zbgf(40960, 322, 0, 1034), new zbgf(40960, 323, 0, 1033) };
  private int[] n = { 1800 };
  static zbbi[] m = { new zbbi(new zn(-2147483637, -2147483636), new zn(-2147483635, -2147483634)) };
  
  zbhq(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    zbn localzbn = new zbn(186, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    b();
    this.a.a(localzf);
  }
  
  void b()
    throws Exception
  {
    this.a.c();
    zq localzq = this.e.l();
    float f1 = 0.0F;
    float f2 = this.e.l().h();
    float f3 = this.e.l().i();
    if (this.e.l.a.size() > 0) {
      f1 = ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
    } else {
      f1 = 1736.0F;
    }
    float f4 = f1 * (f2 > f3 ? f3 : f2) / 21600.0F;
    if (!this.e.n().a()) {
      localzq.a(-((f4 + this.e.n().f() * 16.0F) / 2.0F), -(this.e.n().f() * 16.0F / 2.0F));
    }
    float f5 = zbya.a(this.e.o().h());
    if ((this.e.q() == 7) || (this.e.q() == 9))
    {
      if ((int)this.e.d().a() == 0) {
        localzq.a(localzq.f() + f5);
      }
    }
    else if (((this.e.q() == 0) || (this.e.q() == 8)) && ((int)this.e.d().c() == 0)) {
      localzq.c(localzq.h() - f5);
    }
    if (this.e.u().equals("\n")) {
      return;
    }
    zbya.a(this.a, this.e, localzq, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
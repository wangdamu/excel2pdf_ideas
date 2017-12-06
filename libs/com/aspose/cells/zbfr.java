package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbfr
  extends zco
{
  static zn[] i = { new zn(0, 21600), new zn(0, 12160), new zn(12427, -2147483647), new zn(Integer.MIN_VALUE, -2147483647), new zn(Integer.MIN_VALUE, 0), new zn(21600, 6079), new zn(Integer.MIN_VALUE, 12158), new zn(Integer.MIN_VALUE, -2147483646), new zn(12427, -2147483646), new zn(-2147483644, 12160), new zn(-2147483644, 21600) };
  static int[] j = { 1, 43009, 6, 42753, 1, 24576, 32768 };
  static zn[] k = { new zn(Integer.MIN_VALUE, 0), new zn(Integer.MIN_VALUE, 12158), new zn(-2147483645, 21600), new zn(21600, 6079) };
  static zbgf[] l = { new zbgf(8192, 327, 0, 0), new zbgf(8192, 328, 0, 0), new zbgf(32768, 12158, 0, 328), new zbgf(32768, 6079, 0, 328), new zbgf(8193, 1027, 2, 1), new zbgf(32768, 21600, 0, 1030), new zbgf(24576, 1032, 1031, 6079), new zbgf(32768, 6079, 0, 328), new zbgf(32768, 21600, 0, 327) };
  private int[] o = { 15100, 2900 };
  static zbbi[] m = { new zbbi(12427, -2147483647, -2147483643, -2147483646) };
  static int[] n = { 2, 4, 4, 1 };
  
  zbfr(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    int i6 = 0;
    if (this.e.l.a.size() > 0)
    {
      switch (this.e.l.a.size())
      {
      case 2: 
        if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 2100;
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = 15100;
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      case 1: 
        if (((zar)this.e.l.a.get(0)).b() == 327)
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 2100;
        }
        else if (((zar)this.e.l.a.get(0)).b() == 328)
        {
          i5 = 15100;
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      default: 
        i5 = 15100;
        i6 = 2100;
      }
      this.o = new int[] { i5, i6 };
    }
    zbo localzbo = new zbo(i, j, l, this.o, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k, n);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    zbn localzbn = new zbn(91, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
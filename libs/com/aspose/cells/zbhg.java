package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbhg
  extends zco
{
  static zn[] i = { new zn(0, 43936), new zn(-2147483643, 21600), new zn(0, 0), new zn(-2147483639, 21600), new zn(-2147483640, 21600), new zn(-2147483642, 43936), new zn(-2147483634, 21600), new zn(-2147483640, 21600), new zn(-2147483642, 0), new zn(0, 0), new zn(0, 43936), new zn(-2147483643, 21600), new zn(-2147483633, -2147483636), new zn(-2147483637, -2147483646), new zn(-2147483631, -2147483646), new zn(-2147483629, 0), new zn(-2147483630, -2147483646), new zn(-2147483632, -2147483646), new zn(-2147483642, 43936), new zn(-2147483634, 21600), new zn(-2147483632, -2147483646), new zn(-2147483633, -2147483636) };
  static int[] j = { 41732, 1, 42244, 1, 24576, 32770, 41732, 4, 42244, 24576, 32768 };
  static zn[] k = { new zn(-2147483629, 0), new zn(-2147483631, -2147483646), new zn(-2147483626, 0), new zn(-2147483633, 21600), new zn(-2147483630, -2147483646) };
  static zbgf[] l = { new zbgf(8192, 327, 0, 0), new zbgf(8192, 328, 0, 0), new zbgf(8192, 329, 0, 0), new zbgf(32768, 21600, 0, 328), new zbgf(8192, 329, 0, 0), new zbgf(24576, 327, 1027, 0), new zbgf(57344, 328, 328, 1031), new zbgf(8192, 327, 21600, 0), new zbgf(24576, 1033, 1030, 0), new zbgf(8193, 1029, 1, 2), new zbgf(40975, 1028, 21600, 1033), new zbgf(24576, 1034, 1033, 0), new zbgf(24591, 1030, 1029, 21600), new zbgf(32768, 21600, 0, 1036), new zbgf(24576, 1029, 1030, 0), new zbgf(8193, 1038, 1, 2), new zbgf(24576, 1035, 1030, 0), new zbgf(40960, 1035, 0, 1027), new zbgf(24576, 1040, 1027, 0), new zbgf(24576, 1039, 1033, 0), new zbgf(8193, 327, 2, 7), new zbgf(40960, 328, 0, 1044), new zbgf(8193, 1030, 1, 2) };
  private int[] n = { 13000, 19400, 7200 };
  static zbbi[] m = { new zbbi(-2147483628, 2900, -2147483627, 18700) };
  
  zbhg(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    int i7 = 0;
    if (this.e.l.a.size() > 0)
    {
      switch (this.e.l.a.size())
      {
      case 3: 
        i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(2)).a()));
        break;
      case 2: 
        if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
          i7 = 7200;
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 19400;
          i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = 13000;
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        }
        break;
      case 1: 
        if (((zar)this.e.l.a.get(0)).b() == 327)
        {
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 19400;
          i7 = 7200;
        }
        else if (((zar)this.e.l.a.get(0)).b() == 328)
        {
          i5 = 13000;
          i6 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i7 = 7200;
        }
        else
        {
          i5 = 13000;
          i6 = 19400;
          i7 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      default: 
        i5 = 13000;
        i6 = 19400;
        i7 = 7200;
      }
      this.n = new int[] { i5, i6, i7 };
    }
    zbo localzbo = new zbo(i, j, l, this.n, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    zbn localzbn = new zbn(104, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
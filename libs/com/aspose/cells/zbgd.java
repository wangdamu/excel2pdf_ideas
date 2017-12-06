package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbgd
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(21600, 21600), new zn(-2147483644, -2147483645), new zn(-2147483646, -2147483645), new zn(-2147483643, -2147483643), new zn(-2147483642, -2147483642), new zn(-2147483646, -2147483645), new zn(-2147483644, -2147483645), new zn(0, 0), new zn(21600, 21600) };
  static int[] j = { 41988, 42244, 24576, 32768 };
  static zn[] k = { new zn(10800, -2147483633), new zn(-2147483636, -2147483635), new zn(10800, -2147483632), new zn(-2147483634, -2147483635) };
  static zbgf[] l = { new zbgf(16394, 10800, 327, 0), new zbgf(16393, 10800, 327, 0), new zbgf(8192, 1024, 10800, 0), new zbgf(8192, 1025, 10800, 0), new zbgf(32768, 21600, 0, 1026), new zbgf(32768, 10800, 0, 328), new zbgf(16384, 10800, 328, 0), new zbgf(24586, 1029, 327, 0), new zbgf(24585, 1029, 327, 0), new zbgf(24586, 1035, 327, 0), new zbgf(24585, 1035, 327, 0), new zbgf(16386, 10800, 328, 0), new zbgf(8192, 1033, 10800, 0), new zbgf(8192, 1034, 10800, 0), new zbgf(32768, 21600, 0, 1036), new zbgf(8198, 1024, 21600, 0), new zbgf(57350, 1024, 1030, 1029) };
  private int[] m = { 11796480, 5400 };
  
  zbgd(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    int n = (int)this.e.h();
    int i1 = (int)this.e.i();
    int i2 = (int)this.e.f();
    int i3 = (int)this.e.g();
    zq localzq = new zq(n, i1, i2, i3);
    zf localzf = this.a.d();
    this.a.a(4, true);
    int i4 = 0;
    int i5 = 0;
    if (this.e.l.a.size() > 0)
    {
      switch (this.e.l.a.size())
      {
      case 2: 
        if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 328))
        {
          i4 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i4 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i5 = 5400;
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i4 = 11796480;
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      case 1: 
        if (((zar)this.e.l.a.get(0)).b() == 327)
        {
          i4 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i5 = 5400;
        }
        else if (((zar)this.e.l.a.get(0)).b() == 328)
        {
          i4 = 11796480;
          i5 = ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      default: 
        i4 = 11796480;
        i5 = 5400;
      }
      this.m = new int[] { i4, i5 };
    }
    zbo localzbo = new zbo(i, j, l, this.m, null, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    zbn localzbn = new zbn(95, n, i1, i2, i3, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
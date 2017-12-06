package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbfn
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(21600, 21600), new zn(Integer.MIN_VALUE, -2147483647), new zn(-2147483646, -2147483645), new zn(10800, 10800), new zn(Integer.MIN_VALUE, -2147483647), new zn(0, 0), new zn(21600, 21600), new zn(Integer.MIN_VALUE, -2147483647), new zn(-2147483646, -2147483645) };
  static int[] j = { 42244, 2, 24576, 32788, 42244, 32768 };
  static zn[] k = { new zn(Integer.MIN_VALUE, -2147483647), new zn(-2147483646, -2147483645), new zn(10800, 10800) };
  static zbgf[] l = { new zbgf(16384, 10800, 1028, 0), new zbgf(16384, 10800, 1029, 0), new zbgf(16384, 10800, 1030, 0), new zbgf(16384, 10800, 1031, 0), new zbgf(16394, 10800, 327, 0), new zbgf(16393, 10800, 327, 0), new zbgf(16394, 10800, 328, 0), new zbgf(16393, 10800, 328, 0) };
  private int[] m = { 17694720, 0 };
  
  zbfn(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    ArrayList localArrayList = this.e.l.a;
    switch (localArrayList.size())
    {
    case 2: 
      if ((((zar)localArrayList.get(0)).b() == 327) && (((zar)localArrayList.get(1)).b() == 328))
      {
        i4 = ze.f(Integer.valueOf(((zar)localArrayList.get(0)).a()));
        i5 = ze.f(Integer.valueOf(((zar)localArrayList.get(1)).a()));
      }
      else if ((((zar)localArrayList.get(0)).b() == 327) && (((zar)localArrayList.get(1)).b() == 329))
      {
        i4 = ze.f(Integer.valueOf(((zar)localArrayList.get(0)).a()));
        i5 = 0;
      }
      else if ((((zar)localArrayList.get(0)).b() == 328) && (((zar)localArrayList.get(1)).b() == 329))
      {
        i4 = 17694720;
        i5 = ze.f(Integer.valueOf(((zar)localArrayList.get(0)).a()));
      }
      break;
    case 1: 
      if (((zar)localArrayList.get(0)).b() == 327)
      {
        i4 = ze.f(Integer.valueOf(((zar)localArrayList.get(0)).a()));
        i5 = 0;
      }
      else if (((zar)localArrayList.get(0)).b() == 328)
      {
        i4 = 17694720;
        i5 = ze.f(Integer.valueOf(((zar)localArrayList.get(0)).a()));
      }
      break;
    default: 
      i4 = 17694720;
      i5 = 0;
    }
    this.m = new int[] { i4, i5 };
    zbo localzbo = new zbo(i, j, l, this.m, null, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    zbn localzbn = new zbn(19, n, i1, i2, i3, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.a(this.a, this.e, localzq);
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
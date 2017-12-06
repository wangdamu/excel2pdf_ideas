package com.aspose.cells;

import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;

class zbie
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(Integer.MIN_VALUE, 0), new zn(Integer.MIN_VALUE, 21600), new zn(21600, 21600) };
  static int[] j = { 3, 32768 };
  static zbgf[] k = { new zbgf(8192, 327, 0, 0) };
  static zn[] l = new zn[0];
  private int[] m = { 10800 };
  
  zbie(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    int i4 = 0;
    ArrayList localArrayList = this.e.l.a;
    if (localArrayList.size() > 0)
    {
      if (((zar)localArrayList.get(0)).b() == 327) {
        i4 = ze.f(Integer.valueOf(((zar)localArrayList.get(0)).a()));
      } else {
        i4 = 10800;
      }
    }
    else {
      i4 = 10800;
    }
    this.m = new int[] { i4 };
    zbo localzbo = new zbo(i, j, k, this.m, null, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, l);
    zbn localzbn = new zbn(34, n, i1, i2, i3, this.e.n().c(), this.e.n().f(), this.e.m().b(), localzbo);
    localzbn.a(this.e.j());
    localzbn.b(this.e.F());
    localzbn.a(this.e.E());
    zq localzq = new zq(this.g, this.h, this.e.f(), this.e.g());
    localzbn.a(this.a, this.e, localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.Iterator;

class zbfx
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(Integer.MIN_VALUE, 0), new zn(Integer.MIN_VALUE, -2147483647), new zn(-2147483646, -2147483647), new zn(-2147483646, 21600), new zn(21600, 21600) };
  static int[] j = { 5, 32768 };
  static zbgf[] k = { new zbgf(8192, 327, 0, 0), new zbgf(8192, 328, 0, 0), new zbgf(8192, 329, 0, 0) };
  private int[] m = { 10800, 10800, 10800 };
  static zn[] l = new zn[0];
  
  zbfx(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    int n = 1;
    int i1 = 1;
    int i2 = (int)this.e.f();
    int i3 = (int)this.e.g();
    zq localzq = new zq(n, i1, i2, i3);
    ArrayList localArrayList = this.e.l.a;
    int i4 = 10800;
    int i5 = 10800;
    int i6 = 10800;
    if (localArrayList.size() > 0)
    {
      localObject1 = localArrayList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zar)((Iterator)localObject1).next();
        if (((zar)localObject2).b() == 327) {
          i4 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 328) {
          i5 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 329) {
          i6 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
      }
      this.m = new int[] { i4, i5, i6 };
    }
    Object localObject1 = new zbo(i, j, k, this.m, null, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, l);
    Object localObject2 = new zbn(36, n, i1, i2, i3, this.e.n().c(), this.e.n().f(), this.e.m().b(), (zbo)localObject1);
    ((zbn)localObject2).a(this.e.j());
    ((zbn)localObject2).b(this.e.F());
    ((zbn)localObject2).a(this.e.E());
    ((zbn)localObject2).a(this.a, this.e, localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
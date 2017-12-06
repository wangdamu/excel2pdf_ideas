package com.aspose.cells;

import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.Iterator;

class zbfv
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(Integer.MIN_VALUE, 0), new zn(Integer.MIN_VALUE, -2147483647), new zn(21600, -2147483647), new zn(21600, 21600) };
  static int[] j = { 4, 32768 };
  static zn[] k = new zn[0];
  static zbgf[] l = { new zbgf(8192, 327, 0, 0), new zbgf(8192, 328, 0, 0) };
  private int[] m = { 10800, 10800 };
  
  zbfv(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
      }
      this.m = new int[] { i4, i5 };
    }
    Object localObject1 = new zbo(i, j, l, this.m, null, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    Object localObject2 = new zbn(35, n, i1, i2, i3, this.e.n().c(), this.e.n().f(), this.e.m().b(), (zbo)localObject1);
    ((zbn)localObject2).a(this.e.j());
    ((zbn)localObject2).b(this.e.F());
    ((zbn)localObject2).a(this.e.E());
    ((zbn)localObject2).a(this.a, this.e, localzq);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
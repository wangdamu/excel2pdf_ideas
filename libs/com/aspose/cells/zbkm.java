package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.Iterator;

class zbkm
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(21600, 0), new zn(21600, 21600), new zn(0, 21600), new zn(0, 0), new zn(Integer.MIN_VALUE, -2147483647), new zn(-2147483646, -2147483645), new zn(-2147483644, -2147483643), new zn(-2147483642, -2147483641) };
  static int[] j = { 4, 24576, 32768, 3, 43520, 32768 };
  static zn[] k = { new zn(10800, 0), new zn(0, 10800), new zn(10800, 21600), new zn(21600, 10800), new zn(Integer.MIN_VALUE, -2147483647) };
  static zbgf[] l = { new zbgf(8192, 327, 0, 0), new zbgf(8192, 328, 0, 0), new zbgf(8192, 329, 0, 0), new zbgf(8192, 330, 0, 0), new zbgf(8192, 331, 0, 0), new zbgf(8192, 332, 0, 0), new zbgf(8192, 333, 0, 0), new zbgf(8192, 334, 0, 0) };
  private int[] n = { 23400, 24400, 25200, 21600, 25200, 4050, 23400, 4050 };
  static zbbi[] m = { new zbbi(0, 0, 21600, 21600) };
  
  zbkm(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
    ArrayList localArrayList = this.e.l.a;
    int i5 = 23400;
    int i6 = 24400;
    int i7 = 25200;
    int i8 = 21600;
    int i9 = 25200;
    int i10 = 4050;
    int i11 = 23400;
    int i12 = 4050;
    if (this.e.l.a.size() > 0)
    {
      localObject1 = localArrayList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zar)((Iterator)localObject1).next();
        if (((zar)localObject2).b() == 327) {
          i5 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 328) {
          i6 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 329) {
          i7 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 330) {
          i8 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 331) {
          i9 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 332) {
          i10 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 333) {
          i11 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
        if (((zar)localObject2).b() == 334) {
          i12 = ze.f(Integer.valueOf(((zar)localObject2).a()));
        }
      }
      this.n = new int[] { i5, i6, i7, i8, i9, i10, i11, i12 };
    }
    Object localObject1 = new zbo(i, j, l, this.n, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    Object localObject2 = new zbn(49, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), (zbo)localObject1);
    ((zbn)localObject2).a(this.e.j());
    ((zbn)localObject2).a(this.a, this.e, localzq);
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbkm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
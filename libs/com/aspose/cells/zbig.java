package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbig
  extends zco
{
  static zn[] i = { new zn(0, 0), new zn(21600, 21600), new zn(Integer.MIN_VALUE, -2147483647), new zn(-2147483646, -2147483645), new zn(-2147483644, -2147483643) };
  static int[] j = { 46340, 1, 24576, 32768 };
  static zn[] k = { new zn(10800, 0), new zn(3160, 3160), new zn(0, 10800), new zn(3160, 18440), new zn(10800, 21600), new zn(18440, 18440), new zn(21600, 10800), new zn(18440, 3160), new zn(-2147483644, -2147483643) };
  static zbgf[] l = { new zbgf(16384, 10800, 1030, 0), new zbgf(16384, 10800, 1031, 0), new zbgf(16384, 10800, 1032, 0), new zbgf(16384, 10800, 1033, 0), new zbgf(8192, 327, 0, 0), new zbgf(8192, 328, 0, 0), new zbgf(16393, 10800, 1034, 0), new zbgf(16394, 10800, 1034, 0), new zbgf(16393, 10800, 1035, 0), new zbgf(16394, 10800, 1035, 0), new zbgf(8206, 1036, 0, 11), new zbgf(8206, 1036, 11, 0), new zbgf(24584, 1038, 1037, 0), new zbgf(8192, 327, 0, 10800), new zbgf(8192, 328, 0, 10800) };
  private int[] n = { 1350, 25920 };
  static zbbi[] m = { new zbbi(new zn(3200, 3200), new zn(18400, 18400)) };
  
  zbig(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
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
          i5 = com.aspose.cells.b.a.ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = com.aspose.cells.b.a.ze.f(Integer.valueOf(((zar)this.e.l.a.get(1)).a()));
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 327) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = com.aspose.cells.b.a.ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 25920;
        }
        else if ((((zar)this.e.l.a.get(0)).b() == 328) && (((zar)this.e.l.a.get(1)).b() == 329))
        {
          i5 = 1350;
          i6 = com.aspose.cells.b.a.ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      case 1: 
        if (((zar)this.e.l.a.get(0)).b() == 327)
        {
          i5 = com.aspose.cells.b.a.ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
          i6 = 25920;
        }
        else if (((zar)this.e.l.a.get(0)).b() == 328)
        {
          i5 = 1350;
          i6 = com.aspose.cells.b.a.ze.f(Integer.valueOf(((zar)this.e.l.a.get(0)).a()));
        }
        break;
      default: 
        i5 = 1350;
        i6 = 25920;
      }
      this.n = new int[] { i5, i6 };
    }
    float f1 = Math.abs(localzq.h() * (i5 / 21600.0F));
    float f2 = Math.abs(localzq.i() * (i6 / 21600.0F));
    zs localzs = zbya.a(this.e.n());
    if ((i5 > 0) && (i6 > 0) && (f1 <= localzq.h()) && (f2 <= localzq.i()))
    {
      if (!this.e.n().a()) {
        this.a.a(localzs, localzq);
      }
      if (!this.e.m().a())
      {
        localObject1 = new com.aspose.cells.b.a.b.a.ze();
        ((com.aspose.cells.b.a.b.a.ze)localObject1).b(localzq);
        localObject2 = zbya.a(this.e.m(), (com.aspose.cells.b.a.b.a.ze)localObject1);
        this.a.a((zc)localObject2, localzq);
      }
      b(this.e.l());
      this.a.a(localzf);
      return;
    }
    Object localObject1 = new zbo(i, j, l, this.n, m, 21600, 21600, Integer.MIN_VALUE, Integer.MIN_VALUE, k);
    if (this.e.m().d()) {
      this.e.m().a(Color.getWhite());
    }
    Object localObject2 = new zbn(63, i1, i2, i3, i4, this.e.n().c(), this.e.n().f(), this.e.m().b(), (zbo)localObject1);
    ((zbn)localObject2).a(this.e.j());
    ((zbn)localObject2).a(this.a, this.e, localzq);
    b(this.e.l());
    this.a.a(localzf);
  }
  
  void b(zq paramzq)
    throws Exception
  {
    this.a.c();
    paramzq = zbix.a(paramzq);
    if (!this.e.n().a()) {
      paramzq.a(-(this.e.n().f() / 2.0F), -(this.e.n().f() / 2.0F));
    }
    float f = zbya.a(this.e.o().h());
    if ((this.e.q() == 7) || (this.e.q() == 9))
    {
      if ((int)this.e.d().a() == 0) {
        paramzq.a(paramzq.f() + f);
      }
    }
    else if (((this.e.q() == 0) || (this.e.q() == 8)) && ((int)this.e.d().c() == 0)) {
      paramzq.c(paramzq.h() - f);
    }
    paramzq.a(paramzq.f() + (float)this.e.d().a());
    paramzq.c(paramzq.h() - (float)(this.e.d().a() + this.e.d().c()));
    paramzq.b(paramzq.g() + (float)this.e.d().b());
    paramzq.d(paramzq.i() - (float)(this.e.d().b() + this.e.d().d()));
    if (paramzq.i() < this.e.o().d())
    {
      paramzq.a(0.0F, (this.e.o().d() - paramzq.i()) / 2.0F);
      if (paramzq.i() > this.e.l().i()) {
        paramzq.d(this.e.l().i());
      }
    }
    if (this.e.u().equals("\n")) {
      return;
    }
    zbya.a(this.a, this.e, paramzq, this.e.u(), this.e.t(), this.e.o(), this.e.p(), this.e.q(), this.e.r());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
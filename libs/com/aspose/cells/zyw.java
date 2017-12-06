package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zyw
  extends zcp
{
  private float l = 0.0F;
  private float m = 0.0F;
  
  zyw(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    this.l = (0.074F * this.e.y().h());
    this.m = (0.092F * this.e.y().i());
    zf localzf = this.a.d();
    this.a.a(4, true);
    zq localzq = new zq(this.g, this.h + 2.0F * this.m, this.e.y().h() - 2.0F * this.l, this.e.y().i() - 2.0F * this.m);
    zs localzs = zbyb.a(this.e.A());
    ze localze1 = new ze();
    localze1.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze1);
    ze localze2;
    zo[] arrayOfzo1;
    zo localzo1;
    zo localzo2;
    ze localze3;
    zo[] arrayOfzo2;
    ze localze4;
    zo[] arrayOfzo3;
    if (!this.e.z().a())
    {
      localze2 = new ze();
      arrayOfzo1 = new zo[4];
      arrayOfzo1[0] = new zo(localzq.f(), localzq.g());
      arrayOfzo1[1] = new zo(localzq.f() + localzq.h(), localzq.g());
      arrayOfzo1[2] = new zo(localzq.f() + localzq.h(), localzq.g() + 0.8F * localzq.i());
      arrayOfzo1[3] = new zo(localzq.f(), localzq.g() + 0.93F * localzq.i());
      localzo1 = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() * 1.13F);
      localzo2 = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + 0.8F * localzq.i());
      localze2.a(arrayOfzo1[0], arrayOfzo1[1]);
      localze2.a(arrayOfzo1[1], arrayOfzo1[2]);
      localze2.a(arrayOfzo1[2], localzo2, localzo1, arrayOfzo1[3]);
      localze2.a(arrayOfzo1[3], arrayOfzo1[0]);
      localze2.j();
      this.a.a(localzc, localze2);
      localze3 = new ze();
      arrayOfzo2 = new zo[6];
      arrayOfzo2[0] = new zo(this.g + this.l, this.h + 2.0F * this.m);
      arrayOfzo2[1] = new zo(this.g + this.l, this.h + this.m);
      arrayOfzo2[2] = new zo(this.g + this.e.s() - this.l, this.h + this.m);
      arrayOfzo2[3] = new zo(this.g + this.e.s() - this.l, this.h + this.m + 0.66F * this.e.t());
      arrayOfzo2[4] = new zo(this.g + this.e.s() - 2.0F * this.l, this.h + this.m + 0.66F * this.e.t());
      arrayOfzo2[5] = new zo(this.g + this.e.s() - 2.0F * this.l, this.h + 2.0F * this.m);
      localze3.b(arrayOfzo2);
      this.a.a(localzc, localze3);
      localze4 = new ze();
      arrayOfzo3 = new zo[6];
      arrayOfzo3[0] = new zo(this.g + 2.0F * this.l, this.h + this.m);
      arrayOfzo3[1] = new zo(this.g + 2.0F * this.l, this.h);
      arrayOfzo3[2] = new zo(this.g + this.e.s(), this.h);
      arrayOfzo3[3] = new zo(this.g + this.e.s(), this.h + 0.66F * this.e.t());
      arrayOfzo3[4] = new zo(this.g + this.e.s() - this.l, this.h + 0.66F * this.e.t());
      arrayOfzo3[5] = new zo(this.g + this.e.s() - this.l, this.h + this.m);
      localze4.b(arrayOfzo3);
      this.a.a(localzc, localze4);
    }
    if (!this.e.A().a())
    {
      localze2 = new ze();
      arrayOfzo1 = new zo[4];
      arrayOfzo1[0] = new zo(localzq.f(), localzq.g());
      arrayOfzo1[1] = new zo(localzq.f() + localzq.h(), localzq.g());
      arrayOfzo1[2] = new zo(localzq.f() + localzq.h(), localzq.g() + 0.8F * localzq.i());
      arrayOfzo1[3] = new zo(localzq.f(), localzq.g() + 0.93F * localzq.i());
      localzo1 = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + localzq.i() * 1.13F);
      localzo2 = new zo(localzq.f() + localzq.h() / 2.0F, localzq.g() + 0.8F * localzq.i());
      localze2.a(arrayOfzo1[0], arrayOfzo1[1]);
      localze2.a(arrayOfzo1[1], arrayOfzo1[2]);
      localze2.a(arrayOfzo1[2], localzo2, localzo1, arrayOfzo1[3]);
      localze2.a(arrayOfzo1[3], arrayOfzo1[0]);
      localze2.j();
      this.a.a(localzs, localze2);
      localze3 = new ze();
      arrayOfzo2 = new zo[6];
      arrayOfzo2[0] = new zo(this.g + this.l, this.h + 2.0F * this.m);
      arrayOfzo2[1] = new zo(this.g + this.l, this.h + this.m);
      arrayOfzo2[2] = new zo(this.g + this.e.s() - this.l, this.h + this.m);
      arrayOfzo2[3] = new zo(this.g + this.e.s() - this.l, this.h + this.m + 0.66F * this.e.t());
      arrayOfzo2[4] = new zo(this.g + this.e.s() - 2.0F * this.l, this.h + this.m + 0.66F * this.e.t());
      arrayOfzo2[5] = new zo(this.g + this.e.s() - 2.0F * this.l, this.h + 2.0F * this.m);
      localze3.b(arrayOfzo2);
      this.a.a(localzs, localze3);
      localze4 = new ze();
      arrayOfzo3 = new zo[6];
      arrayOfzo3[0] = new zo(this.g + 2.0F * this.l, this.h + this.m);
      arrayOfzo3[1] = new zo(this.g + 2.0F * this.l, this.h);
      arrayOfzo3[2] = new zo(this.g + this.e.s(), this.h);
      arrayOfzo3[3] = new zo(this.g + this.e.s(), this.h + 0.66F * this.e.t());
      arrayOfzo3[4] = new zo(this.g + this.e.s() - this.l, this.h + 0.66F * this.e.t());
      arrayOfzo3[5] = new zo(this.g + this.e.s() - this.l, this.h + this.m);
      localze4.b(arrayOfzo3);
      this.a.a(localzs, localze4);
    }
    a();
    this.a.a(localzf);
  }
  
  void c(zq paramzq)
    throws Exception
  {
    paramzq = d(paramzq);
    super.c(paramzq);
  }
  
  private zq d(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g() + 2.0F * this.m;
    zq localzq = new zq(f1, f2, paramzq.h() - 2.0F * this.l, paramzq.i() * 0.9F - 2.0F * this.m);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
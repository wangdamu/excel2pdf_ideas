package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zyv
  extends zco
{
  private float i = 0.0F;
  private float j = 0.0F;
  
  zyv(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    this.i = (0.074F * this.e.l().h());
    this.j = (0.092F * this.e.l().i());
    zf localzf = this.a.d();
    this.a.a(4, true);
    zq localzq = new zq(this.g, this.h + 2.0F * this.j, this.e.l().h() - 2.0F * this.i, this.e.l().i() - 2.0F * this.j);
    zs localzs = zbya.a(this.e.n());
    ze localze1 = new ze();
    localze1.b(this.e.l());
    zc localzc = zbya.a(this.e.m(), localze1);
    ze localze2;
    zo[] arrayOfzo1;
    zo localzo1;
    zo localzo2;
    ze localze3;
    zo[] arrayOfzo2;
    ze localze4;
    zo[] arrayOfzo3;
    if (!this.e.m().a())
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
      arrayOfzo2[0] = new zo(this.g + this.i, this.h + 2.0F * this.j);
      arrayOfzo2[1] = new zo(this.g + this.i, this.h + this.j);
      arrayOfzo2[2] = new zo(this.g + this.e.f() - this.i, this.h + this.j);
      arrayOfzo2[3] = new zo(this.g + this.e.f() - this.i, this.h + this.j + 0.66F * this.e.g());
      arrayOfzo2[4] = new zo(this.g + this.e.f() - 2.0F * this.i, this.h + this.j + 0.66F * this.e.g());
      arrayOfzo2[5] = new zo(this.g + this.e.f() - 2.0F * this.i, this.h + 2.0F * this.j);
      localze3.b(arrayOfzo2);
      this.a.a(localzc, localze3);
      localze4 = new ze();
      arrayOfzo3 = new zo[6];
      arrayOfzo3[0] = new zo(this.g + 2.0F * this.i, this.h + this.j);
      arrayOfzo3[1] = new zo(this.g + 2.0F * this.i, this.h);
      arrayOfzo3[2] = new zo(this.g + this.e.f(), this.h);
      arrayOfzo3[3] = new zo(this.g + this.e.f(), this.h + 0.66F * this.e.g());
      arrayOfzo3[4] = new zo(this.g + this.e.f() - this.i, this.h + 0.66F * this.e.g());
      arrayOfzo3[5] = new zo(this.g + this.e.f() - this.i, this.h + this.j);
      localze4.b(arrayOfzo3);
      this.a.a(localzc, localze4);
    }
    if (!this.e.n().a())
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
      arrayOfzo2[0] = new zo(this.g + this.i, this.h + 2.0F * this.j);
      arrayOfzo2[1] = new zo(this.g + this.i, this.h + this.j);
      arrayOfzo2[2] = new zo(this.g + this.e.f() - this.i, this.h + this.j);
      arrayOfzo2[3] = new zo(this.g + this.e.f() - this.i, this.h + this.j + 0.66F * this.e.g());
      arrayOfzo2[4] = new zo(this.g + this.e.f() - 2.0F * this.i, this.h + this.j + 0.66F * this.e.g());
      arrayOfzo2[5] = new zo(this.g + this.e.f() - 2.0F * this.i, this.h + 2.0F * this.j);
      localze3.b(arrayOfzo2);
      this.a.a(localzs, localze3);
      localze4 = new ze();
      arrayOfzo3 = new zo[6];
      arrayOfzo3[0] = new zo(this.g + 2.0F * this.i, this.h + this.j);
      arrayOfzo3[1] = new zo(this.g + 2.0F * this.i, this.h);
      arrayOfzo3[2] = new zo(this.g + this.e.f(), this.h);
      arrayOfzo3[3] = new zo(this.g + this.e.f(), this.h + 0.66F * this.e.g());
      arrayOfzo3[4] = new zo(this.g + this.e.f() - this.i, this.h + 0.66F * this.e.g());
      arrayOfzo3[5] = new zo(this.g + this.e.f() - this.i, this.h + this.j);
      localze4.b(arrayOfzo3);
      this.a.a(localzs, localze4);
    }
    b();
    this.a.a(localzf);
  }
  
  void b(zq paramzq)
    throws Exception
  {
    paramzq = c(paramzq);
    super.b(paramzq);
  }
  
  private zq c(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g() + 2.0F * this.j;
    zq localzq = new zq(f1, f2, paramzq.h() - 2.0F * this.i, paramzq.i() * 0.9F - 2.0F * this.j);
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zyv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
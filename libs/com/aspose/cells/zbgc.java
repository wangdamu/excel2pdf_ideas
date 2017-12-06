package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbgc
  extends zcp
{
  zbgc(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    float f5 = 0.0F;
    zq localzq1 = new zq(f1, f2, f3, f4);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(localzq1);
    zs localzs = zbyb.a(this.e.A());
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f5 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
      } else {
        f5 = 0.125F;
      }
    }
    else {
      f5 = 0.125F;
    }
    float f6 = f4 * f5;
    zo localzo1 = new zo(f1, f2);
    zo localzo2 = new zo(f1 + f3, f2);
    zo localzo3 = new zo(f1 + f3, f2 + f4);
    zo localzo4 = new zo(f1, f2 + f4);
    zo localzo5 = new zo(f1 + f6, f2 + f6);
    zo localzo6 = new zo(f1 + f3 - f6, f2 + f6);
    zo localzo7 = new zo(f1 + f3 - f6, f2 + f4 - f6);
    zo localzo8 = new zo(f1 + f6, f2 + f4 - f6);
    zo[] arrayOfzo1 = { localzo1, localzo2, localzo6, localzo5 };
    zo[] arrayOfzo2 = { localzo2, localzo3, localzo7, localzo6 };
    zo[] arrayOfzo3 = { localzo3, localzo4, localzo8, localzo7 };
    zo[] arrayOfzo4 = { localzo4, localzo1, localzo5, localzo8 };
    zo[] arrayOfzo5 = { localzo5, localzo6, localzo7, localzo8 };
    zc localzc1 = zbyb.a(this.e.z(), localzq1, 1.0F, 0.0F);
    zc localzc2 = zbyb.a(this.e.z(), localzq1, 0.6F, 0.0F);
    zc localzc3 = zbyb.a(this.e.z(), localzq1, 0.8F, 0.0F);
    zc localzc4 = zbyb.a(this.e.z(), localzq1, 1.0F, 0.0F);
    zc localzc5 = zbyb.a(this.e.z(), localze);
    if (!this.e.z().a())
    {
      this.a.a(localzc1, arrayOfzo1);
      this.a.a(localzc2, arrayOfzo2);
      this.a.a(localzc3, arrayOfzo3);
      this.a.a(localzc4, arrayOfzo4);
      this.a.a(localzc5, arrayOfzo5);
    }
    if (!this.e.A().a())
    {
      this.a.c(localzs, arrayOfzo1);
      this.a.c(localzs, arrayOfzo2);
      this.a.c(localzs, arrayOfzo3);
      this.a.c(localzs, arrayOfzo4);
      this.a.c(localzs, arrayOfzo5);
    }
    zq localzq2 = new zq(localzo5.d(), localzo5.e(), localzo6.d() - localzo5.d(), localzo8.e() - localzo5.e());
    super.c(localzq2);
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
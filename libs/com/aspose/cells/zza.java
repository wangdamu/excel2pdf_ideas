package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;

class zza
  extends zcp
{
  zza(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zq localzq = new zq(f1, f2, f3, f4);
    zf localzf = this.a.d();
    this.a.a(4, true);
    ze localze = new ze();
    localze.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze);
    zs localzs = zbyb.a(this.e.A());
    if (!this.e.z().a()) {
      this.a.b(localzc, localzq);
    }
    if (!this.e.A().a())
    {
      this.a.c(localzs, f1, f2, f3, f4);
      this.a.b(localzs, f1 + f3 / 8.0F, f2, f1 + f3 / 8.0F, f2 + f4);
      this.a.b(localzs, f1 + 7.0F * f3 / 8.0F, f2, f1 + 7.0F * f3 / 8.0F, f2 + f4);
    }
    super.a();
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
    float f1 = paramzq.f() + paramzq.h() / 8.0F;
    float f2 = paramzq.g();
    zq localzq = new zq(f1, f2, 3.0F * paramzq.h() / 4.0F, paramzq.i());
    return localzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
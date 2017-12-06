package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbhr
  extends zcp
{
  zbhr(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    float f1 = 0.0F;
    float f2 = this.e.u();
    float f3 = this.e.v();
    float f4 = this.e.y().h();
    float f5 = this.e.y().i();
    zq localzq = new zq(f2, f3, f4, f5);
    zs localzs = zbyb.a(this.e.A());
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0) {
        f1 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0));
      } else {
        f1 = 8333.0F;
      }
    }
    else {
      f1 = 8333.0F;
    }
    float f6 = f1 * (f4 > f5 ? f5 : f4) / 100000.0F;
    com.aspose.cells.b.a.b.a.ze localze;
    if (!this.e.z().a())
    {
      localze = new com.aspose.cells.b.a.b.a.ze();
      localze.a(f2 + f4 - 3.0F * f6, f3, 2.0F * f6, 2.0F * f6, 270.0F, 90.0F);
      localze.a(f2 + f4 - f6, f3 + f5 / 2.0F - 2.0F * f6, 2.0F * f6, 2.0F * f6, 180.0F, -90.0F);
      localze.a(f2 + f4 - f6, f3 + f5 / 2.0F, 2.0F * f6, 2.0F * f6, 270.0F, -90.0F);
      localze.a(f2 + f4 - 3.0F * f6, f3 + f5 - 2.0F * f6, 2.0F * f6, 2.0F * f6, 0.0F, 90.0F);
      localze.a(f2 + f6, f3 + f5 - 2.0F * f6, 2.0F * f6, 2.0F * f6, 90.0F, 90.0F);
      localze.a(f2 - f6, f3 + f5 / 2.0F, 2.0F * f6, 2.0F * f6, 0.0F, -90.0F);
      localze.a(f2 - f6, f3 + f5 / 2.0F - 2.0F * f6, 2.0F * f6, 2.0F * f6, 90.0F, -90.0F);
      localze.a(f2 + f6, f3, 2.0F * f6, 2.0F * f6, 180.0F, 90.0F);
      localze.j();
      zc localzc = zbyb.a(this.e.z(), localze);
      this.a.a(localzc, localze);
    }
    if (!this.e.A().a())
    {
      localze = new com.aspose.cells.b.a.b.a.ze();
      localze.k();
      localze.a(f2 + f4 - 3.0F * f6, f3, 2.0F * f6, 2.0F * f6, 270.0F, 90.0F);
      localze.a(f2 + f4 - f6, f3 + f5 / 2.0F - 2.0F * f6, 2.0F * f6, 2.0F * f6, 180.0F, -90.0F);
      localze.a(f2 + f4 - f6, f3 + f5 / 2.0F, 2.0F * f6, 2.0F * f6, 270.0F, -90.0F);
      localze.a(f2 + f4 - 3.0F * f6, f3 + f5 - 2.0F * f6, 2.0F * f6, 2.0F * f6, 0.0F, 90.0F);
      localze.k();
      localze.a(f2 + f6, f3 + f5 - 2.0F * f6, 2.0F * f6, 2.0F * f6, 90.0F, 90.0F);
      localze.a(f2 - f6, f3 + f5 / 2.0F, 2.0F * f6, 2.0F * f6, 0.0F, -90.0F);
      localze.a(f2 - f6, f3 + f5 / 2.0F - 2.0F * f6, 2.0F * f6, 2.0F * f6, 90.0F, -90.0F);
      localze.a(f2 + f6, f3, 2.0F * f6, 2.0F * f6, 180.0F, 90.0F);
      localze.k();
      this.a.a(localzs, localze);
    }
    super.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
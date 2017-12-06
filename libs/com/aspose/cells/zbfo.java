package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbfo
  extends zcp
{
  zbfo(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    zf localzf = this.a.d();
    this.a.a(4, true);
    zq localzq = new zq(this.g, this.h, this.e.y().h(), this.e.y().i());
    zs localzs = zbyb.a(this.e.A());
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    float f5 = 0.0F;
    float f6 = 0.0F;
    com.aspose.cells.b.a.b.a.ze localze;
    if (!this.e.z().a())
    {
      localze = new com.aspose.cells.b.a.b.a.ze();
      if (this.e.n != null)
      {
        if (this.e.n.a.size() > 0)
        {
          f1 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0));
          f2 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1));
        }
        else
        {
          f1 = 0.0F;
        }
      }
      else {
        f1 = -1.0F;
      }
      if (f1 < 0.0F)
      {
        localze.a(localzq, 270.0F, 90.0F);
        localze.b(this.g + localzq.h(), this.h + localzq.i() / 2.0F, this.g + localzq.h() / 2.0F, this.h + localzq.i() / 2.0F);
        localze.b(this.g + localzq.h() / 2.0F, this.h + localzq.i() / 2.0F, this.g + localzq.h() / 2.0F, this.h);
      }
      else
      {
        f5 = f1 / 2.16E7F * 360.0F % 360.0F;
        f6 = f2 / 2.16E7F * 360.0F % 360.0F;
        f3 = f5;
        if (f6 - f5 < 0.0F) {
          f4 = 360.0F - Math.abs(f6 - f5);
        } else {
          f4 = f6 - f5;
        }
        localObject = new zp((int)localzq.f(), (int)localzq.g(), (int)localzq.h(), (int)localzq.i());
        localze.a((zp)localObject, f3, f4);
      }
      Object localObject = zbyb.a(this.e.z(), localze);
      this.a.a((zc)localObject, localze);
    }
    if (!this.e.A().a())
    {
      localze = new com.aspose.cells.b.a.b.a.ze();
      if (this.e.n != null)
      {
        f1 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0));
        f2 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1));
      }
      else
      {
        f1 = -1.0F;
      }
      if (f1 < 0.0F)
      {
        localze.a(localzq, 270.0F, 90.0F);
      }
      else
      {
        f5 = f1 / 2.16E7F * 360.0F % 360.0F;
        f6 = f2 / 2.16E7F * 360.0F % 360.0F;
        f3 = f5;
        if (f6 - f5 < 0.0F) {
          f4 = 360.0F - Math.abs(f6 - f5);
        } else {
          f4 = f6 - f5;
        }
        localze.a(localzq, f3, f4);
      }
      this.a.a(localzs, localze);
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
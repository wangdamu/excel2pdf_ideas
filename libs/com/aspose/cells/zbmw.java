package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbmw
  extends zcp
{
  zbmw(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    float f1 = this.c;
    float f2 = this.d;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    zf localzf = this.a.d();
    this.a.a(4, true);
    zq localzq = new zq(f1, f2, f3, f4);
    zs localzs = zbyb.a(this.e.A());
    float f5 = 0.0F;
    float f6 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = f4 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 209999.98F;
        if (f5 == 0.0F) {
          f5 = 0.1F;
        }
        f6 = f4 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        if (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) >= 100000.0F)
        {
          f5 = f4 / 35.0F;
        }
        else if (f5 > f6)
        {
          float f7 = f5;
          f5 = f6;
          f6 = f7;
        }
      }
      else
      {
        f5 = f4 / 35.0F;
        f6 = 3.0F * f4 / 6.0F;
      }
    }
    else
    {
      f5 = f4 / 35.0F;
      f6 = 3.0F * f4 / 6.0F;
    }
    f5 = Math.abs(f5);
    f6 = Math.abs(f6);
    com.aspose.cells.b.a.b.a.ze localze;
    zc localzc;
    switch (this.e.c)
    {
    case 1: 
    case 2: 
      if (!this.e.z().a())
      {
        localze = new com.aspose.cells.b.a.b.a.ze();
        localze.a(f1 - f3 / 2.0F, f2, f3, 2.0F * f5, 270.0F, 90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f5, f1 + f3 / 2.0F, f2 + f6 - f5);
        localze.a(f1 + f3 / 2.0F, f2 + f6 - 2.0F * f5, f3, 2.0F * f5, 180.0F, -90.0F);
        localze.a(f1 + f3 / 2.0F, f2 + f6, f3, 2.0F * f5, 270.0F, -90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f6 + f5, f1 + f3 / 2.0F, f2 + f4 - f5);
        localze.a(f1 - f3 / 2.0F, f2 + f4 - 2.0F * f5, f3, 2.0F * f5, 0.0F, 90.0F);
        localze.j();
        localzc = zbyb.a(this.e.z(), localze);
        this.a.a(localzc, localze);
      }
      if (!this.e.A().a())
      {
        this.a.a(localzs, f1 - f3 / 2.0F, f2, f3, 2.0F * f5, 270.0F, 90.0F);
        this.a.a(localzs, f1 + f3 / 2.0F, f2 + f6 - 2.0F * f5, f3, 2.0F * f5, 180.0F, -90.0F);
        this.a.a(localzs, f1 + f3 / 2.0F, f2 + f6, f3, 2.0F * f5, 270.0F, -90.0F);
        this.a.a(localzs, f1 - f3 / 2.0F, f2 + f4 - 2.0F * f5, f3, 2.0F * f5, 0.0F, 90.0F);
        this.a.b(localzs, f1 + f3 / 2.0F, f2 + f5, f1 + f3 / 2.0F, f2 + f6 - f5);
        this.a.b(localzs, f1 + f3 / 2.0F, f2 + f6 + f5, f1 + f3 / 2.0F, f2 + f4 - f5);
      }
      break;
    case 3: 
    case 4: 
      if (!this.e.z().a())
      {
        localze = new com.aspose.cells.b.a.b.a.ze();
        localze.a(f1 + f3 / 2.0F, f2, f3, 2.0F * f5, 270.0F, -90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f5, f1 + f3 / 2.0F, f2 + f6 - f5);
        localze.a(f1 - f3 / 2.0F, f2 + f6 - 2.0F * f5, f3, 2.0F * f5, 0.0F, 90.0F);
        localze.a(f1 - f3 / 2.0F, f2 + f6, f3, 2.0F * f5, 270.0F, 90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f6 + f5, f1 + f3 / 2.0F, f2 + f4 - f5);
        localze.a(f1 + f3 / 2.0F, f2 + f4 - 2.0F * f5, f3, 2.0F * f5, 180.0F, -90.0F);
        localze.j();
        localzc = zbyb.a(this.e.z(), localze);
        this.a.a(localzc, localze);
      }
      if (!this.e.A().a())
      {
        this.a.a(localzs, f1 + f3 / 2.0F, f2, f3, 2.0F * f5, 270.0F, -90.0F);
        this.a.a(localzs, f1 - f3 / 2.0F, f2 + f6 - 2.0F * f5, f3, 2.0F * f5, 0.0F, 90.0F);
        this.a.a(localzs, f1 - f3 / 2.0F, f2 + f6, f3, 2.0F * f5, 270.0F, 90.0F);
        this.a.a(localzs, f1 + f3 / 2.0F, f2 + f4 - 2.0F * f5, f3, 2.0F * f5, 180.0F, -90.0F);
        this.a.b(localzs, f1 + f3 / 2.0F, f2 + f5, f1 + f3 / 2.0F, f2 + f6 - f5);
        this.a.b(localzs, f1 + f3 / 2.0F, f2 + f6 + f5, f1 + f3 / 2.0F, f2 + f4 - f5);
      }
      break;
    }
    super.a();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
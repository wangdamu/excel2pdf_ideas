package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.zf;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbmv
  extends zco
{
  zbmv(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    float f1 = this.c;
    float f2 = this.d;
    float f3 = this.e.l().h();
    float f4 = this.e.l().i();
    zf localzf = this.a.d();
    this.a.a(4, true);
    zq localzq = new zq(f1, f2, f3, f4);
    zc localzc = zbya.a(this.e.m(), localzq);
    zs localzs = zbya.a(this.e.n());
    float f5 = 0.0F;
    float f6 = 0.0F;
    if (this.e.l.a.size() == 2)
    {
      f5 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      f6 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F;
    }
    else if (this.e.l.a.size() == 1)
    {
      if (((zar)this.e.l.a.get(0)).b() == 327) {
        f5 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      } else {
        f5 = f4 / 10.0F;
      }
      if (((zar)this.e.l.a.get(0)).b() == 328) {
        f6 = f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F;
      } else {
        f6 = 3.0F * f4 / 6.0F;
      }
    }
    else
    {
      f5 = f4 / 10.0F;
      f6 = 3.0F * f4 / 6.0F;
    }
    f5 = Math.abs(f5);
    f6 = Math.abs(f6);
    com.aspose.cells.b.a.b.a.ze localze;
    switch (this.e.a)
    {
    case 1: 
    case 2: 
      if ((!this.e.m().a()) && (f3 > 0.0F) && (f5 > 0.0F))
      {
        localze = new com.aspose.cells.b.a.b.a.ze();
        localze.a(f1 - f3 / 2.0F, f2, f3, 2.0F * f5, 270.0F, 90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f5, f1 + f3 / 2.0F, f2 + f6 - f5);
        localze.a(f1 + f3 / 2.0F, f2 + f6 - 2.0F * f5, f3, 2.0F * f5, 180.0F, -90.0F);
        localze.a(f1 + f3 / 2.0F, f2 + f6, f3, 2.0F * f5, 270.0F, -90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f6 + f5, f1 + f3 / 2.0F, f2 + f4 - f5);
        localze.a(f1 - f3 / 2.0F, f2 + f4 - 2.0F * f5, f3, 2.0F * f5, 0.0F, 90.0F);
        localze.j();
        this.a.a(localzc, localze);
      }
      if ((!this.e.n().a()) && (f3 > 0.0F) && (f5 > 0.0F))
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
      if (!this.e.m().a())
      {
        localze = new com.aspose.cells.b.a.b.a.ze();
        localze.a(f1 + f3 / 2.0F, f2, f3, 2.0F * f5, 270.0F, -90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f5, f1 + f3 / 2.0F, f2 + f6 - f5);
        localze.a(f1 - f3 / 2.0F, f2 + f6 - 2.0F * f5, f3, 2.0F * f5, 0.0F, 90.0F);
        localze.a(f1 - f3 / 2.0F, f2 + f6, f3, 2.0F * f5, 270.0F, 90.0F);
        localze.b(f1 + f3 / 2.0F, f2 + f6 + f5, f1 + f3 / 2.0F, f2 + f4 - f5);
        localze.a(f1 + f3 / 2.0F, f2 + f4 - 2.0F * f5, f3, 2.0F * f5, 180.0F, -90.0F);
        localze.j();
        this.a.a(localzc, localze);
      }
      if (!this.e.n().a())
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
    super.b();
    this.a.a(localzf);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
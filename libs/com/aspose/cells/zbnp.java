package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbnp
  extends zcp
{
  zbnp(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  void b()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.s();
    float f4 = this.e.t();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = Math.min(f3, f4);
    zq localzq1 = new zq(f1, f2, f3, f4);
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.b(localzq1);
    zc localzc = zbyb.a(this.e.z(), localze1);
    zs localzs = zbyb.a(this.e.A());
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = f7 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f6 = f7 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
      }
      else
      {
        f5 = f7 * 0.5F;
        f6 = f7 * 0.5F;
      }
    }
    else
    {
      f5 = f7 * 0.5F;
      f6 = f7 * 0.5F;
    }
    float f8 = f3 - f6;
    float f9 = (f4 - f5) / 2.0F;
    float f10 = f4 - 2.0F * f9;
    float f11 = f3 > f4 ? f4 : f3;
    float f12 = 0.03333F * f11;
    float f13 = 0.06065F * f11;
    zq localzq2 = new zq(f1, f2 + f9, f12, f10);
    zq localzq3 = new zq(f1 + 0.06444F * f11, f2 + f9, f13, f10);
    zo[] arrayOfzo = new zo[7];
    com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
    arrayOfzo[0] = new zo(f1 + 0.15777F * f11, f2 + f9);
    arrayOfzo[1] = new zo(f1 + f8, f2 + f9);
    arrayOfzo[2] = new zo(f1 + f8, f2);
    arrayOfzo[3] = new zo(f1 + f3, f2 + f4 / 2.0F);
    arrayOfzo[4] = new zo(f1 + f8, f2 + f4);
    arrayOfzo[5] = new zo(f1 + f8, f2 + f4 - f9);
    arrayOfzo[6] = new zo(f1 + 0.15777F * f11, f2 + f4 - f9);
    localze2.b(arrayOfzo);
    if (!this.e.z().a())
    {
      this.a.b(localzc, localzq2);
      this.a.b(localzc, localzq3);
      this.a.a(localzc, localze2);
    }
    if (!this.e.A().a())
    {
      this.a.c(localzs, f1, f2 + f9, f12, f10);
      this.a.c(localzs, f1 + 0.06444F * f11, f2 + f9, f13, f10);
      this.a.a(localzs, localze2);
    }
    super.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbnp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
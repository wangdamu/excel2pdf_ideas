package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbno
  extends zco
{
  zbno(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.f();
    float f4 = this.e.g();
    float f5 = 0.0F;
    float f6 = 0.0F;
    zq localzq1 = new zq(f1, f2, f3, f4);
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.b(localzq1);
    zc localzc = zbya.a(this.e.m(), localze1);
    zs localzs = zbya.a(this.e.n());
    if (this.e.l.a.size() == 2)
    {
      f6 = f3 - f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      f5 = f4 - 2.0F * (f4 * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F);
    }
    else if (this.e.l.a.size() == 1)
    {
      if (((zar)this.e.l.a.get(0)).a() == 327)
      {
        f5 = f4 - 2.0F * (f4 * 0.27027777F);
        f6 = f3 - f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      }
      else
      {
        f5 = f3 - f3 * (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
        f6 = f3 - f3 * 0.7558333F;
      }
    }
    else
    {
      f6 = f3 - f3 * 0.7558333F;
      f5 = f4 - 2.0F * (f4 * 0.27027777F);
    }
    float f7 = f3 - f6;
    float f8 = (f4 - f5) / 2.0F;
    float f9 = f4 - 2.0F * f8;
    float f10 = f3;
    float f11 = 0.03333F * f10;
    float f12 = 0.06065F * f10;
    zq localzq2 = new zq(f1, f2 + f8, f11, f9);
    zq localzq3 = new zq(f1 + 0.06444F * f10, f2 + f8, f12, f9);
    zo[] arrayOfzo = new zo[7];
    com.aspose.cells.b.a.b.a.ze localze2 = new com.aspose.cells.b.a.b.a.ze();
    arrayOfzo[0] = new zo(f1 + 0.15777F * f10, f2 + f8);
    arrayOfzo[1] = new zo(f1 + f7, f2 + f8);
    arrayOfzo[2] = new zo(f1 + f7, f2);
    arrayOfzo[3] = new zo(f1 + f3, f2 + f4 / 2.0F);
    arrayOfzo[4] = new zo(f1 + f7, f2 + f4);
    arrayOfzo[5] = new zo(f1 + f7, f2 + f4 - f8);
    arrayOfzo[6] = new zo(f1 + 0.15777F * f10, f2 + f4 - f8);
    localze2.b(arrayOfzo);
    if (!this.e.m().a())
    {
      this.a.b(localzc, localzq2);
      this.a.b(localzc, localzq3);
      this.a.a(localzc, localze2);
    }
    if (!this.e.n().a())
    {
      this.a.c(localzs, f1, f2 + f8, f11, f9);
      this.a.c(localzs, f1 + 0.06444F * f10, f2 + f8, f12, f9);
      this.a.a(localzs, localze2);
    }
    super.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
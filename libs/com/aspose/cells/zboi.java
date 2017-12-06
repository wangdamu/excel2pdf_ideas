package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zboi
  extends zco
{
  private float i = 0.0F;
  private float j = 0.0F;
  
  zboi(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
    throws Exception
  {
    float f1 = this.e.h();
    float f2 = this.e.i();
    float f3 = this.e.f();
    float f4 = this.e.g();
    zq localzq = new zq(f1, f2, f3, f4);
    zs localzs = zbya.a(this.e.n());
    com.aspose.cells.b.a.b.a.ze localze1 = a(f1, f2, f3, f4, 0);
    zc localzc1 = zbya.a(this.e.m(), localze1);
    com.aspose.cells.b.a.b.a.ze localze2 = a(f1, f2, f3, f4, 1);
    zc localzc2 = zbya.a(this.e.m(), localze2);
    com.aspose.cells.b.a.b.a.ze localze3 = a(f1, f2, f3, f4, 2);
    zc localzc3 = zbya.a(this.e.m(), localze3);
    com.aspose.cells.b.a.b.a.ze localze4 = a(f1, f2, f3, f4, 3);
    zc localzc4 = zbya.a(this.e.m(), localze4, 0.8F, 0.0F);
    com.aspose.cells.b.a.b.a.ze localze5 = a(f1, f2, f3, f4, 4);
    zc localzc5 = zbya.a(this.e.m(), localze5, 0.8F, 0.0F);
    if (!this.e.m().a())
    {
      this.a.a(localzc1, localze1);
      this.a.a(localzc2, localze2);
      this.a.a(localzc3, localze3);
      this.a.a(localzc4, localze4);
      this.a.a(localzc5, localze5);
    }
    if (!this.e.n().a())
    {
      this.a.a(localzs, localze1);
      this.a.a(localzs, localze2);
      this.a.a(localzs, localze3);
      this.a.a(localzs, localze4);
      this.a.a(localzs, localze5);
    }
    super.b();
  }
  
  com.aspose.cells.b.a.b.a.ze a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    if (this.e.l.a.size() == 2)
    {
      this.j = (this.e.g() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      this.i = (this.e.f() / 3.0F * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) / 21600.0F);
    }
    else if (this.e.l.a.size() == 1)
    {
      if (((zar)this.e.l.a.get(0)).b() == 327) {
        this.j = (this.e.g() * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      } else {
        this.j = (this.e.g() * 5452.0F / 21600.0F);
      }
      if (((zar)this.e.l.a.get(0)).b() == 328) {
        this.i = (this.e.f() / 3.0F * com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) / 21600.0F);
      } else {
        this.i = (this.e.f() / 3.0F * 18753.0F / 21600.0F);
      }
    }
    else
    {
      this.j = (this.e.g() * 5452.0F / 21600.0F);
      this.i = (this.e.f() / 3.0F * 18753.0F / 21600.0F);
    }
    float f1 = paramFloat3 / 2.0F - this.i;
    float f2 = paramFloat4 - this.j;
    float f3 = paramFloat4 - f2;
    if (paramInt == 0)
    {
      localze.a(paramFloat1 + f1, paramFloat2 + f2, 0.0555F * paramFloat3, f3 / 2.0F, 180.0F, 90.0F);
      localze.b(paramFloat1 + f1 + 0.0277F * paramFloat3, paramFloat2 + f2, paramFloat1 + paramFloat3 - 0.0277F * paramFloat3 - f1, paramFloat2 + f2);
      localze.a(paramFloat1 + paramFloat3 - 0.0555F * paramFloat3 - f1, paramFloat2 + f2, 0.0555F * paramFloat3, f3 / 2.0F, -90.0F, 90.0F);
      localze.k();
      localze.b(paramFloat1 + paramFloat3 - f1, paramFloat2 + paramFloat4 - 3.0F * f3 / 4.0F, paramFloat1 + paramFloat3 - f1, paramFloat2 + f3 / 4.0F);
      localze.a(paramFloat1 + paramFloat3 - 0.0555F * paramFloat3 - f1, paramFloat2, 0.0555F * paramFloat3, f3 / 2.0F, 0.0F, -90.0F);
      localze.b(paramFloat1 + paramFloat3 - f1 - 0.0277F * paramFloat3, paramFloat2, paramFloat1 + f1 + 0.0277F * paramFloat3, paramFloat2);
      localze.a(paramFloat1 + f1, paramFloat2, 0.0555F * paramFloat3, f3 / 2.0F, 270.0F, -90.0F);
      localze.b(paramFloat1 + f1, paramFloat2 + f3 / 4.0F, paramFloat1 + f1, paramFloat2 + paramFloat4 - 3.0F * f3 / 4.0F);
    }
    else if (paramInt == 1)
    {
      localze.b(paramFloat1, paramFloat2 + f3, paramFloat1 + f1, paramFloat2 + f3);
      localze.b(paramFloat1 + f1, paramFloat2 + f3, paramFloat1 + f1, paramFloat2 + paramFloat4 - 3.0F * f3 / 4.0F);
      localze.a(paramFloat1 + f1, paramFloat2 + f2, 0.0555F * paramFloat3, f3 / 2.0F, 180.0F, -90.0F);
      localze.b(paramFloat1 + f1 + 0.0277F * paramFloat3, paramFloat2 + paramFloat4 - f3 / 2.0F, paramFloat1 + f1 + 0.1F * paramFloat3, paramFloat2 + paramFloat4 - f3 / 2.0F);
      localze.a(paramFloat1 + f1 + 0.0722F * paramFloat3, paramFloat2 + f2 + f3 / 2.0F, 0.0555F * paramFloat3, f3 / 2.0F, 270.0F, 180.0F);
      localze.b(paramFloat1, paramFloat2 + paramFloat4, paramFloat1 + 0.125F * paramFloat3, paramFloat2 + f3 + f2 / 2.0F);
      localze.b(paramFloat1 + 0.125F * paramFloat3, paramFloat2 + f3 + f2 / 2.0F, paramFloat1, paramFloat2 + f3);
      localze.j();
    }
    else if (paramInt == 2)
    {
      localze.b(paramFloat1 + paramFloat3, paramFloat2 + f3, paramFloat1 + paramFloat3 - f1, paramFloat2 + f3);
      localze.b(paramFloat1 + paramFloat3 - f1, paramFloat2 + f3, paramFloat1 + paramFloat3 - f1, paramFloat2 + paramFloat4 - 3.0F * f3 / 4.0F);
      localze.a(paramFloat1 + paramFloat3 - 0.0555F * paramFloat3 - f1, paramFloat2 + f2, 0.0555F * paramFloat3, f3 / 2.0F, 0.0F, 90.0F);
      localze.a(paramFloat1 + paramFloat3 - f1 - 0.1277F * paramFloat3, paramFloat2 + f2 + f3 / 2.0F, 0.0555F * paramFloat3, f3 / 2.0F, 270.0F, -180.0F);
      localze.b(paramFloat1 + paramFloat3, paramFloat2 + paramFloat4, paramFloat1 + 0.875F * paramFloat3, paramFloat2 + f3 + f2 / 2.0F);
      localze.b(paramFloat1 + 0.875F * paramFloat3, paramFloat2 + f3 + f2 / 2.0F, paramFloat1 + paramFloat3, paramFloat2 + f3);
      localze.j();
    }
    else if (paramInt == 3)
    {
      localze.a(paramFloat1 + f1, paramFloat2 + f2, 0.0555F * paramFloat3, f3 / 2.0F, 270.0F, -180.0F);
      localze.a(paramFloat1 + f1 + 0.0722F * paramFloat3, paramFloat2 + f2 + f3 / 2.0F, 0.0555F * paramFloat3, f3 / 2.0F, 270.0F, 90.0F);
      localze.k();
      localze.b(paramFloat1 + f1 + 0.1277F * paramFloat3, paramFloat2 + paramFloat4 - f3 / 4.0F, paramFloat1 + f1 + 0.1277F * paramFloat3, paramFloat2 + f2);
      localze.b(paramFloat1 + f1 + 0.1277F * paramFloat3, paramFloat2 + f2, paramFloat1 + f1 + 0.0277F * paramFloat3, paramFloat2 + f2);
    }
    else
    {
      localze.a(paramFloat1 + paramFloat3 - 0.0555F * paramFloat3 - f1, paramFloat2 + f2, 0.0555F * paramFloat3, f3 / 2.0F, 270.0F, 180.0F);
      localze.a(paramFloat1 + paramFloat3 - f1 - 0.1277F * paramFloat3, paramFloat2 + f2 + f3 / 2.0F, 0.0555F * paramFloat3, f3 / 2.0F, 270.0F, -90.0F);
      localze.k();
      localze.b(paramFloat1 + paramFloat3 - f1 - 0.1277F * paramFloat3, paramFloat2 + paramFloat4 - f3 / 4.0F, paramFloat1 + paramFloat3 - f1 - 0.1277F * paramFloat3, paramFloat2 + f2);
      localze.b(paramFloat1 + paramFloat3 - f1 - 0.1277F * paramFloat3, paramFloat2 + f2, paramFloat1 + paramFloat3 - f1 - 0.0277F * paramFloat3, paramFloat2 + f2);
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zboi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
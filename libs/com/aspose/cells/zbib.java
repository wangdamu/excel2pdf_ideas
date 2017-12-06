package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbib
  extends zcp
{
  private float l = 0.0F;
  private float m = 0.0F;
  
  zbib(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
    if (!this.e.U()) {
      this.e.f(180);
    } else {
      this.e.f(0);
    }
  }
  
  void b()
    throws Exception
  {
    float f1 = this.e.u();
    float f2 = this.e.v();
    float f3 = this.e.s();
    float f4 = this.e.t();
    zq localzq = new zq(f1, f2, f3, f4);
    com.aspose.cells.b.a.b.a.ze localze1 = new com.aspose.cells.b.a.b.a.ze();
    localze1.b(localzq);
    zc localzc = zbyb.a(this.e.z(), localze1);
    zs localzs = zbyb.a(this.e.A());
    com.aspose.cells.b.a.b.a.ze localze2 = a(f1, f2, f3, f4, 0);
    com.aspose.cells.b.a.b.a.ze localze3 = a(f1, f2, f3, f4, 1);
    com.aspose.cells.b.a.b.a.ze localze4 = a(f1, f2, f3, f4, 2);
    com.aspose.cells.b.a.b.a.ze localze5 = a(f1, f2, f3, f4, 3);
    com.aspose.cells.b.a.b.a.ze localze6 = a(f1, f2, f3, f4, 4);
    if (!this.e.z().a())
    {
      this.a.a(localzc, localze2);
      this.a.a(localzc, localze3);
      this.a.a(localzc, localze4);
      this.a.a(localzc, localze5);
      this.a.a(localzc, localze6);
    }
    if (!this.e.A().a())
    {
      this.a.a(localzs, localze2);
      this.a.a(localzs, localze3);
      this.a.a(localzs, localze4);
      this.a.a(localzs, localze5);
      this.a.a(localzs, localze6);
    }
    super.a();
  }
  
  public com.aspose.cells.b.a.b.a.ze a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        this.m = (this.e.t() * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        this.l = (this.e.s() / 2.0F * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F);
      }
      else
      {
        this.m = (this.e.t() * 16667.0F / 100000.0F);
        this.l = (this.e.s() / 2.0F * 50000.0F / 100000.0F);
      }
    }
    else
    {
      this.m = (this.e.t() * 16667.0F / 100000.0F);
      this.l = (this.e.s() / 2.0F * 50000.0F / 100000.0F);
    }
    float f1 = paramFloat3 / 2.0F - this.l;
    float f2 = paramFloat4 - this.m;
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbhv
  extends zcp
{
  private zq l = new zq();
  
  zbhv(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = this.e.u();
    float f2 = this.e.v();
    float f3 = this.e.s();
    float f4 = this.e.t();
    return a(f1, f2, f3, f4);
  }
  
  public com.aspose.cells.b.a.b.a.ze a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) * paramFloat4 / 100000.0F;
        f2 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) * paramFloat3 / 100000.0F;
      }
      else
      {
        f1 = 6520.0F * paramFloat4 / 100000.0F;
        f2 = 0.0F * paramFloat3 / 100000.0F;
      }
    }
    else
    {
      f1 = 6520.0F * paramFloat4 / 100000.0F;
      f2 = 0.0F * paramFloat3 / 100000.0F;
    }
    float f3 = paramFloat3 - 2.0F * Math.abs(f2);
    if (this.e.V() == this.e.U())
    {
      if (f2 >= 0.0F)
      {
        localze.a(paramFloat1, paramFloat2 + f1, paramFloat1 + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + f1);
        localze.a(paramFloat1 + 1.0F * f3 / 2.0F, paramFloat2 + f1, paramFloat1 + 1.0F * f3 / 2.0F + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 1.0F * f3 / 2.0F + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + f3, paramFloat2 + f1);
        localze.a(paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
        localze.a(paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + paramFloat4 - f1);
        localze.j();
        this.l = new zq(paramFloat1, paramFloat2 + f1 * 2.0F, f3, paramFloat4 - f1 * 4.0F);
      }
      else
      {
        localze.a(paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + f1);
        localze.a(paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F, paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + paramFloat3, paramFloat2 + f1);
        localze.a(paramFloat1 + f3, paramFloat2 + paramFloat4 - f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
        localze.a(paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1, paramFloat2 + paramFloat4 - f1);
        localze.j();
        this.l = new zq(paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + f1 * 2.0F, f3, paramFloat4 - f1 * 4.0F);
      }
    }
    else if (f2 >= 0.0F)
    {
      localze.a(paramFloat1 + paramFloat3, paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + f1);
      localze.a(paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F, paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + f1);
      localze.a(paramFloat1, paramFloat2 + paramFloat4 - f1, paramFloat1 + f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
      localze.a(paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + f3, paramFloat2 + paramFloat4 - f1);
      localze.j();
      this.l = new zq(paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + f1 * 2.0F, f3, paramFloat4 - f1 * 4.0F);
    }
    else
    {
      localze.a(paramFloat1 + f3, paramFloat2 + f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + f1);
      localze.a(paramFloat1 + f3 / 2.0F, paramFloat2 + f1, paramFloat1 + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1, paramFloat2 + f1);
      localze.a(paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
      localze.a(paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - f1);
      localze.j();
      this.l = new zq(paramFloat1, paramFloat2 + f1 * 2.0F, f3, paramFloat4 - f1 * 4.0F);
    }
    return localze;
  }
  
  zq b(zq paramzq)
  {
    return this.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbhu
  extends zco
{
  zbhu(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = this.e.h();
    float f2 = this.e.i();
    float f3 = this.e.f();
    float f4 = this.e.g();
    return a(f1, f2, f3, f4);
  }
  
  public com.aspose.cells.b.a.b.a.ze a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f1 = 0.0F;
    float f2 = 0.0F;
    switch (this.e.l.a.size())
    {
    case 2: 
      f1 = com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) * paramFloat4 / 21600.0F;
      f2 = (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(1)).a())) - 10800.0F) * paramFloat3 / 21600.0F;
      break;
    case 1: 
      if (((zar)this.e.l.a.get(0)).b() == 327)
      {
        f1 = com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) * paramFloat4 / 21600.0F;
        f2 = 0.0F * paramFloat3 / 21600.0F;
      }
      else
      {
        f1 = 2880.0F * paramFloat4 / 21600.0F;
        f2 = (com.aspose.cells.b.a.ze.a(Integer.valueOf(((zar)this.e.l.a.get(0)).a())) - 10800.0F) * paramFloat3 / 21600.0F;
      }
      break;
    default: 
      f1 = 2880.0F * paramFloat4 / 21600.0F;
      f2 = 0.0F * paramFloat3 / 21600.0F;
    }
    float f3 = paramFloat3 - 2.0F * Math.abs(f2);
    if (this.e.F() == this.e.E())
    {
      if (f2 >= 0.0F)
      {
        localze.a(paramFloat1, paramFloat2 + f1, paramFloat1 + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + f1);
        localze.a(paramFloat1 + 1.0F * f3 / 2.0F, paramFloat2 + f1, paramFloat1 + 1.0F * f3 / 2.0F + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 1.0F * f3 / 2.0F + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + f3, paramFloat2 + f1);
        localze.a(paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
        localze.a(paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + paramFloat4 - f1);
        localze.j();
      }
      else
      {
        localze.a(paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + f1);
        localze.a(paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F, paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F + 1.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + paramFloat3, paramFloat2 + f1);
        localze.a(paramFloat1 + f3, paramFloat2 + paramFloat4 - f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
        localze.a(paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 1.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1, paramFloat2 + paramFloat4 - f1);
        localze.j();
      }
    }
    else if (f2 >= 0.0F)
    {
      localze.a(paramFloat1 + paramFloat3, paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + f1);
      localze.a(paramFloat1 + 2.0F * Math.abs(f2) + 1.0F * f3 / 2.0F, paramFloat2 + f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + f1);
      localze.a(paramFloat1, paramFloat2 + paramFloat4 - f1, paramFloat1 + f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
      localze.a(paramFloat1 + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + f3, paramFloat2 + paramFloat4 - f1);
      localze.j();
    }
    else
    {
      localze.a(paramFloat1 + f3, paramFloat2 + f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + 3.0F * f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1 + f3 / 2.0F, paramFloat2 + f1);
      localze.a(paramFloat1 + f3 / 2.0F, paramFloat2 + f1, paramFloat1 + f3 / 4.0F, paramFloat2 - 2.0F * f1, paramFloat1 + f3 / 4.0F, paramFloat2 + 4.0F * f1, paramFloat1, paramFloat2 + f1);
      localze.a(paramFloat1 + 2.0F * Math.abs(f2), paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1);
      localze.a(paramFloat1 + 2.0F * Math.abs(f2) + f3 / 2.0F, paramFloat2 + paramFloat4 - f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 + 2.0F * f1, paramFloat1 + 2.0F * Math.abs(f2) + 3.0F * f3 / 4.0F, paramFloat2 + paramFloat4 - 4.0F * f1, paramFloat1 + paramFloat3, paramFloat2 + paramFloat4 - f1);
      localze.j();
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbhu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbfs
  extends zcp
{
  zbfs(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = paramzq.f();
    float f2 = paramzq.g();
    float f3 = paramzq.h();
    float f4 = paramzq.i();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = Math.min(f3, f4);
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = f9 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f6 = f9 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        f7 = f9 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
        f8 = f9 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F;
      }
      else
      {
        f5 = f9 * 0.2383F;
        f6 = f9 * 0.25F;
        f7 = f9 * 0.25F;
        f8 = f9 * 0.4375F;
      }
    }
    else
    {
      f5 = f9 * 0.2383F;
      f6 = f9 * 0.25F;
      f7 = f9 * 0.25F;
      f8 = f9 * 0.4375F;
    }
    f5 = f5 == 0.0F ? 0.1F : f5;
    f6 = f6 == 0.0F ? 0.1F : f6;
    f7 = f7 == 0.0F ? 0.1F : f7;
    f8 = f8 == 0.0F ? 0.1F : f8;
    float f10 = f5;
    float f11 = f8;
    float f12 = f7;
    float f13 = f6;
    float f14 = f11;
    float f15 = Math.abs(f11 - f10);
    float f16 = f13 - f10 / 2.0F;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    switch (this.e.c)
    {
    case 1: 
      localze.a(f1, f2 + f16, 2.0F * f14, 2.0F * f14, 180.0F, 90.0F);
      localze.b(f1 + f11, f2 + f16, f1 + (f3 - f12), f2 + f16);
      localze.b(f1 + (f3 - f12), f2 + f16, f1 + (f3 - f12), f2);
      localze.b(f1 + (f3 - f12), f2, f1 + f3, f2 + f13);
      localze.b(f1 + f3, f2 + f13, f1 + (f3 - f12), f2 + 2.0F * f13);
      localze.b(f1 + (f3 - f12), f2 + f13 + f10 / 2.0F, f1 + f11, f2 + 2.0F * f13 - f16);
      localze.a(f1 + f10, f2 + f13 + f10 / 2.0F, 2.0F * f15, 2.0F * f15, 270.0F, -90.0F);
      localze.b(f1 + f10, f2 + f4, f1, f2 + f4);
      break;
    case 2: 
      localze.a(f1, f2 + f4 - f16 - 2.0F * f14, 2.0F * f14, 2.0F * f14, 180.0F, -90.0F);
      localze.b(f1 + f11, f2 + f4 - f16, f1 + (f3 - f12), f2 + f4 - f16);
      localze.b(f1 + (f3 - f12), f2 + f4 - f16, f1 + (f3 - f12), f2 + f4);
      localze.b(f1 + (f3 - f12), f2 + f4, f1 + f3, f2 + f4 - f13);
      localze.b(f1 + f3, f2 + f4 - f13, f1 + (f3 - f12), f2 + f4 - 2.0F * f13);
      localze.b(f1 + (f3 - f12), f2 + f4 - f5 - f16, f1 + f11, f2 + f4 - f5 - f16);
      localze.a(f1 + f10, f2 + f4 - f5 - f16 - 2.0F * f15, 2.0F * f15, 2.0F * f15, 90.0F, 90.0F);
      localze.b(f1 + f10, f2, f1, f2);
      break;
    case 3: 
      localze.a(f1 + f3 - 2.0F * f14, f2 + f4 - f16 - 2.0F * f14, 2.0F * f14, 2.0F * f14, 0.0F, 90.0F);
      localze.b(f1 + f3 - f11, f2 + f4 - f16, f1 + f12, f2 + f4 - f16);
      localze.b(f1 + f12, f2 + f4 - f16, f1 + f12, f2 + f4);
      localze.b(f1 + f12, f2 + f4, f1, f2 + f4 - f13);
      localze.b(f1, f2 + f4 - f13, f1 + f12, f2 + f4 - 2.0F * f13);
      localze.b(f1 + f12, f2 + f4 - f5 - f16, f1 + f3 - f11, f2 + f4 - f5 - f16);
      localze.a(f1 + f3 - f10 - 2.0F * f15, f2 + f4 - f5 - f16 - 2.0F * f15, 2.0F * f15, 2.0F * f15, 90.0F, -90.0F);
      localze.b(f1 + f3 - f10, f2, f1 + f3, f2);
      break;
    case 4: 
      localze.a(f1 + f3 - 2.0F * f14, f2 + f16, 2.0F * f14, 2.0F * f14, 0.0F, -90.0F);
      localze.b(f1 + f3 - f11, f2 + f16, f1 + f12, f2 + f16);
      localze.b(f1 + f12, f2 + f16, f1 + f12, f2);
      localze.b(f1 + f12, f2, f1, f2 + f13);
      localze.b(f1, f2 + f13, f1 + f12, f2 + 2.0F * f13);
      localze.b(f1 + f12, f2 + f5 + f16, f1 + f3 - f11, f2 + f5 + f16);
      localze.a(f1 + f3 - f10 - 2.0F * f15, f2 + f5 + f16, 2.0F * f15, 2.0F * f15, 270.0F, 90.0F);
      localze.b(f1 + f3 - f10, f2 + f4, f1 + f3, f2 + f4);
    }
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
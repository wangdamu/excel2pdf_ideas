package com.aspose.cells;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbge
  extends zcp
{
  zbge(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
    switch (this.e.c)
    {
    case 1: 
      break;
    case 2: 
      zi localzi1 = new zi(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, this.e.W().i());
      this.a.c();
      this.a.a(localzi1);
      break;
    case 3: 
      zi localzi2 = new zi(-1.0F, 0.0F, 0.0F, -1.0F, this.e.W().h(), this.e.W().i());
      this.a.c();
      this.a.a(localzi2);
      break;
    case 4: 
      zi localzi3 = new zi(-1.0F, 0.0F, 0.0F, 1.0F, this.e.W().h(), 0.0F);
      this.a.c();
      this.a.a(localzi3);
    }
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = Math.min(paramzq.h(), paramzq.i());
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f1 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 60000.0F;
        f2 = com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 60000.0F;
        f3 = f4 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
      }
      else
      {
        f1 = 180.0F;
        f2 = 0.0F;
        f3 = f4 * 25000.0F / 100000.0F;
      }
    }
    else
    {
      f1 = 180.0F;
      f2 = 0.0F;
      f3 = f4 * 25000.0F / 100000.0F;
    }
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    float f5 = this.g;
    float f6 = this.h;
    float f7 = this.e.y().h();
    float f8 = this.e.y().i();
    zq localzq = new zq(f5, f6, f7, f8);
    if ((f2 > 180.0F) && (f2 <= 360.0F)) {
      localze.a(localzq, f1, f2 - f1);
    } else {
      localze.a(localzq, f1, 360.0F - f1 + f2);
    }
    if ((f2 > 180.0F) && (f2 <= 360.0F)) {
      localze.a(f5 + f3, f6 + f3, f7 - 2.0F * f3, f8 - 2.0F * f3, f2, -(f2 - f1));
    } else {
      localze.a(f5 + f3, f6 + f3, f7 - 2.0F * f3, f8 - 2.0F * f3, f2, -(360.0F - f1 + f2));
    }
    localze.j();
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
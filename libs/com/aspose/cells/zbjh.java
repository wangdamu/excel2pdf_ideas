package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbjh
  extends zcp
{
  private zq l = new zq();
  
  zbjh(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbni);
  }
  
  com.aspose.cells.b.a.b.a.ze a(zq paramzq)
  {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.e.y().h();
    float f4 = this.e.y().i();
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    float f10 = 0.0F;
    float f11 = 0.0F;
    float f12 = 0.0F;
    float f13 = Math.min(f3, f4);
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        f5 = f13 * (com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F);
        f6 = f13 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(1)) / 100000.0F;
        f7 = f13 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(2)) / 100000.0F;
        f8 = f3 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(3)) / 100000.0F;
      }
      else
      {
        f5 = f13 * 0.25F;
        f6 = f13 * 0.25F;
        f7 = f13 * 0.25F;
        f8 = f3 * 0.64616F;
      }
    }
    else
    {
      f5 = f13 * 0.25F;
      f6 = f13 * 0.25F;
      f7 = f13 * 0.25F;
      f8 = f3 * 0.64616F;
    }
    f9 = f8;
    f10 = f3 - f7;
    f11 = f4 / 2.0F - f6;
    f12 = f4 / 2.0F - f5 / 2.0F;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[11];
    switch (this.e.c)
    {
    case 1: 
    case 2: 
      arrayOfzo[0] = new zo(f1 + f3 - f9, f2);
      arrayOfzo[1] = new zo(f1 + f3, f2);
      arrayOfzo[2] = new zo(f1 + f3, f2 + f4);
      arrayOfzo[3] = new zo(f1 + f3 - f9, f2 + f4);
      arrayOfzo[4] = new zo(f1 + f3 - f9, f2 + f4 - f12);
      arrayOfzo[5] = new zo(f1 + f7, f2 + f4 - f12);
      arrayOfzo[6] = new zo(f1 + f7, f2 + f4 - f11);
      arrayOfzo[7] = new zo(f1, f2 + f4 / 2.0F);
      arrayOfzo[8] = new zo(f1 + f7, f2 + f11);
      arrayOfzo[9] = new zo(f1 + f7, f2 + f12);
      arrayOfzo[10] = new zo(f1 + f3 - f9, f2 + f12);
      break;
    case 3: 
    case 4: 
      arrayOfzo[0] = new zo(f1, f2);
      arrayOfzo[1] = new zo(f1 + f9, f2);
      arrayOfzo[2] = new zo(f1 + f9, f2 + f12);
      arrayOfzo[3] = new zo(f1 + f10, f2 + f12);
      arrayOfzo[4] = new zo(f1 + f10, f2 + f11);
      arrayOfzo[5] = new zo(f1 + f3, f2 + f4 / 2.0F);
      arrayOfzo[6] = new zo(f1 + f10, f2 + f4 - f11);
      arrayOfzo[7] = new zo(f1 + f10, f2 + f4 - f12);
      arrayOfzo[8] = new zo(f1 + f9, f2 + f4 - f12);
      arrayOfzo[9] = new zo(f1 + f9, f2 + f4);
      arrayOfzo[10] = new zo(f1, f2 + f4);
    }
    this.l = new zq(arrayOfzo[0].d(), arrayOfzo[0].e(), arrayOfzo[1].d() - arrayOfzo[0].d(), arrayOfzo[2].e() - arrayOfzo[1].e());
    localze.b(arrayOfzo);
    return localze;
  }
  
  zq b(zq paramzq)
  {
    return this.l;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbjh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
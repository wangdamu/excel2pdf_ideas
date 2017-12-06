package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblx
  extends zcp
{
  zblx(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
    if (this.e.n != null)
    {
      if (this.e.n.a.size() > 0)
      {
        if (f3 > f4)
        {
          f6 = Math.min(f3, f4);
          f5 = f6 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        }
        else
        {
          f6 = Math.max(f3, f4);
          f5 = f6 * com.aspose.cells.b.a.ze.a(this.e.n.a.get(0)) / 100000.0F;
        }
      }
      else if (f3 > f4)
      {
        f6 = Math.min(f3, f4);
        f5 = f6 * 13542.0F / 100000.0F;
      }
      else
      {
        f6 = Math.max(f3, f4);
        f5 = f6 * 13542.0F / 100000.0F;
      }
    }
    else if (f3 > f4)
    {
      f6 = Math.min(f3, f4);
      f5 = f6 * 13542.0F / 100000.0F;
    }
    else
    {
      f6 = Math.max(f3, f4);
      f5 = f6 * 13542.0F / 100000.0F;
    }
    float f6 = f4 / 2.0F - f5;
    float f7 = f4 - 2.0F * f6;
    float f8 = f7 * f3 / f4;
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[3];
    for (int i = 0; i < 4; i++)
    {
      arrayOfzo[0] = new zo((float)(f1 + f3 / 2.0F + Math.cos(zbkt.a(i * 90)) * f3 / 2.0D), (float)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(i * 90)) * f4 / 2.0D));
      arrayOfzo[1] = new zo((float)(f1 + f3 / 2.0F + Math.cos(zbkt.a(45 + i * 90)) * f8 / 2.0D), (float)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(45 + i * 90)) * f7 / 2.0D));
      arrayOfzo[2] = new zo((float)(f1 + f3 / 2.0F + Math.cos(zbkt.a((i + 1) * 90)) * f3 / 2.0D), (float)(f2 + f4 / 2.0F + -Math.sin(zbkt.a((i + 1) * 90)) * f4 / 2.0D));
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
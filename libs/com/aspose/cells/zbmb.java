package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zbmb
  extends zcp
{
  zbmb(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
        f5 = f6 * 35591.0F / 100000.0F;
      }
      else
      {
        f6 = Math.max(f3, f4);
        f5 = f6 * 35591.0F / 100000.0F;
      }
    }
    else if (f3 > f4)
    {
      f6 = Math.min(f3, f4);
      f5 = f6 * 35591.0F / 100000.0F;
    }
    else
    {
      f6 = Math.max(f3, f4);
      f5 = f6 * 35591.0F / 100000.0F;
    }
    f4 = (float)(2.0F * f4 / (1.0D + Math.sin(zbkt.a(64.28571428571429D))));
    f3 = (float)(f3 / Math.cos(zbkt.a(12.857142857142858D)));
    float f6 = paramzq.i() / 2.0F - f5;
    float f7 = f4 - 2.0F * f6;
    float f8 = f7 * f3 / f4;
    f1 = (float)(f1 - f3 * (1.0D - Math.cos(zbkt.a(12.857142857142858D))) / 2.0D);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[3];
    for (int i = 0; i < 7; i++)
    {
      arrayOfzo[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(-12 + i * 360 / 7)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F - Math.sin(zbkt.a(-12 + i * 360 / 7)) * f4 / 2.0D));
      arrayOfzo[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(-12 + (i + 1) * 360 / 7)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F - Math.sin(zbkt.a(-12 + (i + 1) * 360 / 7)) * f4 / 2.0D));
      arrayOfzo[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(12 + i * 360 / 7)) * f8 / 2.0D), (int)(f2 + f4 / 2.0F - Math.sin(zbkt.a(12 + i * 360 / 7)) * f7 / 2.0D));
      localze.a(arrayOfzo[0], arrayOfzo[1]);
      localze.a(arrayOfzo[1], arrayOfzo[2]);
    }
    return localze;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbmb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
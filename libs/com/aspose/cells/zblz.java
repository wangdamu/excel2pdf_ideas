package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import java.util.ArrayList;

class zblz
  extends zcp
{
  zblz(zr paramzr, float paramFloat1, float paramFloat2, zbni paramzbni)
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
        f5 = f6 * 20040.0F / 100000.0F;
      }
      else
      {
        f6 = Math.max(f3, f4);
        f5 = f6 * 20040.0F / 100000.0F;
      }
    }
    else if (f3 > f4)
    {
      f6 = Math.min(f3, f4);
      f5 = f6 * 20040.0F / 100000.0F;
    }
    else
    {
      f6 = Math.max(f3, f4);
      f5 = f6 * 20040.0F / 100000.0F;
    }
    f4 = (float)(2.0F * f4 / (1.0D + Math.sin(zbkt.a(54.0D))));
    f3 = (float)(f3 / Math.cos(zbkt.a(18.0D)));
    float f6 = paramzq.i() / 2.0F - f5 + 6.0F;
    float f7 = f4 - 2.0F * f6;
    float f8 = f7 * f3 / f4;
    f1 = (float)(f1 - f3 * (1.0D - Math.cos(zbkt.a(18.0D))) / 2.0D);
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    zo[] arrayOfzo = new zo[3];
    int i;
    switch (this.e.c)
    {
    case 1: 
    case 4: 
      for (i = 0; i < 5; i++)
      {
        arrayOfzo[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + i * 72)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(18 + i * 72)) * f4 / 2.0D));
        arrayOfzo[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(54 + i * 72)) * f8 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(54 + i * 72)) * f7 / 2.0D));
        arrayOfzo[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + (i + 1) * 72)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(18 + (i + 1) * 72)) * f4 / 2.0D));
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
      }
      break;
    case 2: 
    case 3: 
      for (i = 0; i < 5; i++)
      {
        arrayOfzo[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + i * 72)) * f3 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbkt.a(18 + i * 72)) * f4 / 2.0D)));
        arrayOfzo[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(54 + i * 72)) * f8 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbkt.a(54 + i * 72)) * f7 / 2.0D)));
        arrayOfzo[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + (i + 1) * 72)) * f3 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbkt.a(18 + (i + 1) * 72)) * f4 / 2.0D)));
        localze.a(arrayOfzo[0], arrayOfzo[1]);
        localze.a(arrayOfzo[1], arrayOfzo[2]);
      }
    }
    return localze;
  }
  
  zq b(zq paramzq)
  {
    zq localzq = new zq(this.c, this.d, this.e.y().h(), this.e.y().i());
    float f1 = localzq.f();
    float f2 = localzq.g();
    float f3 = localzq.h();
    float f4 = localzq.i();
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
        f5 = f6 * 20040.0F / 100000.0F;
      }
      else
      {
        f6 = Math.max(f3, f4);
        f5 = f6 * 20040.0F / 100000.0F;
      }
    }
    else if (f3 > f4)
    {
      f6 = Math.min(f3, f4);
      f5 = f6 * 20040.0F / 100000.0F;
    }
    else
    {
      f6 = Math.max(f3, f4);
      f5 = f6 * 20040.0F / 100000.0F;
    }
    f4 = (float)(2.0F * f4 / (1.0D + Math.sin(zbkt.a(54.0D))));
    f3 = (float)(f3 / Math.cos(zbkt.a(18.0D)));
    float f6 = localzq.i() / 2.0F - f5 + 6.0F;
    float f7 = f4 - 2.0F * f6;
    float f8 = f7 * f3 / f4;
    f1 = (float)(f1 - f3 * (1.0D - Math.cos(zbkt.a(18.0D))) / 2.0D);
    zo[] arrayOfzo1 = new zo[3];
    zo[] arrayOfzo2 = new zo[5];
    int i;
    switch (this.e.c)
    {
    case 1: 
    case 4: 
      for (i = 0; i < 5; i++)
      {
        arrayOfzo1[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + i * 72)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(18 + i * 72)) * f4 / 2.0D));
        arrayOfzo1[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(54 + i * 72)) * f8 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(54 + i * 72)) * f7 / 2.0D));
        arrayOfzo1[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + (i + 1) * 72)) * f3 / 2.0D), (int)(f2 + f4 / 2.0F + -Math.sin(zbkt.a(18 + (i + 1) * 72)) * f4 / 2.0D));
        arrayOfzo2[i] = arrayOfzo1[1];
      }
      break;
    case 2: 
    case 3: 
      for (i = 0; i < 5; i++)
      {
        arrayOfzo1[0] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + i * 72)) * f3 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbkt.a(18 + i * 72)) * f4 / 2.0D)));
        arrayOfzo1[1] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(54 + i * 72)) * f8 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbkt.a(54 + i * 72)) * f7 / 2.0D)));
        arrayOfzo1[2] = new zo((int)(f1 + f3 / 2.0F + Math.cos(zbkt.a(18 + (i + 1) * 72)) * f3 / 2.0D), (int)(f2 + f4 - (f4 / 2.0F + -Math.sin(zbkt.a(18 + (i + 1) * 72)) * f4 / 2.0D)));
        arrayOfzo2[i] = arrayOfzo1[1];
      }
    }
    float f9 = arrayOfzo2[0].d();
    float f10 = arrayOfzo2[0].e();
    float f11 = arrayOfzo2[0].d();
    float f12 = arrayOfzo2[0].e();
    for (int j = 1; j < arrayOfzo2.length; j++)
    {
      if (arrayOfzo2[j].d() < f9) {
        f9 = arrayOfzo2[j].d();
      }
      if (arrayOfzo2[j].e() < f10) {
        f10 = arrayOfzo2[j].e();
      }
      if (arrayOfzo2[j].d() > f11) {
        f11 = arrayOfzo2[j].d();
      }
      if (arrayOfzo2[j].e() > f12) {
        f12 = arrayOfzo2[j].e();
      }
    }
    paramzq.a(f9);
    paramzq.b(f10);
    paramzq.c(f11 - f9);
    paramzq.d(f12 - f10);
    return paramzq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zblz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
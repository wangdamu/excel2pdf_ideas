package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

abstract class zaem
  extends zgz
{
  zaem(zgw paramzgw, float paramFloat1, float paramFloat2, float paramFloat3, double[] paramArrayOfDouble)
  {
    super(paramzgw, paramFloat1, paramFloat2, paramFloat3, paramArrayOfDouble);
  }
  
  protected void a(zgw paramzgw)
  {
    int i = paramzgw.c().getRotationAngle();
    if ((i == 0) || (i == 255) || (i == 90) || (i == -90)) {
      d(paramzgw);
    } else {
      c(paramzgw);
    }
  }
  
  private void c(zgw paramzgw)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    int i = paramzgw.c().getRotationAngle();
    double d = i / 180.0F * 3.141592653589793D;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    zanw localzanw1;
    for (int j = 0; j < this.i.size(); j++)
    {
      localzanw1 = (zanw)this.i.get(j);
      if (localzanw1.d > f6)
      {
        f6 = localzanw1.d;
        f7 = localzanw1.e;
        f8 = j;
      }
    }
    float f3;
    float f4;
    float f5;
    zanw localzanw2;
    float f9;
    float f10;
    if (i > 0)
    {
      f3 = (float)Math.sin(d);
      f4 = (float)Math.cos(d);
      f5 = (float)Math.tan(d);
      for (j = 0; j < this.i.size(); j++)
      {
        localzanw1 = (zanw)this.i.get(j);
        localzanw1.f = f1;
        localzanw1.c = f2;
        if (j == this.i.size() - 1) {
          break;
        }
        f2 += localzanw1.e;
        localzanw2 = (zanw)this.i.get(j + 1);
        switch (this.h)
        {
        case 7: 
          f1 += localzanw2.e / f5;
          break;
        case 8: 
          f1 += localzanw1.d - localzanw2.d + localzanw1.e / f5;
          break;
        case 1: 
          f9 = localzanw1.d * f3 + localzanw1.e * f4;
          f10 = localzanw2.d * f3 + localzanw2.e * f4;
          f1 += localzanw2.e / f5;
          f1 -= (f10 - f9) * 0.5F / f3;
          break;
        default: 
          f1 += localzanw2.e / f5;
        }
      }
    }
    else if (i < 0)
    {
      f3 = (float)Math.sin(-d);
      f4 = (float)Math.cos(-d);
      f5 = (float)Math.tan(-d);
      for (j = 0; j < this.i.size(); j++)
      {
        localzanw1 = (zanw)this.i.get(j);
        localzanw1.f = f1;
        localzanw1.c = f2;
        if (j == this.i.size() - 1) {
          break;
        }
        f2 += localzanw1.e;
        localzanw2 = (zanw)this.i.get(j + 1);
        switch (this.h)
        {
        case 7: 
          f1 -= localzanw1.e / f5;
          break;
        case 8: 
          f1 -= localzanw2.d - localzanw1.d + localzanw2.e / f5;
          break;
        case 1: 
          f9 = localzanw1.d * f3 + localzanw1.e * f4;
          f10 = localzanw2.d * f3 + localzanw2.e * f4;
          f1 -= localzanw1.e / f5;
          f1 -= (f10 - f9) * 0.5F / f3;
          break;
        default: 
          f1 -= localzanw2.d - localzanw1.d + localzanw2.e / f5;
        }
      }
    }
  }
  
  private void d(zgw paramzgw)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    this.e += paramzgw.a();
    float f4 = this.d / a * 72.0F;
    if ((this.g == 3) && (this.i.size() > 0))
    {
      float f5 = this.i.size() / 6.0F;
      if (this.f - f4 < f5 * this.f / this.i.size())
      {
        if (this.i.size() > 1) {
          f3 = (f4 - this.f) / (this.i.size() - 1);
        } else if (this.i.size() == 1) {
          f1 += (f4 - this.f) / 2.0F;
        }
        this.f = f4;
      }
    }
    f2 = f1;
    for (int i = this.i.size() - 1; i >= 0; i--)
    {
      zanw localzanw = (zanw)this.i.get(i);
      localzanw.c -= f2;
      f2 += localzanw.e + f3;
      switch (this.h)
      {
      case 7: 
        if (paramzgw.t()) {
          localzanw.f = (this.e - localzanw.d - 1.0F - paramzgw.a());
        } else {
          localzanw.f = (1.0F + paramzgw.a());
        }
        break;
      case 8: 
        if (this.l) {
          localzanw.f = 1.0F;
        } else if (paramzgw.t()) {
          localzanw.f = (1.0F + paramzgw.a());
        } else {
          localzanw.f = (this.e - localzanw.d - 1.0F - paramzgw.a());
        }
        break;
      case 1: 
      case 2: 
        localzanw.f = ((this.e - localzanw.d) / 2.0F);
        break;
      case 6: 
        localzanw.f = 1.0F;
        this.e = (this.c / a * 72.0F);
        if ((localzanw.b.size() >= 2) && (!localzanw.l)) {
          localzanw.i = ((this.e - 2.0F - localzanw.d) / (localzanw.b.size() - 1));
        }
        if ((localzanw.i >= 0.0F) && (i == this.i.size() - 1)) {
          localzanw.i = 0.0F;
        }
        break;
      case 3: 
        localzanw.f = 1.0F;
        this.e = (this.c / a * 72.0F);
        if (localzanw.b.size() >= 2) {
          localzanw.i = ((this.e - 2.0F - localzanw.d) / (localzanw.b.size() - 1));
        } else if (localzanw.b.size() == 1) {
          localzanw.f = ((this.e - localzanw.d) / 2.0F);
        }
        break;
      }
    }
  }
  
  protected void b()
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      zanw localzanw = (zanw)localIterator.next();
      if (this.e < localzanw.d) {
        this.e = localzanw.d;
      }
      this.f += localzanw.e;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
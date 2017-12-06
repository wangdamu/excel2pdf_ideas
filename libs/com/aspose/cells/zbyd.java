package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

abstract class zbyd
  extends zgz
{
  zbyd(zgw paramzgw, float paramFloat1, float paramFloat2, float paramFloat3, double[] paramArrayOfDouble)
  {
    super(paramzgw, paramFloat1, paramFloat2, paramFloat3, paramArrayOfDouble);
  }
  
  protected void a(zgw paramzgw)
  {
    float f1 = 0.0F;
    this.f += paramzgw.a();
    float f2 = 0.0F;
    float f3 = this.c * 72.0F / a;
    if ((this.h == 6) && (this.e < f3))
    {
      if (this.i.size() > 1) {
        f2 = (f3 - this.e) / (this.i.size() - 1);
      }
      this.e = f3;
    }
    f1 = this.e;
    for (int i = 0; i < this.i.size(); i++)
    {
      zanw localzanw = (zanw)this.i.get(i);
      f1 -= localzanw.d;
      localzanw.f = f1;
      f1 -= f2;
      switch (this.g)
      {
      case 9: 
        localzanw.c = (-this.f + paramzgw.a());
        break;
      case 0: 
        if (this.l) {
          localzanw.c = (-this.f);
        } else {
          localzanw.c = (-localzanw.e - paramzgw.a());
        }
        break;
      case 1: 
      case 2: 
        localzanw.c = (-this.f + (this.f - localzanw.e) / 2.0F);
        break;
      case 6: 
        this.f = (this.d * 72.0F / a);
        localzanw.c = (-this.f);
        if ((localzanw.b.size() >= 2) && (!localzanw.l)) {
          localzanw.i = ((this.f - localzanw.e) / (localzanw.b.size() - 1));
        }
        if ((localzanw.i >= 0.0F) && (i == this.i.size() - 1)) {
          localzanw.i = 0.0F;
        }
        break;
      case 3: 
        this.f = (this.d * 72.0F / a);
        localzanw.c = (-this.f);
        if (localzanw.b.size() >= 2) {
          localzanw.i = ((this.f - localzanw.e) / (localzanw.b.size() - 1));
        } else if (localzanw.b.size() == 1) {
          localzanw.c = (-this.f + (this.f - localzanw.e) / 2.0F);
        }
        break;
      case 4: 
      case 5: 
      case 7: 
      case 8: 
      default: 
        localzanw.c = (-this.f + paramzgw.a());
      }
    }
  }
  
  protected void b()
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      zanw localzanw = (zanw)localIterator.next();
      if (this.f < localzanw.e) {
        this.f = localzanw.e;
      }
      this.e += localzanw.d;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
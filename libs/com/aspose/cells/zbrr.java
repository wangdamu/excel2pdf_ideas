package com.aspose.cells;

import com.aspose.cells.b.a.za;

class zbrr
  extends zbrv
{
  private int f;
  
  public zbrr(int paramInt, boolean paramBoolean)
  {
    super(64, b(paramInt), c(paramInt), paramBoolean);
    this.f = paramInt;
  }
  
  public zbrr(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramInt1, b(paramInt2), c(paramInt2), paramBoolean);
    this.f = paramInt2;
  }
  
  private static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 364: 
    case 366: 
      return true;
    }
    return false;
  }
  
  private static boolean c(int paramInt)
  {
    return false;
  }
  
  public zaie a()
  {
    switch (this.f)
    {
    case 12: 
    case 45: 
    case 366: 
      if (this.b > 1) {
        return new zabb(zbpi.c(this.a, 0, this.b));
      }
      return zabc.a;
    case 193: 
    case 195: 
    case 364: 
      if (this.b > 0) {
        return new zabb(zbpi.d(this.a, 0, this.b));
      }
      return zabc.a;
    case 269: 
      if (this.b > 0) {
        return new zabb(zbpi.f(this.a, 0, this.b));
      }
      return zabc.b;
    case 318: 
      return new zabb(zbpi.e(this.a, 0, this.b));
    case 227: 
      return f();
    case 323: 
      return zbpi.g(this.a, 0, this.b);
    case 322: 
      return zbpi.h(this.a, 0, this.b);
    }
    return null;
  }
  
  private zaie f()
  {
    if (this.b > 0)
    {
      za.a(this.a, 0, this.b);
      if (this.b % 2 == 0)
      {
        int i = this.b / 2;
        return new zabb((this.a[(i - 1)] + this.a[i]) / 2.0D);
      }
      return new zabb(this.a[(this.b / 2)]);
    }
    return zabc.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbrr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
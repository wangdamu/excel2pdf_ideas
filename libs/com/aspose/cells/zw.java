package com.aspose.cells;

abstract class zw
{
  ShadowEffect a;
  zaml b;
  int c;
  int d;
  
  zw(ShadowEffect paramShadowEffect)
  {
    this.a = paramShadowEffect;
  }
  
  abstract int a();
  
  public CellsColor b()
  {
    if (this.b == null) {
      this.b = new zaml(true);
    }
    return new CellsColor(this.a.e(), this.b);
  }
  
  public void a(CellsColor paramCellsColor)
  {
    this.b = paramCellsColor.a;
  }
  
  public double c()
  {
    return zbxp.d(this.c);
  }
  
  public void a(double paramDouble)
  {
    this.c = zbxp.h(paramDouble);
  }
  
  public double d()
  {
    return zbxp.c(this.d);
  }
  
  public void b(double paramDouble)
  {
    this.d = zbxp.f(paramDouble);
  }
  
  public double e()
  {
    return 0.0D;
  }
  
  public void c(double paramDouble) {}
  
  public double f()
  {
    return 0.0D;
  }
  
  public void d(double paramDouble) {}
  
  void a(zw paramzw, CopyOptions paramCopyOptions)
  {
    if (paramzw.b != null)
    {
      this.b = new zaml(true);
      this.b.f(paramzw.b);
    }
    else
    {
      this.b = null;
    }
    this.c = paramzw.c;
    this.d = paramzw.d;
  }
  
  boolean a(zw paramzw)
  {
    if ((this.b != null) || (paramzw.b != null)) {
      if ((this.b != null) && (paramzw.b != null))
      {
        if (!this.b.g(paramzw.b)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if (this.c != paramzw.c) {
      return false;
    }
    return this.d == paramzw.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

abstract class zbaf
  extends zazx
{
  public zbaf(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw, paramInt, true);
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < this.b) {
      return this.k.a(paramInt1, paramInt2);
    }
    return zabc.g;
  }
  
  public boolean a(int paramInt)
  {
    int i = this.k.d();
    return b(paramInt / i, paramInt % i);
  }
  
  public int c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public int k()
  {
    return this.i * this.c + this.j;
  }
  
  public zaiw b(int paramInt)
  {
    if (paramInt < this.b) {
      return this.k.b(paramInt);
    }
    return new zazj(zabc.g, this.k.b(), 1, this.k.d());
  }
  
  public zaiw c(int paramInt)
  {
    return zbam.a(this.k.c(paramInt), this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
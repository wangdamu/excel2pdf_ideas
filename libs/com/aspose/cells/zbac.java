package com.aspose.cells;

abstract class zbac
  extends zazx
{
  protected int d;
  protected int e;
  
  public zbac(zaiw paramzaiw, int paramInt)
  {
    super(paramzaiw, paramInt, false);
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (paramInt2 < this.b) {
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
    return this.c;
  }
  
  public int d()
  {
    return this.a;
  }
  
  public int k()
  {
    return this.i * this.a + this.j;
  }
  
  public zaiw b(int paramInt)
  {
    return zbam.a(this.k.b(paramInt), this.a);
  }
  
  public zaiw c(int paramInt)
  {
    if (paramInt < this.b) {
      return this.k.c(paramInt);
    }
    return new zazj(zabc.g, this.k.b(), this.k.c(), 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

abstract class zazy
  extends zbab
{
  protected int a;
  protected int b;
  protected int c;
  protected int d;
  protected int e;
  protected int f;
  
  public zazy(zaiw paramzaiw, int paramInt1, int paramInt2)
  {
    super(paramzaiw);
    this.a = paramzaiw.c();
    this.b = paramzaiw.d();
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < this.a) && (paramInt2 < this.b)) {
      return this.k.a(paramInt1, paramInt2);
    }
    return zabc.g;
  }
  
  public boolean a(int paramInt)
  {
    return b(paramInt / this.d, paramInt % this.d);
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.c * this.d;
  }
  
  public int k()
  {
    return this.i * this.d + this.j;
  }
  
  public zaiw b(int paramInt)
  {
    return zbam.a(this.k.b(paramInt), this.d);
  }
  
  public zaiw c(int paramInt)
  {
    return zbam.a(this.k.c(paramInt), this.c);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
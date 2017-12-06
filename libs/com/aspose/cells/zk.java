package com.aspose.cells;

abstract class zk
  implements zaiv
{
  protected int a;
  protected int b;
  protected zahc c;
  protected int d;
  protected int e;
  
  protected abstract void a(int paramInt);
  
  zk(zahc paramzahc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c = paramzahc;
    this.a = paramInt1;
    this.b = paramInt3;
    this.d = (paramInt2 < 0 ? paramzahc.a(-1, false) : paramInt2);
    this.e = (paramInt4 < 0 ? paramzahc.a(-1, true) : paramInt4);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (this.a < 0)
    {
      this.d = this.c.a(-1, false);
    }
    else
    {
      this.d = this.c.b(this.a, this.d);
      if (this.d < 0) {
        this.d = (-this.d - 1);
      }
    }
    if (this.b < 0)
    {
      this.e = this.c.a(-1, true);
    }
    else
    {
      this.e = this.c.b(this.b, this.e);
      if (this.e < 0) {
        this.e = this.c.a(-this.e - 1, true);
      }
    }
    if (paramInt1 > -1) {
      a(this.c.a(paramInt1, paramInt2));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
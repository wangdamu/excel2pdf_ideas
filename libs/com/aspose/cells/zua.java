package com.aspose.cells;

class zua
  extends zk
{
  private int f;
  private int g;
  
  zua(zahc paramzahc, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(paramzahc, paramInt1, paramInt2, paramInt3, paramInt4);
    this.f = paramInt5;
    b();
  }
  
  public int a()
  {
    this.g += this.f;
    if (this.g > this.e) {
      return -this.g - 1;
    }
    return this.g;
  }
  
  public void b(int paramInt)
  {
    if (paramInt <= this.a)
    {
      this.g = (this.d - this.f);
    }
    else if (paramInt == this.b)
    {
      this.g = (this.e - this.f);
    }
    else if ((this.b > -1) && (paramInt > this.b))
    {
      this.g = this.e;
    }
    else
    {
      this.g = this.c.a(paramInt, this.d, this.e);
      if (this.g < 0) {
        this.g = (-this.g - 1);
      }
      this.g -= this.f;
    }
  }
  
  public void b()
  {
    this.g = (this.d - this.f);
  }
  
  protected void a(int paramInt)
  {
    if (paramInt < 0) {
      this.g = (-paramInt - 1 - this.f);
    } else {
      this.g = paramInt;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
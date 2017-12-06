package com.aspose.cells;

class zbqs
  implements zajh
{
  private boolean a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      this.a = true;
      this.b = (-paramInt1);
      this.e = this.b;
    }
    else
    {
      this.a = false;
      this.b = paramInt1;
    }
    this.d = paramInt2;
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt < this.b)
    {
      if (!this.a) {
        this.e = (this.b + this.c * this.d);
      }
      return false;
    }
    if (!this.a) {
      this.e = (this.b + Math.min((paramInt - this.b) / this.d, this.c) * this.d);
    }
    return true;
  }
  
  public int a()
  {
    return this.e;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.aspose.cells;

class zbqt
  implements zajh
{
  private byte[] a = new byte[zbdw.n(268435455)];
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(zbdx paramzbdx, int paramInt)
  {
    this.c = zbdw.a(this.a, 0, this.a.length, paramzbdx);
    this.d = (paramInt < 0 ? this.b : paramInt);
    this.g = (this.c + zbdw.q(this.d));
    this.f = -1;
  }
  
  public boolean a(int paramInt)
  {
    if (paramInt >= this.g)
    {
      this.e = this.g;
      return true;
    }
    if (this.f < 0) {
      this.f = (this.c + zbdw.p(this.d));
    }
    if (paramInt >= this.f)
    {
      this.e = paramInt;
      return true;
    }
    this.e = this.g;
    return false;
  }
  
  public int a()
  {
    return this.e;
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(this.a, 0, paramArrayOfByte, paramInt, this.c);
    if (this.e > this.c) {
      paramArrayOfByte[(paramInt + this.c)] = 0;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
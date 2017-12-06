package com.aspose.cells;

class zarc
{
  private double a = 1.0D;
  private byte b = 0;
  private short c = -1;
  private short d = -1;
  private byte e = 3;
  
  public double a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.a = paramDouble;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.b = ((byte)paramInt);
  }
  
  public int c()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.c = ((short)paramInt);
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void c(int paramInt)
  {
    this.d = ((short)paramInt);
  }
  
  public boolean e()
  {
    return d(1);
  }
  
  public void a(boolean paramBoolean)
  {
    a(1, paramBoolean);
  }
  
  public boolean f()
  {
    return d(2);
  }
  
  public void b(boolean paramBoolean)
  {
    a(2, paramBoolean);
  }
  
  public boolean g()
  {
    return d(4);
  }
  
  public void c(boolean paramBoolean)
  {
    a(4, paramBoolean);
  }
  
  public boolean h()
  {
    return d(8);
  }
  
  public void d(boolean paramBoolean)
  {
    a(8, paramBoolean);
  }
  
  private boolean d(int paramInt)
  {
    return (this.e & 0xFF & paramInt) != 0;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.e = ((byte)(this.e | (byte)paramInt));
    } else {
      this.e = ((byte)(this.e & (byte)(paramInt ^ 0xFFFFFFFF)));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
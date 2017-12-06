package com.aspose.cells;

class zbfi
{
  private int[] a = new int[0];
  private int b;
  private int c;
  
  void a(zbfi paramzbfi, CopyOptions paramCopyOptions)
  {
    if (paramzbfi.a != null)
    {
      this.a = new int[paramzbfi.a.length];
      System.arraycopy(paramzbfi.a, 0, this.a, 0, this.a.length);
    }
    this.b = paramzbfi.b;
    this.c = paramzbfi.c;
  }
  
  public boolean a()
  {
    return a(128, true);
  }
  
  public void a(boolean paramBoolean)
  {
    b(128, paramBoolean);
  }
  
  public boolean b()
  {
    return a(4, true);
  }
  
  public void b(boolean paramBoolean)
  {
    b(4, paramBoolean);
  }
  
  public boolean c()
  {
    return a(32, true);
  }
  
  public void c(boolean paramBoolean)
  {
    b(32, paramBoolean);
  }
  
  public boolean d()
  {
    return a(8, false);
  }
  
  public void d(boolean paramBoolean)
  {
    b(8, paramBoolean);
  }
  
  public boolean e()
  {
    return a(16, true);
  }
  
  public void e(boolean paramBoolean)
  {
    b(16, paramBoolean);
  }
  
  public int[] f()
  {
    return this.a;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.a = paramArrayOfInt;
    d(2);
  }
  
  public int g()
  {
    if (a(1, true)) {
      return 0;
    }
    return 1;
  }
  
  public void a(int paramInt)
  {
    b(1, paramInt == 0);
  }
  
  public int h()
  {
    if (c(64)) {
      return this.b;
    }
    return 2;
  }
  
  public void b(int paramInt)
  {
    d(64);
    this.b = paramInt;
  }
  
  boolean i()
  {
    return a(256, false);
  }
  
  void f(boolean paramBoolean)
  {
    b(256, paramBoolean);
  }
  
  boolean c(int paramInt)
  {
    return (this.c & paramInt << 16) != 0;
  }
  
  void d(int paramInt)
  {
    this.c |= paramInt << 16;
  }
  
  boolean a(int paramInt, boolean paramBoolean)
  {
    if (c(paramInt)) {
      return (this.c & paramInt) != 0;
    }
    return paramBoolean;
  }
  
  void b(int paramInt, boolean paramBoolean)
  {
    d(paramInt);
    if (paramBoolean) {
      this.c |= paramInt;
    } else {
      this.c &= (paramInt ^ 0xFFFFFFFF);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
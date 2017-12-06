package com.aspose.cells;

class zbqp
{
  private int a = 1025;
  private int b = 2560;
  private short c = 4095;
  private short d = 4095;
  
  zbqp(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt2;
    this.b = paramInt3;
  }
  
  void a(zbqp paramzbqp, CopyOptions paramCopyOptions)
  {
    if (paramCopyOptions.h)
    {
      this.c = paramzbqp.c;
      this.d = paramzbqp.c;
    }
    if (paramCopyOptions.g) {
      this.a = paramzbqp.a;
    }
    this.b = paramzbqp.b;
  }
  
  int a()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = ((short)paramInt);
    this.d = this.c;
  }
  
  int b()
  {
    return this.d;
  }
  
  void b(int paramInt)
  {
    this.d = ((short)paramInt);
  }
  
  int c()
  {
    return this.a;
  }
  
  void c(int paramInt)
  {
    this.a = paramInt;
  }
  
  int d()
  {
    return this.b;
  }
  
  void d(int paramInt)
  {
    this.b = paramInt;
  }
  
  void a(boolean paramBoolean)
  {
    this.b &= 0xFFFFFFFE;
    this.b |= (paramBoolean ? 1 : 0);
  }
  
  void b(boolean paramBoolean)
  {
    this.b &= 0xFFFFFFFD;
    this.b |= (paramBoolean ? 2 : 0);
  }
  
  void c(boolean paramBoolean)
  {
    this.b &= 0xFFFFFFEF;
    this.b |= (paramBoolean ? 16 : 0);
  }
  
  void d(boolean paramBoolean)
  {
    this.b &= 0xFEFF;
    this.b |= (paramBoolean ? 256 : 0);
  }
  
  public boolean e()
  {
    return (this.b & 0x80) != 0;
  }
  
  public void e(boolean paramBoolean)
  {
    this.b &= 0xFF7F;
    this.b |= (paramBoolean ? 128 : 0);
  }
  
  boolean f()
  {
    return (this.b & 0x40) != 0;
  }
  
  void f(boolean paramBoolean)
  {
    this.b &= 0xFFFFFFBF;
    this.b |= (paramBoolean ? 64 : 0);
  }
  
  int g()
  {
    return 8;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */